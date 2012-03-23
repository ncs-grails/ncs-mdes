package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenPbKnowNcs2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String psPbHowKnowNcsId
	/**
	 * Status level 2
	 */
	String psPbId
	/**
	 * Status level 2
	 */
	StudyEntryMethodCl2 howKnowNcs
	/**
	 * PII level P
	 * Status level 2
	 */
	String howKnowNcsOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		psPbHowKnowNcsId(nullable: false, minSize:1, maxSize:36)
		psPbId(nullable: false, minSize:1, maxSize:36)
		howKnowNcs(nullable: false)
		howKnowNcsOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_pb_know_ncs_2'
		psuId column:'psu_id'
		psPbHowKnowNcsId column:'ps_pb_how_know_ncs_id'
		psPbId column:'ps_pb_id'
		howKnowNcs column:'how_know_ncs'
		howKnowNcsOth column:'how_know_ncs_oth'
		transactionType column:'transaction_type'
	}
}
