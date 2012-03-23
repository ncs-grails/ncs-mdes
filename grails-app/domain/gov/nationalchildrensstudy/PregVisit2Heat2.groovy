package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2Heat2 {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv2Heat2Id
	/**
	 * Status level 1
	 */
	String pv2Id
	/**
	 * Status level 3
	 */
	HeatTypeCl1 heat2
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv2Heat2Id(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		heat2(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_heat2'
		psuId column:'psu_id'
		pv2Heat2Id column:'pv2_heat2_id'
		pv2Id column:'pv2_id'
		heat2 column:'heat2'
		transactionType column:'transaction_type'
	}
}
