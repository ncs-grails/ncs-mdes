package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecBlood {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String specBloodId
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
	ConfirmTypeCl23 bloodIntro
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 hemophilia
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 bloodThinner
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 chemo
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 bloodDraw
	/**
	 * PII level P
	 * Status level 2
	 */
	String bloodDrawOth
	/**
	 * Status level 2
	 */
	String lastTimeEat
	/**
	 * Status level 2
	 */
	TimeOfDayCl1 lastTimeEatUnit
	/**
	 * Status level 2
	 */
	String lastDateEat
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 coffeeTea
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 alcohol
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 coughCold
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 laxative
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 vitamin
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 diabetes
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 insulin
	/**
	 * Status level 2
	 */
	ConfirmTypeCl23 bloodComplete
	/**
	 * Status level 2
	 */
	String timeStamp2
	/**
	 * Status level 2
	 */
	SpecimenStatusCl2 collectionStatus
	/**
	 * Status level 2
	 */
	SpecimenCllctnLocationCl1 collectionLocation
	/**
	 * Status level 2
	 */
	BloodCollecIssueCl1 overallComments
	/**
	 * PII level P
	 * Status level 2
	 */
	String overallCommentsOth
	/**
	 * Status level 2
	 */
	String timeStamp3
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 centrifugeLocation
	/**
	 * Status level 2
	 */
	String equipId
	/**
	 * Status level 2
	 */
	String centrifugeTime
	/**
	 * Status level 2
	 */
	TimeOfDayCl1 centrifugeTimeUnit
	/**
	 * Status level 2
	 */
	String centrifugeDate
	/**
	 * Status level 2
	 */
	String centrifugeEndTime
	/**
	 * Status level 2
	 */
	TimeOfDayCl1 centrifugeEndTimeUnit
	/**
	 * Status level 2
	 */
	String centrifugeEndDate
	/**
	 * Status level 2
	 */
	TemperatureCl1 centrifugeTempMeasure
	/**
	 * Status level 2
	 */
	BigDecimal centrifugeTemp
	/**
	 * Status level 2
	 */
	BloodHemolyzeCl1 bloodHemolyze
	/**
	 * Status level 2
	 */
	CommentsCl1 centrifugeComment
	/**
	 * PII level P
	 * Status level 2
	 */
	String centrifugeCommentOth
	/**
	 * Status level 2
	 */
	String timeStamp4
	/**
	 * Status level 2
	 */
	TemperatureCl2 coldTempMeasure
	/**
	 * Status level 2
	 */
	Integer coldTemp
	/**
	 * Status level 2
	 */
	ChamberStatusCl1 coldThresholdLow
	/**
	 * Status level 2
	 */
	ChamberStatusCl1 coldThresholdHigh
	/**
	 * Status level 2
	 */
	ChamberStatusCl1 ambientThresholdLow
	/**
	 * Status level 2
	 */
	CommentsCl1 bloodDrawCom
	/**
	 * PII level P
	 * Status level 2
	 */
	String bloodDrawComment
	/**
	 * Status level 2
	 */
	String timeStamp5
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		specBloodId(nullable: false, minSize:1, maxSize:36)
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
		bloodIntro(nullable: false)
		hemophilia(nullable: false)
		bloodThinner(nullable: false)
		chemo(nullable: false)
		bloodDraw(nullable: false)
		bloodDrawOth(nullable: true, maxSize:255)
		lastTimeEat(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		lastTimeEatUnit(nullable: false)
		lastDateEat(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		coffeeTea(nullable: false)
		alcohol(nullable: false)
		coughCold(nullable: false)
		laxative(nullable: false)
		vitamin(nullable: false)
		diabetes(nullable: false)
		insulin(nullable: false)
		bloodComplete(nullable: false)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		collectionStatus(nullable: false)
		collectionLocation(nullable: false)
		overallComments(nullable: false)
		overallCommentsOth(nullable: true, maxSize:255)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		centrifugeLocation(nullable: false)
		equipId(nullable: true, maxSize:36)
		centrifugeTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		centrifugeTimeUnit(nullable: false)
		centrifugeDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		centrifugeEndTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		centrifugeEndTimeUnit(nullable: false)
		centrifugeEndDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		centrifugeTempMeasure(nullable: false)
		centrifugeTemp(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		bloodHemolyze(nullable: false)
		centrifugeComment(nullable: false)
		centrifugeCommentOth(nullable: true, maxSize:255)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		coldTempMeasure(nullable: false)
		coldTemp(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		coldThresholdLow(nullable: false)
		coldThresholdHigh(nullable: false)
		ambientThresholdLow(nullable: false)
		bloodDrawCom(nullable: false)
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
