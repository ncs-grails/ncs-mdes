package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class HouseholdEnumerationAgeElig {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ageEligibleLoopId
	/**
	 * Status level 1
	 */
	String hhenumId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * PII level Y
	 * Status level 3
	 */
	String ageEligFname
	/**
	 * Status level 1
	 */
	Integer ageEligAge
	/**
	 * Status level 3
	 */
	PersonPartcpntReltnshpCl3 ageEligRelate
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ageEligibleLoopId(nullable: false, minSize:1, maxSize:36)
		hhenumId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		ageEligFname(nullable: true, maxSize:30)
		ageEligAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		ageEligRelate(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'household_enumeration_age_elig'
		psuId column:'psu_id'
		ageEligibleLoopId column:'age_eligible_loop_id'
		hhenumId column:'hhenum_id'
		pId column:'p_id'
		ageEligFname column:'age_elig_fname'
		ageEligAge column:'age_elig_age'
		ageEligRelate column:'age_elig_relate'
		transactionType column:'transaction_type'
	}
}
