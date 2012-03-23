package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwelveMthSaqWater2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String twelveMthSaqId
	/**
	 * Status level 2
	 */
	String twelveMthSaqWaterId
	/**
	 * Status level 2
	 */
	WaterTypeCl3 water1
	/**
	 * PII level P
	 * Status level 2
	 */
	String water1Oth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twelveMthSaqId(nullable: false, minSize:1, maxSize:36)
		twelveMthSaqWaterId(nullable: false, minSize:1, maxSize:36)
		water1(nullable: false)
		water1Oth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_saq_water_2'
		psuId column:'psu_id'
		twelveMthSaqId column:'twelve_mth_saq_id'
		twelveMthSaqWaterId column:'twelve_mth_saq_water_id'
		water1 column:'water_1'
		water1Oth column:'water_1_oth'
		transactionType column:'transaction_type'
	}
}
