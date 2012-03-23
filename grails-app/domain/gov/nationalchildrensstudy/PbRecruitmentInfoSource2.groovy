package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PbRecruitmentInfoSource2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pbRecruitmentId
	/**
	 * Status level 2
	 */
	String pbRecruitInfoSourceId
	/**
	 * Status level 2
	 */
	InformationSourceCl6 pbInstiInfoSource
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pbRecruitmentId(nullable: false, minSize:1, maxSize:36)
		pbRecruitInfoSourceId(nullable: false, minSize:1, maxSize:36)
		pbInstiInfoSource(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pb_recruitment_info_source_2'
		psuId column:'psu_id'
		pbRecruitmentId column:'pb_recruitment_id'
		pbRecruitInfoSourceId column:'pb_recruit_info_source_id'
		pbInstiInfoSource column:'pb_insti_info_source'
		transactionType column:'transaction_type'
	}
}
