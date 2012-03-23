package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwfDupFilled {

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
	String tapWaterTwfDupFilledId
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
		tapWaterTwfId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwfDupFilledId(nullable: false, minSize:1, maxSize:36)
		dpReasBottleNFilled(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twf_dup_filled'
		psuId column:'psu_id'
		tapWaterTwfId column:'tap_water_twf_id'
		tapWaterTwfDupFilledId column:'tap_water_twf_dup_filled_id'
		dpReasBottleNFilled column:'dp_reas_bottle_n_filled'
		transactionType column:'transaction_type'
	}
}
