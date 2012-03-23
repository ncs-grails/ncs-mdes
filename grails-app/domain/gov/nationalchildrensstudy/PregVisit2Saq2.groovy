package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2Saq2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv2SaqId
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
	ImportanceLevelCl1 learn
	/**
	 * Status level 2
	 */
	ImportanceLevelCl1 help
	/**
	 * Status level 2
	 */
	ImportanceLevelCl1 incent
	/**
	 * Status level 2
	 */
	ImportanceLevelCl1 research
	/**
	 * Status level 2
	 */
	ImportanceLevelCl1 envir
	/**
	 * Status level 2
	 */
	ImportanceLevelCl1 community
	/**
	 * Status level 2
	 */
	ImportanceLevelCl1 knowOthers
	/**
	 * Status level 2
	 */
	ImportanceLevelCl1 family
	/**
	 * Status level 2
	 */
	ImportanceLevelCl1 doctor
	/**
	 * Status level 2
	 */
	ImportanceLevelCl1 staff
	/**
	 * Status level 2
	 */
	OpinionTypeCl5 opinSpouse
	/**
	 * Status level 2
	 */
	OpinionTypeCl5 opinFamily
	/**
	 * Status level 2
	 */
	OpinionTypeCl5 opinFriend
	/**
	 * Status level 2
	 */
	OpinionTypeCl5 opinDr
	/**
	 * Status level 2
	 */
	OpinionTypeCl2 experience
	/**
	 * Status level 2
	 */
	ImprovementRankCl1 improve
	/**
	 * Status level 2
	 */
	IntLengthRankCl1 intLength
	/**
	 * Status level 2
	 */
	StressLevelCl1 intStress
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 intRepeat
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
		pv2SaqId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false)
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false)
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
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
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_saq_2'
		psuId column:'psu_id'
		pv2SaqId column:'pv2_saq_id'
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
		timeStamp2 column:'time_stamp_2'
		transactionType column:'transaction_type'
	}
}
