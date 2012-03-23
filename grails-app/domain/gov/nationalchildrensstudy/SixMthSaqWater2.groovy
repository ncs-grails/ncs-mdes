package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthSaqWater2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String sixMthSaqId
	/**
	 * Status level 2
	 */
	String sixMonthWaterId
	/**
	 * Status level 2
	 */
	WaterTypeCl4 water1
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		sixMthSaqId(nullable: false, minSize:1, maxSize:36)
		sixMonthWaterId(nullable: false, minSize:1, maxSize:36)
		water1(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'six_mth_saq_water_2'
		psuId column:'psu_id'
		sixMthSaqId column:'six_mth_saq_id'
		sixMonthWaterId column:'six_month_water_id'
		water1 column:'water_1'
		transactionType column:'transaction_type'
	}
}
