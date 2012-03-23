package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecCordBloodSpecimen {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String specCordBloodId
	/**
	 * Status level 2
	 */
	String specCordBloodSpecimenId
	/**
	 * Status level 2
	 */
	String specimenId
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		specCordBloodId(nullable: false, minSize:1, maxSize:36)
		specCordBloodSpecimenId(nullable: false, minSize:1, maxSize:36)
		specimenId(nullable: false, minSize:1, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_cord_blood_specimen'
		psuId column:'psu_id'
		specCordBloodId column:'spec_cord_blood_id'
		specCordBloodSpecimenId column:'spec_cord_blood_specimen_id'
		specimenId column:'specimen_id'
		transactionType column:'transaction_type'
	}
}
