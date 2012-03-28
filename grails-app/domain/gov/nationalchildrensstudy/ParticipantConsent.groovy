package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ParticipantConsent {

	Integer psuId
	String participantConsentId
	String pId
	String consentVersion
	String consentExpiration
	Integer consentType
	Integer consentFormType
	Integer consentGiven
	String consentDate
	Integer consentWithdraw
	Integer consentWithdrawType
	Integer consentWithdrawReason
	String consentWithdrawDate
	Integer consentLanguage
	String consentLanguageOth
	String personWhoConsentedId
	Integer whoConsented
	String personWthdrwConsentId
	Integer whoWthdrwConsent
	Integer consentTranslate
	String consentComments
	String contactId
	Integer reconsiderationScriptUse
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		participantConsentId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		consentVersion(nullable: true, maxSize:9)
		consentExpiration(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		consentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -4])
		consentFormType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -4])
		consentGiven(nullable: false, inList:[1, 2, -4])
		consentDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		consentWithdraw(nullable: false, inList:[1, 2, -4])
		consentWithdrawType(nullable: false, inList:[1, 2, -3, -4])
		consentWithdrawReason(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, -5, -4])
		consentWithdrawDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		consentLanguage(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, -1, -5, -6, -4])
		consentLanguageOth(nullable: true, maxSize:255)
		personWhoConsentedId(nullable: true, maxSize:36)
		whoConsented(nullable: false, inList:[1, 2, 3, -4])
		personWthdrwConsentId(nullable: true, maxSize:36)
		whoWthdrwConsent(nullable: false, inList:[1, 2, 3, -7, -4])
		consentTranslate(nullable: false, inList:[1, 2, 3, 4, 5, 6, -4])
		consentComments(nullable: true, maxSize:8000)
		contactId(nullable: true, maxSize:36)
		reconsiderationScriptUse(nullable: false, inList:[1, 2, -7, -4])
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
