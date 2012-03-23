package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Instrument {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String instrumentId
	/**
	 * Status level 1
	 */
	String eventId
	/**
	 * Status level 3
	 */
	InstrumentTypeCl1 instrumentType
	/**
	 * PII level P
	 * Status level 1
	 */
	String instrumentTypeOth
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
	String insStartTime
	/**
	 * Status level 1
	 */
	String insEndTime
	/**
	 * Status level 1
	 */
	String insDateStart
	/**
	 * Status level 1
	 */
	String insDateEnd
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 insBreakoff
	/**
	 * Status level 3
	 */
	InstrumentStatusCl1 insStatus
	/**
	 * Status level 3
	 */
	InstrumentAdminModeCl1 insMode
	/**
	 * PII level P
	 * Status level 1
	 */
	String insModeOth
	/**
	 * Status level 3
	 */
	InstrumentAdminMethodCl1 insMethod
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 supReview
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 dataProblem
	/**
	 * PII level P
	 * Status level 1
	 */
	String instruComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		instrumentId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false)
		instrumentTypeOth(nullable: true, maxSize:255)
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		insStartTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		insEndTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		insDateStart(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		insDateEnd(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		insBreakoff(nullable: false)
		insStatus(nullable: false)
		insMode(nullable: false)
		insModeOth(nullable: true, maxSize:255)
		insMethod(nullable: false)
		supReview(nullable: false)
		dataProblem(nullable: false)
		instruComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'instrument'
		psuId column:'psu_id'
		instrumentId column:'instrument_id'
		eventId column:'event_id'
		instrumentType column:'instrument_type'
		instrumentTypeOth column:'instrument_type_oth'
		instrumentVersion column:'instrument_version'
		instrumentRepeatKey column:'instrument_repeat_key'
		insStartTime column:'ins_start_time'
		insEndTime column:'ins_end_time'
		insDateStart column:'ins_date_start'
		insDateEnd column:'ins_date_end'
		insBreakoff column:'ins_breakoff'
		insStatus column:'ins_status'
		insMode column:'ins_mode'
		insModeOth column:'ins_mode_oth'
		insMethod column:'ins_method'
		supReview column:'sup_review'
		dataProblem column:'data_problem'
		instruComment column:'instru_comment'
		transactionType column:'transaction_type'
	}
}
