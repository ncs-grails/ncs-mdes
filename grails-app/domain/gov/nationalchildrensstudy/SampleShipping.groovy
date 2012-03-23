package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SampleShipping {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String sampleId
	/**
	 * Status level 2
	 */
	String srscId
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
	ShipperDestinationCl1 shipperDestination
	/**
	 * Status level 2
	 */
	String shipmentDate
	/**
	 * Status level 2
	 */
	ShipmentTemperatureCl2 shipmentCoolant
	/**
	 * Status level 2
	 */
	String shipmentTrackingNo
	/**
	 * PII level P
	 * Status level 2
	 */
	String shipmentIssuesOth
	/**
	 * Status level 2
	 */
	String staffIdTrack
	/**
	 * Status level 2
	 */
	SamplesShippedByCl1 sampleShippedBy
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		sampleId(nullable: false, minSize:1, maxSize:36)
		srscId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		shipperId(nullable: false, minSize:1, maxSize:36)
		shipperDestination(nullable: false)
		shipmentDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		shipmentCoolant(nullable: false)
		shipmentTrackingNo(nullable: false, minSize:1, maxSize:36)
		shipmentIssuesOth(nullable: true, maxSize:255)
		staffIdTrack(nullable: true, maxSize:36)
		sampleShippedBy(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'sample_shipping'
		psuId column:'psu_id'
		sampleId column:'sample_id'
		srscId column:'srsc_id'
		staffId column:'staff_id'
		shipperId column:'shipper_id'
		shipperDestination column:'shipper_destination'
		shipmentDate column:'shipment_date'
		shipmentCoolant column:'shipment_coolant'
		shipmentTrackingNo column:'shipment_tracking_no'
		shipmentIssuesOth column:'shipment_issues_oth'
		staffIdTrack column:'staff_id_track'
		sampleShippedBy column:'sample_shipped_by'
		transactionType column:'transaction_type'
	}
}
