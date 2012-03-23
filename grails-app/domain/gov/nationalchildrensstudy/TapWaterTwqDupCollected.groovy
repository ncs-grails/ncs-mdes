package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwqDupCollected {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String tapWaterTwqId
	/**
	 * Status level 2
	 */
	String tapWaterTwqDupCollId
	/**
	 * Status level 2
	 */
	WaterCllctnReasonCl1 reasTwqDpNCollected
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwqId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwqDupCollId(nullable: false, minSize:1, maxSize:36)
		reasTwqDpNCollected(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twq_dup_collected'
		psuId column:'psu_id'
		tapWaterTwqId column:'tap_water_twq_id'
		tapWaterTwqDupCollId column:'tap_water_twq_dup_coll_id'
		reasTwqDpNCollected column:'reas_twq_dp_n_collected'
		transactionType column:'transaction_type'
	}
}
