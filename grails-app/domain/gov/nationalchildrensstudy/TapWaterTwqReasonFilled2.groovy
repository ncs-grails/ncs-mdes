package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwqReasonFilled2 {

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
	String tapWaterTwqReasonFilled2Id
	/**
	 * Status level 2
	 */
	WaterCllctnReasonCl1 blReasBottleNFilled
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwqId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwqReasonFilled2Id(nullable: false, minSize:1, maxSize:36)
		blReasBottleNFilled(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twq_reason_filled2'
		psuId column:'psu_id'
		tapWaterTwqId column:'tap_water_twq_id'
		tapWaterTwqReasonFilled2Id column:'tap_water_twq_reason_filled2_id'
		blReasBottleNFilled column:'bl_reas_bottle_n_filled'
		transactionType column:'transaction_type'
	}
}
