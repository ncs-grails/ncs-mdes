package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1Cool {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1CoolId
	/**
	 * Status level 1
	 */
	String pv1Id
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
		pv1CoolId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		cool(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_cool'
		psuId column:'psu_id'
		pv1CoolId column:'pv1_cool_id'
		pv1Id column:'pv1_id'
		cool column:'cool'
		transactionType column:'transaction_type'
	}
}
