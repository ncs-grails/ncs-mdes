package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class EighteenMthMotherPrescr {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String eighteenMthMotherId
	/**
	 * Status level 2
	 */
	String pId
	/**
	 * Status level 2
	 */
	String eighteenMthMotherPrescrId
	/**
	 * Status level 2
	 */
	String prescrmed
	/**
	 * Status level 2
	 */
	RouteOfRxAdminCl1 prescrAdmin
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
	DrugDoseUnitCl1 prescripFreqUnit
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		eighteenMthMotherId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eighteenMthMotherPrescrId(nullable: false, minSize:1, maxSize:36)
		prescrmed(nullable: true, maxSize:100)
		prescrAdmin(nullable: false)
		prescrAdminOth(nullable: true, maxSize:255)
		prescrTakestill(nullable: false)
		prescripFreq(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		prescripFreqUnit(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'eighteen_mth_mother_prescr'
		psuId column:'psu_id'
		eighteenMthMotherId column:'eighteen_mth_mother_id'
		pId column:'p_id'
		eighteenMthMotherPrescrId column:'eighteen_mth_mother_prescr_id'
		prescrmed column:'prescrmed'
		prescrAdmin column:'prescr_admin'
		prescrAdminOth column:'prescr_admin_oth'
		prescrTakestill column:'prescr_takestill'
		prescripFreq column:'prescrip_freq'
		prescripFreqUnit column:'prescrip_freq_unit'
		transactionType column:'transaction_type'
	}
}
