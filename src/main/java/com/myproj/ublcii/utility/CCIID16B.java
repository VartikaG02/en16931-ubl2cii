/**
 * 
 */
package com.myproj.ublcii.utility;

import javax.annotation.concurrent.Immutable;

import com.helger.commons.annotation.PresentForCodeCoverage;

/**
 * Constants for CII D16B handling.
 *
 * @author Vartika Gupta
 */
@Immutable
public final class CCIID16B {
	/** The classpath relative directory where the main XSDs reside */
	public static final String SCHEMA_DIRECTORY = "schemas/d16b/data/standard/";

	/** The CII rsm namespace URL */
	public static final String XML_SCHEMA_RSM_NAMESPACE_URL = "urn:un:unece:uncefact:data:standard:CrossIndustryInvoice:100";

	/** The udt namespace URL */
	public static final String XML_SCHEMA_UDT_NAMESPACE_URL = "urn:un:unece:uncefact:data:standard:UnqualifiedDataType:100";

	/** The qdt namespace URL */
	public static final String XML_SCHEMA_QDT_NAMESPACE_URL = "urn:un:unece:uncefact:data:standard:QualifiedDataType:100";

	/** The ram namespace URL */
	public static final String XML_SCHEMA_RAM_NAMESPACE_URL = "urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100";

	@PresentForCodeCoverage
	private static final CCIID16B s_aInstance = new CCIID16B();

	private CCIID16B() {
	}
}
