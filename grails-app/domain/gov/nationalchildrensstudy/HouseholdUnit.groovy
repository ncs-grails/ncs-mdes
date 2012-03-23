package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class HouseholdUnit {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String hhId
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 hhStatus
	/**
	 * Status level 3
	 */
	HouseholdEligibilityCl2 hhElig
	/**
	 * Status level 1
	 */
	Integer numAgeElig
	/**
	 * Status level 1
	 */
	Integer numPreg
	/**
	 * Status level 1
	 */
	Integer numPregMinor
	/**
	 * Status level 1
	 */
	Integer numPregAdult
	/**
	 * Status level 1
	 */
	Integer numPregOver49
	/**
	 * Status level 3
	 */
	ResidenceTypeCl2 hhStructure
	/**
	 * PII level P
	 * Status level 1
	 */
	String hhStructureOth
	/**
	 * PII level P
	 * Status level 1
	 */
	String hhComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		hhId(nullable: false, minSize:1, maxSize:36)
		hhStatus(nullable: false)
		hhElig(nullable: false)
		numAgeElig(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numPregMinor(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numPregAdult(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numPregOver49(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		hhStructure(nullable: false)
		hhStructureOth(nullable: true, maxSize:255)
		hhComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'household_unit'
		psuId column:'psu_id'
		hhId column:'hh_id'
		hhStatus column:'hh_status'
		hhElig column:'hh_elig'
		numAgeElig column:'num_age_elig'
		numPreg column:'num_preg'
		numPregMinor column:'num_preg_minor'
		numPregAdult column:'num_preg_adult'
		numPregOver49 column:'num_preg_over49'
		hhStructure column:'hh_structure'
		hhStructureOth column:'hh_structure_oth'
		hhComment column:'hh_comment'
		transactionType column:'transaction_type'
	}
}
