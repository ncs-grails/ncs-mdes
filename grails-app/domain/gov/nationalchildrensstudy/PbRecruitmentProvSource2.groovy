package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PbRecruitmentProvSource2 {

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
	String pbRecruitProvSourceId
	/**
	 * Status level 2
	 */
	InformationSourceCl7 pbProvSource
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pbRecruitmentId(nullable: false, minSize:1, maxSize:36)
		pbRecruitProvSourceId(nullable: false, minSize:1, maxSize:36)
		pbProvSource(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pb_recruitment_prov_source_2'
		psuId column:'psu_id'
		pbRecruitmentId column:'pb_recruitment_id'
		pbRecruitProvSourceId column:'pb_recruit_prov_source_id'
		pbProvSource column:'pb_prov_source'
		transactionType column:'transaction_type'
	}
}
