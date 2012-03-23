package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class OutreachLang2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String outreachLang2Id
	/**
	 * Status level 2
	 */
	String outreachEventId
	/**
	 * Status level 2
	 */
	LanguageCl2 outreachLang2
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		outreachLang2Id(nullable: false, minSize:1, maxSize:36)
		outreachEventId(nullable: false, minSize:1, maxSize:36)
		outreachLang2(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'outreach_lang2'
		psuId column:'psu_id'
		outreachLang2Id column:'outreach_lang2_id'
		outreachEventId column:'outreach_event_id'
		outreachLang2 column:'outreach_lang2'
		transactionType column:'transaction_type'
	}
}
