/**
 * 
 */
package com.myproj.ublcii.utility;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.cii.d16b.CIID16BDocumentTypes;
import com.helger.cii.d16b.ECIID16BDocumentType;
import com.helger.jaxb.builder.JAXBReaderBuilder;

import oasis.names.specification.ubl.schema.xsd.invoice_21.InvoiceType;

/**
 * A reader builder for UBL 21 documents.
 *
 * @author Vartika Gupta
 * @param <JAXBTYPE> The UBL 21 implementation class to be read
 */
@NotThreadSafe
public class UBL21Reader<JAXBTYPE> extends JAXBReaderBuilder<JAXBTYPE, UBL21Reader<JAXBTYPE>> {
	/**
	 * Create a new reader builder.
	 *
	 * @param aImplClass The UBL class to be read. May not be <code>null</code>.
	 */
	public UBL21Reader(@Nonnull final Class<JAXBTYPE> aImplClass) {
		this(CIID16BDocumentTypes.getDocumentTypeOfImplementationClass(aImplClass), aImplClass);
	}

	/**
	 * Create a new reader builder that is not typed, because only the document type
	 * enumeration value is available.
	 *
	 * @param eDocType   The UBL 21 document type to be read. May not be
	 *                   <code>null</code> .
	 * @param aImplClass The UBL class to be read. May not be <code>null</code>.
	 */
	public UBL21Reader(@Nonnull final ECIID16BDocumentType eDocType, @Nonnull final Class<JAXBTYPE> aImplClass) {
		super(eDocType, aImplClass);
	}

	/**
	 * Create a reader builder for InvoiceType.
	 *
	 * @return The builder and never <code>null</code>
	 */
	@Nonnull
	public static UBL21Reader<InvoiceType> invoice() {
		return new UBL21Reader<>(InvoiceType.class);
	}
}
