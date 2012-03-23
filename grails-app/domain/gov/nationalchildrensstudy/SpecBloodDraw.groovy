package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecBloodDraw {

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
	String specBloodDrawId
	/**
	 * Status level 2
	 */
	BloodDrawProbCl1 bloodDrawProb
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		specBloodId(nullable: false, minSize:1, maxSize:36)
		specBloodDrawId(nullable: false, minSize:1, maxSize:36)
		bloodDrawProb(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_blood_draw'
		psuId column:'psu_id'
		specBloodId column:'spec_blood_id'
		specBloodDrawId column:'spec_blood_draw_id'
		bloodDrawProb column:'blood_draw_prob'
		transactionType column:'transaction_type'
	}
}
