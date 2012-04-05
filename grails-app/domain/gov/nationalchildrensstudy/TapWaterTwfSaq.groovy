package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class TapWaterTwfSaq {

	Integer psuId
	String tapWaterTwfSaqId
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
	Integer pTwfNCollect
	Integer pTwf2Collected
	String pTwf2CollectedOth
	Integer pTwf0Collected
	String pTwf0CollectedOth
	String pTwfBottle1Id
	String pTwfBottle2Id
	String pTwfBottle3Id
	String pTwfDate
	Integer pTwfDay
	Integer pTwfLocation
	String pTwfLocationOth
	Integer pTwfFiltered
	Integer pTwfOwnHh
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "tap_water_twf_saq"

	public TapWaterTwfSaq(XMLStreamReader reader, boolean strict) {
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
								case 'tap_water_twf_saq_id':
									tapWaterTwfSaqId = elementText
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
								case 'p_twf_n_collect':
									pTwfNCollect = elementText.toInteger()
									break
								case 'p_twf_2_collected':
									pTwf2Collected = elementText.toInteger()
									break
								case 'p_twf_2_collected_oth':
									pTwf2CollectedOth = elementText
									break
								case 'p_twf_0_collected':
									pTwf0Collected = elementText.toInteger()
									break
								case 'p_twf_0_collected_oth':
									pTwf0CollectedOth = elementText
									break
								case 'p_twf_bottle_1_id':
									pTwfBottle1Id = elementText
									break
								case 'p_twf_bottle_2_id':
									pTwfBottle2Id = elementText
									break
								case 'p_twf_bottle_3_id':
									pTwfBottle3Id = elementText
									break
								case 'p_twf_date':
									pTwfDate = elementText
									break
								case 'p_twf_day':
									pTwfDay = elementText.toInteger()
									break
								case 'p_twf_location':
									pTwfLocation = elementText.toInteger()
									break
								case 'p_twf_location_oth':
									pTwfLocationOth = elementText
									break
								case 'p_twf_filtered':
									pTwfFiltered = elementText.toInteger()
									break
								case 'p_twf_own_hh':
									pTwfOwnHh = elementText.toInteger()
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
		tapWaterTwfSaqId(nullable: false, minSize:1, maxSize:36)
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
		pTwfNCollect(nullable: false, inList:[1, null, null, null, -4])
		pTwf2Collected(nullable: false, inList:[1, 2, 3, -5, -4])
		pTwf2CollectedOth(nullable: true, maxSize:255)
		pTwf0Collected(nullable: false, inList:[1, 2, 3, 4, -5, -4])
		pTwf0CollectedOth(nullable: true, maxSize:255)
		pTwfBottle1Id(nullable: true, maxSize:14)
		pTwfBottle2Id(nullable: true, maxSize:14)
		pTwfBottle3Id(nullable: true, maxSize:14)
		pTwfDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		pTwfDay(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -4])
		pTwfLocation(nullable: false, inList:[1, 2, 3, -5, -1, -2, -4])
		pTwfLocationOth(nullable: true, maxSize:255)
		pTwfFiltered(nullable: false, inList:[1, 2, -1, -2, -4])
		pTwfOwnHh(nullable: false, inList:[1, 2, -1, -2, -4])
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tap_water_twf_saq'

		psuId column:'psu_id'
		tapWaterTwfSaqId column:'tap_water_twf_saq_id'
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
		pTwfNCollect column:'p_twf_n_collect'
		pTwf2Collected column:'p_twf_2_collected'
		pTwf2CollectedOth column:'p_twf_2_collected_oth'
		pTwf0Collected column:'p_twf_0_collected'
		pTwf0CollectedOth column:'p_twf_0_collected_oth'
		pTwfBottle1Id column:'p_twf_bottle_1_id'
		pTwfBottle2Id column:'p_twf_bottle_2_id'
		pTwfBottle3Id column:'p_twf_bottle_3_id'
		pTwfDate column:'p_twf_date'
		pTwfDay column:'p_twf_day'
		pTwfLocation column:'p_twf_location'
		pTwfLocationOth column:'p_twf_location_oth'
		pTwfFiltered column:'p_twf_filtered'
		pTwfOwnHh column:'p_twf_own_hh'
		transactionType column:'transaction_type'
	}
}
