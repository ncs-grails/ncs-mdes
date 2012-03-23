package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Staff {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String staffId
	/**
	 * Status level 1
	 */
	StudyStaffTypeCl1 staffType
	/**
	 * PII level P
	 * Status level 1
	 */
	String staffTypeOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 subcontractor
	/**
	 * Status level 1
	 */
	Integer staffYob
	/**
	 * Status level 3
	 */
	AgeRangeCl1 staffAgeRange
	/**
	 * Status level 3
	 */
	GenderCl1 staffGender
	/**
	 * Status level 3
	 */
	RaceCl1 staffRace
	/**
	 * PII level P
	 * Status level 1
	 */
	String staffRaceOth
	/**
	 * Status level 2
	 */
	String staffZip
	/**
	 * Status level 3
	 */
	EthnicityCl1 staffEthnicity
	/**
	 * Status level 3
	 */
	ExperienceLevelCl1 staffExp
	/**
	 * PII level P
	 * Status level 1
	 */
	String staffComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		staffId(nullable: false, minSize:1, maxSize:36)
		staffType(nullable: false)
		staffTypeOth(nullable: true, maxSize:255)
		subcontractor(nullable: false)
		staffYob(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		staffAgeRange(nullable: false)
		staffGender(nullable: false)
		staffRace(nullable: false)
		staffRaceOth(nullable: true, maxSize:255)
		staffZip(nullable: false, minSize:1, maxSize:5)
		staffEthnicity(nullable: false)
		staffExp(nullable: false)
		staffComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'staff'
		psuId column:'psu_id'
		staffId column:'staff_id'
		staffType column:'staff_type'
		staffTypeOth column:'staff_type_oth'
		subcontractor column:'subcontractor'
		staffYob column:'staff_yob'
		staffAgeRange column:'staff_age_range'
		staffGender column:'staff_gender'
		staffRace column:'staff_race'
		staffRaceOth column:'staff_race_oth'
		staffZip column:'staff_zip'
		staffEthnicity column:'staff_ethnicity'
		staffExp column:'staff_exp'
		staffComment column:'staff_comment'
		transactionType column:'transaction_type'
	}
}
