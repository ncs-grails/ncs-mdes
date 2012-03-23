package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class HouseholdInventoryAgeElig {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String hhInventoryId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 2
	 */
	String householdInventoryAgeEligId
	/**
	 * PII level Y
	 * Status level 2
	 */
	String ageEligFname
	/**
	 * Status level 2
	 */
	Integer ageEligAge
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		hhInventoryId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		householdInventoryAgeEligId(nullable: false, minSize:1, maxSize:36)
		ageEligFname(nullable: true, maxSize:30)
		ageEligAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'household_inventory_age_elig'
		psuId column:'psu_id'
		hhInventoryId column:'hh_inventory_id'
		pId column:'p_id'
		householdInventoryAgeEligId column:'household_inventory_age_elig_id'
		ageEligFname column:'age_elig_fname'
		ageEligAge column:'age_elig_age'
		transactionType column:'transaction_type'
	}
}
