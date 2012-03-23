package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenEhKnowNcs {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String psEhHowKnowNcsId
	/**
	 * Status level 1
	 */
	String psEhId
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
		psEhHowKnowNcsId(nullable: false, minSize:1, maxSize:36)
		psEhId(nullable: false, minSize:1, maxSize:36)
		howKnowNcs(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_eh_know_ncs'
		psuId column:'psu_id'
		psEhHowKnowNcsId column:'ps_eh_how_know_ncs_id'
		psEhId column:'ps_eh_id'
		howKnowNcs column:'how_know_ncs'
		transactionType column:'transaction_type'
	}
}
