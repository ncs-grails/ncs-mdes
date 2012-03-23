package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ValidationIns {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String validationInsId
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
	String timeStamp1
	/**
	 * Status level 2
	 */
	ConfirmTypeCl25 intro1
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 verNumber
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
	 * Status level 2
	 */
	ConfirmTypeCl7 phone
	/**
	 * PII level Y
	 * Status level 2
	 */
	String phoneNbr
	/**
	 * Status level 2
	 */
	String timeStamp2
	/**
	 * Status level 2
	 */
	ConfirmTypeCl24 intro2
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 schedule
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 intro3
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
	String timeStamp3
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 intConfirm
	/**
	 * Status level 2
	 */
	String timeStamp4
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 hhEnum
	/**
	 * Status level 2
	 */
	Integer numFemale
	/**
	 * Status level 2
	 */
	String timeStamp5
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 pregScr
	/**
	 * Status level 2
	 */
	Integer age
	/**
	 * Status level 2
	 */
	String timeStamp6
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 infConsent
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 infConsent2
	/**
	 * Status level 2
	 */
	String timeStamp7
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 ppgCati
	/**
	 * Status level 2
	 */
	PregnancyStatusCl1 ppgCati2
	/**
	 * Status level 2
	 */
	String timeStamp8
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 prepreg
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 prepreg2
	/**
	 * Status level 2
	 */
	String timeStamp9
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 preg1
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 homeTest
	/**
	 * Status level 2
	 */
	String timeStamp10
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 preg2
	/**
	 * Status level 2
	 */
	HomeOwnershipCl1 ownHome
	/**
	 * Status level 2
	 */
	String timeStamp11
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 birth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 vaccine
	/**
	 * Status level 2
	 */
	String timeStamp12
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 childslp
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 vchildcare
	/**
	 * Status level 2
	 */
	String timeStamp13
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 sixMonth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 insure
	/**
	 * Status level 2
	 */
	String timeStamp14
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 childskill
	/**
	 * Status level 2
	 */
	WellchildCarePlaceCl2 rHcare
	/**
	 * Status level 2
	 */
	String timeStamp15
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 twelveMonth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 childcare
	/**
	 * Status level 2
	 */
	String timeStamp16
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 comment
	/**
	 * PII level P
	 * Status level 2
	 */
	String commentOth
	/**
	 * Status level 2
	 */
	String timeStamp17
	/**
	 * Status level 2
	 */
	String timeStamp18
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		validationInsId(nullable: false, minSize:1, maxSize:36)
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
		intro1(nullable: false)
		verNumber(nullable: false)
		bestTtc1(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		dayWeek1(nullable: true, maxSize:100)
		bestTtc2(nullable: false)
		bestTtc3(nullable: false)
		phone(nullable: false)
		phoneNbr(nullable: true, maxSize:10)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		intro2(nullable: false)
		schedule(nullable: false)
		intro3(nullable: false)
		rBestTtc1(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		dayWeek2(nullable: true, maxSize:100)
		rBestTtc2(nullable: false)
		rBestTtc3(nullable: false)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		intConfirm(nullable: false)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hhEnum(nullable: false)
		numFemale(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregScr(nullable: false)
		age(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		infConsent(nullable: false)
		infConsent2(nullable: false)
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		ppgCati(nullable: false)
		ppgCati2(nullable: false)
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		prepreg(nullable: false)
		prepreg2(nullable: false)
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		preg1(nullable: false)
		homeTest(nullable: false)
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		preg2(nullable: false)
		ownHome(nullable: false)
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		birth(nullable: false)
		vaccine(nullable: false)
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		childslp(nullable: false)
		vchildcare(nullable: false)
		timeStamp13(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		sixMonth(nullable: false)
		insure(nullable: false)
		timeStamp14(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		childskill(nullable: false)
		rHcare(nullable: false)
		timeStamp15(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		twelveMonth(nullable: false)
		childcare(nullable: false)
		timeStamp16(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		comment(nullable: false)
		commentOth(nullable: true, maxSize:255)
		timeStamp17(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timeStamp18(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'validation_ins'
		psuId column:'psu_id'
		validationInsId column:'validation_ins_id'
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
		intro1 column:'intro_1'
		verNumber column:'ver_number'
		bestTtc1 column:'best_ttc_1'
		dayWeek1 column:'day_week_1'
		bestTtc2 column:'best_ttc_2'
		bestTtc3 column:'best_ttc_3'
		phone column:'phone'
		phoneNbr column:'phone_nbr'
		timeStamp2 column:'time_stamp_2'
		intro2 column:'intro_2'
		schedule column:'schedule'
		intro3 column:'intro_3'
		rBestTtc1 column:'r_best_ttc_1'
		dayWeek2 column:'day_week_2'
		rBestTtc2 column:'r_best_ttc_2'
		rBestTtc3 column:'r_best_ttc_3'
		timeStamp3 column:'time_stamp_3'
		intConfirm column:'int_confirm'
		timeStamp4 column:'time_stamp_4'
		hhEnum column:'hh_enum'
		numFemale column:'num_female'
		timeStamp5 column:'time_stamp_5'
		pregScr column:'preg_scr'
		age column:'age'
		timeStamp6 column:'time_stamp_6'
		infConsent column:'inf_consent'
		infConsent2 column:'inf_consent2'
		timeStamp7 column:'time_stamp_7'
		ppgCati column:'ppg_cati'
		ppgCati2 column:'ppg_cati2'
		timeStamp8 column:'time_stamp_8'
		prepreg column:'prepreg'
		prepreg2 column:'prepreg2'
		timeStamp9 column:'time_stamp_9'
		preg1 column:'preg1'
		homeTest column:'home_test'
		timeStamp10 column:'time_stamp_10'
		preg2 column:'preg2'
		ownHome column:'own_home'
		timeStamp11 column:'time_stamp_11'
		birth column:'birth'
		vaccine column:'vaccine'
		timeStamp12 column:'time_stamp_12'
		childslp column:'childslp'
		vchildcare column:'vchildcare'
		timeStamp13 column:'time_stamp_13'
		sixMonth column:'six_month'
		insure column:'insure'
		timeStamp14 column:'time_stamp_14'
		childskill column:'childskill'
		rHcare column:'r_hcare'
		timeStamp15 column:'time_stamp_15'
		twelveMonth column:'twelve_month'
		childcare column:'childcare'
		timeStamp16 column:'time_stamp_16'
		comment column:'comment'
		commentOth column:'comment_oth'
		timeStamp17 column:'time_stamp_17'
		timeStamp18 column:'time_stamp_18'
		transactionType column:'transaction_type'
	}
}
