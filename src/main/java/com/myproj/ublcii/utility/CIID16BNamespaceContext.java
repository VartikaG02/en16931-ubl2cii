/**
 * 
 */
package com.myproj.ublcii.utility;

import javax.annotation.Nonnull;
import javax.xml.XMLConstants;

import com.helger.commons.annotation.Singleton;
import com.helger.xml.namespace.MapBasedNamespaceContext;

/**
 * The namespace context to be used as the namespace prefix mapper.
 *
 * @author Vartika Gupta
 */
@Singleton
public class CIID16BNamespaceContext extends MapBasedNamespaceContext {
	private static final class SingletonHolder {
		static final CIID16BNamespaceContext s_aInstance = new CIID16BNamespaceContext();
	}

	protected CIID16BNamespaceContext() {
		addMapping("xsi", XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
		addMapping("xs", XMLConstants.W3C_XML_SCHEMA_NS_URI);
		addMapping("rsm", CCIID16B.XML_SCHEMA_RSM_NAMESPACE_URL);
		addMapping("udt", CCIID16B.XML_SCHEMA_UDT_NAMESPACE_URL);
		addMapping("qdt", CCIID16B.XML_SCHEMA_QDT_NAMESPACE_URL);
		addMapping("ram", CCIID16B.XML_SCHEMA_RAM_NAMESPACE_URL);
	}

	@Nonnull
	public static CIID16BNamespaceContext getInstance() {
		return SingletonHolder.s_aInstance;
	}
}
