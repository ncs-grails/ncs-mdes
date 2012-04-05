package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class VacuumBag {

	Integer psuId
	String vacuumBagId
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
	String timeStamp1
	Integer vacuumParticipant
	Integer vacuumInHome
	Integer vacuumTechOkay
	Integer vacuumRefuse
	String vacuumRefuseOth
	Integer vacuumType
	String vacTypeOth
	String vacuumMakeModel
	Integer vacuumBagChanged
	Integer vacuumBagChangedFreq
	String timeStamp2
	Integer vacuumCollected
	Integer rVacuumNCollected
	String rVacuumNCollectedOth
	Integer vacuumMostUsed
	Integer vacuumTemp
	Integer vacuumRh
	Integer vacuumBag
	String vacuumBagOth
	Integer sampleNumber
	String sampleId
	Integer vacuumProblems
	String vacuumProblemsOth
	String timeStamp3
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "vacuum_bag"

	public VacuumBag(XMLStreamReader reader, boolean strict) {
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
								case 'vacuum_bag_id':
									vacuumBagId = elementText
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
								case 'time_stamp_1':
									timeStamp1 = elementText
									break
								case 'vacuum_participant':
									vacuumParticipant = elementText.toInteger()
									break
								case 'vacuum_in_home':
									vacuumInHome = elementText.toInteger()
									break
								case 'vacuum_tech_okay':
									vacuumTechOkay = elementText.toInteger()
									break
								case 'vacuum_refuse':
									vacuumRefuse = elementText.toInteger()
									break
								case 'vacuum_refuse_oth':
									vacuumRefuseOth = elementText
									break
								case 'vacuum_type':
									vacuumType = elementText.toInteger()
									break
								case 'vac_type_oth':
									vacTypeOth = elementText
									break
								case 'vacuum_make_model':
									vacuumMakeModel = elementText
									break
								case 'vacuum_bag_changed':
									vacuumBagChanged = elementText.toInteger()
									break
								case 'vacuum_bag_changed_freq':
									vacuumBagChangedFreq = elementText.toInteger()
									break
								case 'time_stamp_2':
									timeStamp2 = elementText
									break
								case 'vacuum_collected':
									vacuumCollected = elementText.toInteger()
									break
								case 'r_vacuum_n_collected':
									rVacuumNCollected = elementText.toInteger()
									break
								case 'r_vacuum_n_collected_oth':
									rVacuumNCollectedOth = elementText
									break
								case 'vacuum_most_used':
									vacuumMostUsed = elementText.toInteger()
									break
								case 'vacuum_temp':
									vacuumTemp = elementText.toInteger()
									break
								case 'vacuum_rh':
									vacuumRh = elementText.toInteger()
									break
								case 'vacuum_bag':
									vacuumBag = elementText.toInteger()
									break
								case 'vacuum_bag_oth':
									vacuumBagOth = elementText
									break
								case 'sample_number':
									sampleNumber = elementText.toInteger()
									break
								case 'sample_id':
									sampleId = elementText
									break
								case 'vacuum_problems':
									vacuumProblems = elementText.toInteger()
									break
								case 'vacuum_problems_oth':
									vacuumProblemsOth = elementText
									break
								case 'time_stamp_3':
									timeStamp3 = elementText
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
		vacuumBagId(nullable: false, minSize:1, maxSize:36)
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
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		vacuumParticipant(nullable: false, inList:[1, 2, -4])
		vacuumInHome(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		vacuumTechOkay(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		vacuumRefuse(nullable: false, inList:[1, 2, 3, -5, -3, -4])
		vacuumRefuseOth(nullable: true, maxSize:255)
		vacuumType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, -5, -3, -4])
		vacTypeOth(nullable: true, maxSize:255)
		vacuumMakeModel(nullable: true, maxSize:255)
		vacuumBagChanged(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		vacuumBagChangedFreq(nullable: false, inList:[1, 2, 3, -3, -4])
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		vacuumCollected(nullable: false, inList:[1, 2, -4])
		rVacuumNCollected(nullable: false, inList:[1, 2, 3, 4, -5, -1, -2, -3, -4])
		rVacuumNCollectedOth(nullable: true, maxSize:255)
		vacuumMostUsed(nullable: false, inList:[1, 2, -4])
		vacuumTemp(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		vacuumRh(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		vacuumBag(nullable: false, inList:[1, 2, 3, -5, -1, -2, -3, -4])
		vacuumBagOth(nullable: true, maxSize:255)
		sampleNumber(nullable: false, inList:[1, -4])
		sampleId(nullable: true, maxSize:14)
		vacuumProblems(nullable: false, inList:[1, 2, 3, 4, -5, -1, -2, -3, -4])
		vacuumProblemsOth(nullable: true, maxSize:255)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'vacuum_bag'

		psuId column:'psu_id'
		vacuumBagId column:'vacuum_bag_id'
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
		timeStamp1 column:'time_stamp_1'
		vacuumParticipant column:'vacuum_participant'
		vacuumInHome column:'vacuum_in_home'
		vacuumTechOkay column:'vacuum_tech_okay'
		vacuumRefuse column:'vacuum_refuse'
		vacuumRefuseOth column:'vacuum_refuse_oth'
		vacuumType column:'vacuum_type'
		vacTypeOth column:'vac_type_oth'
		vacuumMakeModel column:'vacuum_make_model'
		vacuumBagChanged column:'vacuum_bag_changed'
		vacuumBagChangedFreq column:'vacuum_bag_changed_freq'
		timeStamp2 column:'time_stamp_2'
		vacuumCollected column:'vacuum_collected'
		rVacuumNCollected column:'r_vacuum_n_collected'
		rVacuumNCollectedOth column:'r_vacuum_n_collected_oth'
		vacuumMostUsed column:'vacuum_most_used'
		vacuumTemp column:'vacuum_temp'
		vacuumRh column:'vacuum_rh'
		vacuumBag column:'vacuum_bag'
		vacuumBagOth column:'vacuum_bag_oth'
		sampleNumber column:'sample_number'
		sampleId column:'sample_id'
		vacuumProblems column:'vacuum_problems'
		vacuumProblemsOth column:'vacuum_problems_oth'
		timeStamp3 column:'time_stamp_3'
		transactionType column:'transaction_type'
	}
}
