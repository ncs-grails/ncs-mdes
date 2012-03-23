package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecBloodHemolyze {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String specBloodId
	/**
	 * Status level 2
	 */
	String specBloodHemolyzeId
	/**
	 * Status level 2
	 */
	TubeTypeCl2 v1TubeHemolyze
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		specBloodId(nullable: false, minSize:1, maxSize:36)
		specBloodHemolyzeId(nullable: true, minSize:1, maxSize:36)
		v1TubeHemolyze(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_blood_hemolyze'
		psuId column:'psu_id'
		specBloodId column:'spec_blood_id'
		specBloodHemolyzeId column:'spec_blood_hemolyze_id'
		v1TubeHemolyze column:'v1_tube_hemolyze'
		transactionType column:'transaction_type'
	}
}
