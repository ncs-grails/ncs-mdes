package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class LowHighScript {

	Integer psuId
	String lowHiId
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
	Integer outAnswer
	String outAnswerOth
	Integer outSpeak
	Integer outAvail
	Integer outVisit
	Integer outVisitUcla
	Integer outTalk
	String rBestTtc1
	String dayWeek2
	Integer rBestTtc2
	Integer rBestTtc3
	Integer outUnavail
	String bestTtc1
	String dayWeek1
	Integer bestTtc2
	Integer bestTtc3
	String outNextph
	Integer inVisit
	Integer inVisitUcla
	Integer ppgConfirm
	Integer followup1
	Integer followup3
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		lowHiId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		outAnswer(nullable: false, inList:[1, 2, 3, -5, -3, -4])
		outAnswerOth(nullable: true, maxSize:255)
		outSpeak(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		outAvail(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		outVisit(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		outVisitUcla(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		outTalk(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		rBestTtc1(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		dayWeek2(nullable: true, maxSize:100)
		rBestTtc2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		rBestTtc3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		outUnavail(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bestTtc1(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		dayWeek1(nullable: true, maxSize:100)
		bestTtc2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bestTtc3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		outNextph(nullable: true, maxSize:10)
		inVisit(nullable: false, inList:[1, 2, -1, -2, -4])
		inVisitUcla(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		ppgConfirm(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		followup1(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		followup3(nullable: false, inList:[1, 2, 3, -1, -2, -4])
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
