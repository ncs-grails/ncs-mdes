package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwelveMthSaqWater {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String twelveMthSaqId
	/**
	 * Status level 1
	 */
	String twelveMthSaqWaterId
	/**
	 * Status level 3
	 */
	WaterTypeCl3 water1
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twelveMthSaqId(nullable: false, minSize:1, maxSize:36)
		twelveMthSaqWaterId(nullable: false, minSize:1, maxSize:36)
		water1(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_saq_water'
		psuId column:'psu_id'
		twelveMthSaqId column:'twelve_mth_saq_id'
		twelveMthSaqWaterId column:'twelve_mth_saq_water_id'
		water1 column:'water_1'
		transactionType column:'transaction_type'
	}
}
