package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwelveMthSaqSupplement {

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
	String twelveMthSaqSupplementId
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
		twelveMthSaqId(nullable: false, minSize:1, maxSize:36)
		twelveMthSaqSupplementId(nullable: false, minSize:1, maxSize:36)
		supplement(nullable: false)
		supplementOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_saq_supplement'
		psuId column:'psu_id'
		twelveMthSaqId column:'twelve_mth_saq_id'
		twelveMthSaqSupplementId column:'twelve_mth_saq_supplement_id'
		supplement column:'supplement'
		supplementOth column:'supplement_oth'
		transactionType column:'transaction_type'
	}
}
