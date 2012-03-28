package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ValidationIns {

	Integer psuId
	String validationInsId
	Integer recruitType
	String duId
	String pId
	String eventId
	Integer eventType
	Integer eventRepeatKey
	String instrumentId
	Integer instrumentType
	String instrumentVersion
	Integer instrumentRepeatKey
	String timeStamp1
	Integer intro1
	Integer verNumber
	String bestTtc1
	String dayWeek1
	Integer bestTtc2
	Integer bestTtc3
	Integer phone
	String phoneNbr
	String timeStamp2
	Integer intro2
	Integer schedule
	Integer intro3
	String rBestTtc1
	String dayWeek2
	Integer rBestTtc2
	Integer rBestTtc3
	String timeStamp3
	Integer intConfirm
	String timeStamp4
	Integer hhEnum
	Integer numFemale
	String timeStamp5
	Integer pregScr
	Integer age
	String timeStamp6
	Integer infConsent
	Integer infConsent2
	String timeStamp7
	Integer ppgCati
	Integer ppgCati2
	String timeStamp8
	Integer prepreg
	Integer prepreg2
	String timeStamp9
	Integer preg1
	Integer homeTest
	String timeStamp10
	Integer preg2
	Integer ownHome
	String timeStamp11
	Integer birth
	Integer vaccine
	String timeStamp12
	Integer childslp
	Integer vchildcare
	String timeStamp13
	Integer sixMonth
	Integer insure
	String timeStamp14
	Integer childskill
	Integer rHcare
	String timeStamp15
	Integer twelveMonth
	Integer childcare
	String timeStamp16
	Integer comment
	String commentOth
	String timeStamp17
	String timeStamp18
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		validationInsId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: false)
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		intro1(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		verNumber(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bestTtc1(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		dayWeek1(nullable: true, maxSize:100)
		bestTtc2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bestTtc3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		phone(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		phoneNbr(nullable: true, maxSize:10)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		intro2(nullable: false, inList:[1, 2, -3, -4])
		schedule(nullable: false, inList:[1, 2, -3, -4])
		intro3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		rBestTtc1(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		dayWeek2(nullable: true, maxSize:100)
		rBestTtc2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		rBestTtc3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		intConfirm(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hhEnum(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		numFemale(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregScr(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		age(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		infConsent(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		infConsent2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		ppgCati(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		ppgCati2(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		prepreg(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		prepreg2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		preg1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		homeTest(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		preg2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		ownHome(nullable: false, inList:[1, 2, 3, -5, -1, -2, -3, -4])
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		birth(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		vaccine(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		childslp(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		vchildcare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp13(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		sixMonth(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insure(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp14(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		childskill(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		rHcare(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4])
		timeStamp15(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		twelveMonth(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		childcare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp16(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		comment(nullable: false, inList:[1, 2, -1, -2, -3, -4])
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
