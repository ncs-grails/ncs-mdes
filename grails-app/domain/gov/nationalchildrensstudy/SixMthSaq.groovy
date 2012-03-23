package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthSaq {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String sixMthSaqId
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
	String pId
	/**
	 * Status level 1
	 */
	String eventId
	/**
	 * Status level 3
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
	 * Status level 3
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
	 * Status level 1
	 */
	String timeStamp1
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 breastFeed
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 breastFeedNow
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 pumped
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 pumpedNow
	/**
	 * Status level 3
	 */
	Integer breastStop
	/**
	 * Status level 3
	 */
	TimeUnitCl7 breastStopUnit
	/**
	 * Status level 1
	 */
	Integer breastDay
	/**
	 * Status level 1
	 */
	Integer breastWeek
	/**
	 * Status level 1
	 */
	Integer formulaDay
	/**
	 * Status level 1
	 */
	Integer formulaWeek
	/**
	 * Status level 1
	 */
	Integer cowMilkDay
	/**
	 * Status level 1
	 */
	Integer cowMilkWeek
	/**
	 * Status level 1
	 */
	Integer milkOthDay
	/**
	 * Status level 1
	 */
	Integer milkOthWeek
	/**
	 * Status level 3
	 */
	BreastMilkFeedCl2 pumped2
	/**
	 * Status level 3
	 */
	TimePeriodCl1 breastMilkStored
	/**
	 * Status level 3
	 */
	TimePeriodCl2 breastMilkTemp
	/**
	 * Status level 3
	 */
	AgeRangeCl4 formula
	/**
	 * Status level 3
	 */
	SupplementCl2 formulaIron
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 formulaLabel
	/**
	 * Status level 1
	 */
	Integer formulaAmt
	/**
	 * Status level 3
	 */
	VolumeUnitCl1 formulaUnit
	/**
	 * Status level 1
	 */
	Integer waterAmt
	/**
	 * Status level 3
	 */
	VolumeUnitCl2 waterUnit
	/**
	 * Status level 3
	 */
	ConfirmTypeCl6 water2
	/**
	 * Status level 1
	 */
	Integer ounces
	/**
	 * Status level 3
	 */
	RegularityLevelCl11 cleanHands1
	/**
	 * Status level 3
	 */
	RegularityLevelCl11 cleanHands2
	/**
	 * Status level 3
	 */
	RegularityLevelCl11 cleanHands3
	/**
	 * Status level 3
	 */
	RegularityLevelCl11 cleanHands4
	/**
	 * Status level 3
	 */
	RegularityLevelCl11 cleanHands5
	/**
	 * Status level 3
	 */
	RegularityLevelCl11 bType1
	/**
	 * Status level 3
	 */
	RegularityLevelCl11 bType2
	/**
	 * Status level 3
	 */
	RegularityLevelCl11 bType3
	/**
	 * Status level 3
	 */
	RegularityLevelCl11 bType4
	/**
	 * Status level 3
	 */
	RegularityLevelCl11 bType5
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pacifier
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 cowsMilk1
	/**
	 * Status level 1
	 */
	Integer cowsMilk2
	/**
	 * Status level 3
	 */
	TimeUnitCl6 cowsMilk2Unit
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 juice
	/**
	 * Status level 1
	 */
	Integer juiceAge
	/**
	 * Status level 3
	 */
	TimeUnitCl6 juiceAgeUnit
	/**
	 * Status level 3
	 */
	RegularityLevelCl9 juiceCalcium
	/**
	 * Status level 3
	 */
	RegularityLevelCl10 cFood1
	/**
	 * Status level 3
	 */
	RegularityLevelCl10 cFood2
	/**
	 * Status level 3
	 */
	RegularityLevelCl10 cFood3
	/**
	 * Status level 3
	 */
	RegularityLevelCl10 cFood4
	/**
	 * Status level 3
	 */
	RegularityLevelCl10 cFood5
	/**
	 * Status level 3
	 */
	RegularityLevelCl9 organic
	/**
	 * Status level 3
	 */
	DrugDoseFormCl1 suppForm
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 herbal
	/**
	 * PII level P
	 * Status level 1
	 */
	String herbalOth
	/**
	 * Status level 1
	 */
	String timeStamp2
	/**
	 * Status level 1
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
		breastDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		breastWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowMilkDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowMilkWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		milkOthDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		milkOthWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
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
		table 'six_mth_saq'
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
		breastDay column:'breast_day'
		breastWeek column:'breast_week'
		formulaDay column:'formula_day'
		formulaWeek column:'formula_week'
		cowMilkDay column:'cow_milk_day'
		cowMilkWeek column:'cow_milk_week'
		milkOthDay column:'milk_oth_day'
		milkOthWeek column:'milk_oth_week'
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
		cleanHands1 column:'clean_hands1'
		cleanHands2 column:'clean_hands2'
		cleanHands3 column:'clean_hands3'
		cleanHands4 column:'clean_hands4'
		cleanHands5 column:'clean_hands5'
		bType1 column:'b_type1'
		bType2 column:'b_type2'
		bType3 column:'b_type3'
		bType4 column:'b_type4'
		bType5 column:'b_type5'
		pacifier column:'pacifier'
		cowsMilk1 column:'cows_milk_1'
		cowsMilk2 column:'cows_milk_2'
		cowsMilk2Unit column:'cows_milk2_unit'
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
