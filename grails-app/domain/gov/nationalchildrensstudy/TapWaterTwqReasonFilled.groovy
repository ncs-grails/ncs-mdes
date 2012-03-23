package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwqReasonFilled {

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
	String tapWaterTwqReasonFilledId
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
		tapWaterTwqId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwqReasonFilledId(nullable: false, minSize:1, maxSize:36)
		reasBottleNFilled(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twq_reason_filled'
		psuId column:'psu_id'
		tapWaterTwqId column:'tap_water_twq_id'
		tapWaterTwqReasonFilledId column:'tap_water_twq_reason_filled_id'
		reasBottleNFilled column:'reas_bottle_n_filled'
		transactionType column:'transaction_type'
	}
}
