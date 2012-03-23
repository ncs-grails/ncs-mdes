package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthSaqFormulaType2 {

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
	String sixMthFormulaTypeId
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
		sixMthSaqId(nullable: false, minSize:1, maxSize:36)
		sixMthFormulaTypeId(nullable: false, minSize:1, maxSize:36)
		formulaType(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'six_mth_saq_formula_type_2'
		psuId column:'psu_id'
		sixMthSaqId column:'six_mth_saq_id'
		sixMthFormulaTypeId column:'six_mth_formula_type_id'
		formulaType column:'formula_type'
		transactionType column:'transaction_type'
	}
}
