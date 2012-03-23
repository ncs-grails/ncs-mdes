package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2Cool2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv2CoolId
	/**
	 * Status level 2
	 */
	String pv2Id
	/**
	 * Status level 2
	 */
	CoolingSystemTypeCl1 cool
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
		pv2CoolId(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		cool(nullable: false)
		coolOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_cool_2'
		psuId column:'psu_id'
		pv2CoolId column:'pv2_cool_id'
		pv2Id column:'pv2_id'
		cool column:'cool'
		coolOth column:'cool_oth'
		transactionType column:'transaction_type'
	}
}
