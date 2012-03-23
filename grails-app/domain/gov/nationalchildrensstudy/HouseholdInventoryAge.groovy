package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class HouseholdInventoryAge {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String hhInventoryId
	/**
	 * Status level 2
	 */
	String pId
	/**
	 * Status level 2
	 */
	String householdInventoryAgeId
	/**
	 * Status level 2
	 */
	Integer pAge
	/**
	 * PII level Y
	 * Status level 2
	 */
	String pFname
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		hhInventoryId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		householdInventoryAgeId(nullable: false, minSize:1, maxSize:36)
		pAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pFname(nullable: true, maxSize:30)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'household_inventory_age'
		psuId column:'psu_id'
		hhInventoryId column:'hh_inventory_id'
		pId column:'p_id'
		householdInventoryAgeId column:'household_inventory_age_id'
		pAge column:'p_age'
		pFname column:'p_fname'
		transactionType column:'transaction_type'
	}
}
