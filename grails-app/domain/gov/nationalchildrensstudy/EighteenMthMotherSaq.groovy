package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class EighteenMthMotherSaq {

	Integer psuId
	String eighteenMthSaqId
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
	Integer weeksPremature
	Integer childSex
	String respondentFname
	String respondentMinital
	String respondentLname
	Integer respondentRel
	String respondentRelOth
	String asq18AddressId
	String asq18Address1
	String asq18Address2
	String asq18Unit
	String asq18City
	Integer asq18State
	String asq18Zip
	String asq18Zip4
	String asq18Country
	String homePhone
	String otherPhone
	String email
	String asq18AssistnameComment
	String asqChildId
	Integer scId
	String scName
	Integer asq18AgeMonths
	Integer asq18AgeDays
	Integer asq18AdjAgeMonths
	Integer asq18AdjAgeDays
	Integer comm18Points1
	Integer comm18Find2
	Integer comm18Eight3
	Integer comm18Imitate4
	Integer comm18Picture5
	Integer comm18SayIdea6
	String example18Comment
	Integer comm18Total
	Integer grmtr18Bndstd1
	Integer grmtr18Walk2
	Integer grmtr18Nofall3
	Integer grmtr18Climb4
	Integer grmtr18Stairs5
	Integer grmtr18Howkick6
	Integer grmtr18Total
	Integer fnmtr18Throw1
	Integer fnmtr18Stack2
	Integer fnmtr18Mark3
	Integer fnmtr18Threestk4
	Integer fnmtr18Turn5
	Integer fnmtr18Spoon6
	Integer fnmtr18Total
	Integer pslv18Drop1
	Integer pslv18Rchtool2
	Integer pslv18Dmpbtl3
	Integer pslv18Scribble4
	Integer pslv18Copy5
	Integer pslv18Btldmp6
	Integer pslv18Total
	Integer psoc18Mirror1
	Integer psoc18Hugtoy2
	Integer psoc18Attn3
	Integer psoc18Help4
	Integer psoc18Spill5
	Integer psoc18Copy6
	Integer psoc18Total
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "eighteen_mth_mother_saq"

	public EighteenMthMotherSaq(XMLStreamReader reader, boolean strict) {
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
								case 'eighteen_mth_saq_id':
									eighteenMthSaqId = elementText
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
								case 'weeks_premature':
									weeksPremature = elementText.toInteger()
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
								case 'asq18_address_id':
									asq18AddressId = elementText
									break
								case 'asq18_address_1':
									asq18Address1 = elementText
									break
								case 'asq18_address_2':
									asq18Address2 = elementText
									break
								case 'asq18_unit':
									asq18Unit = elementText
									break
								case 'asq18_city':
									asq18City = elementText
									break
								case 'asq18_state':
									asq18State = elementText.toInteger()
									break
								case 'asq18_zip':
									asq18Zip = elementText
									break
								case 'asq18_zip4':
									asq18Zip4 = elementText
									break
								case 'asq18_country':
									asq18Country = elementText
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
								case 'asq18_assistname_comment':
									asq18AssistnameComment = elementText
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
								case 'asq18_age_months':
									asq18AgeMonths = elementText.toInteger()
									break
								case 'asq18_age_days':
									asq18AgeDays = elementText.toInteger()
									break
								case 'asq18_adj_age_months':
									asq18AdjAgeMonths = elementText.toInteger()
									break
								case 'asq18_adj_age_days':
									asq18AdjAgeDays = elementText.toInteger()
									break
								case 'comm18_points_1':
									comm18Points1 = elementText.toInteger()
									break
								case 'comm18_find_2':
									comm18Find2 = elementText.toInteger()
									break
								case 'comm18_eight_3':
									comm18Eight3 = elementText.toInteger()
									break
								case 'comm18_imitate_4':
									comm18Imitate4 = elementText.toInteger()
									break
								case 'comm18_picture_5':
									comm18Picture5 = elementText.toInteger()
									break
								case 'comm18_say_idea_6':
									comm18SayIdea6 = elementText.toInteger()
									break
								case 'example18_comment':
									example18Comment = elementText
									break
								case 'comm18_total':
									comm18Total = elementText.toInteger()
									break
								case 'grmtr18_bndstd_1':
									grmtr18Bndstd1 = elementText.toInteger()
									break
								case 'grmtr18_walk_2':
									grmtr18Walk2 = elementText.toInteger()
									break
								case 'grmtr18_nofall_3':
									grmtr18Nofall3 = elementText.toInteger()
									break
								case 'grmtr18_climb_4':
									grmtr18Climb4 = elementText.toInteger()
									break
								case 'grmtr18_stairs_5':
									grmtr18Stairs5 = elementText.toInteger()
									break
								case 'grmtr18_howkick_6':
									grmtr18Howkick6 = elementText.toInteger()
									break
								case 'grmtr18_total':
									grmtr18Total = elementText.toInteger()
									break
								case 'fnmtr18_throw_1':
									fnmtr18Throw1 = elementText.toInteger()
									break
								case 'fnmtr18_stack_2':
									fnmtr18Stack2 = elementText.toInteger()
									break
								case 'fnmtr18_mark_3':
									fnmtr18Mark3 = elementText.toInteger()
									break
								case 'fnmtr18_threestk_4':
									fnmtr18Threestk4 = elementText.toInteger()
									break
								case 'fnmtr18_turn_5':
									fnmtr18Turn5 = elementText.toInteger()
									break
								case 'fnmtr18_spoon_6':
									fnmtr18Spoon6 = elementText.toInteger()
									break
								case 'fnmtr18_total':
									fnmtr18Total = elementText.toInteger()
									break
								case 'pslv18_drop_1':
									pslv18Drop1 = elementText.toInteger()
									break
								case 'pslv18_rchtool_2':
									pslv18Rchtool2 = elementText.toInteger()
									break
								case 'pslv18_dmpbtl_3':
									pslv18Dmpbtl3 = elementText.toInteger()
									break
								case 'pslv18_scribble_4':
									pslv18Scribble4 = elementText.toInteger()
									break
								case 'pslv18_copy_5':
									pslv18Copy5 = elementText.toInteger()
									break
								case 'pslv18_btldmp_6':
									pslv18Btldmp6 = elementText.toInteger()
									break
								case 'pslv18_total':
									pslv18Total = elementText.toInteger()
									break
								case 'psoc18_mirror_1':
									psoc18Mirror1 = elementText.toInteger()
									break
								case 'psoc18_hugtoy_2':
									psoc18Hugtoy2 = elementText.toInteger()
									break
								case 'psoc18_attn_3':
									psoc18Attn3 = elementText.toInteger()
									break
								case 'psoc18_help_4':
									psoc18Help4 = elementText.toInteger()
									break
								case 'psoc18_spill_5':
									psoc18Spill5 = elementText.toInteger()
									break
								case 'psoc18_copy_6':
									psoc18Copy6 = elementText.toInteger()
									break
								case 'psoc18_total':
									psoc18Total = elementText.toInteger()
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
		eighteenMthSaqId(nullable: false, minSize:1, maxSize:36)
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
		weeksPremature(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		childSex(nullable: false, inList:[1, 2, -1, -2, -4])
		respondentFname(nullable: true, maxSize:30)
		respondentMinital(nullable: true, maxSize:2)
		respondentLname(nullable: true, maxSize:30)
		respondentRel(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -4])
		respondentRelOth(nullable: true, maxSize:255)
		asq18AddressId(nullable: true, maxSize:36)
		asq18Address1(nullable: true, maxSize:100)
		asq18Address2(nullable: true, maxSize:100)
		asq18Unit(nullable: true, maxSize:10)
		asq18City(nullable: true, maxSize:50)
		asq18State(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		asq18Zip(nullable: true, maxSize:5)
		asq18Zip4(nullable: true, maxSize:4)
		asq18Country(nullable: true, maxSize:50)
		homePhone(nullable: true, maxSize:10)
		otherPhone(nullable: true, maxSize:10)
		email(nullable: true, maxSize:100)
		asq18AssistnameComment(nullable: true, maxSize:100)
		asqChildId(nullable: false, minSize:1, maxSize:36)
		scId(nullable: false, inList:[20000013, 20000015, 20000019, 20000022, 20000024, 20000026, 20000029, 20000031, 20000033, 20000036, 20000038, 20000041, 20000043, 20000047, 20000049, 20000051, 20000053, 20000056, 20000059, 20000061, 20000064, 20000066, 20000068, 20000071, 20000073, 20000074, 20000075, 20000076, 20000077, 20000078, 20000080, 20000081, 20000082, 20000120, 20000121, 20000122, -4, 20000000])
		scName(nullable: true, maxSize:100)
		asq18AgeMonths(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		asq18AgeDays(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		asq18AdjAgeMonths(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		asq18AdjAgeDays(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		comm18Points1(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		comm18Find2(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		comm18Eight3(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		comm18Imitate4(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		comm18Picture5(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		comm18SayIdea6(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		example18Comment(nullable: true, maxSize:255)
		comm18Total(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		grmtr18Bndstd1(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr18Walk2(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr18Nofall3(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr18Climb4(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr18Stairs5(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr18Howkick6(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		grmtr18Total(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		fnmtr18Throw1(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr18Stack2(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr18Mark3(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr18Threestk4(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr18Turn5(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr18Spoon6(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		fnmtr18Total(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pslv18Drop1(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv18Rchtool2(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv18Dmpbtl3(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv18Scribble4(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv18Copy5(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv18Btldmp6(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		pslv18Total(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		psoc18Mirror1(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc18Hugtoy2(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc18Attn3(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc18Help4(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc18Spill5(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc18Copy6(nullable: false, inList:[0, 5, 10, -1, -2, -4])
		psoc18Total(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'eighteen_mth_mother_saq'

		psuId column:'psu_id'
		eighteenMthSaqId column:'eighteen_mth_saq_id'
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
		weeksPremature column:'weeks_premature'
		childSex column:'child_sex'
		respondentFname column:'respondent_fname'
		respondentMinital column:'respondent_minital'
		respondentLname column:'respondent_lname'
		respondentRel column:'respondent_rel'
		respondentRelOth column:'respondent_rel_oth'
		asq18AddressId column:'asq18_address_id'
		asq18Address1 column:'asq18_address_1'
		asq18Address2 column:'asq18_address_2'
		asq18Unit column:'asq18_unit'
		asq18City column:'asq18_city'
		asq18State column:'asq18_state'
		asq18Zip column:'asq18_zip'
		asq18Zip4 column:'asq18_zip4'
		asq18Country column:'asq18_country'
		homePhone column:'home_phone'
		otherPhone column:'other_phone'
		email column:'email'
		asq18AssistnameComment column:'asq18_assistname_comment'
		asqChildId column:'asq_child_id'
		scId column:'sc_id'
		scName column:'sc_name'
		asq18AgeMonths column:'asq18_age_months'
		asq18AgeDays column:'asq18_age_days'
		asq18AdjAgeMonths column:'asq18_adj_age_months'
		asq18AdjAgeDays column:'asq18_adj_age_days'
		comm18Points1 column:'comm18_points_1'
		comm18Find2 column:'comm18_find_2'
		comm18Eight3 column:'comm18_eight_3'
		comm18Imitate4 column:'comm18_imitate_4'
		comm18Picture5 column:'comm18_picture_5'
		comm18SayIdea6 column:'comm18_say_idea_6'
		example18Comment column:'example18_comment'
		comm18Total column:'comm18_total'
		grmtr18Bndstd1 column:'grmtr18_bndstd_1'
		grmtr18Walk2 column:'grmtr18_walk_2'
		grmtr18Nofall3 column:'grmtr18_nofall_3'
		grmtr18Climb4 column:'grmtr18_climb_4'
		grmtr18Stairs5 column:'grmtr18_stairs_5'
		grmtr18Howkick6 column:'grmtr18_howkick_6'
		grmtr18Total column:'grmtr18_total'
		fnmtr18Throw1 column:'fnmtr18_throw_1'
		fnmtr18Stack2 column:'fnmtr18_stack_2'
		fnmtr18Mark3 column:'fnmtr18_mark_3'
		fnmtr18Threestk4 column:'fnmtr18_threestk_4'
		fnmtr18Turn5 column:'fnmtr18_turn_5'
		fnmtr18Spoon6 column:'fnmtr18_spoon_6'
		fnmtr18Total column:'fnmtr18_total'
		pslv18Drop1 column:'pslv18_drop_1'
		pslv18Rchtool2 column:'pslv18_rchtool_2'
		pslv18Dmpbtl3 column:'pslv18_dmpbtl_3'
		pslv18Scribble4 column:'pslv18_scribble_4'
		pslv18Copy5 column:'pslv18_copy_5'
		pslv18Btldmp6 column:'pslv18_btldmp_6'
		pslv18Total column:'pslv18_total'
		psoc18Mirror1 column:'psoc18_mirror_1'
		psoc18Hugtoy2 column:'psoc18_hugtoy_2'
		psoc18Attn3 column:'psoc18_attn_3'
		psoc18Help4 column:'psoc18_help_4'
		psoc18Spill5 column:'psoc18_spill_5'
		psoc18Copy6 column:'psoc18_copy_6'
		psoc18Total column:'psoc18_total'
		transactionType column:'transaction_type'
	}
}
