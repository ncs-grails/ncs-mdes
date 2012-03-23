package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Telephone {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String phoneId
	/**
	 * Status level 3
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
	 * Status level 3
	 */
	InformationSourceCl2 phoneInfoSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String phoneInfoSourceOth
	/**
	 * Status level 1
	 */
	String phoneInfoDate
	/**
	 * Status level 1
	 */
	String phoneInfoUpdate
	/**
	 * PII level Y
	 * Status level 3
	 */
	String phoneNbr
	/**
	 * PII level Y
	 * Status level 3
	 */
	String phoneExt
	/**
	 * Status level 3
	 */
	PhoneTypeCl1 phoneType
	/**
	 * PII level P
	 * Status level 1
	 */
	String phoneTypeOth
	/**
	 * Status level 3
	 */
	CommunicationRankCl1 phoneRank
	/**
	 * PII level P
	 * Status level 1
	 */
	String phoneRankOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 phoneLandline
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 phoneShare
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 cellPermission
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 textPermission
	/**
	 * PII level Y
	 * Status level 3
	 */
	String phoneComment
	/**
	 * Status level 2
	 */
	String phoneStartDate
	/**
	 * Status level 2
	 */
	String phoneEndDate
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		phoneId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: true, maxSize:36)
		instituteId(nullable: true, maxSize:36)
		providerId(nullable: true, maxSize:36)
		phoneInfoSource(nullable: false)
		phoneInfoSourceOth(nullable: true, maxSize:255)
		phoneInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		phoneInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		phoneNbr(nullable: true, maxSize:10)
		phoneExt(nullable: true, maxSize:5)
		phoneType(nullable: false)
		phoneTypeOth(nullable: true, maxSize:255)
		phoneRank(nullable: false)
		phoneRankOth(nullable: true, maxSize:255)
		phoneLandline(nullable: false)
		phoneShare(nullable: false)
		cellPermission(nullable: false)
		textPermission(nullable: false)
		phoneComment(nullable: true, maxSize:8000)
		phoneStartDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		phoneEndDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'telephone'
		psuId column:'psu_id'
		phoneId column:'phone_id'
		personId column:'person_id'
		instituteId column:'institute_id'
		providerId column:'provider_id'
		phoneInfoSource column:'phone_info_source'
		phoneInfoSourceOth column:'phone_info_source_oth'
		phoneInfoDate column:'phone_info_date'
		phoneInfoUpdate column:'phone_info_update'
		phoneNbr column:'phone_nbr'
		phoneExt column:'phone_ext'
		phoneType column:'phone_type'
		phoneTypeOth column:'phone_type_oth'
		phoneRank column:'phone_rank'
		phoneRankOth column:'phone_rank_oth'
		phoneLandline column:'phone_landline'
		phoneShare column:'phone_share'
		cellPermission column:'cell_permission'
		textPermission column:'text_permission'
		phoneComment column:'phone_comment'
		phoneStartDate column:'phone_start_date'
		phoneEndDate column:'phone_end_date'
		transactionType column:'transaction_type'
	}
}
