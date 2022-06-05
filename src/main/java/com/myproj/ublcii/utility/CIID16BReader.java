/**
 * 
 */
package com.myproj.ublcii.utility;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.jaxb.builder.JAXBReaderBuilder;

import un.unece.uncefact.data.standard.crossindustryinvoice._100.CrossIndustryInvoiceType;

/**
 * A reader builder for CII D16B documents.
 *
 * @author Vartika Gupta
 * @param <JAXBTYPE> The CII D16B implementation class to be read
 */
@NotThreadSafe
public class CIID16BReader<JAXBTYPE> extends JAXBReaderBuilder<JAXBTYPE, CIID16BReader<JAXBTYPE>> {
	/**
	 * Create a new reader builder.
	 *
	 * @param aImplClass The CII class to be read. May not be <code>null</code>.
	 */
	public CIID16BReader(@Nonnull final Class<JAXBTYPE> aImplClass) {
		this(CIID16BDocumentTypes.getDocumentTypeOfImplementationClass(aImplClass), aImplClass);
	}

	/**
	 * Create a new reader builder that is not typed, because only the document type
	 * enumeration value is available.
	 *
	 * @param eDocType   The CII D16B document type to be read. May not be
	 *                   <code>null</code> .
	 * @param aImplClass The CII class to be read. May not be <code>null</code>.
	 */
	public CIID16BReader(@Nonnull final ECIID16BDocumentType eDocType, @Nonnull final Class<JAXBTYPE> aImplClass) {
		super(eDocType, aImplClass);
	}

	/**
	 * Create a reader builder for CrossIndustryInvoiceType.
	 *
	 * @return The builder and never <code>null</code>
	 */
	@Nonnull
	public static CIID16BReader<CrossIndustryInvoiceType> crossIndustryInvoice() {
		return new CIID16BReader<>(CrossIndustryInvoiceType.class);
	}
}
