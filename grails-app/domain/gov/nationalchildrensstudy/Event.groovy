package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class Event {

	Integer psuId
	String eventId
	String participantId
	Integer eventType
	String eventTypeOth
	Integer eventRepeatKey
	Integer eventDisp
	Integer eventDispCat
	String eventStartDate
	String eventStartTime
	String eventEndDate
	String eventEndTime
	Integer eventBreakoff
	Integer eventIncentiveType
	BigDecimal eventIncentCash
	String eventIncentNoncash
	String eventComment
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "event"

	public Event(XMLStreamReader reader, boolean strict) {
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
								case 'event_id':
									eventId = elementText
									break
								case 'participant_id':
									participantId = elementText
									break
								case 'event_type':
									eventType = elementText.toInteger()
									break
								case 'event_type_oth':
									eventTypeOth = elementText
									break
								case 'event_repeat_key':
									eventRepeatKey = elementText.toInteger()
									break
								case 'event_disp':
									eventDisp = elementText.toInteger()
									break
								case 'event_disp_cat':
									eventDispCat = elementText.toInteger()
									break
								case 'event_start_date':
									eventStartDate = elementText
									break
								case 'event_start_time':
									eventStartTime = elementText
									break
								case 'event_end_date':
									eventEndDate = elementText
									break
								case 'event_end_time':
									eventEndTime = elementText
									break
								case 'event_breakoff':
									eventBreakoff = elementText.toInteger()
									break
								case 'event_incentive_type':
									eventIncentiveType = elementText.toInteger()
									break
								case 'event_incent_cash':
									eventIncentCash = elementText.toBigDecimal()
									break
								case 'event_incent_noncash':
									eventIncentNoncash = elementText
									break
								case 'event_comment':
									eventComment = elementText
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
		eventId(nullable: false, minSize:1, maxSize:36)
		participantId(nullable: true, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventTypeOth(nullable: true, maxSize:255)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		eventDisp(nullable: false)
		eventDispCat(nullable: false, inList:[1, 2, 3, 4, 5, 6, -4])
		eventStartDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		eventStartTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		eventEndDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		eventEndTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		eventBreakoff(nullable: false, inList:[1, 2, -4])
		eventIncentiveType(nullable: false, inList:[1, 2, 3, 4, -4])
		eventIncentCash(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		eventIncentNoncash(nullable: true, maxSize:255)
		eventComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'event'

		psuId column:'psu_id'
		eventId column:'event_id'
		participantId column:'participant_id'
		eventType column:'event_type'
		eventTypeOth column:'event_type_oth'
		eventRepeatKey column:'event_repeat_key'
		eventDisp column:'event_disp'
		eventDispCat column:'event_disp_cat'
		eventStartDate column:'event_start_date'
		eventStartTime column:'event_start_time'
		eventEndDate column:'event_end_date'
		eventEndTime column:'event_end_time'
		eventBreakoff column:'event_breakoff'
		eventIncentiveType column:'event_incentive_type'
		eventIncentCash column:'event_incent_cash'
		eventIncentNoncash column:'event_incent_noncash'
		eventComment column:'event_comment'
		transactionType column:'transaction_type'
	}
}
