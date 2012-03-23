package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1Heat22 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv1Heat2Id
	/**
	 * Status level 2
	 */
	String pv1Id
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
		pv1Heat2Id(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		heat2(nullable: false)
		heat2Oth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_heat2_2'
		psuId column:'psu_id'
		pv1Heat2Id column:'pv1_heat2_id'
		pv1Id column:'pv1_id'
		heat2 column:'heat2'
		heat2Oth column:'heat2_oth'
		transactionType column:'transaction_type'
	}
}
