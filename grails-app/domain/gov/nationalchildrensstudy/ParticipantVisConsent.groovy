package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ParticipantVisConsent {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pidVisitConsentId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	VisitTypeCl1 visConsentType
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 visConsentResponse
	/**
	 * Status level 3
	 */
	LanguageCl2 visLanguage
	/**
	 * PII level P
	 * Status level 1
	 */
	String visLanguageOth
	/**
	 * Status level 1
	 */
	String visPersonWhoConsentedId
	/**
	 * Status level 3
	 */
	AgeStatusCl1 visWhoConsented
	/**
	 * Status level 3
	 */
	TranslationMethodCl1 visTranslate
	/**
	 * PII level P
	 * Status level 1
	 */
	String visComments
	/**
	 * Status level 1
	 */
	String contactId
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pidVisitConsentId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		visConsentType(nullable: false)
		visConsentResponse(nullable: false)
		visLanguage(nullable: false)
		visLanguageOth(nullable: true, maxSize:255)
		visPersonWhoConsentedId(nullable: true, maxSize:36)
		visWhoConsented(nullable: false)
		visTranslate(nullable: false)
		visComments(nullable: true, maxSize:8000)
		contactId(nullable: true, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'participant_vis_consent'
		psuId column:'psu_id'
		pidVisitConsentId column:'pid_visit_consent_id'
		pId column:'p_id'
		visConsentType column:'vis_consent_type'
		visConsentResponse column:'vis_consent_response'
		visLanguage column:'vis_language'
		visLanguageOth column:'vis_language_oth'
		visPersonWhoConsentedId column:'vis_person_who_consented_id'
		visWhoConsented column:'vis_who_consented'
		visTranslate column:'vis_translate'
		visComments column:'vis_comments'
		contactId column:'contact_id'
		transactionType column:'transaction_type'
	}
}
