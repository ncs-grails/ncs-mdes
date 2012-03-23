package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1LocalTrav {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1LocalTravId
	/**
	 * Status level 1
	 */
	String pv1Id
	/**
	 * Status level 3
	 */
	CommuteTypeCl2 localTrav
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1LocalTravId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		localTrav(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_local_trav'
		psuId column:'psu_id'
		pv1LocalTravId column:'pv1_local_trav_id'
		pv1Id column:'pv1_id'
		localTrav column:'local_trav'
		transactionType column:'transaction_type'
	}
}
