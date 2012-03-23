package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PbRecruitmentProvSource {

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
	String pbRecruitProvSourceId
	/**
	 * Status level 3
	 */
	InformationSourceCl5 pbProvSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String pbProvSourceOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pbRecruitmentId(nullable: false, minSize:1, maxSize:36)
		pbRecruitProvSourceId(nullable: false, minSize:1, maxSize:36)
		pbProvSource(nullable: false)
		pbProvSourceOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pb_recruitment_prov_source'
		psuId column:'psu_id'
		pbRecruitmentId column:'pb_recruitment_id'
		pbRecruitProvSourceId column:'pb_recruit_prov_source_id'
		pbProvSource column:'pb_prov_source'
		pbProvSourceOth column:'pb_prov_source_oth'
		transactionType column:'transaction_type'
	}
}
