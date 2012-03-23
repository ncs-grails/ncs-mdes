package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisitLiCool {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pvLiCoolId
	/**
	 * Status level 1
	 */
	String pvLiId
	/**
	 * Status level 3
	 */
	CoolingSystemTypeCl2 cool
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pvLiCoolId(nullable: false, minSize:1, maxSize:36)
		pvLiId(nullable: false, minSize:1, maxSize:36)
		cool(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_li_cool'
		psuId column:'psu_id'
		pvLiCoolId column:'pv_li_cool_id'
		pvLiId column:'pv_li_id'
		cool column:'cool'
		transactionType column:'transaction_type'
	}
}
