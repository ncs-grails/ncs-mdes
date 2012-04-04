package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class PregScreenHi2 {

	Integer psuId
	String psHiId
	Integer recruitType
	String duId
	String pId
	String eventId
	Integer eventType
	Integer eventRepeatKey
	String instrumentId
	Integer instrumentType
	String instrumentVersion
	Integer instrumentRepeatKey
	String timeStamp1
	String incoming
	String timeStamp2
	Integer rGender
	Integer maleR
	Integer female1
	String firstName
	String rPhone1
	String timeStamp3
	String rFname
	String rLname
	String personDob
	Integer age
	Integer ageRange
	Integer ageElig
	String timeStamp4
	String addressId
	String address1
	String address2
	String unit
	String city
	Integer state
	String zip
	String zip4
	Integer duEligConfirm
	String timeStamp5
	Integer knowNcs
	String elig
	String timeStamp6
	Integer pregnant
	String origDueDate
	String datePeriod
	Integer weeksPreg
	Integer monthPreg
	Integer trimester
	String timeStamp7
	Integer trying
	Integer hyster
	Integer ovaries
	Integer tubesTied
	Integer menopause
	Integer medUnable
	String medUnableOth
	String timeStamp8
	Integer maristat
	Integer educ
	Integer employ
	String employOth
	Integer ethnicity
	Integer personLang
	String personLangOth
	String timeStamp9
	Integer hhMembers
	Integer numChild
	Integer income4cat
	String timeStamp10
	String phoneNbr
	String phoneNbrOth
	Integer phoneType
	String phoneTypeOth
	String homePhone
	Integer cellPhone1
	Integer cellPhone2
	Integer cellPhone3
	Integer cellPhone4
	String cellPhone
	Integer sameAddr
	String mailAddressId
	String mailAddress1
	String mailAddress2
	String mailUnit
	String mailCity
	Integer mailState
	String mailZip
	String mailZip4
	Integer haveEmail
	String email
	Integer emailType
	Integer emailShare
	Integer planMove
	Integer whereMove
	Integer moveInfo
	String newAddressId
	String newAddress1
	String newAddress2
	String newUnit
	String newCity
	Integer newState
	String newZip
	String newZip4
	Integer whenMove
	String dateMove
	String timeStamp11
	Integer ppgFirst
	Integer bioFatherHome
	Integer partnerTrying
	Integer biofatherRaise
	Integer socfatherRaise
	Integer fatherAvail
	String timeStamp12
	Integer otherFemale
	String timeStamp13
	Integer english
	Integer contactLang
	String contactLangOth
	Integer interpret
	Integer contactInterpret
	String contactInterpretOth
	String timeStamp14
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "preg_screen_hi_2"

	public PregScreenHi2(XMLStreamReader reader, boolean strict) {
		if (reader.startElement) {
			if (reader.localName() == XSD_TABLE_NAME) {
				// We're in the table, load the first column
				if ( reader.hasNext() ) { reader.next() }

				while ( reader.hasNext() ) {
					if ( reader.endElement ) {
						if (reader.localName() == XSD_TABLE_NAME) {
							break
						}
					} else if ( reader.startElement ) {
						String elementName = reader.localName()
						String elementText = reader.text()
						if ( elementText ) {
							switch ( elementName ) {

								case 'psu_id':
									psuId = elementText.toInteger()
									break
								case 'ps_hi_id':
									psHiId = elementText
									break
								case 'recruit_type':
									recruitType = elementText.toInteger()
									break
								case 'du_id':
									duId = elementText
									break
								case 'p_id':
									pId = elementText
									break
								case 'event_id':
									eventId = elementText
									break
								case 'event_type':
									eventType = elementText.toInteger()
									break
								case 'event_repeat_key':
									eventRepeatKey = elementText.toInteger()
									break
								case 'instrument_id':
									instrumentId = elementText
									break
								case 'instrument_type':
									instrumentType = elementText.toInteger()
									break
								case 'instrument_version':
									instrumentVersion = elementText
									break
								case 'instrument_repeat_key':
									instrumentRepeatKey = elementText.toInteger()
									break
								case 'time_stamp_1':
									timeStamp1 = elementText
									break
								case 'incoming':
									incoming = elementText
									break
								case 'time_stamp_2':
									timeStamp2 = elementText
									break
								case 'r_gender':
									rGender = elementText.toInteger()
									break
								case 'male_r':
									maleR = elementText.toInteger()
									break
								case 'female_1':
									female1 = elementText.toInteger()
									break
								case 'first_name':
									firstName = elementText
									break
								case 'r_phone_1':
									rPhone1 = elementText
									break
								case 'time_stamp_3':
									timeStamp3 = elementText
									break
								case 'r_fname':
									rFname = elementText
									break
								case 'r_lname':
									rLname = elementText
									break
								case 'person_dob':
									personDob = elementText
									break
								case 'age':
									age = elementText.toInteger()
									break
								case 'age_range':
									ageRange = elementText.toInteger()
									break
								case 'age_elig':
									ageElig = elementText.toInteger()
									break
								case 'time_stamp_4':
									timeStamp4 = elementText
									break
								case 'address_id':
									addressId = elementText
									break
								case 'address_1':
									address1 = elementText
									break
								case 'address_2':
									address2 = elementText
									break
								case 'unit':
									unit = elementText
									break
								case 'city':
									city = elementText
									break
								case 'state':
									state = elementText.toInteger()
									break
								case 'zip':
									zip = elementText
									break
								case 'zip4':
									zip4 = elementText
									break
								case 'du_elig_confirm':
									duEligConfirm = elementText.toInteger()
									break
								case 'time_stamp_5':
									timeStamp5 = elementText
									break
								case 'know_ncs':
									knowNcs = elementText.toInteger()
									break
								case 'elig':
									elig = elementText
									break
								case 'time_stamp_6':
									timeStamp6 = elementText
									break
								case 'pregnant':
									pregnant = elementText.toInteger()
									break
								case 'orig_due_date':
									origDueDate = elementText
									break
								case 'date_period':
									datePeriod = elementText
									break
								case 'weeks_preg':
									weeksPreg = elementText.toInteger()
									break
								case 'month_preg':
									monthPreg = elementText.toInteger()
									break
								case 'trimester':
									trimester = elementText.toInteger()
									break
								case 'time_stamp_7':
									timeStamp7 = elementText
									break
								case 'trying':
									trying = elementText.toInteger()
									break
								case 'hyster':
									hyster = elementText.toInteger()
									break
								case 'ovaries':
									ovaries = elementText.toInteger()
									break
								case 'tubes_tied':
									tubesTied = elementText.toInteger()
									break
								case 'menopause':
									menopause = elementText.toInteger()
									break
								case 'med_unable':
									medUnable = elementText.toInteger()
									break
								case 'med_unable_oth':
									medUnableOth = elementText
									break
								case 'time_stamp_8':
									timeStamp8 = elementText
									break
								case 'maristat':
									maristat = elementText.toInteger()
									break
								case 'educ':
									educ = elementText.toInteger()
									break
								case 'employ':
									employ = elementText.toInteger()
									break
								case 'employ_oth':
									employOth = elementText
									break
								case 'ethnicity':
									ethnicity = elementText.toInteger()
									break
								case 'person_lang':
									personLang = elementText.toInteger()
									break
								case 'person_lang_oth':
									personLangOth = elementText
									break
								case 'time_stamp_9':
									timeStamp9 = elementText
									break
								case 'hh_members':
									hhMembers = elementText.toInteger()
									break
								case 'num_child':
									numChild = elementText.toInteger()
									break
								case 'income_4cat':
									income4cat = elementText.toInteger()
									break
								case 'time_stamp_10':
									timeStamp10 = elementText
									break
								case 'phone_nbr':
									phoneNbr = elementText
									break
								case 'phone_nbr_oth':
									phoneNbrOth = elementText
									break
								case 'phone_type':
									phoneType = elementText.toInteger()
									break
								case 'phone_type_oth':
									phoneTypeOth = elementText
									break
								case 'home_phone':
									homePhone = elementText
									break
								case 'cell_phone_1':
									cellPhone1 = elementText.toInteger()
									break
								case 'cell_phone_2':
									cellPhone2 = elementText.toInteger()
									break
								case 'cell_phone_3':
									cellPhone3 = elementText.toInteger()
									break
								case 'cell_phone_4':
									cellPhone4 = elementText.toInteger()
									break
								case 'cell_phone':
									cellPhone = elementText
									break
								case 'same_addr':
									sameAddr = elementText.toInteger()
									break
								case 'mail_address_id':
									mailAddressId = elementText
									break
								case 'mail_address1':
									mailAddress1 = elementText
									break
								case 'mail_address2':
									mailAddress2 = elementText
									break
								case 'mail_unit':
									mailUnit = elementText
									break
								case 'mail_city':
									mailCity = elementText
									break
								case 'mail_state':
									mailState = elementText.toInteger()
									break
								case 'mail_zip':
									mailZip = elementText
									break
								case 'mail_zip4':
									mailZip4 = elementText
									break
								case 'have_email':
									haveEmail = elementText.toInteger()
									break
								case 'email':
									email = elementText
									break
								case 'email_type':
									emailType = elementText.toInteger()
									break
								case 'email_share':
									emailShare = elementText.toInteger()
									break
								case 'plan_move':
									planMove = elementText.toInteger()
									break
								case 'where_move':
									whereMove = elementText.toInteger()
									break
								case 'move_info':
									moveInfo = elementText.toInteger()
									break
								case 'new_address_id':
									newAddressId = elementText
									break
								case 'new_address1':
									newAddress1 = elementText
									break
								case 'new_address2':
									newAddress2 = elementText
									break
								case 'new_unit':
									newUnit = elementText
									break
								case 'new_city':
									newCity = elementText
									break
								case 'new_state':
									newState = elementText.toInteger()
									break
								case 'new_zip':
									newZip = elementText
									break
								case 'new_zip4':
									newZip4 = elementText
									break
								case 'when_move':
									whenMove = elementText.toInteger()
									break
								case 'date_move':
									dateMove = elementText
									break
								case 'time_stamp_11':
									timeStamp11 = elementText
									break
								case 'ppg_first':
									ppgFirst = elementText.toInteger()
									break
								case 'bio_father_home':
									bioFatherHome = elementText.toInteger()
									break
								case 'partner_trying':
									partnerTrying = elementText.toInteger()
									break
								case 'biofather_raise':
									biofatherRaise = elementText.toInteger()
									break
								case 'socfather_raise':
									socfatherRaise = elementText.toInteger()
									break
								case 'father_avail':
									fatherAvail = elementText.toInteger()
									break
								case 'time_stamp_12':
									timeStamp12 = elementText
									break
								case 'other_female':
									otherFemale = elementText.toInteger()
									break
								case 'time_stamp_13':
									timeStamp13 = elementText
									break
								case 'english':
									english = elementText.toInteger()
									break
								case 'contact_lang':
									contactLang = elementText.toInteger()
									break
								case 'contact_lang_oth':
									contactLangOth = elementText
									break
								case 'interpret':
									interpret = elementText.toInteger()
									break
								case 'contact_interpret':
									contactInterpret = elementText.toInteger()
									break
								case 'contact_interpret_oth':
									contactInterpretOth = elementText
									break
								case 'time_stamp_14':
									timeStamp14 = elementText
									break
								case 'transaction_type':
									transactionType = elementText
									break
								default:
									if (strict) {
										throw new XMLStreamException(
											"malformed XML, unknown element: ${elementText}")
									} else {
										log.warn "Element: ${elementName} unknown, ignoring."
									}
									break
							}
						}
					}
					reader.next()
				}
			} else {
				throw new XMLStreamException("xml element did not start as ${XSD_TABLE_NAME}")
			}
		} else {
			throw new XMLStreamException("constructor must be passed the start element for the table in the XMLStreamReader")
		}
	}

	static constraints = {

		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		psHiId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		incoming(nullable: true, maxSize:10)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rGender(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		maleR(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		female1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		firstName(nullable: true, maxSize:30)
		rPhone1(nullable: true, maxSize:10)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rFname(nullable: true, maxSize:30)
		rLname(nullable: true, maxSize:30)
		personDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		age(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		ageRange(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4])
		ageElig(nullable: false, inList:[1, 2, 3, -6, -3, -4])
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		addressId(nullable: true, maxSize:36)
		address1(nullable: true, maxSize:100)
		address2(nullable: true, maxSize:100)
		unit(nullable: true, maxSize:10)
		city(nullable: true, maxSize:50)
		state(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		zip(nullable: true, maxSize:5)
		zip4(nullable: true, maxSize:4)
		duEligConfirm(nullable: false, inList:[1, 2, 3, -4])
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		knowNcs(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		elig(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregnant(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		origDueDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		datePeriod(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		weeksPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		monthPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		trimester(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		trying(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		hyster(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		ovaries(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		tubesTied(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		menopause(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		medUnable(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		medUnableOth(nullable: true, maxSize:255)
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		maristat(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -2, -3, -4])
		educ(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4])
		employ(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -5, -1, -2, -3, -4])
		employOth(nullable: true, maxSize:255)
		ethnicity(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		personLang(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, -5, -1, -2, -3, -4])
		personLangOth(nullable: true, maxSize:255)
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hhMembers(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numChild(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		income4cat(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		phoneNbr(nullable: true, maxSize:10)
		phoneNbrOth(nullable: true, maxSize:10)
		phoneType(nullable: false, inList:[1, 2, 3, 4, -5, -1, -2, -3, -4])
		phoneTypeOth(nullable: true, maxSize:255)
		homePhone(nullable: true, maxSize:10)
		cellPhone1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone4(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone(nullable: true, maxSize:10)
		sameAddr(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		mailAddressId(nullable: true, maxSize:36)
		mailAddress1(nullable: true, maxSize:100)
		mailAddress2(nullable: true, maxSize:100)
		mailUnit(nullable: true, maxSize:10)
		mailCity(nullable: true, maxSize:50)
		mailState(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		mailZip(nullable: true, maxSize:5)
		mailZip4(nullable: true, maxSize:4)
		haveEmail(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		email(nullable: true, maxSize:100)
		emailType(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		emailShare(nullable: false, inList:[1, 2, -3, -4])
		planMove(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		whereMove(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		moveInfo(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		newAddressId(nullable: true, maxSize:36)
		newAddress1(nullable: true, maxSize:100)
		newAddress2(nullable: true, maxSize:100)
		newUnit(nullable: true, maxSize:10)
		newCity(nullable: true, maxSize:50)
		newState(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		newZip(nullable: true, maxSize:5)
		newZip4(nullable: true, maxSize:4)
		whenMove(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		dateMove(nullable: true, maxSize:7, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9])?")
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		ppgFirst(nullable: false, inList:[1, 2, 3, 4, 5, 6, -4])
		bioFatherHome(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		partnerTrying(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		biofatherRaise(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		socfatherRaise(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fatherAvail(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		otherFemale(nullable: false, inList:[1, 2, -1, -2, -4])
		timeStamp13(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		english(nullable: false, inList:[1, 2, -4])
		contactLang(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, -5, -3, -4])
		contactLangOth(nullable: true, maxSize:255)
		interpret(nullable: false, inList:[1, 2, -3, -4])
		contactInterpret(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -3, -4])
		contactInterpretOth(nullable: true, maxSize:255)
		timeStamp14(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_hi_2'

		psuId column:'psu_id'
		psHiId column:'ps_hi_id'
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
		incoming column:'incoming'
		timeStamp2 column:'time_stamp_2'
		rGender column:'r_gender'
		maleR column:'male_r'
		female1 column:'female_1'
		firstName column:'first_name'
		rPhone1 column:'r_phone_1'
		timeStamp3 column:'time_stamp_3'
		rFname column:'r_fname'
		rLname column:'r_lname'
		personDob column:'person_dob'
		age column:'age'
		ageRange column:'age_range'
		ageElig column:'age_elig'
		timeStamp4 column:'time_stamp_4'
		addressId column:'address_id'
		address1 column:'address_1'
		address2 column:'address_2'
		unit column:'unit'
		city column:'city'
		state column:'state'
		zip column:'zip'
		zip4 column:'zip4'
		duEligConfirm column:'du_elig_confirm'
		timeStamp5 column:'time_stamp_5'
		knowNcs column:'know_ncs'
		elig column:'elig'
		timeStamp6 column:'time_stamp_6'
		pregnant column:'pregnant'
		origDueDate column:'orig_due_date'
		datePeriod column:'date_period'
		weeksPreg column:'weeks_preg'
		monthPreg column:'month_preg'
		trimester column:'trimester'
		timeStamp7 column:'time_stamp_7'
		trying column:'trying'
		hyster column:'hyster'
		ovaries column:'ovaries'
		tubesTied column:'tubes_tied'
		menopause column:'menopause'
		medUnable column:'med_unable'
		medUnableOth column:'med_unable_oth'
		timeStamp8 column:'time_stamp_8'
		maristat column:'maristat'
		educ column:'educ'
		employ column:'employ'
		employOth column:'employ_oth'
		ethnicity column:'ethnicity'
		personLang column:'person_lang'
		personLangOth column:'person_lang_oth'
		timeStamp9 column:'time_stamp_9'
		hhMembers column:'hh_members'
		numChild column:'num_child'
		income4cat column:'income_4cat'
		timeStamp10 column:'time_stamp_10'
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
		mailAddress1 column:'mail_address1'
		mailAddress2 column:'mail_address2'
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
		newAddress1 column:'new_address1'
		newAddress2 column:'new_address2'
		newUnit column:'new_unit'
		newCity column:'new_city'
		newState column:'new_state'
		newZip column:'new_zip'
		newZip4 column:'new_zip4'
		whenMove column:'when_move'
		dateMove column:'date_move'
		timeStamp11 column:'time_stamp_11'
		ppgFirst column:'ppg_first'
		bioFatherHome column:'bio_father_home'
		partnerTrying column:'partner_trying'
		biofatherRaise column:'biofather_raise'
		socfatherRaise column:'socfather_raise'
		fatherAvail column:'father_avail'
		timeStamp12 column:'time_stamp_12'
		otherFemale column:'other_female'
		timeStamp13 column:'time_stamp_13'
		english column:'english'
		contactLang column:'contact_lang'
		contactLangOth column:'contact_lang_oth'
		interpret column:'interpret'
		contactInterpret column:'contact_interpret'
		contactInterpretOth column:'contact_interpret_oth'
		timeStamp14 column:'time_stamp_14'
		transactionType column:'transaction_type'
	}
}
