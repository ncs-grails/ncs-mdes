package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwelveMthSaqFormulaBrand {

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
	String twelveMthSaqFormulaBrandId
	/**
	 * Status level 3
	 */
	BabyFormulaCl1 formulaBrand
	/**
	 * PII level P
	 * Status level 1
	 */
	String ftypeOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twelveMthSaqId(nullable: false, minSize:1, maxSize:36)
		twelveMthSaqFormulaBrandId(nullable: false, minSize:1, maxSize:36)
		formulaBrand(nullable: false)
		ftypeOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_saq_formula_brand'
		psuId column:'psu_id'
		twelveMthSaqId column:'twelve_mth_saq_id'
		twelveMthSaqFormulaBrandId column:'twelve_mth_saq_formula_brand_id'
		formulaBrand column:'formula_brand'
		ftypeOth column:'ftype_oth'
		transactionType column:'transaction_type'
	}
}
