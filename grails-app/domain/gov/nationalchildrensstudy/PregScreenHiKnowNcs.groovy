package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenHiKnowNcs {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String psHiHowKnowNcsId
	/**
	 * Status level 1
	 */
	String psHiId
	/**
	 * Status level 3
	 */
	StudyEntryMethodCl2 howKnowNcs
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		psHiHowKnowNcsId(nullable: false, minSize:1, maxSize:36)
		psHiId(nullable: false, minSize:1, maxSize:36)
		howKnowNcs(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_hi_know_ncs'
		psuId column:'psu_id'
		psHiHowKnowNcsId column:'ps_hi_how_know_ncs_id'
		psHiId column:'ps_hi_id'
		howKnowNcs column:'how_know_ncs'
		transactionType column:'transaction_type'
	}
}
