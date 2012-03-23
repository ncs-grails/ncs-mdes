package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwf {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String tapWaterTwfId
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
	String hhId
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
	String timeStamp1
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 twfOkay
	/**
	 * Status level 2
	 */
	RoomTypeCl4 twfLocation
	/**
	 * PII level P
	 * Status level 2
	 */
	String twfLocationOth
	/**
	 * Status level 2
	 */
	String timeStamp2
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 twfCollect
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 bottle1Filled
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 bottle2Filled
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 bottle3Filled
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
	ConfirmTypeCl7 twfFiltered
	/**
	 * PII level P
	 * Status level 2
	 */
	String twfNoneSupplMissing
	/**
	 * PII level P
	 * Status level 2
	 */
	String reasonTwfNCollectedOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 twfBlankCollect
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 blBottle1Filled
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 blBottle2Filled
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 blBottle3Filled
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
	String twfBlNoneSupplMissing
	/**
	 * PII level P
	 * Status level 2
	 */
	String reasTwfBlNCollectedOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 twfDpCollect
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 dpBottle1Filled
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 dpBottle2Filled
	/**
	 * Status level 2
	 */
	BottleFillStatusCl1 dpBottle3Filled
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
	String reasTwfDpNCollectedSuppl
	/**
	 * PII level P
	 * Status level 2
	 */
	String reasTwfDpNCollectedOth
	/**
	 * PII level P
	 * Status level 2
	 */
	String twfComments
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
		tapWaterTwfId(nullable: false, minSize:1, maxSize:36)
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
		twfOkay(nullable: false)
		twfLocation(nullable: false)
		twfLocationOth(nullable: true, maxSize:255)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		twfCollect(nullable: false)
		bottle1Filled(nullable: false)
		bottle2Filled(nullable: false)
		bottle3Filled(nullable: false)
		suppliesMissing(nullable: true, maxSize:255)
		reasBottleNFilledOth(nullable: true, maxSize:255)
		twfFiltered(nullable: false)
		twfNoneSupplMissing(nullable: true, maxSize:255)
		reasonTwfNCollectedOth(nullable: true, maxSize:255)
		twfBlankCollect(nullable: false)
		blBottle1Filled(nullable: false)
		blBottle2Filled(nullable: false)
		blBottle3Filled(nullable: false)
		blSuppliesMissing(nullable: true, maxSize:255)
		blReasBottleNFilledOth(nullable: true, maxSize:255)
		twfBlNoneSupplMissing(nullable: true, maxSize:255)
		reasTwfBlNCollectedOth(nullable: true, maxSize:255)
		twfDpCollect(nullable: false)
		dpBottle1Filled(nullable: false)
		dpBottle2Filled(nullable: false)
		dpBottle3Filled(nullable: false)
		dpSuppliesMissing(nullable: true, maxSize:255)
		dpReasBottleNFilledOth(nullable: true, maxSize:255)
		reasTwfDpNCollectedSuppl(nullable: true, maxSize:255)
		reasTwfDpNCollectedOth(nullable: true, maxSize:255)
		twfComments(nullable: true, maxSize:255)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twf'
		psuId column:'psu_id'
		tapWaterTwfId column:'tap_water_twf_id'
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
		twfOkay column:'twf_okay'
		twfLocation column:'twf_location'
		twfLocationOth column:'twf_location_oth'
		timeStamp2 column:'time_stamp_2'
		twfCollect column:'twf_collect'
		bottle1Filled column:'bottle1_filled'
		bottle2Filled column:'bottle2_filled'
		bottle3Filled column:'bottle3_filled'
		suppliesMissing column:'supplies_missing'
		reasBottleNFilledOth column:'reas_bottle_n_filled_oth'
		twfFiltered column:'twf_filtered'
		twfNoneSupplMissing column:'twf_none_suppl_missing'
		reasonTwfNCollectedOth column:'reason_twf_n_collected_oth'
		twfBlankCollect column:'twf_blank_collect'
		blBottle1Filled column:'bl_bottle1_filled'
		blBottle2Filled column:'bl_bottle2_filled'
		blBottle3Filled column:'bl_bottle3_filled'
		blSuppliesMissing column:'bl_supplies_missing'
		blReasBottleNFilledOth column:'bl_reas_bottle_n_filled_oth'
		twfBlNoneSupplMissing column:'twf_bl_none_suppl_missing'
		reasTwfBlNCollectedOth column:'reas_twf_bl_n_collected_oth'
		twfDpCollect column:'twf_dp_collect'
		dpBottle1Filled column:'dp_bottle1_filled'
		dpBottle2Filled column:'dp_bottle2_filled'
		dpBottle3Filled column:'dp_bottle3_filled'
		dpSuppliesMissing column:'dp_supplies_missing'
		dpReasBottleNFilledOth column:'dp_reas_bottle_n_filled_oth'
		reasTwfDpNCollectedSuppl column:'reas_twf_dp_n_collected_suppl'
		reasTwfDpNCollectedOth column:'reas_twf_dp_n_collected_oth'
		twfComments column:'twf_comments'
		timeStamp3 column:'time_stamp_3'
		transactionType column:'transaction_type'
	}
}
