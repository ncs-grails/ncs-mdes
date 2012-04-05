package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class TapWaterTwqSaq {

	Integer psuId
	String tapWaterTwqSaqId
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
	Integer pTwqNCollect
	Integer pTwq1Collected
	String pTwq1CollectedOth
	Integer pTwq0Collected
	String pTwq0CollectedOth
	String pTwqBottle1Id
	String pTwqBottle2Id
	String pTwqDate
	Integer pTwqDay
	Integer pTwqLocation
	String pTwqLocationOth
	Integer pTwqFiltered
	Integer pTwqOwnHh
	Integer pTwqInsecticide
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "tap_water_twq_saq"

	public TapWaterTwqSaq(XMLStreamReader reader, boolean strict) {
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
								case 'tap_water_twq_saq_id':
									tapWaterTwqSaqId = elementText
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
								case 'p_twq_n_collect':
									pTwqNCollect = elementText.toInteger()
									break
								case 'p_twq_1_collected':
									pTwq1Collected = elementText.toInteger()
									break
								case 'p_twq_1_collected_oth':
									pTwq1CollectedOth = elementText
									break
								case 'p_twq_0_collected':
									pTwq0Collected = elementText.toInteger()
									break
								case 'p_twq_0_collected_oth':
									pTwq0CollectedOth = elementText
									break
								case 'p_twq_bottle_1_id':
									pTwqBottle1Id = elementText
									break
								case 'p_twq_bottle_2_id':
									pTwqBottle2Id = elementText
									break
								case 'p_twq_date':
									pTwqDate = elementText
									break
								case 'p_twq_day':
									pTwqDay = elementText.toInteger()
									break
								case 'p_twq_location':
									pTwqLocation = elementText.toInteger()
									break
								case 'p_twq_location_oth':
									pTwqLocationOth = elementText
									break
								case 'p_twq_filtered':
									pTwqFiltered = elementText.toInteger()
									break
								case 'p_twq_own_hh':
									pTwqOwnHh = elementText.toInteger()
									break
								case 'p_twq_insecticide':
									pTwqInsecticide = elementText.toInteger()
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
		tapWaterTwqSaqId(nullable: false, minSize:1, maxSize:36)
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
		pTwqNCollect(nullable: false, inList:[1, null, null, -4])
		pTwq1Collected(nullable: false, inList:[1, 2, 3, -5, -4])
		pTwq1CollectedOth(nullable: true, maxSize:255)
		pTwq0Collected(nullable: false, inList:[1, 2, 3, 4, -5, -4])
		pTwq0CollectedOth(nullable: true, maxSize:255)
		pTwqBottle1Id(nullable: true, maxSize:14)
		pTwqBottle2Id(nullable: true, maxSize:14)
		pTwqDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		pTwqDay(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -4])
		pTwqLocation(nullable: false, inList:[1, 2, 3, -5, -1, -2, -4])
		pTwqLocationOth(nullable: true, maxSize:255)
		pTwqFiltered(nullable: false, inList:[1, 2, -1, -2, -4])
		pTwqOwnHh(nullable: false, inList:[1, 2, -1, -2, -4])
		pTwqInsecticide(nullable: false, inList:[1, 2, -1, -2, -4])
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twq_saq'

		psuId column:'psu_id'
		tapWaterTwqSaqId column:'tap_water_twq_saq_id'
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
		pTwqNCollect column:'p_twq_n_collect'
		pTwq1Collected column:'p_twq_1_collected'
		pTwq1CollectedOth column:'p_twq_1_collected_oth'
		pTwq0Collected column:'p_twq_0_collected'
		pTwq0CollectedOth column:'p_twq_0_collected_oth'
		pTwqBottle1Id column:'p_twq_bottle_1_id'
		pTwqBottle2Id column:'p_twq_bottle_2_id'
		pTwqDate column:'p_twq_date'
		pTwqDay column:'p_twq_day'
		pTwqLocation column:'p_twq_location'
		pTwqLocationOth column:'p_twq_location_oth'
		pTwqFiltered column:'p_twq_filtered'
		pTwqOwnHh column:'p_twq_own_hh'
		pTwqInsecticide column:'p_twq_insecticide'
		transactionType column:'transaction_type'
	}
}
