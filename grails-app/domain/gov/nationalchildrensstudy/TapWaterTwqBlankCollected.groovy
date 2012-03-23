package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwqBlankCollected {

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
	String tapWaterTwqBlankCollId
	/**
	 * Status level 2
	 */
	WaterCllctnReasonCl1 reasTwqBlNCollected
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwqId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwqBlankCollId(nullable: false, minSize:1, maxSize:36)
		reasTwqBlNCollected(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twq_blank_collected'
		psuId column:'psu_id'
		tapWaterTwqId column:'tap_water_twq_id'
		tapWaterTwqBlankCollId column:'tap_water_twq_blank_coll_id'
		reasTwqBlNCollected column:'reas_twq_bl_n_collected'
		transactionType column:'transaction_type'
	}
}
