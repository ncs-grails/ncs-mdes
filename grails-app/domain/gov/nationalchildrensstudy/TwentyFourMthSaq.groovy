package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class TwentyFourMthSaq {

	Integer psuId
	String twentyFourMthSaqId
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
	String asqDateComp
	String cFname
	String cMinital
	String cLname
	String childDob
	Integer childSex
	String respondentFname
	String respondentMinital
	String respondentLname
	Integer respondentRel
	String respondentRelOth
	String asq24AddressId
	String asq24Address1
	String asq24Address2
	String asq24Unit
	String asq24City
	Integer asq24State
	String asq24Zip
	String asq24Zip4
	String asq24Country
	String homePhone
	String otherPhone
	String email
	String asq24AssistnameComment
	String asqChildId
	Integer scId
	String scName
	Integer comm24Picture1
	Integer comm24Imitate2
	Integer comm24Direct3
	Integer comm24Name4
	Integer comm24SayIdea5
	String example24Comment
	Integer comm24Usewords6
	Integer comm24Total
	Integer grmtr24Stairs1
	Integer grmtr24Howkick2
	Integer grmtr24Steps3
	Integer grmtr24Run4
	Integer grmtr24Jump5
	Integer grmtr24Cankick6
	Integer grmtr24Total
	Integer fnmtr24Spoon1
	Integer fnmtr24Turn2
	Integer fnmtr24Knobs3
	Integer fnmtr24Switch4
	Integer fnmtr247stack5
	Integer fnmtr24String6
	Integer fnmtr24Total
	Integer pslv24Copy1
	Integer pslv24Dmpbtl2
	Integer pslv24Pretend3
	Integer pslv24Away4
	Integer pslv24Stdon5
	Integer pslv24Line46
	Integer pslv24Total
	Integer psoc24Spill1
	Integer psoc24Copy2
	Integer psoc24Fork3
	Integer psoc24Hugtoy4
	Integer psoc24Pushtoy5
	Integer psoc24Calli6
	Integer psoc24Total
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "twenty_four_mth_saq"

	public TwentyFourMthSaq(XMLStreamReader reader, boolean strict) {
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
								case 'twenty_four_mth_saq_id':
									twentyFourMthSaqId = elementText
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
								case 'asq_date_comp':
									asqDateComp = elementText
									break
								case 'c_fname':
									cFname = elementText
									break
								case 'c_minital':
									cMinital = elementText
									break
								case 'c_lname':
									cLname = elementText
									break
								case 'child_dob':
									childDob = elementText
									break
								case 'child_sex':
									childSex = elementText.toInteger()
									break
								case 'respondent_fname':
									respondentFname = elementText
									break
								case 'respondent_minital':
									respondentMinital = elementText
									break
								case 'respondent_lname':
									respondentLname = elementText
									break
								case 'respondent_rel':
									respondentRel = elementText.toInteger()
									break
								case 'respondent_rel_oth':
									respondentRelOth = elementText
									break
								case 'asq24_address_id':
									asq24AddressId = elementText
									break
								case 'asq24_address_1':
									asq24Address1 = elementText
									break
								case 'asq24_address_2':
									asq24Address2 = elementText
									break
								case 'asq24_unit':
									asq24Unit = elementText
									break
								case 'asq24_city':
									asq24City = elementText
									break
								case 'asq24_state':
									asq24State = elementText.toInteger()
									break
								case 'asq24_zip':
									asq24Zip = elementText
									break
								case 'asq24_zip4':
									asq24Zip4 = elementText
									break
								case 'asq24_country':
									asq24Country = elementText
									break
								case 'home_phone':
									homePhone = elementText
									break
								case 'other_phone':
									otherPhone = elementText
									break
								case 'email':
									email = elementText
									break
								case 'asq24_assistname_comment':
									asq24AssistnameComment = elementText
									break
								case 'asq_child_id':
									asqChildId = elementText
									break
								case 'sc_id':
									scId = elementText.toInteger()
									break
								case 'sc_name':
									scName = elementText
									break
								case 'comm24_picture_1':
									comm24Picture1 = elementText.toInteger()
									break
								case 'comm24_imitate_2':
									comm24Imitate2 = elementText.toInteger()
									break
								case 'comm24_direct_3':
									comm24Direct3 = elementText.toInteger()
									break
								case 'comm24_name_4':
									comm24Name4 = elementText.toInteger()
									break
								case 'comm24_say_idea_5':
									comm24SayIdea5 = elementText.toInteger()
									break
								case 'example24_comment':
									example24Comment = elementText
									break
								case 'comm24_usewords_6':
									comm24Usewords6 = elementText.toInteger()
									break
								case 'comm24_total':
									comm24Total = elementText.toInteger()
									break
								case 'grmtr24_stairs_1':
									grmtr24Stairs1 = elementText.toInteger()
									break
								case 'grmtr24_howkick_2':
									grmtr24Howkick2 = elementText.toInteger()
									break
								case 'grmtr24_steps_3':
									grmtr24Steps3 = elementText.toInteger()
									break
								case 'grmtr24_run_4':
									grmtr24Run4 = elementText.toInteger()
									break
								case 'grmtr24_jump_5':
									grmtr24Jump5 = elementText.toInteger()
									break
								case 'grmtr24_cankick_6':
									grmtr24Cankick6 = elementText.toInteger()
									break
								case 'grmtr24_total':
									grmtr24Total = elementText.toInteger()
									break
								case 'fnmtr24_spoon_1':
									fnmtr24Spoon1 = elementText.toInteger()
									break
								case 'fnmtr24_turn_2':
									fnmtr24Turn2 = elementText.toInteger()
									break
								case 'fnmtr24_knobs_3':
									fnmtr24Knobs3 = elementText.toInteger()
									break
								case 'fnmtr24_switch_4':
									fnmtr24Switch4 = elementText.toInteger()
									break
								case 'fnmtr24_7stack_5':
									fnmtr247stack5 = elementText.toInteger()
									break
								case 'fnmtr24_string_6':
									fnmtr24String6 = elementText.toInteger()
									break
								case 'fnmtr24_total':
									fnmtr24Total = elementText.toInteger()
									break
								case 'pslv24_copy_1':
									pslv24Copy1 = elementText.toInteger()
									break
								case 'pslv24_dmpbtl_2':
									pslv24Dmpbtl2 = elementText.toInteger()
									break
								case 'pslv24_pretend_3':
									pslv24Pretend3 = elementText.toInteger()
									break
								case 'pslv24_away_4':
									pslv24Away4 = elementText.toInteger()
									break
								case 'pslv24_stdon_5':
									pslv24Stdon5 = elementText.toInteger()
									break
								case 'pslv24_line4_6':
									pslv24Line46 = elementText.toInteger()
									break
								case 'pslv24_total':
									pslv24Total = elementText.toInteger()
									break
								case 'psoc24_spill_1':
									psoc24Spill1 = elementText.toInteger()
									break
								case 'psoc24_copy_2':
									psoc24Copy2 = elementText.toInteger()
									break
								case 'psoc24_fork_3':
									psoc24Fork3 = elementText.toInteger()
									break
								case 'psoc24_hugtoy_4':
									psoc24Hugtoy4 = elementText.toInteger()
									break
								case 'psoc24_pushtoy_5':
									psoc24Pushtoy5 = elementText.toInteger()
									break
								case 'psoc24_calli_6':
									psoc24Calli6 = elementText.toInteger()
									break
								case 'psoc24_total':
									psoc24Total = elementText.toInteger()
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
		twentyFourMthSaqId(nullable: false, minSize:1, maxSize:36)
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
		asqDateComp(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		cFname(nullable: true, maxSize:30)
		cMinital(nullable: true, maxSize:2)
		cLname(nullable: true, maxSize:30)
		childDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		childSex(nullable: false, inList:[1, 2, -1, -2, -4])
		respondentFname(nullable: true, maxSize:30)
		respondentMinital(nullable: true, maxSize:2)
		respondentLname(nullable: true, maxSize:30)
		respondentRel(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -4])
		respondentRelOth(nullable: true, maxSize:255)
		asq24AddressId(nullable: true, maxSize:36)
		asq24Address1(nullable: true, maxSize:100)
		asq24Address2(nullable: true, maxSize:100)
		asq24Unit(nullable: true, maxSize:10)
		asq24City(nullable: true, maxSize:50)
		asq24State(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		asq24Zip(nullable: true, maxSize:5)
		asq24Zip4(nullable: true, maxSize:4)
		asq24Country(nullable: true, maxSize:50)
		homePhone(nullable: true, maxSize:10)
		otherPhone(nullable: true, maxSize:10)
		email(nullable: true, maxSize:100)
		asq24AssistnameComment(nullable: true, maxSize:100)
		asqChildId(nullable: false, minSize:1, maxSize:36)
		scId(nullable: false, inList:[20000013, 20000015, 20000019, 20000022, 20000024, 20000026, 20000029, 20000031, 20000033, 20000036, 20000038, 20000041, 20000043, 20000047, 20000049, 20000051, 20000053, 20000056, 20000059, 20000061, 20000064, 20000066, 20000068, 20000071, 20000073, 20000074, 20000075, 20000076, 20000077, 20000078, 20000080, 20000081, 20000082, 20000120, 20000121, 20000122, -4, 20000000])
		scName(nullable: true, maxSize:100)
		comm24Picture1(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		comm24Imitate2(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		comm24Direct3(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		comm24Name4(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		comm24SayIdea5(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		example24Comment(nullable: false, minSize:1, maxSize:255)
		comm24Usewords6(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		comm24Total(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		grmtr24Stairs1(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr24Howkick2(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr24Steps3(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr24Run4(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr24Jump5(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr24Cankick6(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr24Total(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		fnmtr24Spoon1(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr24Turn2(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr24Knobs3(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr24Switch4(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr247stack5(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr24String6(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr24Total(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pslv24Copy1(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv24Dmpbtl2(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv24Pretend3(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv24Away4(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv24Stdon5(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv24Line46(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv24Total(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		psoc24Spill1(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc24Copy2(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc24Fork3(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc24Hugtoy4(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc24Pushtoy5(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc24Calli6(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc24Total(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_saq'

		psuId column:'psu_id'
		twentyFourMthSaqId column:'twenty_four_mth_saq_id'
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
		asqDateComp column:'asq_date_comp'
		cFname column:'c_fname'
		cMinital column:'c_minital'
		cLname column:'c_lname'
		childDob column:'child_dob'
		childSex column:'child_sex'
		respondentFname column:'respondent_fname'
		respondentMinital column:'respondent_minital'
		respondentLname column:'respondent_lname'
		respondentRel column:'respondent_rel'
		respondentRelOth column:'respondent_rel_oth'
		asq24AddressId column:'asq24_address_id'
		asq24Address1 column:'asq24_address_1'
		asq24Address2 column:'asq24_address_2'
		asq24Unit column:'asq24_unit'
		asq24City column:'asq24_city'
		asq24State column:'asq24_state'
		asq24Zip column:'asq24_zip'
		asq24Zip4 column:'asq24_zip4'
		asq24Country column:'asq24_country'
		homePhone column:'home_phone'
		otherPhone column:'other_phone'
		email column:'email'
		asq24AssistnameComment column:'asq24_assistname_comment'
		asqChildId column:'asq_child_id'
		scId column:'sc_id'
		scName column:'sc_name'
		comm24Picture1 column:'comm24_picture_1'
		comm24Imitate2 column:'comm24_imitate_2'
		comm24Direct3 column:'comm24_direct_3'
		comm24Name4 column:'comm24_name_4'
		comm24SayIdea5 column:'comm24_say_idea_5'
		example24Comment column:'example24_comment'
		comm24Usewords6 column:'comm24_usewords_6'
		comm24Total column:'comm24_total'
		grmtr24Stairs1 column:'grmtr24_stairs_1'
		grmtr24Howkick2 column:'grmtr24_howkick_2'
		grmtr24Steps3 column:'grmtr24_steps_3'
		grmtr24Run4 column:'grmtr24_run_4'
		grmtr24Jump5 column:'grmtr24_jump_5'
		grmtr24Cankick6 column:'grmtr24_cankick_6'
		grmtr24Total column:'grmtr24_total'
		fnmtr24Spoon1 column:'fnmtr24_spoon_1'
		fnmtr24Turn2 column:'fnmtr24_turn_2'
		fnmtr24Knobs3 column:'fnmtr24_knobs_3'
		fnmtr24Switch4 column:'fnmtr24_switch_4'
		fnmtr247stack5 column:'fnmtr24_7stack_5'
		fnmtr24String6 column:'fnmtr24_string_6'
		fnmtr24Total column:'fnmtr24_total'
		pslv24Copy1 column:'pslv24_copy_1'
		pslv24Dmpbtl2 column:'pslv24_dmpbtl_2'
		pslv24Pretend3 column:'pslv24_pretend_3'
		pslv24Away4 column:'pslv24_away_4'
		pslv24Stdon5 column:'pslv24_stdon_5'
		pslv24Line46 column:'pslv24_line4_6'
		pslv24Total column:'pslv24_total'
		psoc24Spill1 column:'psoc24_spill_1'
		psoc24Copy2 column:'psoc24_copy_2'
		psoc24Fork3 column:'psoc24_fork_3'
		psoc24Hugtoy4 column:'psoc24_hugtoy_4'
		psoc24Pushtoy5 column:'psoc24_pushtoy_5'
		psoc24Calli6 column:'psoc24_calli_6'
		psoc24Total column:'psoc24_total'
		transactionType column:'transaction_type'
	}
}
