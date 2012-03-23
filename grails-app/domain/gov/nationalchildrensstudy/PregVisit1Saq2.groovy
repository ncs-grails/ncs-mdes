package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1Saq2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv1SaqId
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
	ConfirmTypeCl8 planned
	/**
	 * Status level 2
	 */
	Integer monthTry
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 wanted
	/**
	 * Status level 2
	 */
	PregnancyTimingCl1 timing
	/**
	 * Status level 2
	 */
	String fatherName
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 fatherSameHh
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 fatherKnowPreg
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 contactFNow
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 contactFLater
	/**
	 * Status level 2
	 */
	String fAddrId
	/**
	 * PII level Y
	 * Status level 2
	 */
	String fAddr12
	/**
	 * PII level Y
	 * Status level 2
	 */
	String fAddr22
	/**
	 * PII level Y
	 * Status level 2
	 */
	String fUnit2
	/**
	 * PII level Y
	 * Status level 2
	 */
	String fCity2
	/**
	 * PII level Y
	 * Status level 2
	 */
	StateCl2 fState2
	/**
	 * PII level P
	 * Status level 2
	 */
	String fZipcode2
	/**
	 * PII level P
	 * Status level 2
	 */
	String fZip42
	/**
	 * PII level Y
	 * Status level 2
	 */
	String fPhone
	/**
	 * Status level 2
	 */
	Integer fAge
	/**
	 * Status level 2
	 */
	String timeStamp2
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 pastPreg
	/**
	 * Status level 2
	 */
	Integer numPreg
	/**
	 * Status level 2
	 */
	Integer ageFirst
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 premature
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 miscarry
	/**
	 * Status level 2
	 */
	String timeStamp3
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 cigPast
	/**
	 * Status level 2
	 */
	SmokingFrequencyCl1 cigPastFreq
	/**
	 * Status level 2
	 */
	Integer cigPastNum
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 cigNow
	/**
	 * Status level 2
	 */
	SmokingFrequencyCl1 cigNowFreq
	/**
	 * Status level 2
	 */
	Integer cigNowNum
	/**
	 * Status level 2
	 */
	AlcoholFrequencyCl1 drinkPast
	/**
	 * Status level 2
	 */
	Integer drinkPastNum
	/**
	 * Status level 2
	 */
	AlcoholFrequencyCl2 drinkPast5
	/**
	 * Status level 2
	 */
	AlcoholFrequencyCl1 drinkNow
	/**
	 * Status level 2
	 */
	Integer drinkNowNum
	/**
	 * Status level 2
	 */
	AlcoholFrequencyCl2 drinkNow5
	/**
	 * Status level 2
	 */
	String timeStamp4
	/**
	 * Status level 2
	 */
	ImportanceLevelCl2 learn
	/**
	 * Status level 2
	 */
	ImportanceLevelCl2 help
	/**
	 * Status level 2
	 */
	ImportanceLevelCl2 incent
	/**
	 * Status level 2
	 */
	ImportanceLevelCl2 research
	/**
	 * Status level 2
	 */
	ImportanceLevelCl2 envir
	/**
	 * Status level 2
	 */
	ImportanceLevelCl2 community
	/**
	 * Status level 2
	 */
	ImportanceLevelCl2 knowOthers
	/**
	 * Status level 2
	 */
	ImportanceLevelCl2 family
	/**
	 * Status level 2
	 */
	ImportanceLevelCl2 doctor
	/**
	 * Status level 2
	 */
	ImportanceLevelCl2 staff
	/**
	 * Status level 2
	 */
	OpinionTypeCl7 opinSpouse
	/**
	 * Status level 2
	 */
	OpinionTypeCl7 opinFamily
	/**
	 * Status level 2
	 */
	OpinionTypeCl7 opinFriend
	/**
	 * Status level 2
	 */
	OpinionTypeCl7 opinDr
	/**
	 * Status level 2
	 */
	OpinionTypeCl6 experience
	/**
	 * Status level 2
	 */
	ImprovementRankCl2 improve
	/**
	 * Status level 2
	 */
	IntLengthRankCl2 intLength
	/**
	 * Status level 2
	 */
	StressLevelCl2 intStress
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 intRepeat
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
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		planned(nullable: false)
		monthTry(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		wanted(nullable: false)
		timing(nullable: false)
		fatherName(nullable: true, maxSize:60)
		fatherSameHh(nullable: false)
		fatherKnowPreg(nullable: false)
		contactFNow(nullable: false)
		contactFLater(nullable: false)
		fAddrId(nullable: true, maxSize:36)
		fAddr12(nullable: true, maxSize:100)
		fAddr22(nullable: true, maxSize:100)
		fUnit2(nullable: true, maxSize:10)
		fCity2(nullable: true, maxSize:50)
		fState2(nullable: false)
		fZipcode2(nullable: true, maxSize:5)
		fZip42(nullable: true, maxSize:4)
		fPhone(nullable: true, maxSize:10)
		fAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pastPreg(nullable: false)
		numPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		ageFirst(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		premature(nullable: false)
		miscarry(nullable: false)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
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
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
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
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_saq_2'
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
		timeStamp1 column:'time_stamp_1'
		planned column:'planned'
		monthTry column:'month_try'
		wanted column:'wanted'
		timing column:'timing'
		fatherName column:'father_name'
		fatherSameHh column:'father_same_hh'
		fatherKnowPreg column:'father_know_preg'
		contactFNow column:'contact_f_now'
		contactFLater column:'contact_f_later'
		fAddrId column:'f_addr_id'
		fAddr12 column:'f_addr1_2'
		fAddr22 column:'f_addr_2_2'
		fUnit2 column:'f_unit_2'
		fCity2 column:'f_city_2'
		fState2 column:'f_state_2'
		fZipcode2 column:'f_zipcode_2'
		fZip42 column:'f_zip4_2'
		fPhone column:'f_phone'
		fAge column:'f_age'
		timeStamp2 column:'time_stamp_2'
		pastPreg column:'past_preg'
		numPreg column:'num_preg'
		ageFirst column:'age_first'
		premature column:'premature'
		miscarry column:'miscarry'
		timeStamp3 column:'time_stamp_3'
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
		timeStamp4 column:'time_stamp_4'
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
		timeStamp5 column:'time_stamp_5'
		transactionType column:'transaction_type'
	}
}
