package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecBloodTubeComments {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String specBloodTubeId
	/**
	 * Status level 2
	 */
	String specBloodTubeCommentsId
	/**
	 * Status level 2
	 */
	BloodDrawProbCl3 tubeComments
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		specBloodTubeId(nullable: false, minSize:1, maxSize:36)
		specBloodTubeCommentsId(nullable: false, minSize:1, maxSize:36)
		tubeComments(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_blood_tube_comments'
		psuId column:'psu_id'
		specBloodTubeId column:'spec_blood_tube_id'
		specBloodTubeCommentsId column:'spec_blood_tube_comments_id'
		tubeComments column:'tube_comments'
		transactionType column:'transaction_type'
	}
}
