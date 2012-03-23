package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SubsampleDoc {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String eventId
	/**
	 * Status level 2
	 */
	String subsampleDocId
	/**
	 * Status level 2
	 */
	Integer randomOrderNo
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		eventId(nullable: false, minSize:1, maxSize:36)
		subsampleDocId(nullable: false, minSize:1, maxSize:36)
		randomOrderNo(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'subsample_doc'
		psuId column:'psu_id'
		eventId column:'event_id'
		subsampleDocId column:'subsample_doc_id'
		randomOrderNo column:'random_order_no'
		transactionType column:'transaction_type'
	}
}
