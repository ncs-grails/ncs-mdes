package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class StudyCenter {

	Integer scId
	String scName
	String comments
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "study_center"

	public StudyCenter(XMLStreamReader reader, boolean strict) {
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

								case 'sc_id':
									scId = elementText.toInteger()
									break
								case 'sc_name':
									scName = elementText
									break
								case 'comments':
									comments = elementText
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

		scId(nullable: false, inList:[20000013, 20000015, 20000019, 20000022, 20000024, 20000026, 20000029, 20000031, 20000033, 20000036, 20000038, 20000041, 20000043, 20000047, 20000049, 20000051, 20000053, 20000056, 20000059, 20000061, 20000064, 20000066, 20000068, 20000071, 20000073, 20000074, 20000075, 20000076, 20000077, 20000078, 20000080, 20000081, 20000082, 20000120, 20000121, 20000122, -4, 20000000])
		scName(nullable: true, maxSize:100)
		comments(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'study_center'

		scId column:'sc_id'
		scName column:'sc_name'
		comments column:'comments'
		transactionType column:'transaction_type'
	}
}
