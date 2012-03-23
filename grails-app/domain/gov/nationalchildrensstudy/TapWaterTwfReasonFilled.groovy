package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwfReasonFilled {

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
	String tapWaterTwfReasonFilledId
	/**
	 * Status level 2
	 */
	WaterCllctnReasonCl1 reasBottleNFilled
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwfId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwfReasonFilledId(nullable: false, minSize:1, maxSize:36)
		reasBottleNFilled(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twf_reason_filled'
		psuId column:'psu_id'
		tapWaterTwfId column:'tap_water_twf_id'
		tapWaterTwfReasonFilledId column:'tap_water_twf_reason_filled_id'
		reasBottleNFilled column:'reas_bottle_n_filled'
		transactionType column:'transaction_type'
	}
}
