package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class HouseholdEnumeration {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String hhenumId
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
	String hhId
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
	ConfirmTypeCl8 hhMember
	/**
	 * Status level 1
	 */
	String timeStamp2
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
	ConfirmTypeCl7 private_
	/**
	 * Status level 1
	 */
	String timeStamp3
	/**
	 * Status level 3
	 */
	ResidenceTypeCl4 placeType
	/**
	 * PII level P
	 * Status level 1
	 */
	String placeTypeOth
	/**
	 * PII level P
	 * Status level 3
	 */
	String placeName
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 admin
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 rooms
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 resideAge
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 residePreg
	/**
	 * Status level 1
	 */
	String timeStamp4
	/**
	 * Status level 3
	 */
	GenderCl3 rGender
	/**
	 * Status level 1
	 */
	Integer numAdult
	/**
	 * Status level 1
	 */
	Integer numMale
	/**
	 * Status level 1
	 */
	Integer numFemale
	/**
	 * Status level 1
	 */
	Integer hhAgeElig
	/**
	 * Status level 1
	 */
	Integer numAgeElig
	/**
	 * Status level 1
	 */
	String timeStamp5
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 pregnantHh
	/**
	 * Status level 3
	 */
	Integer numPreg
	/**
	 * Status level 1
	 */
	String timeStamp6
	/**
	 * Status level 1
	 */
	String timeStamp7
	/**
	 * Status level 3
	 */
	ConfirmTypeCl5 confirm1
	/**
	 * Status level 3
	 */
	ConfirmTypeCl5 confirm2
	/**
	 * Status level 1
	 */
	String timeStamp8
	/**
	 * Status level 3
	 */
	ResidenceTypeCl3 residenceType
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 apt1
	/**
	 * Status level 3
	 */
	HiddenDuCl1 apt2
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 enumStatus
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
	String phoneAlt
	/**
	 * Status level 3
	 */
	PhoneTypeCl2 phoneAltType
	/**
	 * PII level P
	 * Status level 1
	 */
	String phoneAltTypeOth
	/**
	 * Status level 1
	 */
	String timeStamp10
	/**
	 * Status level 3
	 */
	HouseholdEligibilityCl1 hhElig
	/**
	 * Status level 1
	 */
	String timeStamp11
	/**
	 * Status level 3
	 */
	ContactTypeCl2 contactType
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactTypeOth
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
	ConfirmTypeCl6 interpret
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
		hhenumId(nullable: false, minSize:1, maxSize:36)
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
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
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
		duEligConfirm(nullable: false)
		private_(nullable: false)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		placeType(nullable: false)
		placeTypeOth(nullable: true, maxSize:255)
		placeName(nullable: true, maxSize:255)
		admin(nullable: false)
		rooms(nullable: false)
		resideAge(nullable: false)
		residePreg(nullable: false)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rGender(nullable: false)
		numAdult(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numMale(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numFemale(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		hhAgeElig(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numAgeElig(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregnantHh(nullable: false)
		numPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		confirm1(nullable: false)
		confirm2(nullable: false)
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		residenceType(nullable: false)
		apt1(nullable: false)
		apt2(nullable: false)
		enumStatus(nullable: false)
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rFname(nullable: true, maxSize:30)
		rLname(nullable: true, maxSize:30)
		phoneNbr(nullable: true, maxSize:10)
		phoneType(nullable: false)
		phoneTypeOth(nullable: true, maxSize:255)
		phoneAlt(nullable: true, maxSize:10)
		phoneAltType(nullable: false)
		phoneAltTypeOth(nullable: true, maxSize:255)
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hhElig(nullable: false)
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		contactType(nullable: false)
		contactTypeOth(nullable: true, maxSize:255)
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
		table 'household_enumeration'
		psuId column:'psu_id'
		hhenumId column:'hhenum_id'
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
		timeStamp1 column:'time_stamp_1'
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
		duEligConfirm column:'du_elig_confirm'
		private_ column:'private'
		timeStamp3 column:'time_stamp_3'
		placeType column:'place_type'
		placeTypeOth column:'place_type_oth'
		placeName column:'place_name'
		admin column:'admin'
		rooms column:'rooms'
		resideAge column:'reside_age'
		residePreg column:'reside_preg'
		timeStamp4 column:'time_stamp_4'
		rGender column:'r_gender'
		numAdult column:'num_adult'
		numMale column:'num_male'
		numFemale column:'num_female'
		hhAgeElig column:'hh_age_elig'
		numAgeElig column:'num_age_elig'
		timeStamp5 column:'time_stamp_5'
		pregnantHh column:'pregnant_hh'
		numPreg column:'num_preg'
		timeStamp6 column:'time_stamp_6'
		timeStamp7 column:'time_stamp_7'
		confirm1 column:'confirm_1'
		confirm2 column:'confirm_2'
		timeStamp8 column:'time_stamp_8'
		residenceType column:'residence_type'
		apt1 column:'apt_1'
		apt2 column:'apt_2'
		enumStatus column:'enum_status'
		timeStamp9 column:'time_stamp_9'
		rFname column:'r_fname'
		rLname column:'r_lname'
		phoneNbr column:'phone_nbr'
		phoneType column:'phone_type'
		phoneTypeOth column:'phone_type_oth'
		phoneAlt column:'phone_alt'
		phoneAltType column:'phone_alt_type'
		phoneAltTypeOth column:'phone_alt_type_oth'
		timeStamp10 column:'time_stamp_10'
		hhElig column:'hh_elig'
		timeStamp11 column:'time_stamp_11'
		contactType column:'contact_type'
		contactTypeOth column:'contact_type_oth'
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
