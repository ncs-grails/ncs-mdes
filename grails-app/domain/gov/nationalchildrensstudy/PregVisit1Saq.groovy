package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class PregVisit1Saq {

	Integer psuId
	String pv1SaqId
	Integer recruitType
	String duId
	String pId
	String eventId
	Integer eventType
	Integer eventRepeatKey
	String instrumentId
	Integer instrumentType
	String instrumentVersion
	Integer instrumentRepeatKey
	String timeStamp18
	Integer planned
	Integer monthTry
	Integer wanted
	Integer timing
	String timeStamp19
	Integer pastPreg
	Integer numPreg
	Integer ageFirst
	Integer premature
	Integer miscarry
	String timeStamp20
	Integer cigPast
	Integer cigPastFreq
	Integer cigPastNum
	Integer cigNow
	Integer cigNowFreq
	Integer cigNowNum
	Integer drinkPast
	Integer drinkPastNum
	Integer drinkPast5
	Integer drinkNow
	Integer drinkNowNum
	Integer drinkNow5
	String timeStamp21
	Integer learn
	Integer help
	Integer incent
	Integer research
	Integer envir
	Integer community
	Integer knowOthers
	Integer family
	Integer doctor
	Integer staff
	Integer opinSpouse
	Integer opinFamily
	Integer opinFriend
	Integer opinDr
	Integer experience
	Integer improve
	Integer intLength
	Integer intStress
	Integer intRepeat
	String timeStamp22
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "preg_visit_1_saq"

	public PregVisit1Saq(XMLStreamReader reader, boolean strict) {
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
								case 'pv1_saq_id':
									pv1SaqId = elementText
									break
								case 'recruit_type':
									recruitType = elementText.toInteger()
									break
								case 'du_id':
									duId = elementText
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
								case 'time_stamp_18':
									timeStamp18 = elementText
									break
								case 'planned':
									planned = elementText.toInteger()
									break
								case 'month_try':
									monthTry = elementText.toInteger()
									break
								case 'wanted':
									wanted = elementText.toInteger()
									break
								case 'timing':
									timing = elementText.toInteger()
									break
								case 'time_stamp_19':
									timeStamp19 = elementText
									break
								case 'past_preg':
									pastPreg = elementText.toInteger()
									break
								case 'num_preg':
									numPreg = elementText.toInteger()
									break
								case 'age_first':
									ageFirst = elementText.toInteger()
									break
								case 'premature':
									premature = elementText.toInteger()
									break
								case 'miscarry':
									miscarry = elementText.toInteger()
									break
								case 'time_stamp_20':
									timeStamp20 = elementText
									break
								case 'cig_past':
									cigPast = elementText.toInteger()
									break
								case 'cig_past_freq':
									cigPastFreq = elementText.toInteger()
									break
								case 'cig_past_num':
									cigPastNum = elementText.toInteger()
									break
								case 'cig_now':
									cigNow = elementText.toInteger()
									break
								case 'cig_now_freq':
									cigNowFreq = elementText.toInteger()
									break
								case 'cig_now_num':
									cigNowNum = elementText.toInteger()
									break
								case 'drink_past':
									drinkPast = elementText.toInteger()
									break
								case 'drink_past_num':
									drinkPastNum = elementText.toInteger()
									break
								case 'drink_past_5':
									drinkPast5 = elementText.toInteger()
									break
								case 'drink_now':
									drinkNow = elementText.toInteger()
									break
								case 'drink_now_num':
									drinkNowNum = elementText.toInteger()
									break
								case 'drink_now_5':
									drinkNow5 = elementText.toInteger()
									break
								case 'time_stamp_21':
									timeStamp21 = elementText
									break
								case 'learn':
									learn = elementText.toInteger()
									break
								case 'help':
									help = elementText.toInteger()
									break
								case 'incent':
									incent = elementText.toInteger()
									break
								case 'research':
									research = elementText.toInteger()
									break
								case 'envir':
									envir = elementText.toInteger()
									break
								case 'community':
									community = elementText.toInteger()
									break
								case 'know_others':
									knowOthers = elementText.toInteger()
									break
								case 'family':
									family = elementText.toInteger()
									break
								case 'doctor':
									doctor = elementText.toInteger()
									break
								case 'staff':
									staff = elementText.toInteger()
									break
								case 'opin_spouse':
									opinSpouse = elementText.toInteger()
									break
								case 'opin_family':
									opinFamily = elementText.toInteger()
									break
								case 'opin_friend':
									opinFriend = elementText.toInteger()
									break
								case 'opin_dr':
									opinDr = elementText.toInteger()
									break
								case 'experience':
									experience = elementText.toInteger()
									break
								case 'improve':
									improve = elementText.toInteger()
									break
								case 'int_length':
									intLength = elementText.toInteger()
									break
								case 'int_stress':
									intStress = elementText.toInteger()
									break
								case 'int_repeat':
									intRepeat = elementText.toInteger()
									break
								case 'time_stamp_22':
									timeStamp22 = elementText
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
		pv1SaqId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp18(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		planned(nullable: false, inList:[1, 2, -1, -2, -4])
		monthTry(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		wanted(nullable: false, inList:[1, 2, -1, -2, -4])
		timing(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		timeStamp19(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pastPreg(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		numPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		ageFirst(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		premature(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		miscarry(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp20(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cigPast(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cigPastFreq(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4])
		cigPastNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		cigNow(nullable: false, inList:[1, 2, -1, -2, -4])
		cigNowFreq(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4])
		cigNowNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		drinkPast(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -4])
		drinkPastNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		drinkPast5(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		drinkNow(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -4])
		drinkNowNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		drinkNow5(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		timeStamp21(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		learn(nullable: false, inList:[1, 2, 3, -3, -4])
		help(nullable: false, inList:[1, 2, 3, -3, -4])
		incent(nullable: false, inList:[1, 2, 3, -3, -4])
		research(nullable: false, inList:[1, 2, 3, -3, -4])
		envir(nullable: false, inList:[1, 2, 3, -3, -4])
		community(nullable: false, inList:[1, 2, 3, -3, -4])
		knowOthers(nullable: false, inList:[1, 2, 3, -3, -4])
		family(nullable: false, inList:[1, 2, 3, -4])
		doctor(nullable: false, inList:[1, 2, 3, -3, -4])
		staff(nullable: false, inList:[1, 2, 3, -3, -4])
		opinSpouse(nullable: false, inList:[1, 2, 3, 4, 5, -7, -3, -4])
		opinFamily(nullable: false, inList:[1, 2, 3, 4, 5, -7, -3, -4])
		opinFriend(nullable: false, inList:[1, 2, 3, 4, 5, -7, -3, -4])
		opinDr(nullable: false, inList:[1, 2, 3, 4, 5, -7, -3, -4])
		experience(nullable: false, inList:[1, 2, 3, 4, 5, -3, -4])
		improve(nullable: false, inList:[1, 2, 3, 4, -3, -4])
		intLength(nullable: false, inList:[1, 2, 3, -3, -4])
		intStress(nullable: false, inList:[1, 2, 3, 4, -3, -4])
		intRepeat(nullable: false, inList:[1, 2, -3, -4])
		timeStamp22(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_saq'

		psuId column:'psu_id'
		pv1SaqId column:'pv1_saq_id'
		recruitType column:'recruit_type'
		duId column:'du_id'
		pId column:'p_id'
		eventId column:'event_id'
		eventType column:'event_type'
		eventRepeatKey column:'event_repeat_key'
		instrumentId column:'instrument_id'
		instrumentType column:'instrument_type'
		instrumentVersion column:'instrument_version'
		instrumentRepeatKey column:'instrument_repeat_key'
		timeStamp18 column:'time_stamp_18'
		planned column:'planned'
		monthTry column:'month_try'
		wanted column:'wanted'
		timing column:'timing'
		timeStamp19 column:'time_stamp_19'
		pastPreg column:'past_preg'
		numPreg column:'num_preg'
		ageFirst column:'age_first'
		premature column:'premature'
		miscarry column:'miscarry'
		timeStamp20 column:'time_stamp_20'
		cigPast column:'cig_past'
		cigPastFreq column:'cig_past_freq'
		cigPastNum column:'cig_past_num'
		cigNow column:'cig_now'
		cigNowFreq column:'cig_now_freq'
		cigNowNum column:'cig_now_num'
		drinkPast column:'drink_past'
		drinkPastNum column:'drink_past_num'
		drinkPast5 column:'drink_past_5'
		drinkNow column:'drink_now'
		drinkNowNum column:'drink_now_num'
		drinkNow5 column:'drink_now_5'
		timeStamp21 column:'time_stamp_21'
		learn column:'learn'
		help column:'help'
		incent column:'incent'
		research column:'research'
		envir column:'envir'
		community column:'community'
		knowOthers column:'know_others'
		family column:'family'
		doctor column:'doctor'
		staff column:'staff'
		opinSpouse column:'opin_spouse'
		opinFamily column:'opin_family'
		opinFriend column:'opin_friend'
		opinDr column:'opin_dr'
		experience column:'experience'
		improve column:'improve'
		intLength column:'int_length'
		intStress column:'int_stress'
		intRepeat column:'int_repeat'
		timeStamp22 column:'time_stamp_22'
		transactionType column:'transaction_type'
	}
}
