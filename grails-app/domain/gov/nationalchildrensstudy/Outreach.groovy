package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class Outreach {

	Integer psuId
	String tsuId
	String ssuId
	String outreachEventId
	String outreachEventDate
	Integer outreachTarget
	String outreachTargetOth
	Integer outreachMode
	String outreachModeOth
	Integer outreachType
	String outreachTypeOth
	Integer outreachTailored
	Integer outreachLang1
	Integer outreachLang2
	String outreachLangOth
	Integer outreachRace1
	Integer outreachRace2
	String outreachRaceOth
	Integer outreachCulture1
	Integer outreachCulture2
	String outreachCultureOth
	Integer outreachQuantity
	BigDecimal outreachCost
	Integer outreachStaffing
	Integer outreachIncident
	String incidentId
	Integer outreachEvalResult
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "outreach"

	public Outreach(XMLStreamReader reader, boolean strict) {
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
								case 'tsu_id':
									tsuId = elementText
									break
								case 'ssu_id':
									ssuId = elementText
									break
								case 'outreach_event_id':
									outreachEventId = elementText
									break
								case 'outreach_event_date':
									outreachEventDate = elementText
									break
								case 'outreach_target':
									outreachTarget = elementText.toInteger()
									break
								case 'outreach_target_oth':
									outreachTargetOth = elementText
									break
								case 'outreach_mode':
									outreachMode = elementText.toInteger()
									break
								case 'outreach_mode_oth':
									outreachModeOth = elementText
									break
								case 'outreach_type':
									outreachType = elementText.toInteger()
									break
								case 'outreach_type_oth':
									outreachTypeOth = elementText
									break
								case 'outreach_tailored':
									outreachTailored = elementText.toInteger()
									break
								case 'outreach_lang1':
									outreachLang1 = elementText.toInteger()
									break
								case 'outreach_lang2':
									outreachLang2 = elementText.toInteger()
									break
								case 'outreach_lang_oth':
									outreachLangOth = elementText
									break
								case 'outreach_race1':
									outreachRace1 = elementText.toInteger()
									break
								case 'outreach_race2':
									outreachRace2 = elementText.toInteger()
									break
								case 'outreach_race_oth':
									outreachRaceOth = elementText
									break
								case 'outreach_culture1':
									outreachCulture1 = elementText.toInteger()
									break
								case 'outreach_culture2':
									outreachCulture2 = elementText.toInteger()
									break
								case 'outreach_culture_oth':
									outreachCultureOth = elementText
									break
								case 'outreach_quantity':
									outreachQuantity = elementText.toInteger()
									break
								case 'outreach_cost':
									outreachCost = elementText.toBigDecimal()
									break
								case 'outreach_staffing':
									outreachStaffing = elementText.toInteger()
									break
								case 'outreach_incident':
									outreachIncident = elementText.toInteger()
									break
								case 'incident_id':
									incidentId = elementText
									break
								case 'outreach_eval_result':
									outreachEvalResult = elementText.toInteger()
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
		tsuId(nullable: true, maxSize:36)
		ssuId(nullable: true, maxSize:36)
		outreachEventId(nullable: false, minSize:1, maxSize:36)
		outreachEventDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		outreachTarget(nullable: true, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, -5, -4])
		outreachTargetOth(nullable: true, maxSize:255)
		outreachMode(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -5, -4])
		outreachModeOth(nullable: true, maxSize:255)
		outreachType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, -5, -4])
		outreachTypeOth(nullable: true, maxSize:255)
		outreachTailored(nullable: false, inList:[1, 2, -4])
		outreachLang1(nullable: false, inList:[1, 2, -4])
		outreachLang2(nullable: true, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, -1, -5, -6, -4])
		outreachLangOth(nullable: true, maxSize:255)
		outreachRace1(nullable: false, inList:[1, 2, -3, -4])
		outreachRace2(nullable: true, inList:[1, 2, 3, 4, 5, 6, -5, -7, -4])
		outreachRaceOth(nullable: true, maxSize:255)
		outreachCulture1(nullable: false, inList:[1, 2, -3, -4])
		outreachCulture2(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, -5, -7, -4])
		outreachCultureOth(nullable: true, maxSize:255)
		outreachQuantity(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		outreachCost(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		outreachStaffing(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		outreachIncident(nullable: false, inList:[1, 2, -4])
		incidentId(nullable: true, maxSize:36)
		outreachEvalResult(nullable: false, inList:[1, 2, 3, -4])
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'outreach'

		psuId column:'psu_id'
		tsuId column:'tsu_id'
		ssuId column:'ssu_id'
		outreachEventId column:'outreach_event_id'
		outreachEventDate column:'outreach_event_date'
		outreachTarget column:'outreach_target'
		outreachTargetOth column:'outreach_target_oth'
		outreachMode column:'outreach_mode'
		outreachModeOth column:'outreach_mode_oth'
		outreachType column:'outreach_type'
		outreachTypeOth column:'outreach_type_oth'
		outreachTailored column:'outreach_tailored'
		outreachLang1 column:'outreach_lang1'
		outreachLang2 column:'outreach_lang2'
		outreachLangOth column:'outreach_lang_oth'
		outreachRace1 column:'outreach_race1'
		outreachRace2 column:'outreach_race2'
		outreachRaceOth column:'outreach_race_oth'
		outreachCulture1 column:'outreach_culture1'
		outreachCulture2 column:'outreach_culture2'
		outreachCultureOth column:'outreach_culture_oth'
		outreachQuantity column:'outreach_quantity'
		outreachCost column:'outreach_cost'
		outreachStaffing column:'outreach_staffing'
		outreachIncident column:'outreach_incident'
		incidentId column:'incident_id'
		outreachEvalResult column:'outreach_eval_result'
		transactionType column:'transaction_type'
	}
}
