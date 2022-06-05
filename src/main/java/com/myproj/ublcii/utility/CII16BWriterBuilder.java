/**
 * 
 */
package com.myproj.ublcii.utility;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.jaxb.builder.JAXBWriterBuilder;
import com.helger.xml.namespace.MapBasedNamespaceContext;

/**
 * A writer builder for CII D16B documents.
 *
 * @author Vartika Gupta
 * @param <JAXBTYPE> The CII D16B implementation class to be read
 */
@NotThreadSafe
public class CII16BWriterBuilder<JAXBTYPE> extends JAXBWriterBuilder<JAXBTYPE, CII16BWriterBuilder<JAXBTYPE>> {
	/**
	 * Create a new writer builder.
	 *
	 * @param aClass The CII class to be written. May not be <code>null</code>.
	 */
	public CII16BWriterBuilder(@Nonnull final Class<JAXBTYPE> aClass) {
		this(CIID16BDocumentTypes.getDocumentTypeOfImplementationClass(aClass));
	}

	public CII16BWriterBuilder(@Nonnull final ECIID16BDocumentType eDocType) {
		super(eDocType);

		// Create a special namespace context for the passed document type
		final MapBasedNamespaceContext aNSContext = new MapBasedNamespaceContext();
		aNSContext.addMappings(CIID16BNamespaceContext.getInstance());
		setNamespaceContext(aNSContext);
	}

	/**
	 * Create a writer builder for CrossIndustryInvoiceType.
	 *
	 * @return The builder and never <code>null</code>
	 */
	@Nonnull
	public static <T> CII16BWriterBuilder<T> create(@Nonnull final Class<T> aClass) {
		return new CII16BWriterBuilder<>(aClass);
	}
}
