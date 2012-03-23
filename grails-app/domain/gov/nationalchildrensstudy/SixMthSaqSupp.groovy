package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthSaqSupp {

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
	String sixMonthSupplementId
	/**
	 * Status level 3
	 */
	SupplementCl1 supplement
	/**
	 * PII level P
	 * Status level 1
	 */
	String supplementOth
	/**
	 * Status level 1
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
		table 'six_mth_saq_supp'
		psuId column:'psu_id'
		sixMthSaqId column:'six_mth_saq_id'
		sixMonthSupplementId column:'six_month_supplement_id'
		supplement column:'supplement'
		supplementOth column:'supplement_oth'
		transactionType column:'transaction_type'
	}
}
