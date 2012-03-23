package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class EighteenMthMotherOtc {

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
	String eighteenMthMotherOtcId
	/**
	 * Status level 2
	 */
	String otcmed
	/**
	 * Status level 2
	 */
	RouteOfRxAdminCl1 otcAdmin
	/**
	 * PII level P
	 * Status level 2
	 */
	String otcAdminOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 otcTakestill
	/**
	 * Status level 2
	 */
	Integer otcFreq
	/**
	 * Status level 2
	 */
	DrugDoseUnitCl1 otcFreqUnit
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		eighteenMthMotherId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eighteenMthMotherOtcId(nullable: false, minSize:1, maxSize:36)
		otcmed(nullable: true, maxSize:100)
		otcAdmin(nullable: false)
		otcAdminOth(nullable: true, maxSize:255)
		otcTakestill(nullable: false)
		otcFreq(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		otcFreqUnit(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'eighteen_mth_mother_otc'
		psuId column:'psu_id'
		eighteenMthMotherId column:'eighteen_mth_mother_id'
		pId column:'p_id'
		eighteenMthMotherOtcId column:'eighteen_mth_mother_otc_id'
		otcmed column:'otcmed'
		otcAdmin column:'otc_admin'
		otcAdminOth column:'otc_admin_oth'
		otcTakestill column:'otc_takestill'
		otcFreq column:'otc_freq'
		otcFreqUnit column:'otc_freq_unit'
		transactionType column:'transaction_type'
	}
}
