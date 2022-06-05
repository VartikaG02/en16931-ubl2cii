/**
 * 
 */
package com.myproj.ublcii.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.xml.bind.JAXBException;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.myproj.ublcii.configuration.FileConfiguration;
import com.myproj.ublcii.utility.UBLCIIConversionUtility;

/**
 * @author
 *
 */
@Service
public class UBLCIIConversionService {

	@Autowired
	private FileConfiguration fileConfiguration;

	/**
	 *
	 * @param File
	 * @return
	 * @throws IOException
	 * @throws JAXBException
	 * @throws IllegalStateException
	 * @throws ApiException
	 */
	public Resource convertInvoiceFormat(MultipartFile file) throws IOException, IllegalStateException, JAXBException {
		// Normalize file name
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		// Check if the file's name contains invalid characters
		if (FilenameUtils.isExtension(fileName, "xml")) {
			fileName = generateUniqueFileName(fileName);
		}
		Path fileInputLocation = Paths.get(fileConfiguration.getUblciiInput()).toAbsolutePath().normalize();

		// Copy file to the target location (Replacing existing file with the same name)
		Path targetInputFileLocation = fileInputLocation.resolve(fileName);
		Files.copy(file.getInputStream(), targetInputFileLocation, StandardCopyOption.REPLACE_EXISTING);
		File inputFile = new File(targetInputFileLocation.toString());
		inputFile.createNewFile();

		String targetFileName = FilenameUtils.getBaseName(fileName).concat("_OUTPUT.xml");

		Path fileOutputLocation = Paths.get(fileConfiguration.getUblciiOutput()).toAbsolutePath().normalize();
		Path targetOutputFileLocation = fileOutputLocation.resolve(targetFileName).normalize();
		File targetFile = new File(targetOutputFileLocation.toString());
		targetFile.createNewFile();

		UBLCIIConversionUtility ublciiConvert = new UBLCIIConversionUtility();
		ublciiConvert.convertUBLtoCII(inputFile, targetFile);

		Resource resource = new UrlResource(targetOutputFileLocation.toUri());
		if (resource.exists()) {
			return resource;
		}
		return resource;
	}

	/**
	 * 
	 * @param actualFileName
	 * @return
	 */
	private String generateUniqueFileName(String actualFileName) {
		String filename = FilenameUtils.getBaseName(actualFileName);
		String datetime = LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm:ssa", Locale.ENGLISH)).replaceAll("\\s", "");
		datetime = datetime.replace(" ", "");
		datetime = datetime.replace(":", "");
		String rndchars = RandomStringUtils.randomAlphanumeric(8);
		filename = filename + "_" + datetime + "_" + rndchars + ".xml";
		return filename;
	}
}
