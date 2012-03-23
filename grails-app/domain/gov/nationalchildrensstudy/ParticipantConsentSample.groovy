package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ParticipantConsentSample {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pId
	/**
	 * Status level 2
	 */
	String participantConsentId
	/**
	 * Status level 2
	 */
	String participantConsentSampleId
	/**
	 * Status level 2
	 */
	ConsentTypeCl2 sampleConsentType
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 sampleConsentGiven
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pId(nullable: false, minSize:1, maxSize:36)
		participantConsentId(nullable: false, minSize:1, maxSize:36)
		participantConsentSampleId(nullable: false, minSize:1, maxSize:36)
		sampleConsentType(nullable: false)
		sampleConsentGiven(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'participant_consent_sample'
		psuId column:'psu_id'
		pId column:'p_id'
		participantConsentId column:'participant_consent_id'
		participantConsentSampleId column:'participant_consent_sample_id'
		sampleConsentType column:'sample_consent_type'
		sampleConsentGiven column:'sample_consent_given'
		transactionType column:'transaction_type'
	}
}
