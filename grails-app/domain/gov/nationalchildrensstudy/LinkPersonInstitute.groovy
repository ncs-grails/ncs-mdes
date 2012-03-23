package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class LinkPersonInstitute {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String personInstituteId
	/**
	 * Status level 1
	 */
	String instituteId
	/**
	 * Status level 1
	 */
	String personId
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 isActive
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		personInstituteId(nullable: false, minSize:1, maxSize:36)
		instituteId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: false, minSize:1, maxSize:36)
		isActive(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'link_person_institute'
		psuId column:'psu_id'
		personInstituteId column:'person_institute_id'
		instituteId column:'institute_id'
		personId column:'person_id'
		isActive column:'is_active'
		transactionType column:'transaction_type'
	}
}
