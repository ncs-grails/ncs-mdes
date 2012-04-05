package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class SpecUrine {

	Integer psuId
	String specUrineId
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
	String timeStamp1
	Integer urineIntro
	String ltUrine1
	String ltUrine2
	Integer ltUrine3
	String ltEatDrink1
	String ltEatDrink2
	Integer ltEatDrink3
	Integer ateMeat
	Integer creatineSupp
	Integer specimenStatus
	Integer specimenComments
	String specimenCommentOth
	String specimenId
	Integer collectionLocation
	Integer urCollDifficult
	String urCollEasierComment
	String timeStamp2
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "spec_urine"

	public SpecUrine(XMLStreamReader reader, boolean strict) {
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
								case 'spec_urine_id':
									specUrineId = elementText
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
								case 'time_stamp_1':
									timeStamp1 = elementText
									break
								case 'urine_intro':
									urineIntro = elementText.toInteger()
									break
								case 'lt_urine_1':
									ltUrine1 = elementText
									break
								case 'lt_urine_2':
									ltUrine2 = elementText
									break
								case 'lt_urine_3':
									ltUrine3 = elementText.toInteger()
									break
								case 'lt_eat_drink_1':
									ltEatDrink1 = elementText
									break
								case 'lt_eat_drink_2':
									ltEatDrink2 = elementText
									break
								case 'lt_eat_drink_3':
									ltEatDrink3 = elementText.toInteger()
									break
								case 'ate_meat':
									ateMeat = elementText.toInteger()
									break
								case 'creatine_supp':
									creatineSupp = elementText.toInteger()
									break
								case 'specimen_status':
									specimenStatus = elementText.toInteger()
									break
								case 'specimen_comments':
									specimenComments = elementText.toInteger()
									break
								case 'specimen_comment_oth':
									specimenCommentOth = elementText
									break
								case 'specimen_id':
									specimenId = elementText
									break
								case 'collection_location':
									collectionLocation = elementText.toInteger()
									break
								case 'ur_coll_difficult':
									urCollDifficult = elementText.toInteger()
									break
								case 'ur_coll_easier_comment':
									urCollEasierComment = elementText
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
		specUrineId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: true, maxSize:36)
		hhId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: true, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		urineIntro(nullable: false, inList:[1, -1, -4])
		ltUrine1(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		ltUrine2(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		ltUrine3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		ltEatDrink1(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		ltEatDrink2(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		ltEatDrink3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		ateMeat(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4])
		creatineSupp(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		specimenStatus(nullable: false, inList:[1, 2, -3, -4])
		specimenComments(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, -5, -1, -2, -3, -4])
		specimenCommentOth(nullable: true, maxSize:255)
		specimenId(nullable: false, minSize:1, maxSize:36)
		collectionLocation(nullable: false, inList:[1, 2, 3, -3, -4])
		urCollDifficult(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		urCollEasierComment(nullable: true, maxSize:255)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_urine'

		psuId column:'psu_id'
		specUrineId column:'spec_urine_id'
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
		urineIntro column:'urine_intro'
		ltUrine1 column:'lt_urine_1'
		ltUrine2 column:'lt_urine_2'
		ltUrine3 column:'lt_urine_3'
		ltEatDrink1 column:'lt_eat_drink_1'
		ltEatDrink2 column:'lt_eat_drink_2'
		ltEatDrink3 column:'lt_eat_drink_3'
		ateMeat column:'ate_meat'
		creatineSupp column:'creatine_supp'
		specimenStatus column:'specimen_status'
		specimenComments column:'specimen_comments'
		specimenCommentOth column:'specimen_comment_oth'
		specimenId column:'specimen_id'
		collectionLocation column:'collection_location'
		urCollDifficult column:'ur_coll_difficult'
		urCollEasierComment column:'ur_coll_easier_comment'
		timeStamp2 column:'time_stamp_2'
		transactionType column:'transaction_type'
	}
}
