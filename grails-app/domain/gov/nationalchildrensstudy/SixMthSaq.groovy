package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class SixMthSaq {

	Integer psuId
	String sixMthSaqId
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
	Integer breastFeed
	Integer breastFeedNow
	Integer pumped
	Integer pumpedNow
	Integer breastStop
	Integer breastStopUnit
	Integer breastDay
	Integer breastWeek
	Integer formulaDay
	Integer formulaWeek
	Integer cowMilkDay
	Integer cowMilkWeek
	Integer milkOthDay
	Integer milkOthWeek
	Integer pumped2
	Integer breastMilkStored
	Integer breastMilkTemp
	Integer formula
	Integer formulaIron
	Integer formulaLabel
	Integer formulaAmt
	Integer formulaUnit
	Integer waterAmt
	Integer waterUnit
	Integer water2
	Integer ounces
	Integer cleanHands1
	Integer cleanHands2
	Integer cleanHands3
	Integer cleanHands4
	Integer cleanHands5
	Integer bType1
	Integer bType2
	Integer bType3
	Integer bType4
	Integer bType5
	Integer pacifier
	Integer cowsMilk1
	Integer cowsMilk2
	Integer cowsMilk2Unit
	Integer juice
	Integer juiceAge
	Integer juiceAgeUnit
	Integer juiceCalcium
	Integer cFood1
	Integer cFood2
	Integer cFood3
	Integer cFood4
	Integer cFood5
	Integer organic
	Integer suppForm
	Integer herbal
	String herbalOth
	String timeStamp2
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "six_mth_saq"

	public SixMthSaq(XMLStreamReader reader, boolean strict) {
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
								case 'six_mth_saq_id':
									sixMthSaqId = elementText
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
								case 'breast_feed':
									breastFeed = elementText.toInteger()
									break
								case 'breast_feed_now':
									breastFeedNow = elementText.toInteger()
									break
								case 'pumped':
									pumped = elementText.toInteger()
									break
								case 'pumped_now':
									pumpedNow = elementText.toInteger()
									break
								case 'breast_stop':
									breastStop = elementText.toInteger()
									break
								case 'breast_stop_unit':
									breastStopUnit = elementText.toInteger()
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
								case 'pumped_2':
									pumped2 = elementText.toInteger()
									break
								case 'breast_milk_stored':
									breastMilkStored = elementText.toInteger()
									break
								case 'breast_milk_temp':
									breastMilkTemp = elementText.toInteger()
									break
								case 'formula':
									formula = elementText.toInteger()
									break
								case 'formula_iron':
									formulaIron = elementText.toInteger()
									break
								case 'formula_label':
									formulaLabel = elementText.toInteger()
									break
								case 'formula_amt':
									formulaAmt = elementText.toInteger()
									break
								case 'formula_unit':
									formulaUnit = elementText.toInteger()
									break
								case 'water_amt':
									waterAmt = elementText.toInteger()
									break
								case 'water_unit':
									waterUnit = elementText.toInteger()
									break
								case 'water_2':
									water2 = elementText.toInteger()
									break
								case 'ounces':
									ounces = elementText.toInteger()
									break
								case 'clean_hands1':
									cleanHands1 = elementText.toInteger()
									break
								case 'clean_hands2':
									cleanHands2 = elementText.toInteger()
									break
								case 'clean_hands3':
									cleanHands3 = elementText.toInteger()
									break
								case 'clean_hands4':
									cleanHands4 = elementText.toInteger()
									break
								case 'clean_hands5':
									cleanHands5 = elementText.toInteger()
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
								case 'pacifier':
									pacifier = elementText.toInteger()
									break
								case 'cows_milk_1':
									cowsMilk1 = elementText.toInteger()
									break
								case 'cows_milk_2':
									cowsMilk2 = elementText.toInteger()
									break
								case 'cows_milk2_unit':
									cowsMilk2Unit = elementText.toInteger()
									break
								case 'juice':
									juice = elementText.toInteger()
									break
								case 'juice_age':
									juiceAge = elementText.toInteger()
									break
								case 'juice_age_unit':
									juiceAgeUnit = elementText.toInteger()
									break
								case 'juice_calcium':
									juiceCalcium = elementText.toInteger()
									break
								case 'c_food1':
									cFood1 = elementText.toInteger()
									break
								case 'c_food2':
									cFood2 = elementText.toInteger()
									break
								case 'c_food3':
									cFood3 = elementText.toInteger()
									break
								case 'c_food4':
									cFood4 = elementText.toInteger()
									break
								case 'c_food5':
									cFood5 = elementText.toInteger()
									break
								case 'organic':
									organic = elementText.toInteger()
									break
								case 'supp_form':
									suppForm = elementText.toInteger()
									break
								case 'herbal':
									herbal = elementText.toInteger()
									break
								case 'herbal_oth':
									herbalOth = elementText
									break
								case 'time_stamp_2':
									timeStamp2 = elementText
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
		sixMthSaqId(nullable: false, minSize:1, maxSize:36)
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
		breastFeed(nullable: false, inList:[1, 2, -1, -2, -4])
		breastFeedNow(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		pumped(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		pumpedNow(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		breastStop(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		breastStopUnit(nullable: false, inList:[1, 2, -7, -3, -4])
		breastDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		breastWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowMilkDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowMilkWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		milkOthDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		milkOthWeek(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pumped2(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4, -7])
		breastMilkStored(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4, -7])
		breastMilkTemp(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4, -7])
		formula(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4, -7])
		formulaIron(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		formulaLabel(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		formulaAmt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		formulaUnit(nullable: false, inList:[1, 2, 3, 4, 5, 6, -3, -4])
		waterAmt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		waterUnit(nullable: false, inList:[1, 2, 3, -3, -4])
		water2(nullable: false, inList:[1, 2, -3, -4])
		ounces(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cleanHands1(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cleanHands2(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cleanHands3(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cleanHands4(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cleanHands5(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType1(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType2(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType3(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType4(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		bType5(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		pacifier(nullable: false, inList:[1, 2, -1, -2, -4])
		cowsMilk1(nullable: false, inList:[1, 2, -4])
		cowsMilk2(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cowsMilk2Unit(nullable: false, inList:[1, 2, -3, -4])
		juice(nullable: false, inList:[1, 2, -4])
		juiceAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		juiceAgeUnit(nullable: false, inList:[1, 2, -3, -4])
		juiceCalcium(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cFood1(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4, -7])
		cFood2(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4, -7])
		cFood3(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4, -7])
		cFood4(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4, -7])
		cFood5(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4, -7])
		organic(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		suppForm(nullable: false, inList:[1, 2, -3, -4])
		herbal(nullable: false, inList:[1, 2, -4])
		herbalOth(nullable: true, maxSize:255)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'six_mth_saq'

		psuId column:'psu_id'
		sixMthSaqId column:'six_mth_saq_id'
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
		breastFeed column:'breast_feed'
		breastFeedNow column:'breast_feed_now'
		pumped column:'pumped'
		pumpedNow column:'pumped_now'
		breastStop column:'breast_stop'
		breastStopUnit column:'breast_stop_unit'
		breastDay column:'breast_day'
		breastWeek column:'breast_week'
		formulaDay column:'formula_day'
		formulaWeek column:'formula_week'
		cowMilkDay column:'cow_milk_day'
		cowMilkWeek column:'cow_milk_week'
		milkOthDay column:'milk_oth_day'
		milkOthWeek column:'milk_oth_week'
		pumped2 column:'pumped_2'
		breastMilkStored column:'breast_milk_stored'
		breastMilkTemp column:'breast_milk_temp'
		formula column:'formula'
		formulaIron column:'formula_iron'
		formulaLabel column:'formula_label'
		formulaAmt column:'formula_amt'
		formulaUnit column:'formula_unit'
		waterAmt column:'water_amt'
		waterUnit column:'water_unit'
		water2 column:'water_2'
		ounces column:'ounces'
		cleanHands1 column:'clean_hands1'
		cleanHands2 column:'clean_hands2'
		cleanHands3 column:'clean_hands3'
		cleanHands4 column:'clean_hands4'
		cleanHands5 column:'clean_hands5'
		bType1 column:'b_type1'
		bType2 column:'b_type2'
		bType3 column:'b_type3'
		bType4 column:'b_type4'
		bType5 column:'b_type5'
		pacifier column:'pacifier'
		cowsMilk1 column:'cows_milk_1'
		cowsMilk2 column:'cows_milk_2'
		cowsMilk2Unit column:'cows_milk2_unit'
		juice column:'juice'
		juiceAge column:'juice_age'
		juiceAgeUnit column:'juice_age_unit'
		juiceCalcium column:'juice_calcium'
		cFood1 column:'c_food1'
		cFood2 column:'c_food2'
		cFood3 column:'c_food3'
		cFood4 column:'c_food4'
		cFood5 column:'c_food5'
		organic column:'organic'
		suppForm column:'supp_form'
		herbal column:'herbal'
		herbalOth column:'herbal_oth'
		timeStamp2 column:'time_stamp_2'
		transactionType column:'transaction_type'
	}
}
