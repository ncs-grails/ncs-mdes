package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ParticipantAuth {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String authFormId
	/**
	 * Status level 2
	 */
	String pId
	/**
	 * Status level 2
	 */
	String contactId
	/**
	 * Status level 2
	 */
	String providerId
	/**
	 * Status level 2
	 */
	AuthFormTypeCl1 authFormType
	/**
	 * PII level P
	 * Status level 2
	 */
	String authTypeOth
	/**
	 * Status level 2
	 */
	AuthStatusCl1 authStatus
	/**
	 * PII level P
	 * Status level 2
	 */
	String authStatusOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		authFormId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		contactId(nullable: false, minSize:1, maxSize:36)
		providerId(nullable: false, minSize:1, maxSize:36)
		authFormType(nullable: false)
		authTypeOth(nullable: true, maxSize:255)
		authStatus(nullable: false)
		authStatusOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'participant_auth'
		psuId column:'psu_id'
		authFormId column:'auth_form_id'
		pId column:'p_id'
		contactId column:'contact_id'
		providerId column:'provider_id'
		authFormType column:'auth_form_type'
		authTypeOth column:'auth_type_oth'
		authStatus column:'auth_status'
		authStatusOth column:'auth_status_oth'
		transactionType column:'transaction_type'
	}
}
