package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwelveMthSaqFormulaType {

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
	String twelveMthSaqFormulaTypeId
	/**
	 * Status level 3
	 */
	FormulaTypeCl1 formulaType
	/**
	 * Status level 1
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
		table 'twelve_mth_saq_formula_type'
		psuId column:'psu_id'
		twelveMthSaqId column:'twelve_mth_saq_id'
		twelveMthSaqFormulaTypeId column:'twelve_mth_saq_formula_type_id'
		formulaType column:'formula_type'
		transactionType column:'transaction_type'
	}
}
