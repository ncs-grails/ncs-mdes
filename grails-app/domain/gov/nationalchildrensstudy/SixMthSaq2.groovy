package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthSaq2 {

	Integer psuId
	String sixMthSaqId
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
	Integer breastFeed
	Integer breastFeedNow
	Integer pumped
	Integer pumpedNow
	Integer breastStop
	Integer breastStopUnit
	Integer breastMilk
	Integer breastUnit
	Integer formulaOften
	Integer formulaOftenUnit
	Integer cowMilk
	Integer cowMilkUnit
	Integer milkOther
	Integer milkOtherUnit
	Integer pumped2
	Integer breastMilkStored
	Integer breastMilkTemp
	Integer formula
	Integer formulaIron
	Integer formulaLabel
	Integer formulaAmt
	Integer formulaUnit
	Integer waterAmt
	Integer waterUnit
	Integer water2
	Integer ounces
	Integer cleanHands1
	Integer cleanHands2
	Integer cleanHands3
	Integer cleanHands4
	Integer cleanHands5
	Integer bType1
	Integer bType2
	Integer bType3
	Integer bType4
	Integer bType5
	Integer pacifier
	Integer cowsMilk1
	Integer cowsMilk2
	Integer cowsMilk2Unit
	Integer juice
	Integer juiceAge
	Integer juiceAgeUnit
	Integer juiceCalcium
	Integer cFood1
	Integer cFood2
	Integer cFood3
	Integer cFood4
	Integer cFood5
	Integer organic
	Integer suppForm
	Integer herbal
	String herbalOth
	String timeStamp2
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		sixMthSaqId(nullable: false, minSize:1, maxSize:36)
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
		breastFeed(nullable: false, inList:[1, 2, -1, -2, -4])
		breastFeedNow(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		pumped(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		pumpedNow(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		breastStop(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		breastStopUnit(nullable: false, inList:[1, 2, -7, -3, -4])
		breastMilk(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		breastUnit(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		formulaOften(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaOftenUnit(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cowMilk(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowMilkUnit(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		milkOther(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		milkOtherUnit(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		pumped2(nullable: false, inList:[2, 3, 4, 5, 6, -1, -2, -3, -4, -7])
		breastMilkStored(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4, -7])
		breastMilkTemp(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4, -7])
		formula(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4, -7])
		formulaIron(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		formulaLabel(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		formulaAmt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaUnit(nullable: false, inList:[1, 2, 3, 4, 5, 6, -3, -4])
		waterAmt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		waterUnit(nullable: false, inList:[1, 2, 3, -3, -4])
		water2(nullable: false, inList:[1, 2, -3, -4])
		ounces(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cleanHands1(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cleanHands2(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cleanHands3(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cleanHands4(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cleanHands5(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType1(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType2(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType3(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType4(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType5(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		pacifier(nullable: false, inList:[1, 2, -1, -2, -4])
		cowsMilk1(nullable: false, inList:[1, 2, -4])
		cowsMilk2(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowsMilk2Unit(nullable: false, inList:[1, 2, -3, -4])
		juice(nullable: false, inList:[1, 2, -4])
		juiceAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		juiceAgeUnit(nullable: false, inList:[1, 2, -3, -4])
		juiceCalcium(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cFood1(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		cFood2(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		cFood3(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		cFood4(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		cFood5(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		organic(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		suppForm(nullable: false, inList:[1, 2, -3, -4])
		herbal(nullable: false, inList:[1, 2, -4])
		herbalOth(nullable: true, maxSize:255)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'six_mth_saq_2'
		psuId column:'psu_id'
		sixMthSaqId column:'six_mth_saq_id'
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
		breastFeed column:'breast_feed'
		breastFeedNow column:'breast_feed_now'
		pumped column:'pumped'
		pumpedNow column:'pumped_now'
		breastStop column:'breast_stop'
		breastStopUnit column:'breast_stop_unit'
		breastMilk column:'breast_milk'
		breastUnit column:'breast_unit'
		formulaOften column:'formula_often'
		formulaOftenUnit column:'formula_often_unit'
		cowMilk column:'cow_milk'
		cowMilkUnit column:'cow_milk_unit'
		milkOther column:'milk_other'
		milkOtherUnit column:'milk_other_unit'
		pumped2 column:'pumped_2'
		breastMilkStored column:'breast_milk_stored'
		breastMilkTemp column:'breast_milk_temp'
		formula column:'formula'
		formulaIron column:'formula_iron'
		formulaLabel column:'formula_label'
		formulaAmt column:'formula_amt'
		formulaUnit column:'formula_unit'
		waterAmt column:'water_amt'
		waterUnit column:'water_unit'
		water2 column:'water_2'
		ounces column:'ounces'
		cleanHands1 column:'clean_hands_1'
		cleanHands2 column:'clean_hands_2'
		cleanHands3 column:'clean_hands_3'
		cleanHands4 column:'clean_hands_4'
		cleanHands5 column:'clean_hands_5'
		bType1 column:'b_type_1'
		bType2 column:'b_type_2'
		bType3 column:'b_type_3'
		bType4 column:'b_type_4'
		bType5 column:'b_type_5'
		pacifier column:'pacifier'
		cowsMilk1 column:'cows_milk_1'
		cowsMilk2 column:'cows_milk_2'
		cowsMilk2Unit column:'cows_milk_2_unit'
		juice column:'juice'
		juiceAge column:'juice_age'
		juiceAgeUnit column:'juice_age_unit'
		juiceCalcium column:'juice_calcium'
		cFood1 column:'c_food1'
		cFood2 column:'c_food2'
		cFood3 column:'c_food3'
		cFood4 column:'c_food4'
		cFood5 column:'c_food5'
		organic column:'organic'
		suppForm column:'supp_form'
		herbal column:'herbal'
		herbalOth column:'herbal_oth'
		timeStamp2 column:'time_stamp_2'
		transactionType column:'transaction_type'
	}
}
