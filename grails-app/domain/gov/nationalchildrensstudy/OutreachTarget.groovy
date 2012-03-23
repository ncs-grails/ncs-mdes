package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class OutreachTarget {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String outreachTargetId
	/**
	 * Status level 1
	 */
	String outreachEventId
	/**
	 * Status level 3
	 */
	OutreachTargetCl1 outreachTargetMs
	/**
	 * PII level P
	 * Status level 1
	 */
	String outreachTargetMsOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		outreachTargetId(nullable: false, minSize:1, maxSize:36)
		outreachEventId(nullable: false, minSize:1, maxSize:36)
		outreachTargetMs(nullable: false)
		outreachTargetMsOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'outreach_target'
		psuId column:'psu_id'
		outreachTargetId column:'outreach_target_id'
		outreachEventId column:'outreach_event_id'
		outreachTargetMs column:'outreach_target_ms'
		outreachTargetMsOth column:'outreach_target_ms_oth'
		transactionType column:'transaction_type'
	}
}
