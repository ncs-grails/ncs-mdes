package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwelveMthSaqFormulaType2 {

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
	String twelveMthSaqFormulaTypeId
	/**
	 * Status level 2
	 */
	FormulaTypeCl1 formulaType
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twelveMthSaqId(nullable: false, minSize:1, maxSize:36)
		twelveMthSaqFormulaTypeId(nullable: false, minSize:1, maxSize:36)
		formulaType(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_saq_formula_type_2'
		psuId column:'psu_id'
		twelveMthSaqId column:'twelve_mth_saq_id'
		twelveMthSaqFormulaTypeId column:'twelve_mth_saq_formula_type_id'
		formulaType column:'formula_type'
		transactionType column:'transaction_type'
	}
}
