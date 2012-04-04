package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class Address {

	Integer psuId
	String addressId
	String personId
	String instituteId
	String providerId
	String duId
	Integer addressRank
	String addressRankOth
	Integer addressInfoSource
	String addressInfoSourceOth
	Integer addressInfoMode
	String addressInfoModeOth
	String addressInfoDate
	String addressInfoUpdate
	String addressStartDate
	String addressEndDate
	Integer addressType
	String addressTypeOth
	Integer addressDescription
	String addressDescriptionOth
	String address1
	String address2
	String unit
	String city
	Integer state
	String zip
	String zip4
	String addressComment
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "address"

	public Address(XMLStreamReader reader, boolean strict) {
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
								case 'address_id':
									addressId = elementText
									break
								case 'person_id':
									personId = elementText
									break
								case 'institute_id':
									instituteId = elementText
									break
								case 'provider_id':
									providerId = elementText
									break
								case 'du_id':
									duId = elementText
									break
								case 'address_rank':
									addressRank = elementText.toInteger()
									break
								case 'address_rank_oth':
									addressRankOth = elementText
									break
								case 'address_info_source':
									addressInfoSource = elementText.toInteger()
									break
								case 'address_info_source_oth':
									addressInfoSourceOth = elementText
									break
								case 'address_info_mode':
									addressInfoMode = elementText.toInteger()
									break
								case 'address_info_mode_oth':
									addressInfoModeOth = elementText
									break
								case 'address_info_date':
									addressInfoDate = elementText
									break
								case 'address_info_update':
									addressInfoUpdate = elementText
									break
								case 'address_start_date':
									addressStartDate = elementText
									break
								case 'address_end_date':
									addressEndDate = elementText
									break
								case 'address_type':
									addressType = elementText.toInteger()
									break
								case 'address_type_oth':
									addressTypeOth = elementText
									break
								case 'address_description':
									addressDescription = elementText.toInteger()
									break
								case 'address_description_oth':
									addressDescriptionOth = elementText
									break
								case 'address_1':
									address1 = elementText
									break
								case 'address_2':
									address2 = elementText
									break
								case 'unit':
									unit = elementText
									break
								case 'city':
									city = elementText
									break
								case 'state':
									state = elementText.toInteger()
									break
								case 'zip':
									zip = elementText
									break
								case 'zip4':
									zip4 = elementText
									break
								case 'address_comment':
									addressComment = elementText
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
		addressId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: true, maxSize:36)
		instituteId(nullable: true, maxSize:36)
		providerId(nullable: true, maxSize:36)
		duId(nullable: true, maxSize:36)
		addressRank(nullable: false, inList:[1, 2, 3, 4, -5, -4])
		addressRankOth(nullable: true, maxSize:255)
		addressInfoSource(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, -5, -4])
		addressInfoSourceOth(nullable: true, maxSize:255)
		addressInfoMode(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -4])
		addressInfoModeOth(nullable: true, maxSize:255)
		addressInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		addressInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		addressStartDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		addressEndDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		addressType(nullable: false, inList:[1, 2, 3, 4, 5, -5, -6, -4])
		addressTypeOth(nullable: true, maxSize:255)
		addressDescription(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -6, -5, -4])
		addressDescriptionOth(nullable: true, maxSize:255)
		address1(nullable: true, maxSize:100)
		address2(nullable: true, maxSize:100)
		unit(nullable: true, maxSize:10)
		city(nullable: true, maxSize:50)
		state(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -6, -4])
		zip(nullable: true, maxSize:5)
		zip4(nullable: true, maxSize:4)
		addressComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'address'

		psuId column:'psu_id'
		addressId column:'address_id'
		personId column:'person_id'
		instituteId column:'institute_id'
		providerId column:'provider_id'
		duId column:'du_id'
		addressRank column:'address_rank'
		addressRankOth column:'address_rank_oth'
		addressInfoSource column:'address_info_source'
		addressInfoSourceOth column:'address_info_source_oth'
		addressInfoMode column:'address_info_mode'
		addressInfoModeOth column:'address_info_mode_oth'
		addressInfoDate column:'address_info_date'
		addressInfoUpdate column:'address_info_update'
		addressStartDate column:'address_start_date'
		addressEndDate column:'address_end_date'
		addressType column:'address_type'
		addressTypeOth column:'address_type_oth'
		addressDescription column:'address_description'
		addressDescriptionOth column:'address_description_oth'
		address1 column:'address_1'
		address2 column:'address_2'
		unit column:'unit'
		city column:'city'
		state column:'state'
		zip column:'zip'
		zip4 column:'zip4'
		addressComment column:'address_comment'
		transactionType column:'transaction_type'
	}
}
