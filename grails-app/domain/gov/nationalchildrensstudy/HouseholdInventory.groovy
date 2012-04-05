package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class HouseholdInventory {

	Integer psuId
	String hhInventoryId
	Integer recruitType
	String duId
	String hhId
	String pId
	String eventId
	Integer eventType
	Integer eventRepeatKey
	String instrumentId
	Integer instrumentType
	String instrumentVersion
	Integer instrumentRepeatKey
	Integer outAnswer
	String outAnswerOth
	Integer outSpeakAdult
	Integer hhAdult
	String timeStamp1
	Integer hhIncentive
	Integer hhMember
	String timeStamp2
	String addressId
	String address1
	String address2
	String unit
	String city
	Integer state
	String zip
	String zip4
	Integer private_
	String timeStamp3
	Integer placeType
	String placeTypeOth
	String placeName
	String timeStamp4
	Integer rGender
	Integer numAdult
	Integer numMale
	Integer numFemale
	Integer hhAgeElig
	String timeStamp5
	Integer pregnantHh
	Integer numPreg
	Integer confirm1
	Integer confirm2
	String timeStamp6
	String rFname
	String rLname
	String phoneNbr
	Integer phoneType
	String phoneTypeOth
	String timeStamp7
	String timeStamp8
	Integer contactType
	String contactTypeOth
	Integer english
	Integer contactLang
	String contactLangOth
	Integer interpret
	Integer contactInterpret
	String contactInterpretOth
	String timeStamp9
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "household_inventory"

	public HouseholdInventory(XMLStreamReader reader, boolean strict) {
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
								case 'hh_inventory_id':
									hhInventoryId = elementText
									break
								case 'recruit_type':
									recruitType = elementText.toInteger()
									break
								case 'du_id':
									duId = elementText
									break
								case 'hh_id':
									hhId = elementText
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
								case 'out_answer':
									outAnswer = elementText.toInteger()
									break
								case 'out_answer_oth':
									outAnswerOth = elementText
									break
								case 'out_speak_adult':
									outSpeakAdult = elementText.toInteger()
									break
								case 'hh_adult':
									hhAdult = elementText.toInteger()
									break
								case 'time_stamp_1':
									timeStamp1 = elementText
									break
								case 'hh_incentive':
									hhIncentive = elementText.toInteger()
									break
								case 'hh_member':
									hhMember = elementText.toInteger()
									break
								case 'time_stamp_2':
									timeStamp2 = elementText
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
								case 'private':
									private_ = elementText.toInteger()
									break
								case 'time_stamp_3':
									timeStamp3 = elementText
									break
								case 'place_type':
									placeType = elementText.toInteger()
									break
								case 'place_type_oth':
									placeTypeOth = elementText
									break
								case 'place_name':
									placeName = elementText
									break
								case 'time_stamp_4':
									timeStamp4 = elementText
									break
								case 'r_gender':
									rGender = elementText.toInteger()
									break
								case 'num_adult':
									numAdult = elementText.toInteger()
									break
								case 'num_male':
									numMale = elementText.toInteger()
									break
								case 'num_female':
									numFemale = elementText.toInteger()
									break
								case 'hh_age_elig':
									hhAgeElig = elementText.toInteger()
									break
								case 'time_stamp_5':
									timeStamp5 = elementText
									break
								case 'pregnant_hh':
									pregnantHh = elementText.toInteger()
									break
								case 'num_preg':
									numPreg = elementText.toInteger()
									break
								case 'confirm_1':
									confirm1 = elementText.toInteger()
									break
								case 'confirm_2':
									confirm2 = elementText.toInteger()
									break
								case 'time_stamp_6':
									timeStamp6 = elementText
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
								case 'phone_type_oth':
									phoneTypeOth = elementText
									break
								case 'time_stamp_7':
									timeStamp7 = elementText
									break
								case 'time_stamp_8':
									timeStamp8 = elementText
									break
								case 'contact_type':
									contactType = elementText.toInteger()
									break
								case 'contact_type_oth':
									contactTypeOth = elementText
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
								case 'time_stamp_9':
									timeStamp9 = elementText
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
		hhInventoryId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: false, minSize:1, maxSize:36)
		hhId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: true, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		outAnswer(nullable: false, inList:[1, 2, 3, -5, -3, -4])
		outAnswerOth(nullable: true, maxSize:255)
		outSpeakAdult(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		hhAdult(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hhIncentive(nullable: false, inList:[1, 2, -4])
		hhMember(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		addressId(nullable: true, maxSize:36)
		address1(nullable: true, maxSize:100)
		address2(nullable: true, maxSize:100)
		unit(nullable: true, maxSize:10)
		city(nullable: true, maxSize:50)
		state(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		zip(nullable: true, maxSize:5)
		zip4(nullable: true, maxSize:4)
		private_(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		placeType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -5, -1, -2, -3, -4])
		placeTypeOth(nullable: true, maxSize:255)
		placeName(nullable: true, maxSize:255)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rGender(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		numAdult(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numMale(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numFemale(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		hhAgeElig(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregnantHh(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		numPreg(nullable: false)
		confirm1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		confirm2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rFname(nullable: true, maxSize:30)
		rLname(nullable: true, maxSize:30)
		phoneNbr(nullable: true, maxSize:10)
		phoneType(nullable: false, inList:[1, 2, 3, 4, -5, -1, -2, -3, -4])
		phoneTypeOth(nullable: true, maxSize:255)
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		contactType(nullable: false, inList:[1, 2, 3, 4, -5, -3, -4])
		contactTypeOth(nullable: true, maxSize:255)
		english(nullable: false, inList:[1, 2, -4])
		contactLang(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, -5, -3, -4])
		contactLangOth(nullable: true, maxSize:255)
		interpret(nullable: false, inList:[1, 2, -3, -4])
		contactInterpret(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -3, -4])
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