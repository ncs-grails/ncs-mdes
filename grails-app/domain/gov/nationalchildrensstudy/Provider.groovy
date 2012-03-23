package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Provider {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String providerId
	/**
	 * Status level 3
	 */
	ProviderTypeCl1 providerType
	/**
	 * PII level P
	 * Status level 1
	 */
	String providerTypeOth
	/**
	 * Status level 4
	 */
	ProviderStudyRoleCl1 providerNcsRole
	/**
	 * PII level P
	 * Status level 4
	 */
	String providerNcsRoleOth
	/**
	 * Status level 3
	 */
	PracticeCharacteristicCl1 practiceInfo
	/**
	 * Status level 3
	 */
	PracticeLoadRangeCl1 practicePatientLoad
	/**
	 * Status level 3
	 */
	PracticeSizeRangeCl1 practiceSize
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 publicPractice
	/**
	 * Status level 3
	 */
	InformationSourceCl2 providerInfoSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String providerInfoSourceOth
	/**
	 * Status level 1
	 */
	String providerInfoDate
	/**
	 * Status level 1
	 */
	String providerInfoUpdate
	/**
	 * PII level P
	 * Status level 1
	 */
	String providerComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		providerId(nullable: false, minSize:1, maxSize:36)
		providerType(nullable: false)
		providerTypeOth(nullable: true, maxSize:255)
		providerNcsRole(nullable: false)
		providerNcsRoleOth(nullable: true, maxSize:255)
		practiceInfo(nullable: false)
		practicePatientLoad(nullable: false)
		practiceSize(nullable: false)
		publicPractice(nullable: false)
		providerInfoSource(nullable: false)
		providerInfoSourceOth(nullable: true, maxSize:255)
		providerInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		providerInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		providerComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'provider'
		psuId column:'psu_id'
		providerId column:'provider_id'
		providerType column:'provider_type'
		providerTypeOth column:'provider_type_oth'
		providerNcsRole column:'provider_ncs_role'
		providerNcsRoleOth column:'provider_ncs_role_oth'
		practiceInfo column:'practice_info'
		practicePatientLoad column:'practice_patient_load'
		practiceSize column:'practice_size'
		publicPractice column:'public_practice'
		providerInfoSource column:'provider_info_source'
		providerInfoSourceOth column:'provider_info_source_oth'
		providerInfoDate column:'provider_info_date'
		providerInfoUpdate column:'provider_info_update'
		providerComment column:'provider_comment'
		transactionType column:'transaction_type'
	}
}
