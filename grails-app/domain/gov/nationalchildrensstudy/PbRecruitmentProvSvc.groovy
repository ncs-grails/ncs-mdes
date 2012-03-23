package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PbRecruitmentProvSvc {

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
	String pbRecruitProvSvcId
	/**
	 * Status level 3
	 */
	ProviderServiceCl1 pbProvSvc
	/**
	 * PII level P
	 * Status level 1
	 */
	String pbProvSvcOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pbRecruitmentId(nullable: false, minSize:1, maxSize:36)
		pbRecruitProvSvcId(nullable: false, minSize:1, maxSize:36)
		pbProvSvc(nullable: false)
		pbProvSvcOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pb_recruitment_prov_svc'
		psuId column:'psu_id'
		pbRecruitmentId column:'pb_recruitment_id'
		pbRecruitProvSvcId column:'pb_recruit_prov_svc_id'
		pbProvSvc column:'pb_prov_svc'
		pbProvSvcOth column:'pb_prov_svc_oth'
		transactionType column:'transaction_type'
	}
}
