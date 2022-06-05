/**
 * 
 */
package com.myproj.ublcii.utility;

import javax.annotation.Nonnull;
import javax.xml.validation.Schema;

import com.helger.commons.annotation.Nonempty;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.impl.CommonsArrayList;
import com.helger.commons.collection.impl.ICommonsList;
import com.helger.commons.io.resource.ClassPathResource;
import com.helger.commons.string.StringHelper;
import com.helger.jaxb.builder.IJAXBDocumentType;
import com.helger.jaxb.builder.JAXBDocumentType;

import un.unece.uncefact.data.standard.crossindustryinvoice._100.CrossIndustryInvoiceType;

/**
 * Enumeration with all available CII D16B document types.
 *
 * @author Vartika Gupta
 */
public enum ECIID16BDocumentType implements IJAXBDocumentType {
	CROSS_INDUSTRY_INVOICE(CrossIndustryInvoiceType.class, "CrossIndustryInvoice_100pD16B.xsd");

	@Nonnull
	private static ClassLoader _getCL() {
		return ECIID16BDocumentType.class.getClassLoader();
	}

	private final JAXBDocumentType m_aDocType;

	private ECIID16BDocumentType(@Nonnull final Class<?> aClass, @Nonnull final String sXSDPath) {
		m_aDocType = new JAXBDocumentType(aClass,
				new CommonsArrayList<>(new ClassPathResource(CCIID16B.SCHEMA_DIRECTORY + sXSDPath, _getCL())),
				s -> StringHelper.trimEnd(s, "Type"));
	}

	@Nonnull
	public Class<?> getImplementationClass() {
		return m_aDocType.getImplementationClass();
	}

	@Nonnull
	@Nonempty
	@ReturnsMutableCopy
	public ICommonsList<ClassPathResource> getAllXSDResources() {
		return m_aDocType.getAllXSDResources();
	}

	@Nonnull
	public String getNamespaceURI() {
		return m_aDocType.getNamespaceURI();
	}

	@Nonnull
	@Nonempty
	public String getLocalName() {
		return m_aDocType.getLocalName();
	}

	@Nonnull
	public Schema getSchema() {
		return m_aDocType.getSchema();
	}
}
