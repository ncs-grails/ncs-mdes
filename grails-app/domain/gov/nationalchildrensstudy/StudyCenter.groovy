package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class StudyCenter {

	/**
	 * Status level 1
	 */
	StudyCenterCl1 scId
	/**
	 * Status level 1
	 */
	String scName
	/**
	 * PII level P
	 * Status level 1
	 */
	String comments
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		scId(nullable: false)
		scName(nullable: true, maxSize:100)
		comments(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'study_center'
		scId column:'sc_id'
		scName column:'sc_name'
		comments column:'comments'
		transactionType column:'transaction_type'
	}
}
