package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecBlood {

	Integer psuId
	String specBloodId
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
	Integer bloodIntro
	Integer hemophilia
	Integer bloodThinner
	Integer chemo
	Integer bloodDraw
	String bloodDrawOth
	String lastTimeEat
	Integer lastTimeEatUnit
	String lastDateEat
	Integer coffeeTea
	Integer alcohol
	Integer coughCold
	Integer laxative
	Integer vitamin
	Integer diabetes
	Integer insulin
	Integer bloodComplete
	String timeStamp2
	Integer collectionStatus
	Integer collectionLocation
	Integer overallComments
	String overallCommentsOth
	String timeStamp3
	Integer centrifugeLocation
	String equipId
	String centrifugeTime
	Integer centrifugeTimeUnit
	String centrifugeDate
	String centrifugeEndTime
	Integer centrifugeEndTimeUnit
	String centrifugeEndDate
	Integer centrifugeTempMeasure
	BigDecimal centrifugeTemp
	Integer bloodHemolyze
	Integer centrifugeComment
	String centrifugeCommentOth
	String timeStamp4
	Integer coldTempMeasure
	Integer coldTemp
	Integer coldThresholdLow
	Integer coldThresholdHigh
	Integer ambientThresholdLow
	Integer bloodDrawCom
	String bloodDrawComment
	String timeStamp5
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		specBloodId(nullable: false, minSize:1, maxSize:36)
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
		bloodIntro(nullable: false, inList:[1, -1, -4])
		hemophilia(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bloodThinner(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		chemo(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bloodDraw(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bloodDrawOth(nullable: true, maxSize:255)
		lastTimeEat(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		lastTimeEatUnit(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		lastDateEat(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		coffeeTea(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		alcohol(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		coughCold(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		laxative(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		vitamin(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		diabetes(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insulin(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bloodComplete(nullable: false, inList:[1, -1, -4])
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		collectionStatus(nullable: false, inList:[1, 2, 3, -3, -4])
		collectionLocation(nullable: false, inList:[1, 2, 3, -3, -4])
		overallComments(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, -5, -1, -2, -3, -4])
		overallCommentsOth(nullable: true, maxSize:255)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		centrifugeLocation(nullable: false, inList:[1, 2, -3, -4])
		equipId(nullable: true, maxSize:36)
		centrifugeTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		centrifugeTimeUnit(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		centrifugeDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		centrifugeEndTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		centrifugeEndTimeUnit(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		centrifugeEndDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		centrifugeTempMeasure(nullable: false, inList:[1, 2, -3, -4])
		centrifugeTemp(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		bloodHemolyze(nullable: false, inList:[1, 2, 3, -3, -4])
		centrifugeComment(nullable: false, inList:[1, 2, -3, -4])
		centrifugeCommentOth(nullable: true, maxSize:255)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		coldTempMeasure(nullable: false, inList:[1, 2, -7, -3, -4])
		coldTemp(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		coldThresholdLow(nullable: false, inList:[1, 2, -3, -4])
		coldThresholdHigh(nullable: false, inList:[1, 2, -3, -4])
		ambientThresholdLow(nullable: false, inList:[1, 2, -3, -4])
		bloodDrawCom(nullable: false, inList:[1, 2, -3, -4])
		bloodDrawComment(nullable: true, maxSize:255)
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_blood'
		psuId column:'psu_id'
		specBloodId column:'spec_blood_id'
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
		bloodIntro column:'blood_intro'
		hemophilia column:'hemophilia'
		bloodThinner column:'blood_thinner'
		chemo column:'chemo'
		bloodDraw column:'blood_draw'
		bloodDrawOth column:'blood_draw_oth'
		lastTimeEat column:'last_time_eat'
		lastTimeEatUnit column:'last_time_eat_unit'
		lastDateEat column:'last_date_eat'
		coffeeTea column:'coffee_tea'
		alcohol column:'alcohol'
		coughCold column:'cough_cold'
		laxative column:'laxative'
		vitamin column:'vitamin'
		diabetes column:'diabetes'
		insulin column:'insulin'
		bloodComplete column:'blood_complete'
		timeStamp2 column:'time_stamp_2'
		collectionStatus column:'collection_status'
		collectionLocation column:'collection_location'
		overallComments column:'overall_comments'
		overallCommentsOth column:'overall_comments_oth'
		timeStamp3 column:'time_stamp_3'
		centrifugeLocation column:'centrifuge_location'
		equipId column:'equip_id'
		centrifugeTime column:'centrifuge_time'
		centrifugeTimeUnit column:'centrifuge_time_unit'
		centrifugeDate column:'centrifuge_date'
		centrifugeEndTime column:'centrifuge_end_time'
		centrifugeEndTimeUnit column:'centrifuge_end_time_unit'
		centrifugeEndDate column:'centrifuge_end_date'
		centrifugeTempMeasure column:'centrifuge_temp_measure'
		centrifugeTemp column:'centrifuge_temp'
		bloodHemolyze column:'blood_hemolyze'
		centrifugeComment column:'centrifuge_comment'
		centrifugeCommentOth column:'centrifuge_comment_oth'
		timeStamp4 column:'time_stamp_4'
		coldTempMeasure column:'cold_temp_measure'
		coldTemp column:'cold_temp'
		coldThresholdLow column:'cold_threshold_low'
		coldThresholdHigh column:'cold_threshold_high'
		ambientThresholdLow column:'ambient_threshold_low'
		bloodDrawCom column:'blood_draw_com'
		bloodDrawComment column:'blood_draw_comment'
		timeStamp5 column:'time_stamp_5'
		transactionType column:'transaction_type'
	}
}
