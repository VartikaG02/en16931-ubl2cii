/**
 * 
 */
package com.myproj.ublcii.utility;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.xml.bind.JAXBException;

import com.helger.commons.error.list.ErrorList;
import com.helger.jaxb.validation.WrappedCollectingValidationEventHandler;
import com.helger.ubl21.UBL21Reader;
import oasis.names.specification.ubl.schema.xsd.invoice_21.InvoiceType;
import un.unece.uncefact.data.standard.crossindustryinvoice._100.CrossIndustryInvoiceType;
import org.springframework.stereotype.Component;

/**
 * @author
 * 
 *         Vartika Gupta
 *
 */
@Component
public class UBLCIIConversionUtility {
	/**
	 *
	 * @param File
	 * @param targetFile
	 * @return
	 * @throws JAXBException
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	public void convertUBLtoCII(File file, File targetFile) throws JAXBException, IllegalStateException, IOException {
		final InvoiceType aUBLInvoice = UBL21Reader.invoice()
				.setValidationEventHandler(new WrappedCollectingValidationEventHandler(new ErrorList())).read(file);
		final Serializable aCrossIndustryInvoice = new UBLToCII16BConverter().convertUBLToCII(aUBLInvoice,
				new ErrorList());
		final CrossIndustryInvoiceType aCIIInvoice = (CrossIndustryInvoiceType) aCrossIndustryInvoice;
		// Parse XML and convert to domain model
		final CII16BWriterBuilder<CrossIndustryInvoiceType> aWriter = CIID16BWriter.crossIndustryInvoice()
				.setFormattedOutput(true);
		aWriter.write(aCIIInvoice, targetFile);
	}
}
