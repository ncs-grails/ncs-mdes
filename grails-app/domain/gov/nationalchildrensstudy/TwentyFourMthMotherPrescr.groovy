package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwentyFourMthMotherPrescr {

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
	String twentyFourMthMotherPrescrId
	/**
	 * Status level 2
	 */
	String prescrmed
	/**
	 * Status level 2
	 */
	RouteOfRxAdminCl2 prescrAdmin
	/**
	 * Status level 2
	 */
	DrugDoseUnitCl1 prescripFreqUnit
	/**
	 * PII level P
	 * Status level 2
	 */
	String prescrAdminOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 prescrTakestill
	/**
	 * Status level 2
	 */
	Integer prescripFreq
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twentyFourMthMotherId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		twentyFourMthMotherPrescrId(nullable: false, minSize:1, maxSize:36)
		prescrmed(nullable: true, maxSize:100)
		prescrAdmin(nullable: false)
		prescripFreqUnit(nullable: false)
		prescrAdminOth(nullable: true, maxSize:255)
		prescrTakestill(nullable: false)
		prescripFreq(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_mother_prescr'
		psuId column:'psu_id'
		twentyFourMthMotherId column:'twenty_four_mth_mother_id'
		pId column:'p_id'
		twentyFourMthMotherPrescrId column:'twenty_four_mth_mother_prescr_id'
		prescrmed column:'prescrmed'
		prescrAdmin column:'prescr_admin'
		prescripFreqUnit column:'prescrip_freq_unit'
		prescrAdminOth column:'prescr_admin_oth'
		prescrTakestill column:'prescr_takestill'
		prescripFreq column:'prescrip_freq'
		transactionType column:'transaction_type'
	}
}
