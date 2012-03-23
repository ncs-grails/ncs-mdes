package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenEh {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String psEhId
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
	 * Status level 1
	 */
	String timeStamp2
	/**
	 * PII level P
	 * Status level 1
	 */
	String personDob
	/**
	 * Status level 1
	 */
	Integer age
	/**
	 * Status level 3
	 */
	AgeRangeCl2 ageRange
	/**
	 * Status level 3
	 */
	AgeEligibleCl1 ageElig
	/**
	 * Status level 1
	 */
	String timeStamp3
	/**
	 * Status level 1
	 */
	String addressId
	/**
	 * PII level Y
	 * Status level 3
	 */
	String address1
	/**
	 * PII level Y
	 * Status level 3
	 */
	String address2
	/**
	 * PII level Y
	 * Status level 3
	 */
	String unit
	/**
	 * PII level Y
	 * Status level 3
	 */
	String city
	/**
	 * PII level Y
	 * Status level 3
	 */
	StateCl2 state
	/**
	 * PII level P
	 * Status level 1
	 */
	String zip
	/**
	 * PII level P
	 * Status level 1
	 */
	String zip4
	/**
	 * Status level 3
	 */
	DuConfirmCl1 duEligConfirm
	/**
	 * Status level 3
	 */
	HomeOwnershipCl1 ownHome
	/**
	 * PII level P
	 * Status level 1
	 */
	String ownHomeOth
	/**
	 * Status level 1
	 */
	String timeStamp4
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 knowNcs
	/**
	 * PII level P
	 * Status level 1
	 */
	String howKnowNcsOth
	/**
	 * Status level 1
	 */
	String elig
	/**
	 * Status level 1
	 */
	String timeStamp5
	/**
	 * Status level 3
	 */
	PregnancyStatusCl1 pregnant
	/**
	 * Status level 1
	 */
	String origDueDate
	/**
	 * Status level 1
	 */
	String datePeriod
	/**
	 * Status level 1
	 */
	Integer weeksPreg
	/**
	 * Status level 1
	 */
	Integer monthPreg
	/**
	 * Status level 3
	 */
	TrimesterCl1 trimester
	/**
	 * Status level 1
	 */
	String timeStamp6
	/**
	 * Status level 3
	 */
	PregnancyTryingStatusCl2 trying
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 hyster
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 ovaries
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 tubesTied
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 menopause
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 medUnable
	/**
	 * PII level P
	 * Status level 1
	 */
	String medUnableOth
	/**
	 * Status level 1
	 */
	String timeStamp7
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
	EmploymentStatusCl1 employ
	/**
	 * PII level P
	 * Status level 1
	 */
	String employOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 ethnicity
	/**
	 * PII level P
	 * Status level 1
	 */
	String raceOth
	/**
	 * Status level 3
	 */
	LanguageCl4 personLang
	/**
	 * PII level P
	 * Status level 1
	 */
	String personLangOth
	/**
	 * Status level 1
	 */
	String timeStamp8
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
	IncomeRangeCl1 income
	/**
	 * Status level 1
	 */
	String timeStamp9
	/**
	 * PII level Y
	 * Status level 3
	 */
	String rFname
	/**
	 * PII level Y
	 * Status level 3
	 */
	String rLname
	/**
	 * PII level Y
	 * Status level 3
	 */
	String phoneNbr
	/**
	 * PII level Y
	 * Status level 3
	 */
	String phoneNbrOth
	/**
	 * Status level 3
	 */
	PhoneTypeCl2 phoneType
	/**
	 * PII level P
	 * Status level 1
	 */
	String phoneTypeOth
	/**
	 * PII level Y
	 * Status level 3
	 */
	String homePhone
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 cellPhone1
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 cellPhone2
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 cellPhone3
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 cellPhone4
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cellPhone
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 sameAddr
	/**
	 * Status level 1
	 */
	String mailAddressId
	/**
	 * PII level Y
	 * Status level 3
	 */
	String mailAddress1
	/**
	 * PII level Y
	 * Status level 3
	 */
	String mailAddress2
	/**
	 * PII level Y
	 * Status level 3
	 */
	String mailUnit
	/**
	 * PII level Y
	 * Status level 3
	 */
	String mailCity
	/**
	 * PII level Y
	 * Status level 3
	 */
	StateCl2 mailState
	/**
	 * PII level P
	 * Status level 1
	 */
	String mailZip
	/**
	 * PII level P
	 * Status level 1
	 */
	String mailZip4
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 haveEmail
	/**
	 * PII level Y
	 * Status level 3
	 */
	String email
	/**
	 * Status level 3
	 */
	EmailTypeCl2 emailType
	/**
	 * Status level 3
	 */
	ConfirmTypeCl6 emailShare
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 planMove
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 whereMove
	/**
	 * Status level 3
	 */
	MovingPlanCl2 moveInfo
	/**
	 * Status level 1
	 */
	String newAddressId
	/**
	 * PII level Y
	 * Status level 3
	 */
	String newAddress1
	/**
	 * PII level Y
	 * Status level 3
	 */
	String newAddress2
	/**
	 * PII level Y
	 * Status level 3
	 */
	String newUnit
	/**
	 * PII level Y
	 * Status level 3
	 */
	String newCity
	/**
	 * PII level Y
	 * Status level 3
	 */
	StateCl2 newState
	/**
	 * PII level P
	 * Status level 1
	 */
	String newZip
	/**
	 * PII level P
	 * Status level 1
	 */
	String newZip4
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 whenMove
	/**
	 * Status level 1
	 */
	String dateMove
	/**
	 * Status level 1
	 */
	String timeStamp10
	/**
	 * Status level 3
	 */
	PpgStatusCl2 ppgFirst
	/**
	 * Status level 1
	 */
	String timeStamp11
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 english
	/**
	 * Status level 3
	 */
	LanguageCl5 contactLang
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactLangOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 interpret
	/**
	 * Status level 3
	 */
	TranslationMethodCl3 contactInterpret
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactInterpretOth
	/**
	 * Status level 1
	 */
	String timeStamp12
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		psEhId(nullable: false, minSize:1, maxSize:36)
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
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		personDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		age(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		ageRange(nullable: false)
		ageElig(nullable: false)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		addressId(nullable: true, maxSize:36)
		address1(nullable: true, maxSize:100)
		address2(nullable: true, maxSize:100)
		unit(nullable: true, maxSize:10)
		city(nullable: true, maxSize:50)
		state(nullable: false)
		zip(nullable: true, maxSize:5)
		zip4(nullable: true, maxSize:4)
		duEligConfirm(nullable: false)
		ownHome(nullable: false)
		ownHomeOth(nullable: true, maxSize:255)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		knowNcs(nullable: false)
		howKnowNcsOth(nullable: true, maxSize:255)
		elig(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregnant(nullable: false)
		origDueDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		datePeriod(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		weeksPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		monthPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		trimester(nullable: false)
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		trying(nullable: false)
		hyster(nullable: false)
		ovaries(nullable: false)
		tubesTied(nullable: false)
		menopause(nullable: false)
		medUnable(nullable: false)
		medUnableOth(nullable: true, maxSize:255)
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		maristat(nullable: false)
		educ(nullable: false)
		employ(nullable: false)
		employOth(nullable: true, maxSize:255)
		ethnicity(nullable: false)
		raceOth(nullable: true, maxSize:255)
		personLang(nullable: false)
		personLangOth(nullable: true, maxSize:255)
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hhMembers(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numChild(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		income(nullable: false)
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rFname(nullable: true, maxSize:30)
		rLname(nullable: true, maxSize:30)
		phoneNbr(nullable: true, maxSize:10)
		phoneNbrOth(nullable: true, maxSize:10)
		phoneType(nullable: false)
		phoneTypeOth(nullable: true, maxSize:255)
		homePhone(nullable: true, maxSize:10)
		cellPhone1(nullable: false)
		cellPhone2(nullable: false)
		cellPhone3(nullable: false)
		cellPhone4(nullable: false)
		cellPhone(nullable: true, maxSize:10)
		sameAddr(nullable: false)
		mailAddressId(nullable: true, maxSize:36)
		mailAddress1(nullable: true, maxSize:100)
		mailAddress2(nullable: true, maxSize:100)
		mailUnit(nullable: true, maxSize:10)
		mailCity(nullable: true, maxSize:50)
		mailState(nullable: false)
		mailZip(nullable: true, maxSize:5)
		mailZip4(nullable: true, maxSize:4)
		haveEmail(nullable: false)
		email(nullable: true, maxSize:100)
		emailType(nullable: false)
		emailShare(nullable: false)
		planMove(nullable: false)
		whereMove(nullable: false)
		moveInfo(nullable: false)
		newAddressId(nullable: true, maxSize:36)
		newAddress1(nullable: true, maxSize:100)
		newAddress2(nullable: true, maxSize:100)
		newUnit(nullable: true, maxSize:10)
		newCity(nullable: true, maxSize:50)
		newState(nullable: false)
		newZip(nullable: true, maxSize:5)
		newZip4(nullable: true, maxSize:4)
		whenMove(nullable: false)
		dateMove(nullable: true, maxSize:7, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9])?")
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		ppgFirst(nullable: false)
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		english(nullable: false)
		contactLang(nullable: false)
		contactLangOth(nullable: true, maxSize:255)
		interpret(nullable: false)
		contactInterpret(nullable: false)
		contactInterpretOth(nullable: true, maxSize:255)
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_eh'
		psuId column:'psu_id'
		psEhId column:'ps_eh_id'
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
		timeStamp2 column:'time_stamp_2'
		personDob column:'person_dob'
		age column:'age'
		ageRange column:'age_range'
		ageElig column:'age_elig'
		timeStamp3 column:'time_stamp_3'
		addressId column:'address_id'
		address1 column:'address_1'
		address2 column:'address_2'
		unit column:'unit'
		city column:'city'
		state column:'state'
		zip column:'zip'
		zip4 column:'zip4'
		duEligConfirm column:'du_elig_confirm'
		ownHome column:'own_home'
		ownHomeOth column:'own_home_oth'
		timeStamp4 column:'time_stamp_4'
		knowNcs column:'know_ncs'
		howKnowNcsOth column:'how_know_ncs_oth'
		elig column:'elig'
		timeStamp5 column:'time_stamp_5'
		pregnant column:'pregnant'
		origDueDate column:'orig_due_date'
		datePeriod column:'date_period'
		weeksPreg column:'weeks_preg'
		monthPreg column:'month_preg'
		trimester column:'trimester'
		timeStamp6 column:'time_stamp_6'
		trying column:'trying'
		hyster column:'hyster'
		ovaries column:'ovaries'
		tubesTied column:'tubes_tied'
		menopause column:'menopause'
		medUnable column:'med_unable'
		medUnableOth column:'med_unable_oth'
		timeStamp7 column:'time_stamp_7'
		maristat column:'maristat'
		educ column:'educ'
		employ column:'employ'
		employOth column:'employ_oth'
		ethnicity column:'ethnicity'
		raceOth column:'race_oth'
		personLang column:'person_lang'
		personLangOth column:'person_lang_oth'
		timeStamp8 column:'time_stamp_8'
		hhMembers column:'hh_members'
		numChild column:'num_child'
		income column:'income'
		timeStamp9 column:'time_stamp_9'
		rFname column:'r_fname'
		rLname column:'r_lname'
		phoneNbr column:'phone_nbr'
		phoneNbrOth column:'phone_nbr_oth'
		phoneType column:'phone_type'
		phoneTypeOth column:'phone_type_oth'
		homePhone column:'home_phone'
		cellPhone1 column:'cell_phone_1'
		cellPhone2 column:'cell_phone_2'
		cellPhone3 column:'cell_phone_3'
		cellPhone4 column:'cell_phone_4'
		cellPhone column:'cell_phone'
		sameAddr column:'same_addr'
		mailAddressId column:'mail_address_id'
		mailAddress1 column:'mail_address_1'
		mailAddress2 column:'mail_address_2'
		mailUnit column:'mail_unit'
		mailCity column:'mail_city'
		mailState column:'mail_state'
		mailZip column:'mail_zip'
		mailZip4 column:'mail_zip4'
		haveEmail column:'have_email'
		email column:'email'
		emailType column:'email_type'
		emailShare column:'email_share'
		planMove column:'plan_move'
		whereMove column:'where_move'
		moveInfo column:'move_info'
		newAddressId column:'new_address_id'
		newAddress1 column:'new_address_1'
		newAddress2 column:'new_address_2'
		newUnit column:'new_unit'
		newCity column:'new_city'
		newState column:'new_state'
		newZip column:'new_zip'
		newZip4 column:'new_zip4'
		whenMove column:'when_move'
		dateMove column:'date_move'
		timeStamp10 column:'time_stamp_10'
		ppgFirst column:'ppg_first'
		timeStamp11 column:'time_stamp_11'
		english column:'english'
		contactLang column:'contact_lang'
		contactLangOth column:'contact_lang_oth'
		interpret column:'interpret'
		contactInterpret column:'contact_interpret'
		contactInterpretOth column:'contact_interpret_oth'
		timeStamp12 column:'time_stamp_12'
		transactionType column:'transaction_type'
	}
}
