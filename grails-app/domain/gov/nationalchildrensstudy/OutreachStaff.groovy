package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class OutreachStaff {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String outreachEventStaffId
	/**
	 * Status level 1
	 */
	String outreachEventId
	/**
	 * Status level 1
	 */
	String staffId
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		outreachEventStaffId(nullable: false, minSize:1, maxSize:36)
		outreachEventId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'outreach_staff'
		psuId column:'psu_id'
		outreachEventStaffId column:'outreach_event_staff_id'
		outreachEventId column:'outreach_event_id'
		staffId column:'staff_id'
		transactionType column:'transaction_type'
	}
}
