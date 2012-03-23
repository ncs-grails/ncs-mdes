package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class InternetUsage {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String internetUsageId
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
	ContactTypeCl4 preferContact
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 everConnect
	/**
	 * Status level 2
	 */
	WebUseFrequencyCl1 useWeb
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 haveEmail
	/**
	 * Status level 2
	 */
	EmailUseFrequencyCl1 checkEmail
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 okEmailAddr
	/**
	 * PII level Y
	 * Status level 2
	 */
	String email
	/**
	 * Status level 2
	 */
	CompletionTypeCl1 preferSurvey
	/**
	 * Status level 2
	 */
	AgreementLevelCl4 dcModeSimple
	/**
	 * Status level 2
	 */
	AgreementLevelCl4 dcModeConvenient
	/**
	 * Status level 2
	 */
	AgreementLevelCl4 dcModeChoice
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
		internetUsageId(nullable: false, minSize:1, maxSize:36)
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
		preferContact(nullable: false)
		everConnect(nullable: false)
		useWeb(nullable: false)
		haveEmail(nullable: false)
		checkEmail(nullable: false)
		okEmailAddr(nullable: false)
		email(nullable: true, maxSize:100)
		preferSurvey(nullable: false)
		dcModeSimple(nullable: false)
		dcModeConvenient(nullable: false)
		dcModeChoice(nullable: false)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'internet_usage'
		psuId column:'psu_id'
		internetUsageId column:'internet_usage_id'
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
		preferContact column:'prefer_contact'
		everConnect column:'ever_connect'
		useWeb column:'use_web'
		haveEmail column:'have_email'
		checkEmail column:'check_email'
		okEmailAddr column:'ok_email_addr'
		email column:'email'
		preferSurvey column:'prefer_survey'
		dcModeSimple column:'dc_mode_simple'
		dcModeConvenient column:'dc_mode_convenient'
		dcModeChoice column:'dc_mode_choice'
		timeStamp2 column:'time_stamp_2'
		transactionType column:'transaction_type'
	}
}
