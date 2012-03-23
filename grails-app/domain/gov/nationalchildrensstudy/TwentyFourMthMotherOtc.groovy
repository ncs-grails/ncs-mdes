package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwentyFourMthMotherOtc {

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
	String twentyFourMthMotherOtcId
	/**
	 * Status level 2
	 */
	String otcmed
	/**
	 * Status level 2
	 */
	RouteOfRxAdminCl2 otcAdmin
	/**
	 * Status level 2
	 */
	DrugDoseUnitCl1 otcFreqUnit
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
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twentyFourMthMotherId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		twentyFourMthMotherOtcId(nullable: false, minSize:1, maxSize:36)
		otcmed(nullable: true, maxSize:100)
		otcAdmin(nullable: false)
		otcFreqUnit(nullable: false)
		otcAdminOth(nullable: true, maxSize:255)
		otcTakestill(nullable: false)
		otcFreq(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_mother_otc'
		psuId column:'psu_id'
		twentyFourMthMotherId column:'twenty_four_mth_mother_id'
		pId column:'p_id'
		twentyFourMthMotherOtcId column:'twenty_four_mth_mother_otc_id'
		otcmed column:'otcmed'
		otcAdmin column:'otc_admin'
		otcFreqUnit column:'otc_freq_unit'
		otcAdminOth column:'otc_admin_oth'
		otcTakestill column:'otc_takestill'
		otcFreq column:'otc_freq'
		transactionType column:'transaction_type'
	}
}
