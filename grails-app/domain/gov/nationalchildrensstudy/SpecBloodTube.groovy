package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecBloodTube {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String specBloodId
	/**
	 * Status level 2
	 */
	String specBloodTubeId
	/**
	 * Status level 2
	 */
	TubeTypeCl1 tubeType
	/**
	 * Status level 2
	 */
	String specimenId
	/**
	 * Status level 2
	 */
	TubeStatusCl1 tubeStatus
	/**
	 * PII level P
	 * Status level 2
	 */
	String tubeCommentsOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		specBloodId(nullable: false, minSize:1, maxSize:36)
		specBloodTubeId(nullable: false, minSize:1, maxSize:36)
		tubeType(nullable: false)
		specimenId(nullable: false, minSize:1, maxSize:36)
		tubeStatus(nullable: false)
		tubeCommentsOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_blood_tube'
		psuId column:'psu_id'
		specBloodId column:'spec_blood_id'
		specBloodTubeId column:'spec_blood_tube_id'
		tubeType column:'tube_type'
		specimenId column:'specimen_id'
		tubeStatus column:'tube_status'
		tubeCommentsOth column:'tube_comments_oth'
		transactionType column:'transaction_type'
	}
}
