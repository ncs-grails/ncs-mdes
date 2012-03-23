package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class LinkContact {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String contactLinkId
	/**
	 * Status level 1
	 */
	String contactId
	/**
	 * Status level 1
	 */
	String eventId
	/**
	 * Status level 1
	 */
	String instrumentId
	/**
	 * Status level 1
	 */
	String staffId
	/**
	 * Status level 1
	 */
	String personId
	/**
	 * Status level 1
	 */
	String providerId
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		contactLinkId(nullable: false, minSize:1, maxSize:36)
		contactId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: true, maxSize:36)
		instrumentId(nullable: true, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: true, maxSize:36)
		providerId(nullable: true, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'link_contact'
		psuId column:'psu_id'
		contactLinkId column:'contact_link_id'
		contactId column:'contact_id'
		eventId column:'event_id'
		instrumentId column:'instrument_id'
		staffId column:'staff_id'
		personId column:'person_id'
		providerId column:'provider_id'
		transactionType column:'transaction_type'
	}
}
