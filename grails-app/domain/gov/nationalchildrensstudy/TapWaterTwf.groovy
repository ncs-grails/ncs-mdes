package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TapWaterTwf {

	Integer psuId
	String tapWaterTwfId
	Integer recruitType
	String duId
	String hhId
	String pId
	String eventId
	Integer eventType
	Integer eventRepeatKey
	String instrumentId
	Integer instrumentType
	String instrumentVersion
	Integer instrumentRepeatKey
	String timeStamp1
	Integer twfOkay
	Integer twfLocation
	String twfLocationOth
	String timeStamp2
	Integer twfCollect
	Integer bottle1Filled
	Integer bottle2Filled
	Integer bottle3Filled
	String suppliesMissing
	String reasBottleNFilledOth
	Integer twfFiltered
	String twfNoneSupplMissing
	String reasonTwfNCollectedOth
	Integer twfBlankCollect
	Integer blBottle1Filled
	Integer blBottle2Filled
	Integer blBottle3Filled
	String blSuppliesMissing
	String blReasBottleNFilledOth
	String twfBlNoneSupplMissing
	String reasTwfBlNCollectedOth
	Integer twfDpCollect
	Integer dpBottle1Filled
	Integer dpBottle2Filled
	Integer dpBottle3Filled
	String dpSuppliesMissing
	String dpReasBottleNFilledOth
	String reasTwfDpNCollectedSuppl
	String reasTwfDpNCollectedOth
	String twfComments
	String timeStamp3
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		tapWaterTwfId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: false, minSize:1, maxSize:36)
		hhId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: true, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		twfOkay(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		twfLocation(nullable: false, inList:[1, 2, -5, -3, -4])
		twfLocationOth(nullable: true, maxSize:255)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		twfCollect(nullable: false, inList:[1, 2, -3, -4])
		bottle1Filled(nullable: false, inList:[1, 2, 3, -3, -4])
		bottle2Filled(nullable: false, inList:[1, 2, 3, -3, -4])
		bottle3Filled(nullable: false, inList:[1, 2, 3, -3, -4])
		suppliesMissing(nullable: true, maxSize:255)
		reasBottleNFilledOth(nullable: true, maxSize:255)
		twfFiltered(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		twfNoneSupplMissing(nullable: true, maxSize:255)
		reasonTwfNCollectedOth(nullable: true, maxSize:255)
		twfBlankCollect(nullable: false, inList:[1, 2, -3, -4])
		blBottle1Filled(nullable: false, inList:[1, 2, 3, -3, -4])
		blBottle2Filled(nullable: false, inList:[1, 2, 3, -3, -4])
		blBottle3Filled(nullable: false, inList:[1, 2, 3, -3, -4])
		blSuppliesMissing(nullable: true, maxSize:255)
		blReasBottleNFilledOth(nullable: true, maxSize:255)
		twfBlNoneSupplMissing(nullable: true, maxSize:255)
		reasTwfBlNCollectedOth(nullable: true, maxSize:255)
		twfDpCollect(nullable: false, inList:[1, 2, -3, -4])
		dpBottle1Filled(nullable: false, inList:[1, 2, 3, -3, -4])
		dpBottle2Filled(nullable: false, inList:[1, 2, 3, -3, -4])
		dpBottle3Filled(nullable: false, inList:[1, 2, 3, -3, -4])
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
