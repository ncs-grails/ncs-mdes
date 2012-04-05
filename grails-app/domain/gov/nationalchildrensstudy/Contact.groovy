package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class Contact {

	Integer psuId
	String contactId
	Integer contactDisp
	Integer contactType
	String contactTypeOth
	String contactDate
	String contactStartTime
	String contactEndTime
	Integer contactLang
	String contactLangOth
	Integer contactInterpret
	String contactInterpretOth
	Integer contactLocation
	String contactLocationOth
	Integer contactPrivate
	String contactPrivateDetail
	BigDecimal contactDistance
	Integer whoContacted
	String whoContactOth
	String contactComment
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "contact"

	public Contact(XMLStreamReader reader, boolean strict) {
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
								case 'contact_id':
									contactId = elementText
									break
								case 'contact_disp':
									contactDisp = elementText.toInteger()
									break
								case 'contact_type':
									contactType = elementText.toInteger()
									break
								case 'contact_type_oth':
									contactTypeOth = elementText
									break
								case 'contact_date':
									contactDate = elementText
									break
								case 'contact_start_time':
									contactStartTime = elementText
									break
								case 'contact_end_time':
									contactEndTime = elementText
									break
								case 'contact_lang':
									contactLang = elementText.toInteger()
									break
								case 'contact_lang_oth':
									contactLangOth = elementText
									break
								case 'contact_interpret':
									contactInterpret = elementText.toInteger()
									break
								case 'contact_interpret_oth':
									contactInterpretOth = elementText
									break
								case 'contact_location':
									contactLocation = elementText.toInteger()
									break
								case 'contact_location_oth':
									contactLocationOth = elementText
									break
								case 'contact_private':
									contactPrivate = elementText.toInteger()
									break
								case 'contact_private_detail':
									contactPrivateDetail = elementText
									break
								case 'contact_distance':
									contactDistance = elementText.toBigDecimal()
									break
								case 'who_contacted':
									whoContacted = elementText.toInteger()
									break
								case 'who_contact_oth':
									whoContactOth = elementText
									break
								case 'contact_comment':
									contactComment = elementText
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
		contactId(nullable: false, minSize:1, maxSize:36)
		contactDisp(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		contactType(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -4])
		contactTypeOth(nullable: true, maxSize:255)
		contactDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		contactStartTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		contactEndTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		contactLang(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, -1, -5, -6, -4])
		contactLangOth(nullable: true, maxSize:255)
		contactInterpret(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -3, -4])
		contactInterpretOth(nullable: true, maxSize:255)
		contactLocation(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -4])
		contactLocationOth(nullable: true, maxSize:255)
		contactPrivate(nullable: false, inList:[1, 2, -4])
		contactPrivateDetail(nullable: true, maxSize:255)
		contactDistance(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		whoContacted(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, -4])
		whoContactOth(nullable: true, maxSize:255)
		contactComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'contact'

		psuId column:'psu_id'
		contactId column:'contact_id'
		contactDisp column:'contact_disp'
		contactType column:'contact_type'
		contactTypeOth column:'contact_type_oth'
		contactDate column:'contact_date'
		contactStartTime column:'contact_start_time'
		contactEndTime column:'contact_end_time'
		contactLang column:'contact_lang'
		contactLangOth column:'contact_lang_oth'
		contactInterpret column:'contact_interpret'
		contactInterpretOth column:'contact_interpret_oth'
		contactLocation column:'contact_location'
		contactLocationOth column:'contact_location_oth'
		contactPrivate column:'contact_private'
		contactPrivateDetail column:'contact_private_detail'
		contactDistance column:'contact_distance'
		whoContacted column:'who_contacted'
		whoContactOth column:'who_contact_oth'
		contactComment column:'contact_comment'
		transactionType column:'transaction_type'
	}
}
