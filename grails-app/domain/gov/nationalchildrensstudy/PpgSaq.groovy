package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PpgSaq {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ppgSaqId
	/**
	 * Status level 3
	 */
	RecruitTypeCl1 recruitType
	/**
	 * Status level 1
	 */
	String duId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	String eventId
	/**
	 * Status level 3
	 */
	EventTypeCl1 eventType
	/**
	 * Status level 1
	 */
	Integer eventRepeatKey
	/**
	 * Status level 1
	 */
	String instrumentId
	/**
	 * Status level 3
	 */
	InstrumentTypeCl1 instrumentType
	/**
	 * Status level 3
	 */
	String instrumentVersion
	/**
	 * Status level 1
	 */
	Integer instrumentRepeatKey
	/**
	 * Status level 1
	 */
	String date
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 pregnant
	/**
	 * Status level 1
	 */
	String ppgDueDate
	/**
	 * Status level 3
	 */
	ConfirmTypeCl6 trying
	/**
	 * PII level Y
	 * Status level 4
	 */
	String contact
	/**
	 * PII level Y
	 * Status level 3
	 */
	String homeAddress
	/**
	 * PII level Y
	 * Status level 3
	 */
	String mailAddress
	/**
	 * PII level Y
	 * Status level 4
	 */
	String phone
	/**
	 * PII level Y
	 * Status level 3
	 */
	String homePhone
	/**
	 * PII level Y
	 * Status level 3
	 */
	String workPhone
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cellPhone
	/**
	 * PII level Y
	 * Status level 3
	 */
	String otherPhone
	/**
	 * PII level Y
	 * Status level 3
	 */
	String email
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ppgSaqId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false)
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false)
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		date(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		pregnant(nullable: false)
		ppgDueDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		trying(nullable: false)
		contact(nullable: true, maxSize:100)
		homeAddress(nullable: true, maxSize:100)
		mailAddress(nullable: true, maxSize:100)
		phone(nullable: true, maxSize:10)
		homePhone(nullable: true, maxSize:10)
		workPhone(nullable: true, maxSize:10)
		cellPhone(nullable: true, maxSize:10)
		otherPhone(nullable: true, maxSize:10)
		email(nullable: true, maxSize:100)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'ppg_saq'
		psuId column:'psu_id'
		ppgSaqId column:'ppg_saq_id'
		recruitType column:'recruit_type'
		duId column:'du_id'
		pId column:'p_id'
		eventId column:'event_id'
		eventType column:'event_type'
		eventRepeatKey column:'event_repeat_key'
		instrumentId column:'instrument_id'
		instrumentType column:'instrument_type'
		instrumentVersion column:'instrument_version'
		instrumentRepeatKey column:'instrument_repeat_key'
		date column:'date'
		pregnant column:'pregnant'
		ppgDueDate column:'ppg_due_date'
		trying column:'trying'
		contact column:'contact'
		homeAddress column:'home_address'
		mailAddress column:'mail_address'
		phone column:'phone'
		homePhone column:'home_phone'
		workPhone column:'work_phone'
		cellPhone column:'cell_phone'
		otherPhone column:'other_phone'
		email column:'email'
		transactionType column:'transaction_type'
	}
}
