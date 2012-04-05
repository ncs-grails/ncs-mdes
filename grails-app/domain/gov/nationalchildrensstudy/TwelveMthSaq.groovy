package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class TwelveMthSaq {

	Integer psuId
	String twelveMthSaqId
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
	Integer spListen
	Integer spFeel
	Integer spDistant
	Integer spUnderstand
	Integer spNeglect
	Integer spLonely
	Integer behave1
	Integer behave2
	Integer behave3
	Integer behave4
	Integer behave5
	Integer behave6
	Integer behave7
	Integer behave8
	Integer behave9
	Integer behave10
	Integer behave11
	Integer behave12
	Integer behave13
	Integer behave14
	Integer behave15
	Integer behave16
	Integer behave17
	Integer behave18
	Integer behave19
	Integer behave20
	Integer behave21
	Integer behave22
	Integer behave23
	Integer behave24
	Integer behave25
	Integer behave26
	Integer behave27
	Integer behave28
	Integer behave29
	Integer behave30
	Integer behave31
	Integer behave32
	Integer behave33
	Integer behave34
	Integer behaviors1
	Integer behaviors2
	Integer behaviors3
	Integer behaviors4
	Integer behaviors5
	Integer behaviors6
	Integer behaviors7
	Integer behaviors8
	String timeStamp2
	Integer breastDay
	Integer breastWeek
	Integer formulaDay
	Integer formulaWeek
	Integer cowMilkDay
	Integer cowMilkWeek
	Integer milkOthDay
	Integer milkOthWeek
	Integer breastMilk
	Integer breastStop
	Integer breastStopUnit
	Integer pumped
	Integer pumped2
	Integer formula
	Integer formulaLast7
	Integer water2
	Integer ounces
	Integer bType1
	Integer bType2
	Integer bType3
	Integer bType4
	Integer bType5
	Integer pacifer
	Integer cowsMilk1
	Integer cowsMilk2
	Integer cereal
	Integer pureed
	Integer tableFood
	Integer herbal
	String timeStamp3
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "twelve_mth_saq"

	public TwelveMthSaq(XMLStreamReader reader, boolean strict) {
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
								case 'twelve_mth_saq_id':
									twelveMthSaqId = elementText
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
								case 'sp_listen':
									spListen = elementText.toInteger()
									break
								case 'sp_feel':
									spFeel = elementText.toInteger()
									break
								case 'sp_distant':
									spDistant = elementText.toInteger()
									break
								case 'sp_understand':
									spUnderstand = elementText.toInteger()
									break
								case 'sp_neglect':
									spNeglect = elementText.toInteger()
									break
								case 'sp_lonely':
									spLonely = elementText.toInteger()
									break
								case 'behave_1':
									behave1 = elementText.toInteger()
									break
								case 'behave_2':
									behave2 = elementText.toInteger()
									break
								case 'behave_3':
									behave3 = elementText.toInteger()
									break
								case 'behave_4':
									behave4 = elementText.toInteger()
									break
								case 'behave_5':
									behave5 = elementText.toInteger()
									break
								case 'behave_6':
									behave6 = elementText.toInteger()
									break
								case 'behave_7':
									behave7 = elementText.toInteger()
									break
								case 'behave_8':
									behave8 = elementText.toInteger()
									break
								case 'behave_9':
									behave9 = elementText.toInteger()
									break
								case 'behave_10':
									behave10 = elementText.toInteger()
									break
								case 'behave_11':
									behave11 = elementText.toInteger()
									break
								case 'behave_12':
									behave12 = elementText.toInteger()
									break
								case 'behave_13':
									behave13 = elementText.toInteger()
									break
								case 'behave_14':
									behave14 = elementText.toInteger()
									break
								case 'behave_15':
									behave15 = elementText.toInteger()
									break
								case 'behave_16':
									behave16 = elementText.toInteger()
									break
								case 'behave_17':
									behave17 = elementText.toInteger()
									break
								case 'behave_18':
									behave18 = elementText.toInteger()
									break
								case 'behave_19':
									behave19 = elementText.toInteger()
									break
								case 'behave_20':
									behave20 = elementText.toInteger()
									break
								case 'behave_21':
									behave21 = elementText.toInteger()
									break
								case 'behave_22':
									behave22 = elementText.toInteger()
									break
								case 'behave_23':
									behave23 = elementText.toInteger()
									break
								case 'behave_24':
									behave24 = elementText.toInteger()
									break
								case 'behave_25':
									behave25 = elementText.toInteger()
									break
								case 'behave_26':
									behave26 = elementText.toInteger()
									break
								case 'behave_27':
									behave27 = elementText.toInteger()
									break
								case 'behave_28':
									behave28 = elementText.toInteger()
									break
								case 'behave_29':
									behave29 = elementText.toInteger()
									break
								case 'behave_30':
									behave30 = elementText.toInteger()
									break
								case 'behave_31':
									behave31 = elementText.toInteger()
									break
								case 'behave_32':
									behave32 = elementText.toInteger()
									break
								case 'behave_33':
									behave33 = elementText.toInteger()
									break
								case 'behave_34':
									behave34 = elementText.toInteger()
									break
								case 'behaviors_1':
									behaviors1 = elementText.toInteger()
									break
								case 'behaviors_2':
									behaviors2 = elementText.toInteger()
									break
								case 'behaviors_3':
									behaviors3 = elementText.toInteger()
									break
								case 'behaviors_4':
									behaviors4 = elementText.toInteger()
									break
								case 'behaviors_5':
									behaviors5 = elementText.toInteger()
									break
								case 'behaviors_6':
									behaviors6 = elementText.toInteger()
									break
								case 'behaviors_7':
									behaviors7 = elementText.toInteger()
									break
								case 'behaviors_8':
									behaviors8 = elementText.toInteger()
									break
								case 'time_stamp_2':
									timeStamp2 = elementText
									break
								case 'breast_day':
									breastDay = elementText.toInteger()
									break
								case 'breast_week':
									breastWeek = elementText.toInteger()
									break
								case 'formula_day':
									formulaDay = elementText.toInteger()
									break
								case 'formula_week':
									formulaWeek = elementText.toInteger()
									break
								case 'cow_milk_day':
									cowMilkDay = elementText.toInteger()
									break
								case 'cow_milk_week':
									cowMilkWeek = elementText.toInteger()
									break
								case 'milk_oth_day':
									milkOthDay = elementText.toInteger()
									break
								case 'milk_oth_week':
									milkOthWeek = elementText.toInteger()
									break
								case 'breast_milk':
									breastMilk = elementText.toInteger()
									break
								case 'breast_stop':
									breastStop = elementText.toInteger()
									break
								case 'breast_stop_unit':
									breastStopUnit = elementText.toInteger()
									break
								case 'pumped':
									pumped = elementText.toInteger()
									break
								case 'pumped_2':
									pumped2 = elementText.toInteger()
									break
								case 'formula':
									formula = elementText.toInteger()
									break
								case 'formula_last7':
									formulaLast7 = elementText.toInteger()
									break
								case 'water_2':
									water2 = elementText.toInteger()
									break
								case 'ounces':
									ounces = elementText.toInteger()
									break
								case 'b_type1':
									bType1 = elementText.toInteger()
									break
								case 'b_type2':
									bType2 = elementText.toInteger()
									break
								case 'b_type3':
									bType3 = elementText.toInteger()
									break
								case 'b_type4':
									bType4 = elementText.toInteger()
									break
								case 'b_type5':
									bType5 = elementText.toInteger()
									break
								case 'pacifer':
									pacifer = elementText.toInteger()
									break
								case 'cows_milk_1':
									cowsMilk1 = elementText.toInteger()
									break
								case 'cows_milk_2':
									cowsMilk2 = elementText.toInteger()
									break
								case 'cereal':
									cereal = elementText.toInteger()
									break
								case 'pureed':
									pureed = elementText.toInteger()
									break
								case 'table_food':
									tableFood = elementText.toInteger()
									break
								case 'herbal':
									herbal = elementText.toInteger()
									break
								case 'time_stamp_3':
									timeStamp3 = elementText
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
		twelveMthSaqId(nullable: false, minSize:1, maxSize:36)
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
		spListen(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		spFeel(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		spDistant(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		spUnderstand(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		spNeglect(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		spLonely(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		behave1(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave2(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave3(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave4(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave5(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave6(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave7(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave8(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave9(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave10(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave11(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave12(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave13(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave14(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave15(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave16(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave17(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave18(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave19(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave20(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave21(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave22(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave23(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave24(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave25(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave26(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave27(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave28(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave29(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave30(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave31(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave32(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave33(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behave34(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behaviors1(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behaviors2(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behaviors3(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behaviors4(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behaviors5(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behaviors6(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behaviors7(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		behaviors8(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		breastDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		breastWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowMilkDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowMilkWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		milkOthDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		milkOthWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		breastMilk(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		breastStop(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		breastStopUnit(nullable: false, inList:[1, 2, -3, -4])
		pumped(nullable: false, inList:[1, 2, -3, -4])
		pumped2(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4])
		formula(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4, -7])
		formulaLast7(nullable: false, inList:[1, 2, -3, -4])
		water2(nullable: false, inList:[1, 2, -3, -4])
		ounces(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		bType1(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType2(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType3(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType4(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType5(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		pacifer(nullable: false, inList:[1, 2, -4])
		cowsMilk1(nullable: false, inList:[1, 2, -4])
		cowsMilk2(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cereal(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4, -7])
		pureed(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4, -7])
		tableFood(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4, -7])
		herbal(nullable: false, inList:[1, 2, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_saq'

		psuId column:'psu_id'
		twelveMthSaqId column:'twelve_mth_saq_id'
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
		spListen column:'sp_listen'
		spFeel column:'sp_feel'
		spDistant column:'sp_distant'
		spUnderstand column:'sp_understand'
		spNeglect column:'sp_neglect'
		spLonely column:'sp_lonely'
		behave1 column:'behave_1'
		behave2 column:'behave_2'
		behave3 column:'behave_3'
		behave4 column:'behave_4'
		behave5 column:'behave_5'
		behave6 column:'behave_6'
		behave7 column:'behave_7'
		behave8 column:'behave_8'
		behave9 column:'behave_9'
		behave10 column:'behave_10'
		behave11 column:'behave_11'
		behave12 column:'behave_12'
		behave13 column:'behave_13'
		behave14 column:'behave_14'
		behave15 column:'behave_15'
		behave16 column:'behave_16'
		behave17 column:'behave_17'
		behave18 column:'behave_18'
		behave19 column:'behave_19'
		behave20 column:'behave_20'
		behave21 column:'behave_21'
		behave22 column:'behave_22'
		behave23 column:'behave_23'
		behave24 column:'behave_24'
		behave25 column:'behave_25'
		behave26 column:'behave_26'
		behave27 column:'behave_27'
		behave28 column:'behave_28'
		behave29 column:'behave_29'
		behave30 column:'behave_30'
		behave31 column:'behave_31'
		behave32 column:'behave_32'
		behave33 column:'behave_33'
		behave34 column:'behave_34'
		behaviors1 column:'behaviors_1'
		behaviors2 column:'behaviors_2'
		behaviors3 column:'behaviors_3'
		behaviors4 column:'behaviors_4'
		behaviors5 column:'behaviors_5'
		behaviors6 column:'behaviors_6'
		behaviors7 column:'behaviors_7'
		behaviors8 column:'behaviors_8'
		timeStamp2 column:'time_stamp_2'
		breastDay column:'breast_day'
		breastWeek column:'breast_week'
		formulaDay column:'formula_day'
		formulaWeek column:'formula_week'
		cowMilkDay column:'cow_milk_day'
		cowMilkWeek column:'cow_milk_week'
		milkOthDay column:'milk_oth_day'
		milkOthWeek column:'milk_oth_week'
		breastMilk column:'breast_milk'
		breastStop column:'breast_stop'
		breastStopUnit column:'breast_stop_unit'
		pumped column:'pumped'
		pumped2 column:'pumped_2'
		formula column:'formula'
		formulaLast7 column:'formula_last7'
		water2 column:'water_2'
		ounces column:'ounces'
		bType1 column:'b_type1'
		bType2 column:'b_type2'
		bType3 column:'b_type3'
		bType4 column:'b_type4'
		bType5 column:'b_type5'
		pacifer column:'pacifer'
		cowsMilk1 column:'cows_milk_1'
		cowsMilk2 column:'cows_milk_2'
		cereal column:'cereal'
		pureed column:'pureed'
		tableFood column:'table_food'
		herbal column:'herbal'
		timeStamp3 column:'time_stamp_3'
		transactionType column:'transaction_type'
	}
}
