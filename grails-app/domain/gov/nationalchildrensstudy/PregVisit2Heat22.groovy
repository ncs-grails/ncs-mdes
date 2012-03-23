package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2Heat22 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv2Heat2Id
	/**
	 * Status level 2
	 */
	String pv2Id
	/**
	 * Status level 2
	 */
	HeatTypeCl1 heat2
	/**
	 * PII level P
	 * Status level 2
	 */
	String heat2Oth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv2Heat2Id(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		heat2(nullable: false)
		heat2Oth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_heat2_2'
		psuId column:'psu_id'
		pv2Heat2Id column:'pv2_heat2_id'
		pv2Id column:'pv2_id'
		heat2 column:'heat2'
		heat2Oth column:'heat2_oth'
		transactionType column:'transaction_type'
	}
}
