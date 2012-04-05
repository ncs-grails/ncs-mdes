package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class NonInterviewRpt {

	Integer psuId
	String nirId
	String contactId
	String nir
	String duId
	String personId
	Integer nirVacInfo
	String nirVacInfoOth
	Integer nirNoaccess
	String nirNoaccessOth
	Integer nirAccessAttempt
	String nirAccessAttemptOth
	Integer nirTypePerson
	String nirTypePersonOth
	Integer cogInformRelation
	String cogInformRelationOth
	String cogDisDesc
	Integer permDisability
	Integer deceasedInformRelation
	String deceasedInformOth
	Integer yod
	Integer stateDeath
	Integer whoRefused
	String whoRefusedOth
	Integer refuserStrength
	Integer refAction
	String ltIllnessDesc
	Integer permLtr
	Integer reasonUnavail
	String reasonUnavailOth
	String dateAvailable
	String dateMoved
	BigDecimal movedLengthTime
	Integer movedUnit
	Integer movedInformRelation
	String movedRelationOth
	String nirOther
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "non_interview_rpt"

	public NonInterviewRpt(XMLStreamReader reader, boolean strict) {
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
								case 'nir_id':
									nirId = elementText
									break
								case 'contact_id':
									contactId = elementText
									break
								case 'nir':
									nir = elementText
									break
								case 'du_id':
									duId = elementText
									break
								case 'person_id':
									personId = elementText
									break
								case 'nir_vac_info':
									nirVacInfo = elementText.toInteger()
									break
								case 'nir_vac_info_oth':
									nirVacInfoOth = elementText
									break
								case 'nir_noaccess':
									nirNoaccess = elementText.toInteger()
									break
								case 'nir_noaccess_oth':
									nirNoaccessOth = elementText
									break
								case 'nir_access_attempt':
									nirAccessAttempt = elementText.toInteger()
									break
								case 'nir_access_attempt_oth':
									nirAccessAttemptOth = elementText
									break
								case 'nir_type_person':
									nirTypePerson = elementText.toInteger()
									break
								case 'nir_type_person_oth':
									nirTypePersonOth = elementText
									break
								case 'cog_inform_relation':
									cogInformRelation = elementText.toInteger()
									break
								case 'cog_inform_relation_oth':
									cogInformRelationOth = elementText
									break
								case 'cog_dis_desc':
									cogDisDesc = elementText
									break
								case 'perm_disability':
									permDisability = elementText.toInteger()
									break
								case 'deceased_inform_relation':
									deceasedInformRelation = elementText.toInteger()
									break
								case 'deceased_inform_oth':
									deceasedInformOth = elementText
									break
								case 'yod':
									yod = elementText.toInteger()
									break
								case 'state_death':
									stateDeath = elementText.toInteger()
									break
								case 'who_refused':
									whoRefused = elementText.toInteger()
									break
								case 'who_refused_oth':
									whoRefusedOth = elementText
									break
								case 'refuser_strength':
									refuserStrength = elementText.toInteger()
									break
								case 'ref_action':
									refAction = elementText.toInteger()
									break
								case 'lt_illness_desc':
									ltIllnessDesc = elementText
									break
								case 'perm_ltr':
									permLtr = elementText.toInteger()
									break
								case 'reason_unavail':
									reasonUnavail = elementText.toInteger()
									break
								case 'reason_unavail_oth':
									reasonUnavailOth = elementText
									break
								case 'date_available':
									dateAvailable = elementText
									break
								case 'date_moved':
									dateMoved = elementText
									break
								case 'moved_length_time':
									movedLengthTime = elementText.toBigDecimal()
									break
								case 'moved_unit':
									movedUnit = elementText.toInteger()
									break
								case 'moved_inform_relation':
									movedInformRelation = elementText.toInteger()
									break
								case 'moved_relation_oth':
									movedRelationOth = elementText
									break
								case 'nir_other':
									nirOther = elementText
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
		nirId(nullable: false, minSize:1, maxSize:36)
		contactId(nullable: false, minSize:1, maxSize:36)
		nir(nullable: true, maxSize:8000)
		duId(nullable: true, maxSize:36)
		personId(nullable: true, maxSize:36)
		nirVacInfo(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -7, -4])
		nirVacInfoOth(nullable: true, maxSize:255)
		nirNoaccess(nullable: true, inList:[1, 2, 3, -5, -7, -4])
		nirNoaccessOth(nullable: true, maxSize:255)
		nirAccessAttempt(nullable: false, inList:[1, 2, 3, -5, -7, -4])
		nirAccessAttemptOth(nullable: true, maxSize:255)
		nirTypePerson(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -7, -4])
		nirTypePersonOth(nullable: true, maxSize:255)
		cogInformRelation(nullable: false, inList:[1, 2, 3, 4, -6, -5, -7, -4])
		cogInformRelationOth(nullable: true, maxSize:255)
		cogDisDesc(nullable: true, maxSize:8000)
		permDisability(nullable: false, inList:[1, 2, -6, -7, -4])
		deceasedInformRelation(nullable: false, inList:[1, 2, 3, 4, -6, -5, -7, -4])
		deceasedInformOth(nullable: true, maxSize:255)
		yod(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		stateDeath(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -6, -7, -4])
		whoRefused(nullable: false, inList:[1, 2, 3, 4, 5, 6, -6, -5, -7, -4])
		whoRefusedOth(nullable: true, maxSize:255)
		refuserStrength(nullable: false, inList:[1, 2, 3, -6, -7, -4])
		refAction(nullable: false, inList:[1, 2, -7, -4])
		ltIllnessDesc(nullable: true, maxSize:8000)
		permLtr(nullable: false, inList:[1, 2, -6, -7, -4])
		reasonUnavail(nullable: false, inList:[1, 2, 3, 4, 5, -6, -5, -7, -4])
		reasonUnavailOth(nullable: true, maxSize:255)
		dateAvailable(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		dateMoved(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		movedLengthTime(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		movedUnit(nullable: false, inList:[1, 2, 3, -3, -4])
		movedInformRelation(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -5, -7, -4])
		movedRelationOth(nullable: true, maxSize:255)
		nirOther(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'non_interview_rpt'

		psuId column:'psu_id'
		nirId column:'nir_id'
		contactId column:'contact_id'
		nir column:'nir'
		duId column:'du_id'
		personId column:'person_id'
		nirVacInfo column:'nir_vac_info'
		nirVacInfoOth column:'nir_vac_info_oth'
		nirNoaccess column:'nir_noaccess'
		nirNoaccessOth column:'nir_noaccess_oth'
		nirAccessAttempt column:'nir_access_attempt'
		nirAccessAttemptOth column:'nir_access_attempt_oth'
		nirTypePerson column:'nir_type_person'
		nirTypePersonOth column:'nir_type_person_oth'
		cogInformRelation column:'cog_inform_relation'
		cogInformRelationOth column:'cog_inform_relation_oth'
		cogDisDesc column:'cog_dis_desc'
		permDisability column:'perm_disability'
		deceasedInformRelation column:'deceased_inform_relation'
		deceasedInformOth column:'deceased_inform_oth'
		yod column:'yod'
		stateDeath column:'state_death'
		whoRefused column:'who_refused'
		whoRefusedOth column:'who_refused_oth'
		refuserStrength column:'refuser_strength'
		refAction column:'ref_action'
		ltIllnessDesc column:'lt_illness_desc'
		permLtr column:'perm_ltr'
		reasonUnavail column:'reason_unavail'
		reasonUnavailOth column:'reason_unavail_oth'
		dateAvailable column:'date_available'
		dateMoved column:'date_moved'
		movedLengthTime column:'moved_length_time'
		movedUnit column:'moved_unit'
		movedInformRelation column:'moved_inform_relation'
		movedRelationOth column:'moved_relation_oth'
		nirOther column:'nir_other'
		transactionType column:'transaction_type'
	}
}
