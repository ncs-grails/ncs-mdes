package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthSaq2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String sixMthSaqId
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
	ConfirmTypeCl8 breastFeed
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 breastFeedNow
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 pumped
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 pumpedNow
	/**
	 * Status level 2
	 */
	Integer breastStop
	/**
	 * Status level 2
	 */
	TimeUnitCl7 breastStopUnit
	/**
	 * Status level 2
	 */
	Integer breastMilk
	/**
	 * Status level 2
	 */
	TimeUnitCl8 breastUnit
	/**
	 * Status level 2
	 */
	Integer formulaOften
	/**
	 * Status level 2
	 */
	TimeUnitCl8 formulaOftenUnit
	/**
	 * Status level 2
	 */
	Integer cowMilk
	/**
	 * Status level 2
	 */
	TimeUnitCl8 cowMilkUnit
	/**
	 * Status level 2
	 */
	Integer milkOther
	/**
	 * Status level 2
	 */
	TimeUnitCl8 milkOtherUnit
	/**
	 * Status level 2
	 */
	BreastMilkFeedCl4 pumped2
	/**
	 * Status level 2
	 */
	TimePeriodCl1 breastMilkStored
	/**
	 * Status level 2
	 */
	TimePeriodCl2 breastMilkTemp
	/**
	 * Status level 2
	 */
	AgeRangeCl4 formula
	/**
	 * Status level 2
	 */
	SupplementCl2 formulaIron
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 formulaLabel
	/**
	 * Status level 2
	 */
	Integer formulaAmt
	/**
	 * Status level 2
	 */
	VolumeUnitCl1 formulaUnit
	/**
	 * Status level 2
	 */
	Integer waterAmt
	/**
	 * Status level 2
	 */
	VolumeUnitCl3 waterUnit
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 water2
	/**
	 * Status level 2
	 */
	Integer ounces
	/**
	 * Status level 2
	 */
	RegularityLevelCl11 cleanHands1
	/**
	 * Status level 2
	 */
	RegularityLevelCl11 cleanHands2
	/**
	 * Status level 2
	 */
	RegularityLevelCl11 cleanHands3
	/**
	 * Status level 2
	 */
	RegularityLevelCl11 cleanHands4
	/**
	 * Status level 2
	 */
	RegularityLevelCl11 cleanHands5
	/**
	 * Status level 2
	 */
	RegularityLevelCl11 bType1
	/**
	 * Status level 2
	 */
	RegularityLevelCl11 bType2
	/**
	 * Status level 2
	 */
	RegularityLevelCl11 bType3
	/**
	 * Status level 2
	 */
	RegularityLevelCl11 bType4
	/**
	 * Status level 2
	 */
	RegularityLevelCl11 bType5
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 pacifier
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 cowsMilk1
	/**
	 * Status level 2
	 */
	Integer cowsMilk2
	/**
	 * Status level 2
	 */
	TimeUnitCl6 cowsMilk2Unit
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 juice
	/**
	 * Status level 2
	 */
	Integer juiceAge
	/**
	 * Status level 2
	 */
	TimeUnitCl6 juiceAgeUnit
	/**
	 * Status level 2
	 */
	RegularityLevelCl9 juiceCalcium
	/**
	 * Status level 2
	 */
	RegularityLevelCl18 cFood1
	/**
	 * Status level 2
	 */
	RegularityLevelCl18 cFood2
	/**
	 * Status level 2
	 */
	RegularityLevelCl18 cFood3
	/**
	 * Status level 2
	 */
	RegularityLevelCl18 cFood4
	/**
	 * Status level 2
	 */
	RegularityLevelCl18 cFood5
	/**
	 * Status level 2
	 */
	RegularityLevelCl9 organic
	/**
	 * Status level 2
	 */
	DrugDoseFormCl1 suppForm
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 herbal
	/**
	 * PII level P
	 * Status level 2
	 */
	String herbalOth
	/**
	 * Status level 2
	 */
	String timeStamp2
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		sixMthSaqId(nullable: false, minSize:1, maxSize:36)
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
		breastFeed(nullable: false)
		breastFeedNow(nullable: false)
		pumped(nullable: false)
		pumpedNow(nullable: false)
		breastStop(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		breastStopUnit(nullable: false)
		breastMilk(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		breastUnit(nullable: false)
		formulaOften(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaOftenUnit(nullable: false)
		cowMilk(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowMilkUnit(nullable: false)
		milkOther(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		milkOtherUnit(nullable: false)
		pumped2(nullable: false)
		breastMilkStored(nullable: false)
		breastMilkTemp(nullable: false)
		formula(nullable: false)
		formulaIron(nullable: false)
		formulaLabel(nullable: false)
		formulaAmt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaUnit(nullable: false)
		waterAmt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		waterUnit(nullable: false)
		water2(nullable: false)
		ounces(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cleanHands1(nullable: false)
		cleanHands2(nullable: false)
		cleanHands3(nullable: false)
		cleanHands4(nullable: false)
		cleanHands5(nullable: false)
		bType1(nullable: false)
		bType2(nullable: false)
		bType3(nullable: false)
		bType4(nullable: false)
		bType5(nullable: false)
		pacifier(nullable: false)
		cowsMilk1(nullable: false)
		cowsMilk2(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowsMilk2Unit(nullable: false)
		juice(nullable: false)
		juiceAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		juiceAgeUnit(nullable: false)
		juiceCalcium(nullable: false)
		cFood1(nullable: false)
		cFood2(nullable: false)
		cFood3(nullable: false)
		cFood4(nullable: false)
		cFood5(nullable: false)
		organic(nullable: false)
		suppForm(nullable: false)
		herbal(nullable: false)
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
