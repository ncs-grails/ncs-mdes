package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwfNCollected {

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
	String tapWaterTwfNCollectedId
	/**
	 * Status level 2
	 */
	WaterCllctnReasonCl1 reasonTwfNCollected
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwfId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwfNCollectedId(nullable: false, minSize:1, maxSize:36)
		reasonTwfNCollected(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twf_n_collected'
		psuId column:'psu_id'
		tapWaterTwfId column:'tap_water_twf_id'
		tapWaterTwfNCollectedId column:'tap_water_twf_n_collected_id'
		reasonTwfNCollected column:'reason_twf_n_collected'
		transactionType column:'transaction_type'
	}
}
