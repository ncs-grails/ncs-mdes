package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class LowHighScript {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String lowHiId
	/**
	 * Status level 2
	 */
	RecruitTypeCl1 recruitType
	/**
	 * Status level 2
	 */
	String duId
	/**
	 * Status level 2
	 */
	String pId
	/**
	 * Status level 2
	 */
	String eventId
	/**
	 * Status level 2
	 */
	EventTypeCl1 eventType
	/**
	 * Status level 2
	 */
	Integer eventRepeatKey
	/**
	 * Status level 2
	 */
	String instrumentId
	/**
	 * Status level 2
	 */
	InstrumentTypeCl1 instrumentType
	/**
	 * Status level 2
	 */
	String instrumentVersion
	/**
	 * Status level 2
	 */
	Integer instrumentRepeatKey
	/**
	 * Status level 2
	 */
	ConfirmTypeCl19 outAnswer
	/**
	 * PII level P
	 * Status level 2
	 */
	String outAnswerOth
	/**
	 * Status level 2
	 */
	PersonAvailabilityCl1 outSpeak
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 outAvail
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 outVisit
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 outVisitUcla
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 outTalk
	/**
	 * Status level 2
	 */
	String rBestTtc1
	/**
	 * Status level 2
	 */
	String dayWeek2
	/**
	 * Status level 2
	 */
	TimeOfDayCl1 rBestTtc2
	/**
	 * Status level 2
	 */
	RelativeTimeCl1 rBestTtc3
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 outUnavail
	/**
	 * Status level 2
	 */
	String bestTtc1
	/**
	 * Status level 2
	 */
	String dayWeek1
	/**
	 * Status level 2
	 */
	TimeOfDayCl1 bestTtc2
	/**
	 * Status level 2
	 */
	RelativeTimeCl1 bestTtc3
	/**
	 * PII level Y
	 * Status level 2
	 */
	String outNextph
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 inVisit
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 inVisitUcla
	/**
	 * Status level 2
	 */
	PregnancyStatusCl2 ppgConfirm
	/**
	 * Status level 2
	 */
	PregnancyTryingStatusCl3 followup1
	/**
	 * Status level 2
	 */
	PregnancyTryingStatusCl3 followup3
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		lowHiId(nullable: false, minSize:1, maxSize:36)
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
		outAnswer(nullable: false)
		outAnswerOth(nullable: true, maxSize:255)
		outSpeak(nullable: false)
		outAvail(nullable: false)
		outVisit(nullable: false)
		outVisitUcla(nullable: false)
		outTalk(nullable: false)
		rBestTtc1(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		dayWeek2(nullable: true, maxSize:100)
		rBestTtc2(nullable: false)
		rBestTtc3(nullable: false)
		outUnavail(nullable: false)
		bestTtc1(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		dayWeek1(nullable: true, maxSize:100)
		bestTtc2(nullable: false)
		bestTtc3(nullable: false)
		outNextph(nullable: true, maxSize:10)
		inVisit(nullable: false)
		inVisitUcla(nullable: false)
		ppgConfirm(nullable: false)
		followup1(nullable: false)
		followup3(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'low_high_script'
		psuId column:'psu_id'
		lowHiId column:'low_hi_id'
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
		outAnswer column:'out_answer'
		outAnswerOth column:'out_answer_oth'
		outSpeak column:'out_speak'
		outAvail column:'out_avail'
		outVisit column:'out_visit'
		outVisitUcla column:'out_visit_ucla'
		outTalk column:'out_talk'
		rBestTtc1 column:'r_best_ttc_1'
		dayWeek2 column:'day_week_2'
		rBestTtc2 column:'r_best_ttc_2'
		rBestTtc3 column:'r_best_ttc_3'
		outUnavail column:'out_unavail'
		bestTtc1 column:'best_ttc_1'
		dayWeek1 column:'day_week_1'
		bestTtc2 column:'best_ttc_2'
		bestTtc3 column:'best_ttc_3'
		outNextph column:'out_nextph'
		inVisit column:'in_visit'
		inVisitUcla column:'in_visit_ucla'
		ppgConfirm column:'ppg_confirm'
		followup1 column:'followup_1'
		followup3 column:'followup_3'
		transactionType column:'transaction_type'
	}
}
