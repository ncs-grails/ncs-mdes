package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1Saq {

	/**
	 * Status level 3
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1SaqId
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
	String timeStamp18
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 planned
	/**
	 * Status level 1
	 */
	Integer monthTry
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 wanted
	/**
	 * Status level 3
	 */
	PregnancyTimingCl1 timing
	/**
	 * Status level 1
	 */
	String timeStamp19
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 pastPreg
	/**
	 * Status level 3
	 */
	Integer numPreg
	/**
	 * Status level 3
	 */
	Integer ageFirst
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 premature
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 miscarry
	/**
	 * Status level 1
	 */
	String timeStamp20
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 cigPast
	/**
	 * Status level 3
	 */
	SmokingFrequencyCl1 cigPastFreq
	/**
	 * Status level 3
	 */
	Integer cigPastNum
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 cigNow
	/**
	 * Status level 3
	 */
	SmokingFrequencyCl1 cigNowFreq
	/**
	 * Status level 3
	 */
	Integer cigNowNum
	/**
	 * Status level 3
	 */
	AlcoholFrequencyCl1 drinkPast
	/**
	 * Status level 3
	 */
	Integer drinkPastNum
	/**
	 * Status level 3
	 */
	AlcoholFrequencyCl2 drinkPast5
	/**
	 * Status level 3
	 */
	AlcoholFrequencyCl1 drinkNow
	/**
	 * Status level 3
	 */
	Integer drinkNowNum
	/**
	 * Status level 3
	 */
	AlcoholFrequencyCl2 drinkNow5
	/**
	 * Status level 1
	 */
	String timeStamp21
	/**
	 * Status level 3
	 */
	ImportanceLevelCl2 learn
	/**
	 * Status level 3
	 */
	ImportanceLevelCl2 help
	/**
	 * Status level 3
	 */
	ImportanceLevelCl2 incent
	/**
	 * Status level 3
	 */
	ImportanceLevelCl2 research
	/**
	 * Status level 3
	 */
	ImportanceLevelCl2 envir
	/**
	 * Status level 3
	 */
	ImportanceLevelCl2 community
	/**
	 * Status level 3
	 */
	ImportanceLevelCl2 knowOthers
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 family
	/**
	 * Status level 3
	 */
	ImportanceLevelCl2 doctor
	/**
	 * Status level 3
	 */
	ImportanceLevelCl2 staff
	/**
	 * Status level 3
	 */
	OpinionTypeCl3 opinSpouse
	/**
	 * Status level 3
	 */
	OpinionTypeCl3 opinFamily
	/**
	 * Status level 3
	 */
	OpinionTypeCl3 opinFriend
	/**
	 * Status level 3
	 */
	OpinionTypeCl3 opinDr
	/**
	 * Status level 3
	 */
	OpinionTypeCl4 experience
	/**
	 * Status level 3
	 */
	ImprovementRankCl2 improve
	/**
	 * Status level 3
	 */
	IntLengthRankCl2 intLength
	/**
	 * Status level 3
	 */
	StressLevelCl2 intStress
	/**
	 * Status level 3
	 */
	ConfirmTypeCl6 intRepeat
	/**
	 * Status level 1
	 */
	String timeStamp22
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1SaqId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false)
		duId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false)
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp18(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		planned(nullable: false)
		monthTry(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		wanted(nullable: false)
		timing(nullable: false)
		timeStamp19(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pastPreg(nullable: false)
		numPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		ageFirst(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		premature(nullable: false)
		miscarry(nullable: false)
		timeStamp20(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cigPast(nullable: false)
		cigPastFreq(nullable: false)
		cigPastNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cigNow(nullable: false)
		cigNowFreq(nullable: false)
		cigNowNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		drinkPast(nullable: false)
		drinkPastNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		drinkPast5(nullable: false)
		drinkNow(nullable: false)
		drinkNowNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		drinkNow5(nullable: false)
		timeStamp21(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		learn(nullable: false)
		help(nullable: false)
		incent(nullable: false)
		research(nullable: false)
		envir(nullable: false)
		community(nullable: false)
		knowOthers(nullable: false)
		family(nullable: false)
		doctor(nullable: false)
		staff(nullable: false)
		opinSpouse(nullable: false)
		opinFamily(nullable: false)
		opinFriend(nullable: false)
		opinDr(nullable: false)
		experience(nullable: false)
		improve(nullable: false)
		intLength(nullable: false)
		intStress(nullable: false)
		intRepeat(nullable: false)
		timeStamp22(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_saq'
		psuId column:'psu_id'
		pv1SaqId column:'pv1_saq_id'
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
		timeStamp18 column:'time_stamp_18'
		planned column:'planned'
		monthTry column:'month_try'
		wanted column:'wanted'
		timing column:'timing'
		timeStamp19 column:'time_stamp_19'
		pastPreg column:'past_preg'
		numPreg column:'num_preg'
		ageFirst column:'age_first'
		premature column:'premature'
		miscarry column:'miscarry'
		timeStamp20 column:'time_stamp_20'
		cigPast column:'cig_past'
		cigPastFreq column:'cig_past_freq'
		cigPastNum column:'cig_past_num'
		cigNow column:'cig_now'
		cigNowFreq column:'cig_now_freq'
		cigNowNum column:'cig_now_num'
		drinkPast column:'drink_past'
		drinkPastNum column:'drink_past_num'
		drinkPast5 column:'drink_past_5'
		drinkNow column:'drink_now'
		drinkNowNum column:'drink_now_num'
		drinkNow5 column:'drink_now_5'
		timeStamp21 column:'time_stamp_21'
		learn column:'learn'
		help column:'help'
		incent column:'incent'
		research column:'research'
		envir column:'envir'
		community column:'community'
		knowOthers column:'know_others'
		family column:'family'
		doctor column:'doctor'
		staff column:'staff'
		opinSpouse column:'opin_spouse'
		opinFamily column:'opin_family'
		opinFriend column:'opin_friend'
		opinDr column:'opin_dr'
		experience column:'experience'
		improve column:'improve'
		intLength column:'int_length'
		intStress column:'int_stress'
		intRepeat column:'int_repeat'
		timeStamp22 column:'time_stamp_22'
		transactionType column:'transaction_type'
	}
}
