package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwqSubsamples {

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
	String tapWaterTwqSubsamplesId
	/**
	 * Status level 2
	 */
	SubsampleTypeCl2 twqSubsamples
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwqId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwqSubsamplesId(nullable: false, minSize:1, maxSize:36)
		twqSubsamples(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twq_subsamples'
		psuId column:'psu_id'
		tapWaterTwqId column:'tap_water_twq_id'
		tapWaterTwqSubsamplesId column:'tap_water_twq_subsamples_id'
		twqSubsamples column:'twq_subsamples'
		transactionType column:'transaction_type'
	}
}
