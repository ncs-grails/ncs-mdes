package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PrePregSaq {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String ppSaqId
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
	 * Status level 3
	 */
	String timeStamp13
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 learn
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 help
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 incent
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 research
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 envir
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 community
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 knowOthers
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 family
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 doctor
	/**
	 * Status level 3
	 */
	ImportanceLevelCl1 staff
	/**
	 * Status level 3
	 */
	OpinionTypeCl3 opinSpouse
	/**
	 * Status level 3
	 */
	OpinionTypeCl1 opinFamily
	/**
	 * Status level 3
	 */
	OpinionTypeCl1 opinFriend
	/**
	 * Status level 3
	 */
	OpinionTypeCl1 opinDr
	/**
	 * Status level 3
	 */
	OpinionTypeCl2 experience
	/**
	 * Status level 3
	 */
	ImprovementRankCl1 improve
	/**
	 * Status level 3
	 */
	IntLengthRankCl1 intLength
	/**
	 * Status level 3
	 */
	StressLevelCl1 intStress
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 intRepeat
	/**
	 * Status level 3
	 */
	String timeStamp14
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ppSaqId(nullable: false, minSize:1, maxSize:36)
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
		timeStamp13(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
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
		timeStamp14(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pre_preg_saq'
		psuId column:'psu_id'
		ppSaqId column:'pp_saq_id'
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
		timeStamp13 column:'time_stamp_13'
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
		timeStamp14 column:'time_stamp_14'
		transactionType column:'transaction_type'
	}
}
