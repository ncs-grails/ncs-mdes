package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenHiKnowNcs2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String psHiHowKnowNcsId
	/**
	 * Status level 2
	 */
	String psHiId
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
		psHiHowKnowNcsId(nullable: false, minSize:1, maxSize:36)
		psHiId(nullable: false, minSize:1, maxSize:36)
		howKnowNcs(nullable: false)
		howKnowNcsOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_hi_know_ncs_2'
		psuId column:'psu_id'
		psHiHowKnowNcsId column:'ps_hi_how_know_ncs_id'
		psHiId column:'ps_hi_id'
		howKnowNcs column:'how_know_ncs'
		howKnowNcsOth column:'how_know_ncs_oth'
		transactionType column:'transaction_type'
	}
}
