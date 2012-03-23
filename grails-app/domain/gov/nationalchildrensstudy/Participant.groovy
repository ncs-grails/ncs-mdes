package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Participant {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	ParticipantTypeCl1 pType
	/**
	 * PII level P
	 * Status level 1
	 */
	String pTypeOth
	/**
	 * Status level 3
	 */
	InformationSourceCl4 statusInfoSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String statusInfoSourceOth
	/**
	 * Status level 3
	 */
	ContactTypeCl1 statusInfoMode
	/**
	 * PII level P
	 * Status level 1
	 */
	String statusInfoModeOth
	/**
	 * Status level 1
	 */
	String statusInfoDate
	/**
	 * Status level 1
	 */
	ConfirmTypeCl2 enrollStatus
	/**
	 * Status level 1
	 */
	String enrollDate
	/**
	 * Status level 3
	 */
	StudyEntryMethodCl1 pidEntry
	/**
	 * PII level P
	 * Status level 1
	 */
	String pidEntryOther
	/**
	 * Status level 3
	 */
	AgeEligibleCl2 pidAgeElig
	/**
	 * PII level P
	 * Status level 1
	 */
	String pidComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pId(nullable: false, minSize:1, maxSize:36)
		pType(nullable: false)
		pTypeOth(nullable: true, maxSize:255)
		statusInfoSource(nullable: false)
		statusInfoSourceOth(nullable: true, maxSize:255)
		statusInfoMode(nullable: false)
		statusInfoModeOth(nullable: true, maxSize:255)
		statusInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		enrollStatus(nullable: false)
		enrollDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		pidEntry(nullable: false)
		pidEntryOther(nullable: true, maxSize:255)
		pidAgeElig(nullable: false)
		pidComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'participant'
		psuId column:'psu_id'
		pId column:'p_id'
		pType column:'p_type'
		pTypeOth column:'p_type_oth'
		statusInfoSource column:'status_info_source'
		statusInfoSourceOth column:'status_info_source_oth'
		statusInfoMode column:'status_info_mode'
		statusInfoModeOth column:'status_info_mode_oth'
		statusInfoDate column:'status_info_date'
		enrollStatus column:'enroll_status'
		enrollDate column:'enroll_date'
		pidEntry column:'pid_entry'
		pidEntryOther column:'pid_entry_other'
		pidAgeElig column:'pid_age_elig'
		pidComment column:'pid_comment'
		transactionType column:'transaction_type'
	}
}
