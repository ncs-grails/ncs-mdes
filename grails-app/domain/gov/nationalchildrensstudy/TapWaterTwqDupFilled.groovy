package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwqDupFilled {

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
	String tapWaterTwqDupFilledId
	/**
	 * Status level 2
	 */
	WaterCllctnReasonCl1 dpReasBottleNFilled
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwqId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwqDupFilledId(nullable: false, minSize:1, maxSize:36)
		dpReasBottleNFilled(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twq_dup_filled'
		psuId column:'psu_id'
		tapWaterTwqId column:'tap_water_twq_id'
		tapWaterTwqDupFilledId column:'tap_water_twq_dup_filled_id'
		dpReasBottleNFilled column:'dp_reas_bottle_n_filled'
		transactionType column:'transaction_type'
	}
}
