package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class BirthVisitLi {

	Integer psuId
	String bvLiId
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
	Integer release
	Integer multiple
	Integer multipleNum
	String childDob
	Integer liveMom
	Integer liveOth
	String timeStamp2
	Integer recentMove
	Integer ownHome
	String ownHomeOth
	Integer ageHome
	Integer lengthReside
	Integer lengthResideUnit
	String timeStamp3
	Integer renovate
	Integer decorate
	Integer smoke
	Integer smokeLocate
	String timeStamp4
	Integer fedBaby
	Integer howFed
	Integer planFeed
	String timeStamp5
	Integer posHosp
	Integer posHome
	Integer sleepRoom
	Integer bed
	String bedOth
	String timeStamp6
	Integer hcareYet
	Integer hcare
	String hcareOth
	Integer vaccineYet
	Integer vaccine
	String timeStamp7
	Integer employ2
	Integer returnJobYet
	String returnJobDt
	Integer returnJob
	Integer returnJobUnit
	Integer childcare
	Integer ccareType
	String ccareTypeOth
	Integer ccareWho
	String relCareOth
	String ccareWhoOth
	String timeStamp8
	String rFname
	String rLname
	String phoneNbr
	Integer phoneType
	String friendPhoneOth
	String phoneTypeOth
	String homePhone
	Integer cellPhone1
	Integer cellPhone2
	Integer cellPhone3
	Integer cellPhone4
	String cellPhone
	String timeStamp9
	Integer moveInfo
	String newAddressId
	String newAddress1
	String newAddress2
	String newUnit
	String newCity
	Integer newState
	String newZip
	String newZip4
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
	Integer moveInfo2
	String newAddressBId
	String newAddress1B
	String newAddress2B
	String newUnitB
	String newCityB
	Integer newStateB
	String newZipB
	String newZip4B
	Integer whenMove
	String dateMove
	String timeStamp10
	String timeStamp11
	Integer participant
	Integer contactType
	Integer english
	Integer contactLang
	String contactLangOth
	Integer interpret
	Integer contactInterpret
	String contactInterpretOth
	String timeStamp12
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "birth_visit_li"

	public BirthVisitLi(XMLStreamReader reader, boolean strict) {
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
								case 'bv_li_id':
									bvLiId = elementText
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
								case 'release':
									release = elementText.toInteger()
									break
								case 'multiple':
									multiple = elementText.toInteger()
									break
								case 'multiple_num':
									multipleNum = elementText.toInteger()
									break
								case 'child_dob':
									childDob = elementText
									break
								case 'live_mom':
									liveMom = elementText.toInteger()
									break
								case 'live_oth':
									liveOth = elementText.toInteger()
									break
								case 'time_stamp_2':
									timeStamp2 = elementText
									break
								case 'recent_move':
									recentMove = elementText.toInteger()
									break
								case 'own_home':
									ownHome = elementText.toInteger()
									break
								case 'own_home_oth':
									ownHomeOth = elementText
									break
								case 'age_home':
									ageHome = elementText.toInteger()
									break
								case 'length_reside':
									lengthReside = elementText.toInteger()
									break
								case 'length_reside_unit':
									lengthResideUnit = elementText.toInteger()
									break
								case 'time_stamp_3':
									timeStamp3 = elementText
									break
								case 'renovate':
									renovate = elementText.toInteger()
									break
								case 'decorate':
									decorate = elementText.toInteger()
									break
								case 'smoke':
									smoke = elementText.toInteger()
									break
								case 'smoke_locate':
									smokeLocate = elementText.toInteger()
									break
								case 'time_stamp_4':
									timeStamp4 = elementText
									break
								case 'fed_baby':
									fedBaby = elementText.toInteger()
									break
								case 'how_fed':
									howFed = elementText.toInteger()
									break
								case 'plan_feed':
									planFeed = elementText.toInteger()
									break
								case 'time_stamp_5':
									timeStamp5 = elementText
									break
								case 'pos_hosp':
									posHosp = elementText.toInteger()
									break
								case 'pos_home':
									posHome = elementText.toInteger()
									break
								case 'sleep_room':
									sleepRoom = elementText.toInteger()
									break
								case 'bed':
									bed = elementText.toInteger()
									break
								case 'bed_oth':
									bedOth = elementText
									break
								case 'time_stamp_6':
									timeStamp6 = elementText
									break
								case 'hcare_yet':
									hcareYet = elementText.toInteger()
									break
								case 'hcare':
									hcare = elementText.toInteger()
									break
								case 'hcare_oth':
									hcareOth = elementText
									break
								case 'vaccine_yet':
									vaccineYet = elementText.toInteger()
									break
								case 'vaccine':
									vaccine = elementText.toInteger()
									break
								case 'time_stamp_7':
									timeStamp7 = elementText
									break
								case 'employ2':
									employ2 = elementText.toInteger()
									break
								case 'return_job_yet':
									returnJobYet = elementText.toInteger()
									break
								case 'return_job_dt':
									returnJobDt = elementText
									break
								case 'return_job':
									returnJob = elementText.toInteger()
									break
								case 'return_job_unit':
									returnJobUnit = elementText.toInteger()
									break
								case 'childcare':
									childcare = elementText.toInteger()
									break
								case 'ccare_type':
									ccareType = elementText.toInteger()
									break
								case 'ccare_type_oth':
									ccareTypeOth = elementText
									break
								case 'ccare_who':
									ccareWho = elementText.toInteger()
									break
								case 'rel_care_oth':
									relCareOth = elementText
									break
								case 'ccare_who_oth':
									ccareWhoOth = elementText
									break
								case 'time_stamp_8':
									timeStamp8 = elementText
									break
								case 'r_fname':
									rFname = elementText
									break
								case 'r_lname':
									rLname = elementText
									break
								case 'phone_nbr':
									phoneNbr = elementText
									break
								case 'phone_type':
									phoneType = elementText.toInteger()
									break
								case 'friend_phone_oth':
									friendPhoneOth = elementText
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
								case 'time_stamp_9':
									timeStamp9 = elementText
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
								case 'move_info_2':
									moveInfo2 = elementText.toInteger()
									break
								case 'new_address_b_id':
									newAddressBId = elementText
									break
								case 'new_address1_b':
									newAddress1B = elementText
									break
								case 'new_address2_b':
									newAddress2B = elementText
									break
								case 'new_unit_b':
									newUnitB = elementText
									break
								case 'new_city_b':
									newCityB = elementText
									break
								case 'new_state_b':
									newStateB = elementText.toInteger()
									break
								case 'new_zip_b':
									newZipB = elementText
									break
								case 'new_zip4_b':
									newZip4B = elementText
									break
								case 'when_move':
									whenMove = elementText.toInteger()
									break
								case 'date_move':
									dateMove = elementText
									break
								case 'time_stamp_10':
									timeStamp10 = elementText
									break
								case 'time_stamp_11':
									timeStamp11 = elementText
									break
								case 'participant':
									participant = elementText.toInteger()
									break
								case 'contact_type':
									contactType = elementText.toInteger()
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
								case 'time_stamp_12':
									timeStamp12 = elementText
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
		bvLiId(nullable: false, minSize:1, maxSize:36)
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
		release(nullable: false, inList:[1, 2, -4])
		multiple(nullable: false, inList:[1, 2, -1, -2, -4])
		multipleNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		childDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		liveMom(nullable: false, inList:[1, 2, -1, -2, -4])
		liveOth(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		recentMove(nullable: false, inList:[1, 2, -1, -2, -4])
		ownHome(nullable: false, inList:[1, 2, 3, -5, -1, -2, -3, -4])
		ownHomeOth(nullable: true, maxSize:255)
		ageHome(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		lengthReside(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		lengthResideUnit(nullable: false, inList:[1, 2, 3, -3, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		renovate(nullable: false, inList:[1, 2, -1, -2, -4])
		decorate(nullable: false, inList:[1, 2, -1, -2, -4])
		smoke(nullable: false, inList:[1, 2, -1, -2, -4])
		smokeLocate(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		fedBaby(nullable: false, inList:[1, 2, -1, -2, -4])
		howFed(nullable: false, inList:[1, 2, 3, 4, -1, -3, -2, -4])
		planFeed(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		posHosp(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		posHome(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		sleepRoom(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bed(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -2, -4])
		bedOth(nullable: true, maxSize:255)
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hcareYet(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		hcare(nullable: false, inList:[1, 2, 3, -5, -1, -2, -4])
		hcareOth(nullable: true, maxSize:255)
		vaccineYet(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		vaccine(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		employ2(nullable: false, inList:[1, 2, -1, -2, -4])
		returnJobYet(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		returnJobDt(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		returnJob(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		returnJobUnit(nullable: false, inList:[1, 2, 3, 4, -3, -4])
		childcare(nullable: false, inList:[1, 2, -1, -2, -4])
		ccareType(nullable: false, inList:[1, 2, 3, -5, -1, -2, -3, -4])
		ccareTypeOth(nullable: true, maxSize:255)
		ccareWho(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, -1, -2, -3, -4])
		relCareOth(nullable: true, maxSize:255)
		ccareWhoOth(nullable: true, maxSize:255)
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rFname(nullable: true, maxSize:30)
		rLname(nullable: true, maxSize:30)
		phoneNbr(nullable: true, maxSize:10)
		phoneType(nullable: false, inList:[1, 2, 3, 4, -5, -1, -2, -3, -4])
		friendPhoneOth(nullable: true, maxSize:255)
		phoneTypeOth(nullable: true, maxSize:255)
		homePhone(nullable: true, maxSize:10)
		cellPhone1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone4(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone(nullable: true, maxSize:10)
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		moveInfo(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		newAddressId(nullable: true, maxSize:36)
		newAddress1(nullable: true, maxSize:100)
		newAddress2(nullable: true, maxSize:100)
		newUnit(nullable: true, maxSize:10)
		newCity(nullable: true, maxSize:50)
		newState(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		newZip(nullable: true, maxSize:5)
		newZip4(nullable: true, maxSize:4)
		sameAddr(nullable: false, inList:[1, 2, -1, -2, -4])
		mailAddressId(nullable: true, maxSize:36)
		mailAddress1(nullable: true, maxSize:100)
		mailAddress2(nullable: true, maxSize:100)
		mailUnit(nullable: true, maxSize:10)
		mailCity(nullable: true, maxSize:50)
		mailState(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		mailZip(nullable: true, maxSize:5)
		mailZip4(nullable: true, maxSize:4)
		haveEmail(nullable: false, inList:[1, 2, -1, -2, -4])
		email(nullable: true, maxSize:100)
		emailType(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		emailShare(nullable: false, inList:[1, 2, -3, -4])
		planMove(nullable: false, inList:[1, 2, -1, -2, -4])
		whereMove(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		moveInfo2(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		newAddressBId(nullable: true, maxSize:36)
		newAddress1B(nullable: true, maxSize:100)
		newAddress2B(nullable: true, maxSize:100)
		newUnitB(nullable: true, maxSize:10)
		newCityB(nullable: true, maxSize:50)
		newStateB(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		newZipB(nullable: true, maxSize:5)
		newZip4B(nullable: true, maxSize:4)
		whenMove(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		dateMove(nullable: true, maxSize:7, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9])?")
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		participant(nullable: false, inList:[1, 2, -4])
		contactType(nullable: false, inList:[1, 2, 3, 4, -4])
		english(nullable: false, inList:[1, 2, -4])
		contactLang(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, -5, -3, -4])
		contactLangOth(nullable: true, maxSize:255)
		interpret(nullable: false, inList:[1, 2, -3, -4])
		contactInterpret(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -3, -4])
		contactInterpretOth(nullable: true, maxSize:255)
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'birth_visit_li'

		psuId column:'psu_id'
		bvLiId column:'bv_li_id'
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
		release column:'release_'
		multiple column:'multiple'
		multipleNum column:'multiple_num'
		childDob column:'child_dob'
		liveMom column:'live_mom'
		liveOth column:'live_oth'
		timeStamp2 column:'time_stamp_2'
		recentMove column:'recent_move'
		ownHome column:'own_home'
		ownHomeOth column:'own_home_oth'
		ageHome column:'age_home'
		lengthReside column:'length_reside'
		lengthResideUnit column:'length_reside_unit'
		timeStamp3 column:'time_stamp_3'
		renovate column:'renovate'
		decorate column:'decorate'
		smoke column:'smoke'
		smokeLocate column:'smoke_locate'
		timeStamp4 column:'time_stamp_4'
		fedBaby column:'fed_baby'
		howFed column:'how_fed'
		planFeed column:'plan_feed'
		timeStamp5 column:'time_stamp_5'
		posHosp column:'pos_hosp'
		posHome column:'pos_home'
		sleepRoom column:'sleep_room'
		bed column:'bed'
		bedOth column:'bed_oth'
		timeStamp6 column:'time_stamp_6'
		hcareYet column:'hcare_yet'
		hcare column:'hcare'
		hcareOth column:'hcare_oth'
		vaccineYet column:'vaccine_yet'
		vaccine column:'vaccine'
		timeStamp7 column:'time_stamp_7'
		employ2 column:'employ2'
		returnJobYet column:'return_job_yet'
		returnJobDt column:'return_job_dt'
		returnJob column:'return_job'
		returnJobUnit column:'return_job_unit'
		childcare column:'childcare'
		ccareType column:'ccare_type'
		ccareTypeOth column:'ccare_type_oth'
		ccareWho column:'ccare_who'
		relCareOth column:'rel_care_oth'
		ccareWhoOth column:'ccare_who_oth'
		timeStamp8 column:'time_stamp_8'
		rFname column:'r_fname'
		rLname column:'r_lname'
		phoneNbr column:'phone_nbr'
		phoneType column:'phone_type'
		friendPhoneOth column:'friend_phone_oth'
		phoneTypeOth column:'phone_type_oth'
		homePhone column:'home_phone'
		cellPhone1 column:'cell_phone_1'
		cellPhone2 column:'cell_phone_2'
		cellPhone3 column:'cell_phone_3'
		cellPhone4 column:'cell_phone_4'
		cellPhone column:'cell_phone'
		timeStamp9 column:'time_stamp_9'
		moveInfo column:'move_info'
		newAddressId column:'new_address_id'
		newAddress1 column:'new_address1'
		newAddress2 column:'new_address2'
		newUnit column:'new_unit'
		newCity column:'new_city'
		newState column:'new_state'
		newZip column:'new_zip'
		newZip4 column:'new_zip4'
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
		moveInfo2 column:'move_info_2'
		newAddressBId column:'new_address_b_id'
		newAddress1B column:'new_address1_b'
		newAddress2B column:'new_address2_b'
		newUnitB column:'new_unit_b'
		newCityB column:'new_city_b'
		newStateB column:'new_state_b'
		newZipB column:'new_zip_b'
		newZip4B column:'new_zip4_b'
		whenMove column:'when_move'
		dateMove column:'date_move'
		timeStamp10 column:'time_stamp_10'
		timeStamp11 column:'time_stamp_11'
		participant column:'participant'
		contactType column:'contact_type'
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
