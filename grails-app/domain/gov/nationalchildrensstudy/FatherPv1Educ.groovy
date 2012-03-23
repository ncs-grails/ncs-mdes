package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class FatherPv1Educ {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String fatherId
	/**
	 * Status level 2
	 */
	String fatherEducId
	/**
	 * Status level 2
	 */
	EducationLevelCl1 educ
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		fatherId(nullable: false, minSize:1, maxSize:36)
		fatherEducId(nullable: false, minSize:1, maxSize:36)
		educ(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'father_pv1_educ'
		psuId column:'psu_id'
		fatherId column:'father_id'
		fatherEducId column:'father_educ_id'
		educ column:'educ'
		transactionType column:'transaction_type'
	}
}
