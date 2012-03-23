package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class HouseholdInventory {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String hhInventoryId
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
	String hhId
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
	ConfirmTypeCl19 outAnswer
	/**
	 * PII level P
	 * Status level 2
	 */
	String outAnswerOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 outSpeakAdult
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 hhAdult
	/**
	 * Status level 2
	 */
	String timeStamp1
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 hhIncentive
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 hhMember
	/**
	 * Status level 2
	 */
	String timeStamp2
	/**
	 * Status level 2
	 */
	String addressId
	/**
	 * PII level Y
	 * Status level 2
	 */
	String address1
	/**
	 * PII level Y
	 * Status level 2
	 */
	String address2
	/**
	 * PII level Y
	 * Status level 2
	 */
	String unit
	/**
	 * PII level Y
	 * Status level 2
	 */
	String city
	/**
	 * PII level Y
	 * Status level 2
	 */
	StateCl2 state
	/**
	 * PII level P
	 * Status level 2
	 */
	String zip
	/**
	 * PII level P
	 * Status level 2
	 */
	String zip4
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 private_
	/**
	 * Status level 2
	 */
	String timeStamp3
	/**
	 * Status level 2
	 */
	ResidenceTypeCl4 placeType
	/**
	 * PII level P
	 * Status level 2
	 */
	String placeTypeOth
	/**
	 * PII level P
	 * Status level 2
	 */
	String placeName
	/**
	 * Status level 2
	 */
	String timeStamp4
	/**
	 * Status level 2
	 */
	GenderCl6 rGender
	/**
	 * Status level 2
	 */
	Integer numAdult
	/**
	 * Status level 2
	 */
	Integer numMale
	/**
	 * Status level 2
	 */
	Integer numFemale
	/**
	 * Status level 2
	 */
	Integer hhAgeElig
	/**
	 * Status level 2
	 */
	String timeStamp5
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 pregnantHh
	/**
	 * Status level 2
	 */
	Integer numPreg
	/**
	 * Status level 2
	 */
	ConfirmTypeCl5 confirm1
	/**
	 * Status level 2
	 */
	ConfirmTypeCl5 confirm2
	/**
	 * Status level 2
	 */
	String timeStamp6
	/**
	 * PII level Y
	 * Status level 2
	 */
	String rFname
	/**
	 * PII level Y
	 * Status level 2
	 */
	String rLname
	/**
	 * PII level Y
	 * Status level 2
	 */
	String phoneNbr
	/**
	 * Status level 2
	 */
	PhoneTypeCl2 phoneType
	/**
	 * PII level P
	 * Status level 2
	 */
	String phoneTypeOth
	/**
	 * Status level 2
	 */
	String timeStamp7
	/**
	 * Status level 2
	 */
	String timeStamp8
	/**
	 * Status level 2
	 */
	ContactTypeCl2 contactType
	/**
	 * PII level P
	 * Status level 2
	 */
	String contactTypeOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 english
	/**
	 * Status level 2
	 */
	LanguageCl5 contactLang
	/**
	 * PII level P
	 * Status level 2
	 */
	String contactLangOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl6 interpret
	/**
	 * Status level 2
	 */
	TranslationMethodCl3 contactInterpret
	/**
	 * PII level P
	 * Status level 2
	 */
	String contactInterpretOth
	/**
	 * Status level 2
	 */
	String timeStamp9
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		hhInventoryId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false)
		duId(nullable: false, minSize:1, maxSize:36)
		hhId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: true, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false)
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		outAnswer(nullable: false)
		outAnswerOth(nullable: true, maxSize:255)
		outSpeakAdult(nullable: false)
		hhAdult(nullable: false)
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hhIncentive(nullable: false)
		hhMember(nullable: false)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		addressId(nullable: true, maxSize:36)
		address1(nullable: true, maxSize:100)
		address2(nullable: true, maxSize:100)
		unit(nullable: true, maxSize:10)
		city(nullable: true, maxSize:50)
		state(nullable: false)
		zip(nullable: true, maxSize:5)
		zip4(nullable: true, maxSize:4)
		private_(nullable: false)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		placeType(nullable: false)
		placeTypeOth(nullable: true, maxSize:255)
		placeName(nullable: true, maxSize:255)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rGender(nullable: false)
		numAdult(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numMale(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numFemale(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		hhAgeElig(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregnantHh(nullable: false)
		numPreg(nullable: false)
		confirm1(nullable: false)
		confirm2(nullable: false)
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rFname(nullable: true, maxSize:30)
		rLname(nullable: true, maxSize:30)
		phoneNbr(nullable: true, maxSize:10)
		phoneType(nullable: false)
		phoneTypeOth(nullable: true, maxSize:255)
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		contactType(nullable: false)
		contactTypeOth(nullable: true, maxSize:255)
		english(nullable: false)
		contactLang(nullable: false)
		contactLangOth(nullable: true, maxSize:255)
		interpret(nullable: false)
		contactInterpret(nullable: false)
		contactInterpretOth(nullable: true, maxSize:255)
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'household_inventory'
		psuId column:'psu_id'
		hhInventoryId column:'hh_inventory_id'
		recruitType column:'recruit_type'
		duId column:'du_id'
		hhId column:'hh_id'
		pId column:'p_id'
		eventId column:'event_id'
		eventType column:'event_type'
		eventRepeatKey column:'event_repeat_key'
		instrumentId column:'instrument_id'
		instrumentType column:'instrument_type'
		instrumentVersion column:'instrument_version'
		instrumentRepeatKey column:'instrument_repeat_key'
		outAnswer column:'out_answer'
		outAnswerOth column:'out_answer_oth'
		outSpeakAdult column:'out_speak_adult'
		hhAdult column:'hh_adult'
		timeStamp1 column:'time_stamp_1'
		hhIncentive column:'hh_incentive'
		hhMember column:'hh_member'
		timeStamp2 column:'time_stamp_2'
		addressId column:'address_id'
		address1 column:'address_1'
		address2 column:'address_2'
		unit column:'unit'
		city column:'city'
		state column:'state'
		zip column:'zip'
		zip4 column:'zip4'
		private_ column:'private'
		timeStamp3 column:'time_stamp_3'
		placeType column:'place_type'
		placeTypeOth column:'place_type_oth'
		placeName column:'place_name'
		timeStamp4 column:'time_stamp_4'
		rGender column:'r_gender'
		numAdult column:'num_adult'
		numMale column:'num_male'
		numFemale column:'num_female'
		hhAgeElig column:'hh_age_elig'
		timeStamp5 column:'time_stamp_5'
		pregnantHh column:'pregnant_hh'
		numPreg column:'num_preg'
		confirm1 column:'confirm_1'
		confirm2 column:'confirm_2'
		timeStamp6 column:'time_stamp_6'
		rFname column:'r_fname'
		rLname column:'r_lname'
		phoneNbr column:'phone_nbr'
		phoneType column:'phone_type'
		phoneTypeOth column:'phone_type_oth'
		timeStamp7 column:'time_stamp_7'
		timeStamp8 column:'time_stamp_8'
		contactType column:'contact_type'
		contactTypeOth column:'contact_type_oth'
		english column:'english'
		contactLang column:'contact_lang'
		contactLangOth column:'contact_lang_oth'
		interpret column:'interpret'
		contactInterpret column:'contact_interpret'
		contactInterpretOth column:'contact_interpret_oth'
		timeStamp9 column:'time_stamp_9'
		transactionType column:'transaction_type'
	}
}
