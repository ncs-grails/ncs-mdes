package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class Provider {

	Integer psuId
	String providerId
	Integer providerType
	String providerTypeOth
	Integer providerNcsRole
	String providerNcsRoleOth
	Integer practiceInfo
	Integer practicePatientLoad
	Integer practiceSize
	Integer publicPractice
	Integer providerInfoSource
	String providerInfoSourceOth
	String providerInfoDate
	String providerInfoUpdate
	String providerComment
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "provider"

	public Provider(XMLStreamReader reader, boolean strict) {
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
								case 'provider_id':
									providerId = elementText
									break
								case 'provider_type':
									providerType = elementText.toInteger()
									break
								case 'provider_type_oth':
									providerTypeOth = elementText
									break
								case 'provider_ncs_role':
									providerNcsRole = elementText.toInteger()
									break
								case 'provider_ncs_role_oth':
									providerNcsRoleOth = elementText
									break
								case 'practice_info':
									practiceInfo = elementText.toInteger()
									break
								case 'practice_patient_load':
									practicePatientLoad = elementText.toInteger()
									break
								case 'practice_size':
									practiceSize = elementText.toInteger()
									break
								case 'public_practice':
									publicPractice = elementText.toInteger()
									break
								case 'provider_info_source':
									providerInfoSource = elementText.toInteger()
									break
								case 'provider_info_source_oth':
									providerInfoSourceOth = elementText
									break
								case 'provider_info_date':
									providerInfoDate = elementText
									break
								case 'provider_info_update':
									providerInfoUpdate = elementText
									break
								case 'provider_comment':
									providerComment = elementText
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
		providerId(nullable: false, minSize:1, maxSize:36)
		providerType(nullable: false, inList:[1, 2, 3, 4, -5, -4])
		providerTypeOth(nullable: true, maxSize:255)
		providerNcsRole(nullable: true, inList:[1, 2, 3, 4, 5, 6, 7, -5, -4])
		providerNcsRoleOth(nullable: true, maxSize:255)
		practiceInfo(nullable: false, inList:[1, 2, -4])
		practicePatientLoad(nullable: false, inList:[1, 2, 3, 4, 5, -4])
		practiceSize(nullable: false, inList:[1, 2, 3, 4, 5, 6, -4])
		publicPractice(nullable: false, inList:[1, 2, -4])
		providerInfoSource(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -5, -4])
		providerInfoSourceOth(nullable: true, maxSize:255)
		providerInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		providerInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		providerComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'provider'

		psuId column:'psu_id'
		providerId column:'provider_id'
		providerType column:'provider_type'
		providerTypeOth column:'provider_type_oth'
		providerNcsRole column:'provider_ncs_role'
		providerNcsRoleOth column:'provider_ncs_role_oth'
		practiceInfo column:'practice_info'
		practicePatientLoad column:'practice_patient_load'
		practiceSize column:'practice_size'
		publicPractice column:'public_practice'
		providerInfoSource column:'provider_info_source'
		providerInfoSourceOth column:'provider_info_source_oth'
		providerInfoDate column:'provider_info_date'
		providerInfoUpdate column:'provider_info_update'
		providerComment column:'provider_comment'
		transactionType column:'transaction_type'
	}
}
