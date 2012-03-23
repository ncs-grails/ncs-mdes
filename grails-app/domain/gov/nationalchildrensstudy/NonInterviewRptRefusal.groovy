package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class NonInterviewRptRefusal {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String nirRefusalId
	/**
	 * Status level 1
	 */
	String nirId
	/**
	 * Status level 1
	 */
	RefusalReasonCl1 refusalReason
	/**
	 * PII level P
	 * Status level 1
	 */
	String refusalReasonOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		nirRefusalId(nullable: false, minSize:1, maxSize:36)
		nirId(nullable: false, minSize:1, maxSize:36)
		refusalReason(nullable: false)
		refusalReasonOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'non_interview_rpt_refusal'
		psuId column:'psu_id'
		nirRefusalId column:'nir_refusal_id'
		nirId column:'nir_id'
		refusalReason column:'refusal_reason'
		refusalReasonOth column:'refusal_reason_oth'
		transactionType column:'transaction_type'
	}
}
