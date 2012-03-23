package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwqSample {

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
	String tapWaterTwqSampleId
	/**
	 * Status level 2
	 */
	SampleTypeCl2 sampleNumber
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
		tapWaterTwqId(nullable: false, minSize:1, maxSize:36)
		tapWaterTwqSampleId(nullable: false, minSize:1, maxSize:36)
		sampleNumber(nullable: false)
		sampleId(nullable: true, maxSize:14)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twq_sample'
		psuId column:'psu_id'
		tapWaterTwqId column:'tap_water_twq_id'
		tapWaterTwqSampleId column:'tap_water_twq_sample_id'
		sampleNumber column:'sample_number'
		sampleId column:'sample_id'
		transactionType column:'transaction_type'
	}
}
