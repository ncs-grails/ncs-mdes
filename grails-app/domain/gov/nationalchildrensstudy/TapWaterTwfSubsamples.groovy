package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwfSubsamples {

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
	String tapWaterTwfSubsamplesId
	/**
	 * Status level 2
	 */
	SubsampleTypeCl1 twfSubsamples
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwfId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwfSubsamplesId(nullable: false, minSize:1, maxSize:36)
		twfSubsamples(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twf_subsamples'
		psuId column:'psu_id'
		tapWaterTwfId column:'tap_water_twf_id'
		tapWaterTwfSubsamplesId column:'tap_water_twf_subsamples_id'
		twfSubsamples column:'twf_subsamples'
		transactionType column:'transaction_type'
	}
}
