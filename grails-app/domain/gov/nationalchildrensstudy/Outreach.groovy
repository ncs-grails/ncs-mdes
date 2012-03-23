package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Outreach {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String tsuId
	/**
	 * Status level 1
	 */
	String ssuId
	/**
	 * Status level 1
	 */
	String outreachEventId
	/**
	 * Status level 1
	 */
	String outreachEventDate
	/**
	 * Status level 4
	 */
	OutreachTargetCl1 outreachTarget
	/**
	 * PII level P
	 * Status level 4
	 */
	String outreachTargetOth
	/**
	 * Status level 3
	 */
	OutreachModeCl1 outreachMode
	/**
	 * PII level P
	 * Status level 1
	 */
	String outreachModeOth
	/**
	 * Status level 3
	 */
	OutreachTypeCl1 outreachType
	/**
	 * PII level P
	 * Status level 1
	 */
	String outreachTypeOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 outreachTailored
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 outreachLang1
	/**
	 * Status level 4
	 */
	LanguageCl2 outreachLang2
	/**
	 * PII level P
	 * Status level 1
	 */
	String outreachLangOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl6 outreachRace1
	/**
	 * Status level 4
	 */
	RaceCl3 outreachRace2
	/**
	 * PII level P
	 * Status level 4
	 */
	String outreachRaceOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl6 outreachCulture1
	/**
	 * Status level 3
	 */
	CultureCl1 outreachCulture2
	/**
	 * PII level P
	 * Status level 1
	 */
	String outreachCultureOth
	/**
	 * Status level 1
	 */
	Integer outreachQuantity
	/**
	 * Status level 1
	 */
	BigDecimal outreachCost
	/**
	 * Status level 1
	 */
	Integer outreachStaffing
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 outreachIncident
	/**
	 * Status level 1
	 */
	String incidentId
	/**
	 * Status level 3
	 */
	SuccessLevelCl1 outreachEvalResult
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tsuId(nullable: true, maxSize:36)
		ssuId(nullable: false, minSize:1, maxSize:36)
		outreachEventId(nullable: false, minSize:1, maxSize:36)
		outreachEventDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		outreachTarget(nullable: false)
		outreachTargetOth(nullable: true, maxSize:255)
		outreachMode(nullable: false)
		outreachModeOth(nullable: true, maxSize:255)
		outreachType(nullable: false)
		outreachTypeOth(nullable: true, maxSize:255)
		outreachTailored(nullable: false)
		outreachLang1(nullable: false)
		outreachLang2(nullable: false)
		outreachLangOth(nullable: true, maxSize:255)
		outreachRace1(nullable: false)
		outreachRace2(nullable: false)
		outreachRaceOth(nullable: true, maxSize:255)
		outreachCulture1(nullable: false)
		outreachCulture2(nullable: false)
		outreachCultureOth(nullable: true, maxSize:255)
		outreachQuantity(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		outreachCost(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		outreachStaffing(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		outreachIncident(nullable: false)
		incidentId(nullable: true, maxSize:36)
		outreachEvalResult(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'outreach'
		psuId column:'psu_id'
		tsuId column:'tsu_id'
		ssuId column:'ssu_id'
		outreachEventId column:'outreach_event_id'
		outreachEventDate column:'outreach_event_date'
		outreachTarget column:'outreach_target'
		outreachTargetOth column:'outreach_target_oth'
		outreachMode column:'outreach_mode'
		outreachModeOth column:'outreach_mode_oth'
		outreachType column:'outreach_type'
		outreachTypeOth column:'outreach_type_oth'
		outreachTailored column:'outreach_tailored'
		outreachLang1 column:'outreach_lang1'
		outreachLang2 column:'outreach_lang2'
		outreachLangOth column:'outreach_lang_oth'
		outreachRace1 column:'outreach_race1'
		outreachRace2 column:'outreach_race2'
		outreachRaceOth column:'outreach_race_oth'
		outreachCulture1 column:'outreach_culture1'
		outreachCulture2 column:'outreach_culture2'
		outreachCultureOth column:'outreach_culture_oth'
		outreachQuantity column:'outreach_quantity'
		outreachCost column:'outreach_cost'
		outreachStaffing column:'outreach_staffing'
		outreachIncident column:'outreach_incident'
		incidentId column:'incident_id'
		outreachEvalResult column:'outreach_eval_result'
		transactionType column:'transaction_type'
	}
}
