package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class LinkPersonProvider {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String personProviderId
	/**
	 * Status level 1
	 */
	String providerId
	/**
	 * Status level 1
	 */
	String personId
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 isActive
	/**
	 * Status level 3
	 */
	StudyIntrodctnOutcomeCl1 provIntroOutcome
	/**
	 * PII level P
	 * Status level 1
	 */
	String provIntroOutcomeOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		personProviderId(nullable: false, minSize:1, maxSize:36)
		providerId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: false, minSize:1, maxSize:36)
		isActive(nullable: false)
		provIntroOutcome(nullable: false)
		provIntroOutcomeOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'link_person_provider'
		psuId column:'psu_id'
		personProviderId column:'person_provider_id'
		providerId column:'provider_id'
		personId column:'person_id'
		isActive column:'is_active'
		provIntroOutcome column:'prov_intro_outcome'
		provIntroOutcomeOth column:'prov_intro_outcome_oth'
		transactionType column:'transaction_type'
	}
}
