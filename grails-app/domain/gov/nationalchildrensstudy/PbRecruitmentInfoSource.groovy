package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PbRecruitmentInfoSource {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pbRecruitmentId
	/**
	 * Status level 1
	 */
	String pbRecruitInfoSourceId
	/**
	 * Status level 3
	 */
	InformationSourceCl5 pbInstiInfoSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String pbInstiInfoSourceOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pbRecruitmentId(nullable: false, minSize:1, maxSize:36)
		pbRecruitInfoSourceId(nullable: false, minSize:1, maxSize:36)
		pbInstiInfoSource(nullable: false)
		pbInstiInfoSourceOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pb_recruitment_info_source'
		psuId column:'psu_id'
		pbRecruitmentId column:'pb_recruitment_id'
		pbRecruitInfoSourceId column:'pb_recruit_info_source_id'
		pbInstiInfoSource column:'pb_insti_info_source'
		pbInstiInfoSourceOth column:'pb_insti_info_source_oth'
		transactionType column:'transaction_type'
	}
}
