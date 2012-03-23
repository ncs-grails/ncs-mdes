package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Person {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String personId
	/**
	 * Status level 3
	 */
	NamePrefixCl1 prefix
	/**
	 * PII level Y
	 * Status level 3
	 */
	String firstName
	/**
	 * PII level Y
	 * Status level 3
	 */
	String lastName
	/**
	 * PII level Y
	 * Status level 3
	 */
	String middleName
	/**
	 * PII level Y
	 * Status level 3
	 */
	String maidenName
	/**
	 * Status level 3
	 */
	NameSuffixCl1 suffix
	/**
	 * Status level 1
	 */
	String title
	/**
	 * Status level 3
	 */
	GenderCl1 sex
	/**
	 * Status level 1
	 */
	Integer age
	/**
	 * Status level 3
	 */
	AgeRangeCl1 ageRange
	/**
	 * PII level P
	 * Status level 1
	 */
	String personDob
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 deceased
	/**
	 * Status level 3
	 */
	EthnicityCl1 ethnicGroup
	/**
	 * Status level 3
	 */
	LanguageCl2 personLang
	/**
	 * PII level P
	 * Status level 1
	 */
	String personLangOth
	/**
	 * Status level 3
	 */
	MaritalStatusCl1 maristat
	/**
	 * PII level P
	 * Status level 1
	 */
	String maristatOth
	/**
	 * Status level 3
	 */
	ContactTypeCl1 prefContact
	/**
	 * PII level P
	 * Status level 1
	 */
	String prefContactOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl1 planMove
	/**
	 * Status level 3
	 */
	MovingPlanCl1 moveInfo
	/**
	 * Status level 1
	 */
	String newAddressId
	/**
	 * Status level 3
	 */
	ConfirmTypeCl4 whenMove
	/**
	 * Status level 1
	 */
	String dateMove
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 pTracing
	/**
	 * Status level 3
	 */
	InformationSourceCl4 pInfoSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String pInfoSourceOth
	/**
	 * Status level 1
	 */
	String pInfoDate
	/**
	 * Status level 1
	 */
	String pInfoUpdate
	/**
	 * PII level P
	 * Status level 1
	 */
	String personComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		personId(nullable: false, minSize:1, maxSize:36)
		prefix(nullable: false)
		firstName(nullable: true, maxSize:30)
		lastName(nullable: true, maxSize:30)
		middleName(nullable: true, maxSize:30)
		maidenName(nullable: true, maxSize:30)
		suffix(nullable: false)
		title(nullable: true, maxSize:5)
		sex(nullable: false)
		age(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		ageRange(nullable: false)
		personDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		deceased(nullable: false)
		ethnicGroup(nullable: false)
		personLang(nullable: false)
		personLangOth(nullable: true, maxSize:255)
		maristat(nullable: false)
		maristatOth(nullable: true, maxSize:255)
		prefContact(nullable: false)
		prefContactOth(nullable: true, maxSize:255)
		planMove(nullable: false)
		moveInfo(nullable: false)
		newAddressId(nullable: true, maxSize:36)
		whenMove(nullable: false)
		dateMove(nullable: true, maxSize:7, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9])?")
		pTracing(nullable: false)
		pInfoSource(nullable: false)
		pInfoSourceOth(nullable: true, maxSize:255)
		pInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		pInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		personComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'person'
		psuId column:'psu_id'
		personId column:'person_id'
		prefix column:'prefix'
		firstName column:'first_name'
		lastName column:'last_name'
		middleName column:'middle_name'
		maidenName column:'maiden_name'
		suffix column:'suffix'
		title column:'title'
		sex column:'sex'
		age column:'age'
		ageRange column:'age_range'
		personDob column:'person_dob'
		deceased column:'deceased'
		ethnicGroup column:'ethnic_group'
		personLang column:'person_lang'
		personLangOth column:'person_lang_oth'
		maristat column:'maristat'
		maristatOth column:'maristat_oth'
		prefContact column:'pref_contact'
		prefContactOth column:'pref_contact_oth'
		planMove column:'plan_move'
		moveInfo column:'move_info'
		newAddressId column:'new_address_id'
		whenMove column:'when_move'
		dateMove column:'date_move'
		pTracing column:'p_tracing'
		pInfoSource column:'p_info_source'
		pInfoSourceOth column:'p_info_source_oth'
		pInfoDate column:'p_info_date'
		pInfoUpdate column:'p_info_update'
		personComment column:'person_comment'
		transactionType column:'transaction_type'
	}
}
