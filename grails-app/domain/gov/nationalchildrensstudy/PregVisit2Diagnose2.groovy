package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2Diagnose2 {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv2Diagnose2Id
	/**
	 * Status level 1
	 */
	String pv2Id
	/**
	 * Status level 3
	 */
	PregnancyDiagnosisCl1 diagnose2
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv2Diagnose2Id(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		diagnose2(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_diagnose_2'
		psuId column:'psu_id'
		pv2Diagnose2Id column:'pv2_diagnose2_id'
		pv2Id column:'pv2_id'
		diagnose2 column:'diagnose_2'
		transactionType column:'transaction_type'
	}
}
