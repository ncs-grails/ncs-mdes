package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecShipping {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String storageContainerId
	/**
	 * Status level 2
	 */
	String spscId
	/**
	 * Status level 2
	 */
	String staffId
	/**
	 * Status level 2
	 */
	String shipperId
	/**
	 * Status level 2
	 */
	String shipperDestination
	/**
	 * Status level 2
	 */
	String shipmentDate
	/**
	 * Status level 2
	 */
	ShipmentTemperatureCl1 shipmentTemperature
	/**
	 * Status level 2
	 */
	String shipmentTrackingNo
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 shipmentReceiptConfirmed
	/**
	 * Status level 2
	 */
	String shipmentReceiptDt
	/**
	 * Status level 2
	 */
	ShipmentIssuesCl1 shipmentIssues
	/**
	 * PII level P
	 * Status level 2
	 */
	String shipmentIssuesOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		storageContainerId(nullable: false, minSize:1, maxSize:36)
		spscId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		shipperId(nullable: false, minSize:1, maxSize:36)
		shipperDestination(nullable: false, minSize:1, maxSize:3)
		shipmentDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		shipmentTemperature(nullable: false)
		shipmentTrackingNo(nullable: false, minSize:1, maxSize:36)
		shipmentReceiptConfirmed(nullable: false)
		shipmentReceiptDt(nullable: true, maxSize:16, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9])?")
		shipmentIssues(nullable: false)
		shipmentIssuesOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_shipping'
		psuId column:'psu_id'
		storageContainerId column:'storage_container_id'
		spscId column:'spsc_id'
		staffId column:'staff_id'
		shipperId column:'shipper_id'
		shipperDestination column:'shipper_destination'
		shipmentDate column:'shipment_date'
		shipmentTemperature column:'shipment_temperature'
		shipmentTrackingNo column:'shipment_tracking_no'
		shipmentReceiptConfirmed column:'shipment_receipt_confirmed'
		shipmentReceiptDt column:'shipment_receipt_dt'
		shipmentIssues column:'shipment_issues'
		shipmentIssuesOth column:'shipment_issues_oth'
		transactionType column:'transaction_type'
	}
}
