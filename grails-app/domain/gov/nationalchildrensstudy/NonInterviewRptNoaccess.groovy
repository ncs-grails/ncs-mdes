package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class NonInterviewRptNoaccess {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String nirNoaccessId
	/**
	 * Status level 1
	 */
	String nirId
	/**
	 * Status level 1
	 */
	NoAccessDescrCl1 nirNoaccess
	/**
	 * PII level P
	 * Status level 1
	 */
	String nirNoaccessOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		nirNoaccessId(nullable: false, minSize:1, maxSize:36)
		nirId(nullable: false, minSize:1, maxSize:36)
		nirNoaccess(nullable: false)
		nirNoaccessOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'non_interview_rpt_noaccess'
		psuId column:'psu_id'
		nirNoaccessId column:'nir_noaccess_id'
		nirId column:'nir_id'
		nirNoaccess column:'nir_noaccess'
		nirNoaccessOth column:'nir_noaccess_oth'
		transactionType column:'transaction_type'
	}
}
