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
import com.helger.ubl21.CUBL21;
import com.helger.xsds.ccts.cct.schemamodule.CCCTS;
import com.helger.xsds.xades132.CXAdES132;
import com.helger.xsds.xades141.CXAdES141;
import com.helger.xsds.xmldsig.CXMLDSig;

/**
 * Enumeration with all available UBL 2.1 document types.
 *
 * @author Vartika Gupta
 */
public enum EUBL21DocumentType implements IJAXBDocumentType {
	APPLICATION_RESPONSE(oasis.names.specification.ubl.schema.xsd.applicationresponse_21.ApplicationResponseType.class,
			"UBL-ApplicationResponse-2.1.xsd"),
	ATTACHED_DOCUMENT(oasis.names.specification.ubl.schema.xsd.attacheddocument_21.AttachedDocumentType.class,
			"UBL-AttachedDocument-2.1.xsd"),
	AWARDED_NOTIFICATION(oasis.names.specification.ubl.schema.xsd.awardednotification_21.AwardedNotificationType.class,
			"UBL-AwardedNotification-2.1.xsd"),
	BILL_OF_LADING(oasis.names.specification.ubl.schema.xsd.billoflading_21.BillOfLadingType.class,
			"UBL-BillOfLading-2.1.xsd"),
	CALL_FOR_TENDERS(oasis.names.specification.ubl.schema.xsd.callfortenders_21.CallForTendersType.class,
			"UBL-CallForTenders-2.1.xsd"),
	CATALOGUE(oasis.names.specification.ubl.schema.xsd.catalogue_21.CatalogueType.class, "UBL-Catalogue-2.1.xsd"),
	CATALOGUE_DELETION(oasis.names.specification.ubl.schema.xsd.cataloguedeletion_21.CatalogueDeletionType.class,
			"UBL-CatalogueDeletion-2.1.xsd"),
	CATALOGUE_ITEM_SPECIFICATION_UPDATE(
			oasis.names.specification.ubl.schema.xsd.catalogueitemspecificationupdate_21.CatalogueItemSpecificationUpdateType.class,
			"UBL-CatalogueItemSpecificationUpdate-2.1.xsd"),
	CATALOGUE_PRICING_UPDATE(
			oasis.names.specification.ubl.schema.xsd.cataloguepricingupdate_21.CataloguePricingUpdateType.class,
			"UBL-CataloguePricingUpdate-2.1.xsd"),
	CATALOGUE_REQUEST(oasis.names.specification.ubl.schema.xsd.cataloguerequest_21.CatalogueRequestType.class,
			"UBL-CatalogueRequest-2.1.xsd"),
	CERTIFICATE_OF_ORIGIN(oasis.names.specification.ubl.schema.xsd.certificateoforigin_21.CertificateOfOriginType.class,
			"UBL-CertificateOfOrigin-2.1.xsd"),
	CONTRACT_AWARD_NOTICE(oasis.names.specification.ubl.schema.xsd.contractawardnotice_21.ContractAwardNoticeType.class,
			"UBL-ContractAwardNotice-2.1.xsd"),
	CONTRACT_NOTICE(oasis.names.specification.ubl.schema.xsd.contractnotice_21.ContractNoticeType.class,
			"UBL-ContractNotice-2.1.xsd"),
	CREDIT_NOTE(oasis.names.specification.ubl.schema.xsd.creditnote_21.CreditNoteType.class, "UBL-CreditNote-2.1.xsd"),
	DEBIT_NOTE(oasis.names.specification.ubl.schema.xsd.debitnote_21.DebitNoteType.class, "UBL-DebitNote-2.1.xsd"),
	DESPATCH_ADVICE(oasis.names.specification.ubl.schema.xsd.despatchadvice_21.DespatchAdviceType.class,
			"UBL-DespatchAdvice-2.1.xsd"),
	DOCUMENT_STATUS(oasis.names.specification.ubl.schema.xsd.documentstatus_21.DocumentStatusType.class,
			"UBL-DocumentStatus-2.1.xsd"),
	DOCUMENT_STATUS_REQUEST(
			oasis.names.specification.ubl.schema.xsd.documentstatusrequest_21.DocumentStatusRequestType.class,
			"UBL-DocumentStatusRequest-2.1.xsd"),
	EXCEPTION_CRITERIA(oasis.names.specification.ubl.schema.xsd.exceptioncriteria_21.ExceptionCriteriaType.class,
			"UBL-ExceptionCriteria-2.1.xsd"),
	EXCEPTION_NOTIFICATION(
			oasis.names.specification.ubl.schema.xsd.exceptionnotification_21.ExceptionNotificationType.class,
			"UBL-ExceptionNotification-2.1.xsd"),
	FORECAST(oasis.names.specification.ubl.schema.xsd.forecast_21.ForecastType.class, "UBL-Forecast-2.1.xsd"),
	FORECAST_REVISION(oasis.names.specification.ubl.schema.xsd.forecastrevision_21.ForecastRevisionType.class,
			"UBL-ForecastRevision-2.1.xsd"),
	FORWARDING_INSTRUCTIONS(
			oasis.names.specification.ubl.schema.xsd.forwardinginstructions_21.ForwardingInstructionsType.class,
			"UBL-ForwardingInstructions-2.1.xsd"),
	FREIGHT_INVOICE(oasis.names.specification.ubl.schema.xsd.freightinvoice_21.FreightInvoiceType.class,
			"UBL-FreightInvoice-2.1.xsd"),
	FULFILMENT_CANCELATION(
			oasis.names.specification.ubl.schema.xsd.fulfilmentcancellation_21.FulfilmentCancellationType.class,
			"UBL-FulfilmentCancellation-2.1.xsd"),
	GOODS_ITEM_ITINERARY(oasis.names.specification.ubl.schema.xsd.goodsitemitinerary_21.GoodsItemItineraryType.class,
			"UBL-GoodsItemItinerary-2.1.xsd"),
	GUARANTEE_CERTIFICATE(
			oasis.names.specification.ubl.schema.xsd.guaranteecertificate_21.GuaranteeCertificateType.class,
			"UBL-GuaranteeCertificate-2.1.xsd"),
	INSTRUCTION_FOR_RETURNS(
			oasis.names.specification.ubl.schema.xsd.instructionforreturns_21.InstructionForReturnsType.class,
			"UBL-InstructionForReturns-2.1.xsd"),
	INVENTORY_REPORT(oasis.names.specification.ubl.schema.xsd.inventoryreport_21.InventoryReportType.class,
			"UBL-InventoryReport-2.1.xsd"),
	INVOICE(oasis.names.specification.ubl.schema.xsd.invoice_21.InvoiceType.class, "UBL-Invoice-2.1.xsd"),
	ITEM_INFORMATION_REQUEST(
			oasis.names.specification.ubl.schema.xsd.iteminformationrequest_21.ItemInformationRequestType.class,
			"UBL-ItemInformationRequest-2.1.xsd"),
	ORDER(oasis.names.specification.ubl.schema.xsd.order_21.OrderType.class, "UBL-Order-2.1.xsd"),
	ORDER_CANCELLATION(oasis.names.specification.ubl.schema.xsd.ordercancellation_21.OrderCancellationType.class,
			"UBL-OrderCancellation-2.1.xsd"),
	ORDER_CHANGE(oasis.names.specification.ubl.schema.xsd.orderchange_21.OrderChangeType.class,
			"UBL-OrderChange-2.1.xsd"),
	ORDER_RESPONSE(oasis.names.specification.ubl.schema.xsd.orderresponse_21.OrderResponseType.class,
			"UBL-OrderResponse-2.1.xsd"),
	ORDER_RESPONSE_SIMPLE(oasis.names.specification.ubl.schema.xsd.orderresponsesimple_21.OrderResponseSimpleType.class,
			"UBL-OrderResponseSimple-2.1.xsd"),
	PACKING_LIST(oasis.names.specification.ubl.schema.xsd.packinglist_21.PackingListType.class,
			"UBL-PackingList-2.1.xsd"),
	PRIOR_INFORMATION_NOTICE(
			oasis.names.specification.ubl.schema.xsd.priorinformationnotice_21.PriorInformationNoticeType.class,
			"UBL-PriorInformationNotice-2.1.xsd"),
	PRODUCT_ACTIVITY(oasis.names.specification.ubl.schema.xsd.productactivity_21.ProductActivityType.class,
			"UBL-ProductActivity-2.1.xsd"),
	QUOTATION(oasis.names.specification.ubl.schema.xsd.quotation_21.QuotationType.class, "UBL-Quotation-2.1.xsd"),
	RECEIPT_ADVICE(oasis.names.specification.ubl.schema.xsd.receiptadvice_21.ReceiptAdviceType.class,
			"UBL-ReceiptAdvice-2.1.xsd"),
	REMINDER(oasis.names.specification.ubl.schema.xsd.reminder_21.ReminderType.class, "UBL-Reminder-2.1.xsd"),
	REMITTANCE_ADVICE(oasis.names.specification.ubl.schema.xsd.remittanceadvice_21.RemittanceAdviceType.class,
			"UBL-RemittanceAdvice-2.1.xsd"),
	REQUEST_FOR_QUOTATION(oasis.names.specification.ubl.schema.xsd.requestforquotation_21.RequestForQuotationType.class,
			"UBL-RequestForQuotation-2.1.xsd"),
	RETAIL_EVENT(oasis.names.specification.ubl.schema.xsd.retailevent_21.RetailEventType.class,
			"UBL-RetailEvent-2.1.xsd"),
	SELF_BILLED_CREDIT_NOTE(
			oasis.names.specification.ubl.schema.xsd.selfbilledcreditnote_21.SelfBilledCreditNoteType.class,
			"UBL-SelfBilledCreditNote-2.1.xsd"),
	SELF_BILLED_INVOICE(oasis.names.specification.ubl.schema.xsd.selfbilledinvoice_21.SelfBilledInvoiceType.class,
			"UBL-SelfBilledInvoice-2.1.xsd"),
	STATEMENT(oasis.names.specification.ubl.schema.xsd.statement_21.StatementType.class, "UBL-Statement-2.1.xsd"),
	STOCK_AVAILABILITY_REPORT(
			oasis.names.specification.ubl.schema.xsd.stockavailabilityreport_21.StockAvailabilityReportType.class,
			"UBL-StockAvailabilityReport-2.1.xsd"),
	TENDER(oasis.names.specification.ubl.schema.xsd.tender_21.TenderType.class, "UBL-Tender-2.1.xsd"),
	TENDERER_QUALIFICATION(
			oasis.names.specification.ubl.schema.xsd.tendererqualification_21.TendererQualificationType.class,
			"UBL-TendererQualification-2.1.xsd"),
	TENDERER_QUALIFICATION_RESPONSE(
			oasis.names.specification.ubl.schema.xsd.tendererqualificationresponse_21.TendererQualificationResponseType.class,
			"UBL-TendererQualificationResponse-2.1.xsd"),
	TENDER_RECEIPT(oasis.names.specification.ubl.schema.xsd.tenderreceipt_21.TenderReceiptType.class,
			"UBL-TenderReceipt-2.1.xsd"),
	TRADE_ITEM_LOCATION_PROFILE(
			oasis.names.specification.ubl.schema.xsd.tradeitemlocationprofile_21.TradeItemLocationProfileType.class,
			"UBL-TradeItemLocationProfile-2.1.xsd"),
	TRANSPORTATION_STATUS(
			oasis.names.specification.ubl.schema.xsd.transportationstatus_21.TransportationStatusType.class,
			"UBL-TransportationStatus-2.1.xsd"),
	TRANSPORTATION_STATUS_REQUEST(
			oasis.names.specification.ubl.schema.xsd.transportationstatusrequest_21.TransportationStatusRequestType.class,
			"UBL-TransportationStatusRequest-2.1.xsd"),
	TRANSPORT_EXECUTION_PLAN(
			oasis.names.specification.ubl.schema.xsd.transportexecutionplan_21.TransportExecutionPlanType.class,
			"UBL-TransportExecutionPlan-2.1.xsd"),
	TRANSPORT_EXECUTION_PLAN_REQUEST(
			oasis.names.specification.ubl.schema.xsd.transportexecutionplanrequest_21.TransportExecutionPlanRequestType.class,
			"UBL-TransportExecutionPlanRequest-2.1.xsd"),
	TRANSPORT_PROGRESS_STATUS(
			oasis.names.specification.ubl.schema.xsd.transportprogressstatus_21.TransportProgressStatusType.class,
			"UBL-TransportProgressStatus-2.1.xsd"),
	TRANSPORT_PROGRESS_STATUS_REQUEST(
			oasis.names.specification.ubl.schema.xsd.transportprogressstatusrequest_21.TransportProgressStatusRequestType.class,
			"UBL-TransportProgressStatusRequest-2.1.xsd"),
	TRANSPORT_SERVICE_DESCRIPTION(
			oasis.names.specification.ubl.schema.xsd.transportservicedescription_21.TransportServiceDescriptionType.class,
			"UBL-TransportServiceDescription-2.1.xsd"),
	TRANSPORT_SERVICE_DESCRIPTION_REQUEST(
			oasis.names.specification.ubl.schema.xsd.transportservicedescriptionrequest_21.TransportServiceDescriptionRequestType.class,
			"UBL-TransportServiceDescriptionRequest-2.1.xsd"),
	UNAWARDED_NOTIFICATION(
			oasis.names.specification.ubl.schema.xsd.unawardednotification_21.UnawardedNotificationType.class,
			"UBL-UnawardedNotification-2.1.xsd"),
	UTILITY_STATEMENT(oasis.names.specification.ubl.schema.xsd.utilitystatement_21.UtilityStatementType.class,
			"UBL-UtilityStatement-2.1.xsd"),
	WAYBILL(oasis.names.specification.ubl.schema.xsd.waybill_21.WaybillType.class, "UBL-Waybill-2.1.xsd");

	private final JAXBDocumentType m_aDocType;

	@Nonnull
	private static ClassLoader _getCL() {
		return EUBL21DocumentType.class.getClassLoader();
	}

	EUBL21DocumentType(@Nonnull final Class<?> aClass, @Nonnull final String sXSDPath) {
		m_aDocType = new JAXBDocumentType(aClass,
				new CommonsArrayList<>(CCCTS.getXSDResource(), CXMLDSig.getXSDResource(), CXAdES132.getXSDResource(),
						CXAdES141.getXSDResource(),
						new ClassPathResource(CUBL21.SCHEMA_DIRECTORY + sXSDPath, _getCL())),
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
