package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1Commute {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1CommuteId
	/**
	 * Status level 1
	 */
	String pv1Id
	/**
	 * Status level 3
	 */
	CommuteTypeCl2 commute
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1CommuteId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		commute(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_commute'
		psuId column:'psu_id'
		pv1CommuteId column:'pv1_commute_id'
		pv1Id column:'pv1_id'
		commute column:'commute'
		transactionType column:'transaction_type'
	}
}
