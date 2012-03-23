package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class StaffValidation {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String staffValId
	/**
	 * Status level 1
	 */
	String staffId
	/**
	 * Status level 1
	 */
	String eventId
	/**
	 * Status level 1
	 */
	ValidationStatusCl1 staffValidate
	/**
	 * Status level 1
	 */
	String staffValDate
	/**
	 * PII level P
	 * Status level 1
	 */
	String staffValComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		staffValId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		staffValidate(nullable: false)
		staffValDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		staffValComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'staff_validation'
		psuId column:'psu_id'
		staffValId column:'staff_val_id'
		staffId column:'staff_id'
		eventId column:'event_id'
		staffValidate column:'staff_validate'
		staffValDate column:'staff_val_date'
		staffValComment column:'staff_val_comment'
		transactionType column:'transaction_type'
	}
}
