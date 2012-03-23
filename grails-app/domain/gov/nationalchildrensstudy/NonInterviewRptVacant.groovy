package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class NonInterviewRptVacant {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String nirVacantId
	/**
	 * Status level 1
	 */
	String nirId
	/**
	 * Status level 1
	 */
	DuVacancyIndicatorCl1 nirVacant
	/**
	 * PII level P
	 * Status level 1
	 */
	String nirVacantOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		nirVacantId(nullable: false, minSize:1, maxSize:36)
		nirId(nullable: false, minSize:1, maxSize:36)
		nirVacant(nullable: false)
		nirVacantOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'non_interview_rpt_vacant'
		psuId column:'psu_id'
		nirVacantId column:'nir_vacant_id'
		nirId column:'nir_id'
		nirVacant column:'nir_vacant'
		nirVacantOth column:'nir_vacant_oth'
		transactionType column:'transaction_type'
	}
}
