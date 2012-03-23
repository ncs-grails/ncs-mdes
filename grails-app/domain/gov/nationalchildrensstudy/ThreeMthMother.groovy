package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ThreeMthMother {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String threeMthId
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
	ConfirmTypeCl2 multChild
	/**
	 * Status level 1
	 */
	Integer childNum
	/**
	 * Status level 3
	 */
	MaritalStatusCl2 maristat
	/**
	 * Status level 3
	 */
	EducationLevelCl1 educ
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 ethnicity
	/**
	 * Status level 1
	 */
	Integer hhMembers
	/**
	 * Status level 1
	 */
	Integer numChild
	/**
	 * Status level 3
	 */
	IncomeRangeCl4 income4cat
	/**
	 * Status level 1
	 */
	String timeStamp3
	/**
	 * Status level 3
	 */
	LanguageCl4 hhPrimaryLang
	/**
	 * PII level P
	 * Status level 1
	 */
	String personLangOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		threeMthId(nullable: false, minSize:1, maxSize:36)
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
		multChild(nullable: false)
		childNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		maristat(nullable: false)
		educ(nullable: false)
		ethnicity(nullable: false)
		hhMembers(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numChild(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		income4cat(nullable: false)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hhPrimaryLang(nullable: false)
		personLangOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'three_mth_mother'
		psuId column:'psu_id'
		threeMthId column:'three_mth_id'
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
		multChild column:'mult_child'
		childNum column:'child_num'
		maristat column:'maristat'
		educ column:'educ'
		ethnicity column:'ethnicity'
		hhMembers column:'hh_members'
		numChild column:'num_child'
		income4cat column:'income_4cat'
		timeStamp3 column:'time_stamp_3'
		hhPrimaryLang column:'hh_primary_lang'
		personLangOth column:'person_lang_oth'
		transactionType column:'transaction_type'
	}
}
