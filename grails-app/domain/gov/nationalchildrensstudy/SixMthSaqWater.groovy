package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthSaqWater {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String sixMthSaqId
	/**
	 * Status level 1
	 */
	String sixMonthWaterId
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
		sixMthSaqId(nullable: false, minSize:1, maxSize:36)
		sixMonthWaterId(nullable: false, minSize:1, maxSize:36)
		water1(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'six_mth_saq_water'
		psuId column:'psu_id'
		sixMthSaqId column:'six_mth_saq_id'
		sixMonthWaterId column:'six_month_water_id'
		water1 column:'water_1'
		transactionType column:'transaction_type'
	}
}
