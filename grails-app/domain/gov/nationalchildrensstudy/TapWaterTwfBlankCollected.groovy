package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwfBlankCollected {

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
	String tapWaterTwfBlankCollId
	/**
	 * Status level 2
	 */
	WaterCllctnReasonCl1 reasTwfBlNCollected
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwfId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwfBlankCollId(nullable: false, minSize:1, maxSize:36)
		reasTwfBlNCollected(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twf_blank_collected'
		psuId column:'psu_id'
		tapWaterTwfId column:'tap_water_twf_id'
		tapWaterTwfBlankCollId column:'tap_water_twf_blank_coll_id'
		reasTwfBlNCollected column:'reas_twf_bl_n_collected'
		transactionType column:'transaction_type'
	}
}
