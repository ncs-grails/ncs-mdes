package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2Cool {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv2CoolId
	/**
	 * Status level 1
	 */
	String pv2Id
	/**
	 * Status level 3
	 */
	CoolingSystemTypeCl1 cool
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv2CoolId(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		cool(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_cool'
		psuId column:'psu_id'
		pv2CoolId column:'pv2_cool_id'
		pv2Id column:'pv2_id'
		cool column:'cool'
		transactionType column:'transaction_type'
	}
}
