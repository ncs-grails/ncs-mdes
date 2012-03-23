package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class FatherPv1Cancer {

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
	String fatherCancerId
	/**
	 * Status level 2
	 */
	CancerTypeCl1 fCancerType
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		fatherId(nullable: false, minSize:1, maxSize:36)
		fatherCancerId(nullable: false, minSize:1, maxSize:36)
		fCancerType(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'father_pv1_cancer'
		psuId column:'psu_id'
		fatherId column:'father_id'
		fatherCancerId column:'father_cancer_id'
		fCancerType column:'f_cancer_type'
		transactionType column:'transaction_type'
	}
}
