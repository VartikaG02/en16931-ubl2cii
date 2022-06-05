/**
 * 
 */
package com.myproj.ublcii.utility;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.jaxb.builder.JAXBWriterBuilder;
import com.helger.xml.namespace.MapBasedNamespaceContext;

import un.unece.uncefact.data.standard.crossindustryinvoice._100.CrossIndustryInvoiceType;

/**
 * A writer builder for CII D16B documents.
 *
 * @author Vartika Gupta
 * @param <JAXBTYPE> The CII D16B implementation class to be read
 */
@NotThreadSafe
public class CIID16BWriter<JAXBTYPE> extends JAXBWriterBuilder<JAXBTYPE, CIID16BWriter<JAXBTYPE>> {
	/**
	 * Create a new writer builder.
	 *
	 * @param aClass The CII class to be written. May not be <code>null</code>.
	 */
	public CIID16BWriter(@Nonnull final Class<JAXBTYPE> aClass) {
		this(CIID16BDocumentTypes.getDocumentTypeOfImplementationClass(aClass));
	}

	public CIID16BWriter(@Nonnull final ECIID16BDocumentType eDocType) {
		super(eDocType);

		// Create a special namespace context for the passed document type
		final MapBasedNamespaceContext aNSContext = new MapBasedNamespaceContext();
		aNSContext.addMappings(CIID16BNamespaceContext.getInstance());
		aNSContext.addDefaultNamespaceURI(m_aDocType.getNamespaceURI());
		setNamespaceContext(aNSContext);
	}

	/**
	 * Create a writer builder for CrossIndustryInvoiceType.
	 *
	 * @return The builder and never <code>null</code>
	 */
	@Nonnull
	public static CII16BWriterBuilder<CrossIndustryInvoiceType> crossIndustryInvoice() {
		return CII16BWriterBuilder.create(CrossIndustryInvoiceType.class);
	}
}
