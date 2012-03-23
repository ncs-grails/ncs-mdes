package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ParticipantRvis {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String rvisId
	/**
	 * Status level 2
	 */
	String pId
	/**
	 * Status level 2
	 */
	LanguageCl2 rvisLanguage
	/**
	 * PII level P
	 * Status level 2
	 */
	String rvisLanguageOth
	/**
	 * Status level 2
	 */
	String rvisPerson
	/**
	 * Status level 2
	 */
	AgeStatusCl1 rvisWhoConsented
	/**
	 * Status level 2
	 */
	TranslationMethodCl1 rvisTranslate
	/**
	 * Status level 2
	 */
	String contactId
	/**
	 * Status level 2
	 */
	String timeStamp1
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 rvisSections
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 rvisDuringInterv
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 rvisDuringBio
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 rvisBioCord
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 rvisDuringEnv
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 rvisDuringThanks
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 rvisAfterSaq
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 rvisReconsideration
	/**
	 * Status level 2
	 */
	String timeStamp2
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		rvisId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		rvisLanguage(nullable: false)
		rvisLanguageOth(nullable: true, maxSize:255)
		rvisPerson(nullable: true, maxSize:36)
		rvisWhoConsented(nullable: false)
		rvisTranslate(nullable: false)
		contactId(nullable: false, minSize:1, maxSize:36)
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rvisSections(nullable: false)
		rvisDuringInterv(nullable: false)
		rvisDuringBio(nullable: false)
		rvisBioCord(nullable: false)
		rvisDuringEnv(nullable: false)
		rvisDuringThanks(nullable: false)
		rvisAfterSaq(nullable: false)
		rvisReconsideration(nullable: false)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'participant_rvis'
		psuId column:'psu_id'
		rvisId column:'rvis_id'
		pId column:'p_id'
		rvisLanguage column:'rvis_language'
		rvisLanguageOth column:'rvis_language_oth'
		rvisPerson column:'rvis_person'
		rvisWhoConsented column:'rvis_who_consented'
		rvisTranslate column:'rvis_translate'
		contactId column:'contact_id'
		timeStamp1 column:'time_stamp_1'
		rvisSections column:'rvis_sections'
		rvisDuringInterv column:'rvis_during_interv'
		rvisDuringBio column:'rvis_during_bio'
		rvisBioCord column:'rvis_bio_cord'
		rvisDuringEnv column:'rvis_during_env'
		rvisDuringThanks column:'rvis_during_thanks'
		rvisAfterSaq column:'rvis_after_saq'
		rvisReconsideration column:'rvis_reconsideration'
		timeStamp2 column:'time_stamp_2'
		transactionType column:'transaction_type'
	}
}
