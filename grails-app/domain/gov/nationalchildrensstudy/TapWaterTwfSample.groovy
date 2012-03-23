package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwfSample {

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
	String tapWaterTwfSampleId
	/**
	 * Status level 2
	 */
	SampleTypeCl1 sampleNumber
	/**
	 * Status level 2
	 */
	String sampleId
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwfId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwfSampleId(nullable: false, minSize:1, maxSize:36)
		sampleNumber(nullable: false)
		sampleId(nullable: true, maxSize:14)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twf_sample'
		psuId column:'psu_id'
		tapWaterTwfId column:'tap_water_twf_id'
		tapWaterTwfSampleId column:'tap_water_twf_sample_id'
		sampleNumber column:'sample_number'
		sampleId column:'sample_id'
		transactionType column:'transaction_type'
	}
}
