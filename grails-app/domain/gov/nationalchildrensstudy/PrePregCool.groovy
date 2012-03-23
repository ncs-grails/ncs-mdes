package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PrePregCool {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ppCoolId
	/**
	 * Status level 1
	 */
	String ppId
	/**
	 * Status level 3
	 */
	CoolingSystemTypeCl1 cool
	/**
	 * PII level P
	 * Status level 3
	 */
	String coolOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ppCoolId(nullable: false, minSize:1, maxSize:36)
		ppId(nullable: false, minSize:1, maxSize:36)
		cool(nullable: false)
		coolOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pre_preg_cool'
		psuId column:'psu_id'
		ppCoolId column:'pp_cool_id'
		ppId column:'pp_id'
		cool column:'cool'
		coolOth column:'cool_oth'
		transactionType column:'transaction_type'
	}
}
