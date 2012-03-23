package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1Heat2 {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1Heat2Id
	/**
	 * Status level 1
	 */
	String pv1Id
	/**
	 * Status level 3
	 */
	HeatTypeCl3 heat2
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1Heat2Id(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		heat2(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_heat2'
		psuId column:'psu_id'
		pv1Heat2Id column:'pv1_heat2_id'
		pv1Id column:'pv1_id'
		heat2 column:'heat2'
		transactionType column:'transaction_type'
	}
}
