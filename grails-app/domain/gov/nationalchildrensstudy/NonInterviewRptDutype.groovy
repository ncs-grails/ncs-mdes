package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class NonInterviewRptDutype {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String nirDutypeId
	/**
	 * Status level 1
	 */
	String nirId
	/**
	 * Status level 1
	 */
	DuNirReasonCl1 nirTypeDu
	/**
	 * PII level P
	 * Status level 1
	 */
	String nirTypeDuOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		nirDutypeId(nullable: false, minSize:1, maxSize:36)
		nirId(nullable: false, minSize:1, maxSize:36)
		nirTypeDu(nullable: false)
		nirTypeDuOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'non_interview_rpt_dutype'
		psuId column:'psu_id'
		nirDutypeId column:'nir_dutype_id'
		nirId column:'nir_id'
		nirTypeDu column:'nir_type_du'
		nirTypeDuOth column:'nir_type_du_oth'
		transactionType column:'transaction_type'
	}
}
