package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SampleReceiptConfirm {

	/**
	 * PII level  
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * PII level  
	 * Status level 2
	 */
	String srscId
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 shipmentReceiptConfirmed
	/**
	 * Status level 2
	 */
	String shipperId
	/**
	 * Status level 2
	 */
	String shipmentTrackingNo
	/**
	 * Status level 2
	 */
	String shipmentReceiptDt
	/**
	 * Status level 2
	 */
	ShipmentConditionCl1 shipmentCondition
	/**
	 * PII level P
	 * Status level 2
	 */
	String shipmentDamagedReason
	/**
	 * Status level 2
	 */
	String sampleId
	/**
	 * Status level 2
	 */
	BigDecimal sampleReceiptTemp
	/**
	 * Status level 2
	 */
	SpecimenStatusCl7 sampleCondition
	/**
	 * Status level 2
	 */
	String shipmentReceivedBy
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		srscId(nullable: false, minSize:1, maxSize:36)
		shipmentReceiptConfirmed(nullable: false)
		shipperId(nullable: false, minSize:1, maxSize:36)
		shipmentTrackingNo(nullable: false, minSize:1, maxSize:36)
		shipmentReceiptDt(nullable: false, minSize:1, maxSize:16, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9])?")
		shipmentCondition(nullable: false)
		shipmentDamagedReason(nullable: true, maxSize:255)
		sampleId(nullable: false, minSize:1, maxSize:36)
		sampleReceiptTemp(nullable: false)
		sampleCondition(nullable: false)
		shipmentReceivedBy(nullable: false, minSize:1, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'sample_receipt_confirm'
		psuId column:'psu_id'
		srscId column:'srsc_id'
		shipmentReceiptConfirmed column:'shipment_receipt_confirmed'
		shipperId column:'shipper_id'
		shipmentTrackingNo column:'shipment_tracking_no'
		shipmentReceiptDt column:'shipment_receipt_dt'
		shipmentCondition column:'shipment_condition'
		shipmentDamagedReason column:'shipment_damaged_reason'
		sampleId column:'sample_id'
		sampleReceiptTemp column:'sample_receipt_temp'
		sampleCondition column:'sample_condition'
		shipmentReceivedBy column:'shipment_received_by'
		transactionType column:'transaction_type'
	}
}
