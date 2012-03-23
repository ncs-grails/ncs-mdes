package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwfReasonFilled2 {

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
	String tapWaterTwfReasonFilled2Id
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
		tapWaterTwfId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwfReasonFilled2Id(nullable: false, minSize:1, maxSize:36)
		blReasBottleNFilled(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twf_reason_filled2'
		psuId column:'psu_id'
		tapWaterTwfId column:'tap_water_twf_id'
		tapWaterTwfReasonFilled2Id column:'tap_water_twf_reason_filled2_id'
		blReasBottleNFilled column:'bl_reas_bottle_n_filled'
		transactionType column:'transaction_type'
	}
}
