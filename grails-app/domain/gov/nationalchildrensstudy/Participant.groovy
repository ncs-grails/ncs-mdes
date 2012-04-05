package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class Participant {

	Integer psuId
	String pId
	Integer pType
	String pTypeOth
	Integer statusInfoSource
	String statusInfoSourceOth
	Integer statusInfoMode
	String statusInfoModeOth
	String statusInfoDate
	Integer enrollStatus
	String enrollDate
	Integer pidEntry
	String pidEntryOther
	Integer pidAgeElig
	String pidComment
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "participant"

	public Participant(XMLStreamReader reader, boolean strict) {
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
								case 'p_id':
									pId = elementText
									break
								case 'p_type':
									pType = elementText.toInteger()
									break
								case 'p_type_oth':
									pTypeOth = elementText
									break
								case 'status_info_source':
									statusInfoSource = elementText.toInteger()
									break
								case 'status_info_source_oth':
									statusInfoSourceOth = elementText
									break
								case 'status_info_mode':
									statusInfoMode = elementText.toInteger()
									break
								case 'status_info_mode_oth':
									statusInfoModeOth = elementText
									break
								case 'status_info_date':
									statusInfoDate = elementText
									break
								case 'enroll_status':
									enrollStatus = elementText.toInteger()
									break
								case 'enroll_date':
									enrollDate = elementText
									break
								case 'pid_entry':
									pidEntry = elementText.toInteger()
									break
								case 'pid_entry_other':
									pidEntryOther = elementText
									break
								case 'pid_age_elig':
									pidAgeElig = elementText.toInteger()
									break
								case 'pid_comment':
									pidComment = elementText
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
		pId(nullable: false, minSize:1, maxSize:36)
		pType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, -5, -4])
		pTypeOth(nullable: true, maxSize:255)
		statusInfoSource(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, -5, -4])
		statusInfoSourceOth(nullable: true, maxSize:255)
		statusInfoMode(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -4])
		statusInfoModeOth(nullable: true, maxSize:255)
		statusInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		enrollStatus(nullable: false, inList:[1, 2, -4])
		enrollDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		pidEntry(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, -5, -4])
		pidEntryOther(nullable: true, maxSize:255)
		pidAgeElig(nullable: false, inList:[1, 2, 3, -6, -7, -4])
		pidComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'participant'

		psuId column:'psu_id'
		pId column:'p_id'
		pType column:'p_type'
		pTypeOth column:'p_type_oth'
		statusInfoSource column:'status_info_source'
		statusInfoSourceOth column:'status_info_source_oth'
		statusInfoMode column:'status_info_mode'
		statusInfoModeOth column:'status_info_mode_oth'
		statusInfoDate column:'status_info_date'
		enrollStatus column:'enroll_status'
		enrollDate column:'enroll_date'
		pidEntry column:'pid_entry'
		pidEntryOther column:'pid_entry_other'
		pidAgeElig column:'pid_age_elig'
		pidComment column:'pid_comment'
		transactionType column:'transaction_type'
	}
}
