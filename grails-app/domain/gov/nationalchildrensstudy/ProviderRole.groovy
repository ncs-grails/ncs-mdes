package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ProviderRole {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String providerRoleId
	/**
	 * Status level 1
	 */
	String providerId
	/**
	 * Status level 3
	 */
	ProviderStudyRoleCl1 providerNcsRole
	/**
	 * PII level P
	 * Status level 1
	 */
	String providerNcsRoleOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		providerRoleId(nullable: false, minSize:1, maxSize:36)
		providerId(nullable: false, minSize:1, maxSize:36)
		providerNcsRole(nullable: false)
		providerNcsRoleOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'provider_role'
		psuId column:'psu_id'
		providerRoleId column:'provider_role_id'
		providerId column:'provider_id'
		providerNcsRole column:'provider_ncs_role'
		providerNcsRoleOth column:'provider_ncs_role_oth'
		transactionType column:'transaction_type'
	}
}
