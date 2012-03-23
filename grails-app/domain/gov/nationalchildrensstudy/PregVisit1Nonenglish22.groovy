package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1Nonenglish22 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv1Nonenglish2Id
	/**
	 * Status level 2
	 */
	String pv1Id
	/**
	 * Status level 2
	 */
	LanguageCl7 hhNonenglish2
	/**
	 * PII level P
	 * Status level 2
	 */
	String hhNonenglish2Oth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1Nonenglish2Id(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		hhNonenglish2(nullable: false)
		hhNonenglish2Oth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_nonenglish2_2'
		psuId column:'psu_id'
		pv1Nonenglish2Id column:'pv1_nonenglish2_id'
		pv1Id column:'pv1_id'
		hhNonenglish2 column:'hh_nonenglish_2'
		hhNonenglish2Oth column:'hh_nonenglish2_oth'
		transactionType column:'transaction_type'
	}
}
