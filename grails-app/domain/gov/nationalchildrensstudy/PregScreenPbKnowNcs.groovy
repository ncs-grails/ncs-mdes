package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenPbKnowNcs {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String psPbHowKnowNcsId
	/**
	 * Status level 1
	 */
	String psPbId
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
		psPbHowKnowNcsId(nullable: false, minSize:1, maxSize:36)
		psPbId(nullable: false, minSize:1, maxSize:36)
		howKnowNcs(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_pb_know_ncs'
		psuId column:'psu_id'
		psPbHowKnowNcsId column:'ps_pb_how_know_ncs_id'
		psPbId column:'ps_pb_id'
		howKnowNcs column:'how_know_ncs'
		transactionType column:'transaction_type'
	}
}
