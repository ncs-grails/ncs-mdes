package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwfDupCollected {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String tapWaterTwfId
	/**
	 * Status level 2
	 */
	String tapWaterTwfDupCollId
	/**
	 * Status level 2
	 */
	WaterCllctnReasonCl1 reasTwfDpNCollected
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwfId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwfDupCollId(nullable: false, minSize:1, maxSize:36)
		reasTwfDpNCollected(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twf_dup_collected'
		psuId column:'psu_id'
		tapWaterTwfId column:'tap_water_twf_id'
		tapWaterTwfDupCollId column:'tap_water_twf_dup_coll_id'
		reasTwfDpNCollected column:'reas_twf_dp_n_collected'
		transactionType column:'transaction_type'
	}
}
