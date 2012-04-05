package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class TwelveMthMother {

	Integer psuId
	String twelveMthId
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
	Integer multChild
	Integer childNum
	String timeStamp8
	Integer tannicAcid
	Integer covers
	Integer vacuum
	Integer removal
	Integer method
	String methodOth
	Integer airFilter
	Integer openWindow
	Integer rodent
	Integer roach
	Integer water
	Integer mold
	String timeStamp9
	Integer renovate
	String timeStamp10
	Integer cigNow
	Integer numSmoker
	Integer smokeRules
	Integer drink
	Integer drinkNow
	Integer drinkNow5
	String timeStamp11
	Integer neighDefn
	Integer neighFam
	Integer neighFriend
	Integer neighbors
	Integer neighNumTalk
	Integer neighHelp
	Integer neighTalk
	Integer neighWatch1
	Integer neighWatch2
	Integer neighClose
	Integer neighTrust
	Integer neighSafe1
	Integer neighSafe2
	Integer neighSafe3
	String timeStamp12
	Integer commEmail
	Integer haveEmail
	Integer email2
	Integer email3
	String email
	Integer commCell
	Integer cellPhone1
	Integer cellPhone2
	Integer cellPhone3
	Integer cellPhone4
	String cellPhone
	String timeStamp13
	Integer commContact
	Integer contact1
	String contactFname1
	String contactLname1
	Integer contactRelate1
	String contactRelate1Oth
	String cAddr1Id
	String cAddr11
	String cAddr21
	String cUnit1
	String cCity1
	Integer cState1
	String cZipcode1
	String cZip41
	String contactPhone1
	String contactFname2
	String contactLname2
	Integer contactRelate2
	String contactRelate2Oth
	String cAddr2Id
	String cAddr12
	String cAddr22
	String cUnit2
	String cCity2
	Integer cState2
	String cZipcode2
	String cZip42
	String contactPhone2
	String timeStamp14
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "twelve_mth_mother"

	public TwelveMthMother(XMLStreamReader reader, boolean strict) {
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
								case 'twelve_mth_id':
									twelveMthId = elementText
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
								case 'mult_child':
									multChild = elementText.toInteger()
									break
								case 'child_num':
									childNum = elementText.toInteger()
									break
								case 'time_stamp_8':
									timeStamp8 = elementText
									break
								case 'tannic_acid':
									tannicAcid = elementText.toInteger()
									break
								case 'covers':
									covers = elementText.toInteger()
									break
								case 'vacuum':
									vacuum = elementText.toInteger()
									break
								case 'removal':
									removal = elementText.toInteger()
									break
								case 'method':
									method = elementText.toInteger()
									break
								case 'method_oth':
									methodOth = elementText
									break
								case 'air_filter':
									airFilter = elementText.toInteger()
									break
								case 'open_window':
									openWindow = elementText.toInteger()
									break
								case 'rodent':
									rodent = elementText.toInteger()
									break
								case 'roach':
									roach = elementText.toInteger()
									break
								case 'water':
									water = elementText.toInteger()
									break
								case 'mold':
									mold = elementText.toInteger()
									break
								case 'time_stamp_9':
									timeStamp9 = elementText
									break
								case 'renovate':
									renovate = elementText.toInteger()
									break
								case 'time_stamp_10':
									timeStamp10 = elementText
									break
								case 'cig_now':
									cigNow = elementText.toInteger()
									break
								case 'num_smoker':
									numSmoker = elementText.toInteger()
									break
								case 'smoke_rules':
									smokeRules = elementText.toInteger()
									break
								case 'drink':
									drink = elementText.toInteger()
									break
								case 'drink_now':
									drinkNow = elementText.toInteger()
									break
								case 'drink_now_5':
									drinkNow5 = elementText.toInteger()
									break
								case 'time_stamp_11':
									timeStamp11 = elementText
									break
								case 'neigh_defn':
									neighDefn = elementText.toInteger()
									break
								case 'neigh_fam':
									neighFam = elementText.toInteger()
									break
								case 'neigh_friend':
									neighFriend = elementText.toInteger()
									break
								case 'neighbors':
									neighbors = elementText.toInteger()
									break
								case 'neigh_num_talk':
									neighNumTalk = elementText.toInteger()
									break
								case 'neigh_help':
									neighHelp = elementText.toInteger()
									break
								case 'neigh_talk':
									neighTalk = elementText.toInteger()
									break
								case 'neigh_watch_1':
									neighWatch1 = elementText.toInteger()
									break
								case 'neigh_watch_2':
									neighWatch2 = elementText.toInteger()
									break
								case 'neigh_close':
									neighClose = elementText.toInteger()
									break
								case 'neigh_trust':
									neighTrust = elementText.toInteger()
									break
								case 'neigh_safe_1':
									neighSafe1 = elementText.toInteger()
									break
								case 'neigh_safe_2':
									neighSafe2 = elementText.toInteger()
									break
								case 'neigh_safe_3':
									neighSafe3 = elementText.toInteger()
									break
								case 'time_stamp_12':
									timeStamp12 = elementText
									break
								case 'comm_email':
									commEmail = elementText.toInteger()
									break
								case 'have_email':
									haveEmail = elementText.toInteger()
									break
								case 'email_2':
									email2 = elementText.toInteger()
									break
								case 'email_3':
									email3 = elementText.toInteger()
									break
								case 'email':
									email = elementText
									break
								case 'comm_cell':
									commCell = elementText.toInteger()
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
								case 'time_stamp_13':
									timeStamp13 = elementText
									break
								case 'comm_contact':
									commContact = elementText.toInteger()
									break
								case 'contact_1':
									contact1 = elementText.toInteger()
									break
								case 'contact_fname_1':
									contactFname1 = elementText
									break
								case 'contact_lname_1':
									contactLname1 = elementText
									break
								case 'contact_relate_1':
									contactRelate1 = elementText.toInteger()
									break
								case 'contact_relate1_oth':
									contactRelate1Oth = elementText
									break
								case 'c_addr1_id':
									cAddr1Id = elementText
									break
								case 'c_addr1_1':
									cAddr11 = elementText
									break
								case 'c_addr_2_1':
									cAddr21 = elementText
									break
								case 'c_unit_1':
									cUnit1 = elementText
									break
								case 'c_city_1':
									cCity1 = elementText
									break
								case 'c_state_1':
									cState1 = elementText.toInteger()
									break
								case 'c_zipcode_1':
									cZipcode1 = elementText
									break
								case 'c_zip4_1':
									cZip41 = elementText
									break
								case 'contact_phone_1':
									contactPhone1 = elementText
									break
								case 'contact_fname_2':
									contactFname2 = elementText
									break
								case 'contact_lname_2':
									contactLname2 = elementText
									break
								case 'contact_relate_2':
									contactRelate2 = elementText.toInteger()
									break
								case 'contact_relate2_oth':
									contactRelate2Oth = elementText
									break
								case 'c_addr2_id':
									cAddr2Id = elementText
									break
								case 'c_addr1_2':
									cAddr12 = elementText
									break
								case 'c_addr_2_2':
									cAddr22 = elementText
									break
								case 'c_unit_2':
									cUnit2 = elementText
									break
								case 'c_city_2':
									cCity2 = elementText
									break
								case 'c_state_2':
									cState2 = elementText.toInteger()
									break
								case 'c_zipcode_2':
									cZipcode2 = elementText
									break
								case 'c_zip4_2':
									cZip42 = elementText
									break
								case 'contact_phone_2':
									contactPhone2 = elementText
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
		twelveMthId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: false)
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		multChild(nullable: false, inList:[1, 2, -4])
		childNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		tannicAcid(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		covers(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		vacuum(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		removal(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		method(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		methodOth(nullable: true, maxSize:255)
		airFilter(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		openWindow(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		rodent(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		roach(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		water(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		mold(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		renovate(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cigNow(nullable: false, inList:[1, 2, -1, -2, -4])
		numSmoker(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		smokeRules(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		drink(nullable: false, inList:[1, 2, -1, -2, -4])
		drinkNow(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4])
		drinkNow5(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		neighDefn(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighFam(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighFriend(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighbors(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighNumTalk(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighHelp(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighTalk(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighWatch1(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighWatch2(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighClose(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighTrust(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighSafe1(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighSafe2(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		neighSafe3(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		commEmail(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		haveEmail(nullable: false, inList:[1, 2, -1, -2, -4])
		email2(nullable: false, inList:[1, 2, -1, -2, -4])
		email3(nullable: false, inList:[1, 2, -1, -2, -4])
		email(nullable: true, maxSize:100)
		commCell(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		cellPhone1(nullable: false, inList:[1, 2, -1, -2, -4])
		cellPhone2(nullable: false, inList:[1, 2, -1, -2, -4])
		cellPhone3(nullable: false, inList:[1, 2, -1, -2, -4])
		cellPhone4(nullable: false, inList:[1, 2, -1, -2, -4])
		cellPhone(nullable: true, maxSize:10)
		timeStamp13(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		commContact(nullable: false, inList:[1, 2, -1, -2, -4])
		contact1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		contactFname1(nullable: true, maxSize:30)
		contactLname1(nullable: true, maxSize:30)
		contactRelate1(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -2, -3, -4])
		contactRelate1Oth(nullable: true, maxSize:255)
		cAddr1Id(nullable: true, maxSize:36)
		cAddr11(nullable: true, maxSize:100)
		cAddr21(nullable: true, maxSize:100)
		cUnit1(nullable: true, maxSize:10)
		cCity1(nullable: true, maxSize:50)
		cState1(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		cZipcode1(nullable: true, maxSize:5)
		cZip41(nullable: true, maxSize:4)
		contactPhone1(nullable: true, maxSize:10)
		contactFname2(nullable: true, maxSize:30)
		contactLname2(nullable: true, maxSize:30)
		contactRelate2(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -2, -3, -4])
		contactRelate2Oth(nullable: true, maxSize:255)
		cAddr2Id(nullable: true, maxSize:36)
		cAddr12(nullable: true, maxSize:100)
		cAddr22(nullable: true, maxSize:100)
		cUnit2(nullable: true, maxSize:10)
		cCity2(nullable: true, maxSize:50)
		cState2(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		cZipcode2(nullable: true, maxSize:5)
		cZip42(nullable: true, maxSize:4)
		contactPhone2(nullable: true, maxSize:10)
		timeStamp14(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_mother'

		psuId column:'psu_id'
		twelveMthId column:'twelve_mth_id'
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
		timeStamp8 column:'time_stamp_8'
		tannicAcid column:'tannic_acid'
		covers column:'covers'
		vacuum column:'vacuum'
		removal column:'removal'
		method column:'method'
		methodOth column:'method_oth'
		airFilter column:'air_filter'
		openWindow column:'open_window'
		rodent column:'rodent'
		roach column:'roach'
		water column:'water'
		mold column:'mold'
		timeStamp9 column:'time_stamp_9'
		renovate column:'renovate'
		timeStamp10 column:'time_stamp_10'
		cigNow column:'cig_now'
		numSmoker column:'num_smoker'
		smokeRules column:'smoke_rules'
		drink column:'drink'
		drinkNow column:'drink_now'
		drinkNow5 column:'drink_now_5'
		timeStamp11 column:'time_stamp_11'
		neighDefn column:'neigh_defn'
		neighFam column:'neigh_fam'
		neighFriend column:'neigh_friend'
		neighbors column:'neighbors'
		neighNumTalk column:'neigh_num_talk'
		neighHelp column:'neigh_help'
		neighTalk column:'neigh_talk'
		neighWatch1 column:'neigh_watch_1'
		neighWatch2 column:'neigh_watch_2'
		neighClose column:'neigh_close'
		neighTrust column:'neigh_trust'
		neighSafe1 column:'neigh_safe_1'
		neighSafe2 column:'neigh_safe_2'
		neighSafe3 column:'neigh_safe_3'
		timeStamp12 column:'time_stamp_12'
		commEmail column:'comm_email'
		haveEmail column:'have_email'
		email2 column:'email_2'
		email3 column:'email_3'
		email column:'email'
		commCell column:'comm_cell'
		cellPhone1 column:'cell_phone_1'
		cellPhone2 column:'cell_phone_2'
		cellPhone3 column:'cell_phone_3'
		cellPhone4 column:'cell_phone_4'
		cellPhone column:'cell_phone'
		timeStamp13 column:'time_stamp_13'
		commContact column:'comm_contact'
		contact1 column:'contact_1'
		contactFname1 column:'contact_fname_1'
		contactLname1 column:'contact_lname_1'
		contactRelate1 column:'contact_relate_1'
		contactRelate1Oth column:'contact_relate1_oth'
		cAddr1Id column:'c_addr1_id'
		cAddr11 column:'c_addr1_1'
		cAddr21 column:'c_addr_2_1'
		cUnit1 column:'c_unit_1'
		cCity1 column:'c_city_1'
		cState1 column:'c_state_1'
		cZipcode1 column:'c_zipcode_1'
		cZip41 column:'c_zip4_1'
		contactPhone1 column:'contact_phone_1'
		contactFname2 column:'contact_fname_2'
		contactLname2 column:'contact_lname_2'
		contactRelate2 column:'contact_relate_2'
		contactRelate2Oth column:'contact_relate2_oth'
		cAddr2Id column:'c_addr2_id'
		cAddr12 column:'c_addr1_2'
		cAddr22 column:'c_addr_2_2'
		cUnit2 column:'c_unit_2'
		cCity2 column:'c_city_2'
		cState2 column:'c_state_2'
		cZipcode2 column:'c_zipcode_2'
		cZip42 column:'c_zip4_2'
		contactPhone2 column:'contact_phone_2'
		timeStamp14 column:'time_stamp_14'
		transactionType column:'transaction_type'
	}
}
