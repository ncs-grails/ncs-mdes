package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1Commute2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv1CommuteId
	/**
	 * Status level 2
	 */
	String pv1Id
	/**
	 * Status level 2
	 */
	CommuteTypeCl2 commute
	/**
	 * PII level P
	 * Status level 2
	 */
	String commuteOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1CommuteId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		commute(nullable: false)
		commuteOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_commute_2'
		psuId column:'psu_id'
		pv1CommuteId column:'pv1_commute_id'
		pv1Id column:'pv1_id'
		commute column:'commute'
		commuteOth column:'commute_oth'
		transactionType column:'transaction_type'
	}
}
