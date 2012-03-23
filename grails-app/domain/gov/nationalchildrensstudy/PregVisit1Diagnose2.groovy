package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1Diagnose2 {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1Diagnose2Id
	/**
	 * Status level 1
	 */
	String pv1Id
	/**
	 * Status level 3
	 */
	PregnancyDiagnosisCl2 diagnose2
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1Diagnose2Id(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		diagnose2(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_diagnose_2'
		psuId column:'psu_id'
		pv1Diagnose2Id column:'pv1_diagnose_2_id'
		pv1Id column:'pv1_id'
		diagnose2 column:'diagnose_2'
		transactionType column:'transaction_type'
	}
}
