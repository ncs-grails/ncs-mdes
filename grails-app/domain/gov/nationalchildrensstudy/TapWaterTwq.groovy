package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwq {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String tapWaterTwqId
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
	String hhId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	String eventId
	/**
	 * Status level 1
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
	 * Status level 1
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
	 * Status level 2
	 */
	String timeStamp1
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 twqOkay
	/**
	 * Status level 2
	 */
	RoomTypeCl4 twqLocation
	/**
	 * PII level P
	 * Status level 2
	 */
	String twqLocationOth
	/**
	 * Status level 2
	 */
	String timeStamp2
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 twqCollect
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 bottle1Filled
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 bottle2Filled
	/**
	 * PII level P
	 * Status level 2
	 */
	String suppliesMissing
	/**
	 * PII level P
	 * Status level 2
	 */
	String reasBottleNFilledOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 twqFiltered
	/**
	 * PII level P
	 * Status level 2
	 */
	String twqNoneSupplMissing
	/**
	 * PII level P
	 * Status level 2
	 */
	String reasonTwqNCollectedOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 twqBlankCollect
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 blBottle1Filled
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 blBottle2Filled
	/**
	 * PII level P
	 * Status level 2
	 */
	String blSuppliesMissing
	/**
	 * PII level P
	 * Status level 2
	 */
	String blReasBottleNFilledOth
	/**
	 * PII level P
	 * Status level 2
	 */
	String twqBlNoneSupplMissing
	/**
	 * PII level P
	 * Status level 2
	 */
	String reasTwqBlNCollectedOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 twqDpCollect
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 dpBottle1Filled
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 dpBottle2Filled
	/**
	 * PII level P
	 * Status level 2
	 */
	String dpSuppliesMissing
	/**
	 * PII level P
	 * Status level 2
	 */
	String dpReasBottleNFilledOth
	/**
	 * PII level P
	 * Status level 2
	 */
	String reasTwqDpNCollectedSuppl
	/**
	 * PII level P
	 * Status level 2
	 */
	String reasTwqDpNCollectedOth
	/**
	 * PII level P
	 * Status level 2
	 */
	String twqComments
	/**
	 * Status level 2
	 */
	String timeStamp3
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		tapWaterTwqId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false)
		duId(nullable: false, minSize:1, maxSize:36)
		hhId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: true, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false)
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		twqOkay(nullable: false)
		twqLocation(nullable: false)
		twqLocationOth(nullable: true, maxSize:255)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		twqCollect(nullable: false)
		bottle1Filled(nullable: false)
		bottle2Filled(nullable: false)
		suppliesMissing(nullable: true, maxSize:255)
		reasBottleNFilledOth(nullable: true, maxSize:255)
		twqFiltered(nullable: false)
		twqNoneSupplMissing(nullable: true, maxSize:255)
		reasonTwqNCollectedOth(nullable: true, maxSize:255)
		twqBlankCollect(nullable: false)
		blBottle1Filled(nullable: false)
		blBottle2Filled(nullable: false)
		blSuppliesMissing(nullable: true, maxSize:255)
		blReasBottleNFilledOth(nullable: true, maxSize:255)
		twqBlNoneSupplMissing(nullable: true, maxSize:255)
		reasTwqBlNCollectedOth(nullable: true, maxSize:255)
		twqDpCollect(nullable: false)
		dpBottle1Filled(nullable: false)
		dpBottle2Filled(nullable: false)
		dpSuppliesMissing(nullable: true, maxSize:255)
		dpReasBottleNFilledOth(nullable: true, maxSize:255)
		reasTwqDpNCollectedSuppl(nullable: true, maxSize:255)
		reasTwqDpNCollectedOth(nullable: true, maxSize:255)
		twqComments(nullable: true, maxSize:255)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twq'
		psuId column:'psu_id'
		tapWaterTwqId column:'tap_water_twq_id'
		recruitType column:'recruit_type'
		duId column:'du_id'
		hhId column:'hh_id'
		pId column:'p_id'
		eventId column:'event_id'
		eventType column:'event_type'
		eventRepeatKey column:'event_repeat_key'
		instrumentId column:'instrument_id'
		instrumentType column:'instrument_type'
		instrumentVersion column:'instrument_version'
		instrumentRepeatKey column:'instrument_repeat_key'
		timeStamp1 column:'time_stamp_1'
		twqOkay column:'twq_okay'
		twqLocation column:'twq_location'
		twqLocationOth column:'twq_location_oth'
		timeStamp2 column:'time_stamp_2'
		twqCollect column:'twq_collect'
		bottle1Filled column:'bottle1_filled'
		bottle2Filled column:'bottle2_filled'
		suppliesMissing column:'supplies_missing'
		reasBottleNFilledOth column:'reas_bottle_n_filled_oth'
		twqFiltered column:'twq_filtered'
		twqNoneSupplMissing column:'twq_none_suppl_missing'
		reasonTwqNCollectedOth column:'reason_twq_n_collected_oth'
		twqBlankCollect column:'twq_blank_collect'
		blBottle1Filled column:'bl_bottle1_filled'
		blBottle2Filled column:'bl_bottle2_filled'
		blSuppliesMissing column:'bl_supplies_missing'
		blReasBottleNFilledOth column:'bl_reas_bottle_n_filled_oth'
		twqBlNoneSupplMissing column:'twq_bl_none_suppl_missing'
		reasTwqBlNCollectedOth column:'reas_twq_bl_n_collected_oth'
		twqDpCollect column:'twq_dp_collect'
		dpBottle1Filled column:'dp_bottle1_filled'
		dpBottle2Filled column:'dp_bottle2_filled'
		dpSuppliesMissing column:'dp_supplies_missing'
		dpReasBottleNFilledOth column:'dp_reas_bottle_n_filled_oth'
		reasTwqDpNCollectedSuppl column:'reas_twq_dp_n_collected_suppl'
		reasTwqDpNCollectedOth column:'reas_twq_dp_n_collected_oth'
		twqComments column:'twq_comments'
		timeStamp3 column:'time_stamp_3'
		transactionType column:'transaction_type'
	}
}
