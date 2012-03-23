package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Email {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String emailId
	/**
	 * Status level 1
	 */
	String personId
	/**
	 * Status level 1
	 */
	String instituteId
	/**
	 * Status level 1
	 */
	String providerId
	/**
	 * PII level Y
	 * Status level 3
	 */
	String email
	/**
	 * Status level 3
	 */
	CommunicationRankCl1 emailRank
	/**
	 * PII level P
	 * Status level 1
	 */
	String emailRankOth
	/**
	 * Status level 3
	 */
	InformationSourceCl2 emailInfoSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String emailInfoSourceOth
	/**
	 * Status level 1
	 */
	String emailInfoDate
	/**
	 * Status level 1
	 */
	String emailInfoUpdate
	/**
	 * Status level 3
	 */
	EmailTypeCl1 emailType
	/**
	 * PII level P
	 * Status level 1
	 */
	String emailTypeOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 emailShare
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 emailActive
	/**
	 * PII level P
	 * Status level 1
	 */
	String emailComment
	/**
	 * Status level 2
	 */
	String emailStartDate
	/**
	 * Status level 2
	 */
	String emailEndDate
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		emailId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: true, maxSize:36)
		instituteId(nullable: true, maxSize:36)
		providerId(nullable: true, maxSize:36)
		email(nullable: true, maxSize:100)
		emailRank(nullable: false)
		emailRankOth(nullable: true, maxSize:255)
		emailInfoSource(nullable: false)
		emailInfoSourceOth(nullable: true, maxSize:255)
		emailInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		emailInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		emailType(nullable: false)
		emailTypeOth(nullable: true, maxSize:255)
		emailShare(nullable: false)
		emailActive(nullable: false)
		emailComment(nullable: true, maxSize:8000)
		emailStartDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		emailEndDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'email'
		psuId column:'psu_id'
		emailId column:'email_id'
		personId column:'person_id'
		instituteId column:'institute_id'
		providerId column:'provider_id'
		email column:'email'
		emailRank column:'email_rank'
		emailRankOth column:'email_rank_oth'
		emailInfoSource column:'email_info_source'
		emailInfoSourceOth column:'email_info_source_oth'
		emailInfoDate column:'email_info_date'
		emailInfoUpdate column:'email_info_update'
		emailType column:'email_type'
		emailTypeOth column:'email_type_oth'
		emailShare column:'email_share'
		emailActive column:'email_active'
		emailComment column:'email_comment'
		emailStartDate column:'email_start_date'
		emailEndDate column:'email_end_date'
		transactionType column:'transaction_type'
	}
}
