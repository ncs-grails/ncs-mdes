package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecPickup {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String spscId
	/**
	 * Status level 2
	 */
	String specimenId
	/**
	 * Status level 2
	 */
	String eventId
	/**
	 * Status level 2
	 */
	String instrumentId
	/**
	 * Status level 2
	 */
	String staffId
	/**
	 * Status level 2
	 */
	String specimenPickupDt
	/**
	 * Status level 2
	 */
	SpecimenStatusCl5 specimenPickupComment
	/**
	 * PII level P
	 * Status level 2
	 */
	String specimenPickupCmtOth
	/**
	 * Status level 2
	 */
	BigDecimal specimenTransTemp
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		spscId(nullable: false, minSize:1, maxSize:36)
		specimenId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		instrumentId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		specimenPickupDt(nullable: false, minSize:1, maxSize:16, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9])?")
		specimenPickupComment(nullable: false)
		specimenPickupCmtOth(nullable: true, maxSize:255)
		specimenTransTemp(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_pickup'
		psuId column:'psu_id'
		spscId column:'spsc_id'
		specimenId column:'specimen_id'
		eventId column:'event_id'
		instrumentId column:'instrument_id'
		staffId column:'staff_id'
		specimenPickupDt column:'specimen_pickup_dt'
		specimenPickupComment column:'specimen_pickup_comment'
		specimenPickupCmtOth column:'specimen_pickup_cmt_oth'
		specimenTransTemp column:'specimen_trans_temp'
		transactionType column:'transaction_type'
	}
}
