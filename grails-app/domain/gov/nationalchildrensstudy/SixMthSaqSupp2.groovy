package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthSaqSupp2 {

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
	String sixMonthSupplementId
	/**
	 * Status level 2
	 */
	SupplementCl4 supplement
	/**
	 * PII level P
	 * Status level 2
	 */
	String supplementOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		sixMthSaqId(nullable: false, minSize:1, maxSize:36)
		sixMonthSupplementId(nullable: false, minSize:1, maxSize:36)
		supplement(nullable: false)
		supplementOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'six_mth_saq_supp_2'
		psuId column:'psu_id'
		sixMthSaqId column:'six_mth_saq_id'
		sixMonthSupplementId column:'six_month_supplement_id'
		supplement column:'supplement'
		supplementOth column:'supplement_oth'
		transactionType column:'transaction_type'
	}
}
