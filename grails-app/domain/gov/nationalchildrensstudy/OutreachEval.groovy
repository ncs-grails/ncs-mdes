package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class OutreachEval {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String outreachEventEvalId
	/**
	 * Status level 1
	 */
	String outreachEventId
	/**
	 * Status level 1
	 */
	OutreachEvalCl1 outreachEval
	/**
	 * PII level P
	 * Status level 1
	 */
	String outreachEvalOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		outreachEventEvalId(nullable: false, minSize:1, maxSize:36)
		outreachEventId(nullable: false, minSize:1, maxSize:36)
		outreachEval(nullable: false)
		outreachEvalOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'outreach_eval'
		psuId column:'psu_id'
		outreachEventEvalId column:'outreach_event_eval_id'
		outreachEventId column:'outreach_event_id'
		outreachEval column:'outreach_eval'
		outreachEvalOth column:'outreach_eval_oth'
		transactionType column:'transaction_type'
	}
}
