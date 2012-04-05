package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class Institution {

	Integer psuId
	String instituteId
	Integer instituteType
	String instituteName
	String instituteTypeOth
	Integer instituteRelation
	String instituteRelationOth
	Integer instituteOwner
	String instituteOwnerOth
	Integer instituteSize
	Integer instituteUnit
	String instituteUnitOth
	Integer instituteInfoSource
	String instituteInfoSourceOth
	String instituteInfoDate
	String instituteInfoUpdate
	String instituteComment
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "institution"

	public Institution(XMLStreamReader reader, boolean strict) {
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
								case 'institute_id':
									instituteId = elementText
									break
								case 'institute_type':
									instituteType = elementText.toInteger()
									break
								case 'institute_name':
									instituteName = elementText
									break
								case 'institute_type_oth':
									instituteTypeOth = elementText
									break
								case 'institute_relation':
									instituteRelation = elementText.toInteger()
									break
								case 'institute_relation_oth':
									instituteRelationOth = elementText
									break
								case 'institute_owner':
									instituteOwner = elementText.toInteger()
									break
								case 'institute_owner_oth':
									instituteOwnerOth = elementText
									break
								case 'institute_size':
									instituteSize = elementText.toInteger()
									break
								case 'institute_unit':
									instituteUnit = elementText.toInteger()
									break
								case 'institute_unit_oth':
									instituteUnitOth = elementText
									break
								case 'institute_info_source':
									instituteInfoSource = elementText.toInteger()
									break
								case 'institute_info_source_oth':
									instituteInfoSourceOth = elementText
									break
								case 'institute_info_date':
									instituteInfoDate = elementText
									break
								case 'institute_info_update':
									instituteInfoUpdate = elementText
									break
								case 'institute_comment':
									instituteComment = elementText
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
		instituteId(nullable: false, minSize:1, maxSize:36)
		instituteType(nullable: false, inList:[1, 2, 3, 4, -5, -4])
		instituteName(nullable: true, maxSize:255)
		instituteTypeOth(nullable: true, maxSize:255)
		instituteRelation(nullable: true, inList:[1, 2, 3, -5, -4])
		instituteRelationOth(nullable: true, maxSize:255)
		instituteOwner(nullable: false, inList:[1, 2, -5, -4])
		instituteOwnerOth(nullable: true, maxSize:255)
		instituteSize(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instituteUnit(nullable: false, inList:[1, 2, 3, -5, -4])
		instituteUnitOth(nullable: true, maxSize:255)
		instituteInfoSource(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -5, -4])
		instituteInfoSourceOth(nullable: true, maxSize:255)
		instituteInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		instituteInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		instituteComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'institution'

		psuId column:'psu_id'
		instituteId column:'institute_id'
		instituteType column:'institute_type'
		instituteName column:'institute_name'
		instituteTypeOth column:'institute_type_oth'
		instituteRelation column:'institute_relation'
		instituteRelationOth column:'institute_relation_oth'
		instituteOwner column:'institute_owner'
		instituteOwnerOth column:'institute_owner_oth'
		instituteSize column:'institute_size'
		instituteUnit column:'institute_unit'
		instituteUnitOth column:'institute_unit_oth'
		instituteInfoSource column:'institute_info_source'
		instituteInfoSourceOth column:'institute_info_source_oth'
		instituteInfoDate column:'institute_info_date'
		instituteInfoUpdate column:'institute_info_update'
		instituteComment column:'institute_comment'
		transactionType column:'transaction_type'
	}
}
