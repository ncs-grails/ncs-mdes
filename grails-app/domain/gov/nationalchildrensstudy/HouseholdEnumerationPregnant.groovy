package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class HouseholdEnumerationPregnant {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pregnantLoopId
	/**
	 * Status level 1
	 */
	String hhenumId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 3
	 */
	Integer pAge
	/**
	 * PII level Y
	 * Status level 3
	 */
	String pFname
	/**
	 * Status level 3
	 */
	PersonPartcpntReltnshpCl3 pRelate
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pregnantLoopId(nullable: false, minSize:1, maxSize:36)
		hhenumId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		pAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pFname(nullable: true, maxSize:30)
		pRelate(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'household_enumeration_pregnant'
		psuId column:'psu_id'
		pregnantLoopId column:'pregnant_loop_id'
		hhenumId column:'hhenum_id'
		pId column:'p_id'
		pAge column:'p_age'
		pFname column:'p_fname'
		pRelate column:'p_relate'
		transactionType column:'transaction_type'
	}
}
