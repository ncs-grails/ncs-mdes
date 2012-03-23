package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PpgCati {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ppgCatiId
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
	String timeStamp1
	/**
	 * Status level 3
	 */
	PregnancyStatusCl1 pregnant
	/**
	 * Status level 3
	 */
	PregnancyTryingStatusCl2 trying
	/**
	 * Status level 1
	 */
	String ppgDueDate1
	/**
	 * Status level 1
	 */
	String datePeriod
	/**
	 * Status level 1
	 */
	Integer weeksPreg
	/**
	 * Status level 1
	 */
	Integer monthPreg
	/**
	 * Status level 3
	 */
	TrimesterCl1 trimester
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 medUnable
	/**
	 * Status level 1
	 */
	String timeStamp2
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 bstNmbr
	/**
	 * PII level Y
	 * Status level 3
	 */
	String phoneNbr
	/**
	 * Status level 3
	 */
	PhoneTypeCl2 phoneType
	/**
	 * Status level 1
	 */
	String timeStamp3
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ppgCatiId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false)
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false)
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: false)
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregnant(nullable: false)
		trying(nullable: false)
		ppgDueDate1(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		datePeriod(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		weeksPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		monthPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		trimester(nullable: false)
		medUnable(nullable: false)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		bstNmbr(nullable: false)
		phoneNbr(nullable: true, maxSize:10)
		phoneType(nullable: false)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'ppg_cati'
		psuId column:'psu_id'
		ppgCatiId column:'ppg_cati_id'
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
		timeStamp1 column:'time_stamp_1'
		pregnant column:'pregnant'
		trying column:'trying'
		ppgDueDate1 column:'ppg_due_date_1'
		datePeriod column:'date_period'
		weeksPreg column:'weeks_preg'
		monthPreg column:'month_preg'
		trimester column:'trimester'
		medUnable column:'med_unable'
		timeStamp2 column:'time_stamp_2'
		bstNmbr column:'bst_nmbr'
		phoneNbr column:'phone_nbr'
		phoneType column:'phone_type'
		timeStamp3 column:'time_stamp_3'
		transactionType column:'transaction_type'
	}
}
