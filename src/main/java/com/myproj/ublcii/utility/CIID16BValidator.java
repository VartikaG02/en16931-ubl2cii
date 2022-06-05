/**
 * 
 */
package com.myproj.ublcii.utility;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.jaxb.builder.JAXBValidationBuilder;

import un.unece.uncefact.data.standard.crossindustryinvoice._100.CrossIndustryInvoiceType;

/**
 * A writer builder for CII D16B documents.
 *
 * @author Vartika Gupta
 * @param <JAXBTYPE> The CII D16B implementation class to be read
 */
@NotThreadSafe
public class CIID16BValidator<JAXBTYPE> extends JAXBValidationBuilder<JAXBTYPE, CIID16BValidator<JAXBTYPE>> {
	/**
	 * Create a new validation builder.
	 *
	 * @param aClass The CII class to be validated. May not be <code>null</code>.
	 */
	public CIID16BValidator(@Nonnull final Class<JAXBTYPE> aClass) {
		this(CIID16BDocumentTypes.getDocumentTypeOfImplementationClass(aClass));
	}

	public CIID16BValidator(@Nonnull final ECIID16BDocumentType eDocType) {
		super(eDocType);
	}

	/**
	 * Create a validation builder for CrossIndustryInvoiceType.
	 *
	 * @return The builder and never <code>null</code>
	 */
	@Nonnull
	public static CIID16BValidator<CrossIndustryInvoiceType> crossIndustryInvoice() {
		return new CIID16BValidator<>(CrossIndustryInvoiceType.class);
	}
}
