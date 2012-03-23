package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ParticipantConsent {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String participantConsentId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	String consentVersion
	/**
	 * Status level 1
	 */
	String consentExpiration
	/**
	 * Status level 3
	 */
	ConsentTypeCl1 consentType
	/**
	 * Status level 2
	 */
	ConsentTypeCl1 consentFormType
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 consentGiven
	/**
	 * Status level 1
	 */
	String consentDate
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 consentWithdraw
	/**
	 * Status level 3
	 */
	ConsentWithdrawReasonCl1 consentWithdrawType
	/**
	 * Status level 2
	 */
	ConsentWithdrawReasonCl2 consentWithdrawReason
	/**
	 * Status level 1
	 */
	String consentWithdrawDate
	/**
	 * Status level 3
	 */
	LanguageCl2 consentLanguage
	/**
	 * PII level P
	 * Status level 1
	 */
	String consentLanguageOth
	/**
	 * Status level 1
	 */
	String personWhoConsentedId
	/**
	 * Status level 3
	 */
	AgeStatusCl1 whoConsented
	/**
	 * Status level 1
	 */
	String personWthdrwConsentId
	/**
	 * Status level 3
	 */
	AgeStatusCl3 whoWthdrwConsent
	/**
	 * Status level 3
	 */
	TranslationMethodCl1 consentTranslate
	/**
	 * PII level P
	 * Status level 1
	 */
	String consentComments
	/**
	 * Status level 1
	 */
	String contactId
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 reconsiderationScriptUse
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		participantConsentId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		consentVersion(nullable: true, maxSize:9)
		consentExpiration(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		consentType(nullable: false)
		consentFormType(nullable: false)
		consentGiven(nullable: false)
		consentDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		consentWithdraw(nullable: false)
		consentWithdrawType(nullable: false)
		consentWithdrawReason(nullable: false)
		consentWithdrawDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		consentLanguage(nullable: false)
		consentLanguageOth(nullable: true, maxSize:255)
		personWhoConsentedId(nullable: true, maxSize:36)
		whoConsented(nullable: false)
		personWthdrwConsentId(nullable: true, maxSize:36)
		whoWthdrwConsent(nullable: false)
		consentTranslate(nullable: false)
		consentComments(nullable: true, maxSize:8000)
		contactId(nullable: true, maxSize:36)
		reconsiderationScriptUse(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'participant_consent'
		psuId column:'psu_id'
		participantConsentId column:'participant_consent_id'
		pId column:'p_id'
		consentVersion column:'consent_version'
		consentExpiration column:'consent_expiration'
		consentType column:'consent_type'
		consentFormType column:'consent_form_type'
		consentGiven column:'consent_given'
		consentDate column:'consent_date'
		consentWithdraw column:'consent_withdraw'
		consentWithdrawType column:'consent_withdraw_type'
		consentWithdrawReason column:'consent_withdraw_reason'
		consentWithdrawDate column:'consent_withdraw_date'
		consentLanguage column:'consent_language'
		consentLanguageOth column:'consent_language_oth'
		personWhoConsentedId column:'person_who_consented_id'
		whoConsented column:'who_consented'
		personWthdrwConsentId column:'person_wthdrw_consent_id'
		whoWthdrwConsent column:'who_wthdrw_consent'
		consentTranslate column:'consent_translate'
		consentComments column:'consent_comments'
		contactId column:'contact_id'
		reconsiderationScriptUse column:'reconsideration_script_use'
		transactionType column:'transaction_type'
	}
}
