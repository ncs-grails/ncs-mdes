package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisitLiCool2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pvLiId
	/**
	 * Status level 2
	 */
	String pvLiCoolId
	/**
	 * Status level 2
	 */
	CoolingSystemTypeCl3 cool
	/**
	 * PII level P
	 * Status level 2
	 */
	String coolOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pvLiId(nullable: false, minSize:1, maxSize:36)
		pvLiCoolId(nullable: false, minSize:1, maxSize:36)
		cool(nullable: false)
		coolOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_li_cool_2'
		psuId column:'psu_id'
		pvLiId column:'pv_li_id'
		pvLiCoolId column:'pv_li_cool_id'
		cool column:'cool'
		coolOth column:'cool_oth'
		transactionType column:'transaction_type'
	}
}
