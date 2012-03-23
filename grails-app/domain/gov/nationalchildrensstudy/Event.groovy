package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Event {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String eventId
	/**
	 * Status level 1
	 */
	String participantId
	/**
	 * Status level 1
	 */
	EventTypeCl1 eventType
	/**
	 * PII level P
	 * Status level 1
	 */
	String eventTypeOth
	/**
	 * Status level 1
	 */
	Integer eventRepeatKey
	/**
	 * Status level 3
	 */
	Integer eventDisp
	/**
	 * Status level 3
	 */
	EventDspstnCatCl1 eventDispCat
	/**
	 * Status level 3
	 */
	String eventStartDate
	/**
	 * Status level 1
	 */
	String eventStartTime
	/**
	 * Status level 1
	 */
	String eventEndDate
	/**
	 * Status level 1
	 */
	String eventEndTime
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 eventBreakoff
	/**
	 * Status level 3
	 */
	IncentiveTypeCl1 eventIncentiveType
	/**
	 * Status level 1
	 */
	BigDecimal eventIncentCash
	/**
	 * PII level P
	 * Status level 1
	 */
	String eventIncentNoncash
	/**
	 * PII level P
	 * Status level 1
	 */
	String eventComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		eventId(nullable: false, minSize:1, maxSize:36)
		participantId(nullable: true, maxSize:36)
		eventType(nullable: false)
		eventTypeOth(nullable: true, maxSize:255)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		eventDisp(nullable: false)
		eventDispCat(nullable: false)
		eventStartDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		eventStartTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		eventEndDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		eventEndTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		eventBreakoff(nullable: false)
		eventIncentiveType(nullable: false)
		eventIncentCash(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		eventIncentNoncash(nullable: true, maxSize:255)
		eventComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'event'
		psuId column:'psu_id'
		eventId column:'event_id'
		participantId column:'participant_id'
		eventType column:'event_type'
		eventTypeOth column:'event_type_oth'
		eventRepeatKey column:'event_repeat_key'
		eventDisp column:'event_disp'
		eventDispCat column:'event_disp_cat'
		eventStartDate column:'event_start_date'
		eventStartTime column:'event_start_time'
		eventEndDate column:'event_end_date'
		eventEndTime column:'event_end_time'
		eventBreakoff column:'event_breakoff'
		eventIncentiveType column:'event_incentive_type'
		eventIncentCash column:'event_incent_cash'
		eventIncentNoncash column:'event_incent_noncash'
		eventComment column:'event_comment'
		transactionType column:'transaction_type'
	}
}
