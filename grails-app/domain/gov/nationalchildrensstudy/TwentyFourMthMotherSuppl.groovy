package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwentyFourMthMotherSuppl {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String twentyFourMthMotherId
	/**
	 * Status level 2
	 */
	String pId
	/**
	 * Status level 2
	 */
	String twentyFourMthMotherSupplId
	/**
	 * Status level 2
	 */
	String supplmed
	/**
	 * Status level 2
	 */
	RouteOfRxAdminCl2 supplAdmin
	/**
	 * PII level P
	 * Status level 2
	 */
	String supplAdminOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 supplTakestill
	/**
	 * Status level 2
	 */
	Integer supplFreq
	/**
	 * Status level 2
	 */
	DrugDoseUnitCl1 supplFreqUnit
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twentyFourMthMotherId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		twentyFourMthMotherSupplId(nullable: false, minSize:1, maxSize:36)
		supplmed(nullable: true, maxSize:100)
		supplAdmin(nullable: false)
		supplAdminOth(nullable: true, maxSize:255)
		supplTakestill(nullable: false)
		supplFreq(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		supplFreqUnit(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_mother_suppl'
		psuId column:'psu_id'
		twentyFourMthMotherId column:'twenty_four_mth_mother_id'
		pId column:'p_id'
		twentyFourMthMotherSupplId column:'twenty_four_mth_mother_suppl_id'
		supplmed column:'supplmed'
		supplAdmin column:'suppl_admin'
		supplAdminOth column:'suppl_admin_oth'
		supplTakestill column:'suppl_takestill'
		supplFreq column:'suppl_freq'
		supplFreqUnit column:'suppl_freq_unit'
		transactionType column:'transaction_type'
	}
}
