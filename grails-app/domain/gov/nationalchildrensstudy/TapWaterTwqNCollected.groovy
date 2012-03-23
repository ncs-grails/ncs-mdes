package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwqNCollected {

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
	String tapWaterTwqNCollectedId
	/**
	 * Status level 2
	 */
	WaterCllctnReasonCl1 reasonTwqNCollected
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwqId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwqNCollectedId(nullable: false, minSize:1, maxSize:36)
		reasonTwqNCollected(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twq_n_collected'
		psuId column:'psu_id'
		tapWaterTwqId column:'tap_water_twq_id'
		tapWaterTwqNCollectedId column:'tap_water_twq_n_collected_id'
		reasonTwqNCollected column:'reason_twq_n_collected'
		transactionType column:'transaction_type'
	}
}
