package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class ThreeMthMotherChildHabits {

	Integer psuId
	String threeMthId
	String pId
	String threeMonthHabitsLoopId
	Integer sleepPlace1
	Integer sleepPlace2
	String sleepPlace2Oth
	Integer sleepPositionNight
	Integer sleepHrsDay
	Integer sleepHrsNight
	Integer sleepDifficult
	Integer cryMore
	Integer cryConsole
	Integer cryColic
	Integer colicFreq
	Integer cryProblem
	Integer calm
	Integer worried
	Integer social
	Integer angry
	Integer shy
	Integer stubborn
	Integer happy
	Integer eyesFollow
	Integer smile
	Integer reach1
	Integer feed
	Integer wave
	Integer reach2
	Integer grab
	Integer switchHands
	Integer pickup
	Integer hold
	Integer sound2
	Integer sound3
	Integer speak1
	Integer speak2
	Integer headup
	Integer roll1
	Integer roll2
	String timeStamp4
	Integer childcare
	Integer familyCareHrs
	Integer homecareHrs
	Integer daycareHrs
	String timeStamp5
	Integer cHealth
	Integer rHcare
	String lastVisit
	Integer visitWt
	Integer sameCare
	Integer hcareSick
	Integer hospital
	Integer diagnosis
	String diagnosisSpecify
	String timeStamp6
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "three_mth_mother_child_habits"

	public ThreeMthMotherChildHabits(XMLStreamReader reader, boolean strict) {
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
								case 'three_mth_id':
									threeMthId = elementText
									break
								case 'p_id':
									pId = elementText
									break
								case 'three_month_habits_loop_id':
									threeMonthHabitsLoopId = elementText
									break
								case 'sleep_place_1':
									sleepPlace1 = elementText.toInteger()
									break
								case 'sleep_place_2':
									sleepPlace2 = elementText.toInteger()
									break
								case 'sleep_place_2_oth':
									sleepPlace2Oth = elementText
									break
								case 'sleep_position_night':
									sleepPositionNight = elementText.toInteger()
									break
								case 'sleep_hrs_day':
									sleepHrsDay = elementText.toInteger()
									break
								case 'sleep_hrs_night':
									sleepHrsNight = elementText.toInteger()
									break
								case 'sleep_difficult':
									sleepDifficult = elementText.toInteger()
									break
								case 'cry_more':
									cryMore = elementText.toInteger()
									break
								case 'cry_console':
									cryConsole = elementText.toInteger()
									break
								case 'cry_colic':
									cryColic = elementText.toInteger()
									break
								case 'colic_freq':
									colicFreq = elementText.toInteger()
									break
								case 'cry_problem':
									cryProblem = elementText.toInteger()
									break
								case 'calm':
									calm = elementText.toInteger()
									break
								case 'worried':
									worried = elementText.toInteger()
									break
								case 'social':
									social = elementText.toInteger()
									break
								case 'angry':
									angry = elementText.toInteger()
									break
								case 'shy':
									shy = elementText.toInteger()
									break
								case 'stubborn':
									stubborn = elementText.toInteger()
									break
								case 'happy':
									happy = elementText.toInteger()
									break
								case 'eyes_follow':
									eyesFollow = elementText.toInteger()
									break
								case 'smile':
									smile = elementText.toInteger()
									break
								case 'reach_1':
									reach1 = elementText.toInteger()
									break
								case 'feed':
									feed = elementText.toInteger()
									break
								case 'wave':
									wave = elementText.toInteger()
									break
								case 'reach_2':
									reach2 = elementText.toInteger()
									break
								case 'grab':
									grab = elementText.toInteger()
									break
								case 'switch_hands':
									switchHands = elementText.toInteger()
									break
								case 'pickup':
									pickup = elementText.toInteger()
									break
								case 'hold':
									hold = elementText.toInteger()
									break
								case 'sound_2':
									sound2 = elementText.toInteger()
									break
								case 'sound_3':
									sound3 = elementText.toInteger()
									break
								case 'speak_1':
									speak1 = elementText.toInteger()
									break
								case 'speak_2':
									speak2 = elementText.toInteger()
									break
								case 'headup':
									headup = elementText.toInteger()
									break
								case 'roll_1':
									roll1 = elementText.toInteger()
									break
								case 'roll_2':
									roll2 = elementText.toInteger()
									break
								case 'time_stamp_4':
									timeStamp4 = elementText
									break
								case 'childcare':
									childcare = elementText.toInteger()
									break
								case 'family_care_hrs':
									familyCareHrs = elementText.toInteger()
									break
								case 'homecare_hrs':
									homecareHrs = elementText.toInteger()
									break
								case 'daycare_hrs':
									daycareHrs = elementText.toInteger()
									break
								case 'time_stamp_5':
									timeStamp5 = elementText
									break
								case 'c_health':
									cHealth = elementText.toInteger()
									break
								case 'r_hcare':
									rHcare = elementText.toInteger()
									break
								case 'last_visit':
									lastVisit = elementText
									break
								case 'visit_wt':
									visitWt = elementText.toInteger()
									break
								case 'same_care':
									sameCare = elementText.toInteger()
									break
								case 'hcare_sick':
									hcareSick = elementText.toInteger()
									break
								case 'hospital':
									hospital = elementText.toInteger()
									break
								case 'diagnosis':
									diagnosis = elementText.toInteger()
									break
								case 'diagnosis_specify':
									diagnosisSpecify = elementText
									break
								case 'time_stamp_6':
									timeStamp6 = elementText
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
		threeMthId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		threeMonthHabitsLoopId(nullable: false, minSize:1, maxSize:36)
		sleepPlace1(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		sleepPlace2(nullable: false, inList:[1, 2, 3, 4, -5, -1, -2, -4])
		sleepPlace2Oth(nullable: true, maxSize:255)
		sleepPositionNight(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		sleepHrsDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sleepHrsNight(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sleepDifficult(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		cryMore(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		cryConsole(nullable: false, inList:[1, 2, -1, -2, -4])
		cryColic(nullable: false, inList:[1, 2, -1, -2, -4])
		colicFreq(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		cryProblem(nullable: false, inList:[1, 2, -1, -2, -4])
		calm(nullable: false, inList:[1, 2, -1, -2, -4])
		worried(nullable: false, inList:[1, 2, -1, -2, -4])
		social(nullable: false, inList:[1, 2, -1, -2, -4])
		angry(nullable: false, inList:[1, 2, -1, -2, -4])
		shy(nullable: false, inList:[1, 2, -1, -2, -4])
		stubborn(nullable: false, inList:[1, 2, -1, -2, -4])
		happy(nullable: false, inList:[1, 2, -1, -2, -4])
		eyesFollow(nullable: false, inList:[1, 2, -1, -2, -4])
		smile(nullable: false, inList:[1, 2, -1, -2, -4])
		reach1(nullable: false, inList:[1, 2, -1, -2, -4])
		feed(nullable: false, inList:[1, 2, -1, -2, -4])
		wave(nullable: false, inList:[1, 2, -1, -2, -4])
		reach2(nullable: false, inList:[1, 2, -1, -2, -4])
		grab(nullable: false, inList:[1, 2, -1, -2, -4])
		switchHands(nullable: false, inList:[1, 2, -1, -2, -4])
		pickup(nullable: false, inList:[1, 2, -1, -2, -4])
		hold(nullable: false, inList:[1, 2, -1, -2, -4])
		sound2(nullable: false, inList:[1, 2, -1, -2, -4])
		sound3(nullable: false, inList:[1, 2, -1, -2, -4])
		speak1(nullable: false, inList:[1, 2, -1, -2, -4])
		speak2(nullable: false, inList:[1, 2, -1, -2, -4])
		headup(nullable: false, inList:[1, 2, -1, -2, -4])
		roll1(nullable: false, inList:[1, 2, -1, -2, -4])
		roll2(nullable: false, inList:[1, 2, -1, -2, -4])
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		childcare(nullable: false, inList:[1, 2, -1, -2, -4])
		familyCareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		homecareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		daycareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cHealth(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		rHcare(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -4])
		lastVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		visitWt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sameCare(nullable: false, inList:[1, 2, -1, -2, -3, -4, -7])
		hcareSick(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4, -7])
		hospital(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		diagnosis(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		diagnosisSpecify(nullable: true, maxSize:255)
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'three_mth_mother_child_habits'

		psuId column:'psu_id'
		threeMthId column:'three_mth_id'
		pId column:'p_id'
		threeMonthHabitsLoopId column:'three_month_habits_loop_id'
		sleepPlace1 column:'sleep_place_1'
		sleepPlace2 column:'sleep_place_2'
		sleepPlace2Oth column:'sleep_place_2_oth'
		sleepPositionNight column:'sleep_position_night'
		sleepHrsDay column:'sleep_hrs_day'
		sleepHrsNight column:'sleep_hrs_night'
		sleepDifficult column:'sleep_difficult'
		cryMore column:'cry_more'
		cryConsole column:'cry_console'
		cryColic column:'cry_colic'
		colicFreq column:'colic_freq'
		cryProblem column:'cry_problem'
		calm column:'calm'
		worried column:'worried'
		social column:'social'
		angry column:'angry'
		shy column:'shy'
		stubborn column:'stubborn'
		happy column:'happy'
		eyesFollow column:'eyes_follow'
		smile column:'smile'
		reach1 column:'reach_1'
		feed column:'feed'
		wave column:'wave'
		reach2 column:'reach_2'
		grab column:'grab'
		switchHands column:'switch_hands'
		pickup column:'pickup'
		hold column:'hold'
		sound2 column:'sound_2'
		sound3 column:'sound_3'
		speak1 column:'speak_1'
		speak2 column:'speak_2'
		headup column:'headup'
		roll1 column:'roll_1'
		roll2 column:'roll_2'
		timeStamp4 column:'time_stamp_4'
		childcare column:'childcare'
		familyCareHrs column:'family_care_hrs'
		homecareHrs column:'homecare_hrs'
		daycareHrs column:'daycare_hrs'
		timeStamp5 column:'time_stamp_5'
		cHealth column:'c_health'
		rHcare column:'r_hcare'
		lastVisit column:'last_visit'
		visitWt column:'visit_wt'
		sameCare column:'same_care'
		hcareSick column:'hcare_sick'
		hospital column:'hospital'
		diagnosis column:'diagnosis'
		diagnosisSpecify column:'diagnosis_specify'
		timeStamp6 column:'time_stamp_6'
		transactionType column:'transaction_type'
	}
}
