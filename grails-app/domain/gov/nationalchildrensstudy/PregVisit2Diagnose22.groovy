package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2Diagnose22 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv2Diagnose2Id
	/**
	 * Status level 2
	 */
	String pv2Id
	/**
	 * Status level 2
	 */
	PregnancyDiagnosisCl1 diagnose2
	/**
	 * PII level P
	 * Status level 2
	 */
	String diagnoseOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv2Diagnose2Id(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		diagnose2(nullable: false)
		diagnoseOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_diagnose_2_2'
		psuId column:'psu_id'
		pv2Diagnose2Id column:'pv2_diagnose2_id'
		pv2Id column:'pv2_id'
		diagnose2 column:'diagnose_2'
		diagnoseOth column:'diagnose_oth'
		transactionType column:'transaction_type'
	}
}
