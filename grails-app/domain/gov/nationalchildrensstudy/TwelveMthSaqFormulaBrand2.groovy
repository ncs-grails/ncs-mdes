package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwelveMthSaqFormulaBrand2 {

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
	String twelveMthSaqFormulaBrandId
	/**
	 * Status level 2
	 */
	BabyFormulaCl2 formulaBrand
	/**
	 * PII level P
	 * Status level 2
	 */
	String formulaBrandOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twelveMthSaqId(nullable: false, minSize:1, maxSize:36)
		twelveMthSaqFormulaBrandId(nullable: false, minSize:1, maxSize:36)
		formulaBrand(nullable: false)
		formulaBrandOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_saq_formula_brand_2'
		psuId column:'psu_id'
		twelveMthSaqId column:'twelve_mth_saq_id'
		twelveMthSaqFormulaBrandId column:'twelve_mth_saq_formula_brand_id'
		formulaBrand column:'formula_brand'
		formulaBrandOth column:'formula_brand_oth'
		transactionType column:'transaction_type'
	}
}
