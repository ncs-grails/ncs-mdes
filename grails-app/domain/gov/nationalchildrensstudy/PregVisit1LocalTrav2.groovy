package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1LocalTrav2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv1LocalTravId
	/**
	 * Status level 2
	 */
	String pv1Id
	/**
	 * Status level 2
	 */
	CommuteTypeCl1 localTrav
	/**
	 * PII level P
	 * Status level 2
	 */
	String localTravOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1LocalTravId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		localTrav(nullable: false)
		localTravOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_local_trav_2'
		psuId column:'psu_id'
		pv1LocalTravId column:'pv1_local_trav_id'
		pv1Id column:'pv1_id'
		localTrav column:'local_trav'
		localTravOth column:'local_trav_oth'
		transactionType column:'transaction_type'
	}
}
