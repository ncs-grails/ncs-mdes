package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class TwelveMthMotherDetail {

	Integer psuId
	String twelveMthId
	String pId
	String twelveMthDetailId
	Integer childQnum
	Integer childSex
	Integer cnameConfirm
	String cFname
	String cLname
	Integer cdobConfirm
	String childDob
	String timeStamp2
	Integer calm
	Integer worried
	Integer social
	Integer angry
	Integer shy
	Integer stubborn
	Integer happy
	Integer cHealth
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
	Integer sound1
	Integer sound2
	Integer sound3
	Integer speak1
	Integer speak2
	Integer headup
	Integer roll1
	Integer roll2
	Integer situp
	Integer stand
	Integer standAlone
	Integer walk
	Integer scribble
	Integer forkSpoon
	Integer talkAbout
	Integer pictures
	Integer thinkof
	Integer holdFun
	Integer giveFun
	Integer read
	Integer readFreq
	Integer watchTv
	Integer tvFreq
	Integer playFreq
	Integer walks
	String timeStamp3
	Integer childcare
	Integer familyCare
	Integer familyCareHrs
	Integer homecare
	Integer homecareHrs
	Integer daycare
	Integer daycareHrs
	String timeStamp4
	Integer rHcare
	String lastVisit
	Integer visitWt
	Integer sameCare
	Integer hcareSick
	String timeStamp5
	Integer earInfection
	Integer gastro
	Integer respiratory
	Integer fever
	Integer blind
	Integer eyesight
	Integer deaf
	Integer birthDefect
	String defectType
	Integer genetic
	String geneticType
	Integer failThrive
	String timeStamp6
	Integer insure
	Integer insEmploy
	Integer insMedicaid
	Integer insTricare
	Integer insIhs
	Integer insMedicare
	Integer insOth
	String timeStamp7
	Integer lice1
	String liceOth1
	String liceOth2
	Integer smokeHours
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "twelve_mth_mother_detail"

	public TwelveMthMotherDetail(XMLStreamReader reader, boolean strict) {
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
								case 'twelve_mth_id':
									twelveMthId = elementText
									break
								case 'p_id':
									pId = elementText
									break
								case 'twelve_mth_detail_id':
									twelveMthDetailId = elementText
									break
								case 'child_qnum':
									childQnum = elementText.toInteger()
									break
								case 'child_sex':
									childSex = elementText.toInteger()
									break
								case 'cname_confirm':
									cnameConfirm = elementText.toInteger()
									break
								case 'c_fname':
									cFname = elementText
									break
								case 'c_lname':
									cLname = elementText
									break
								case 'cdob_confirm':
									cdobConfirm = elementText.toInteger()
									break
								case 'child_dob':
									childDob = elementText
									break
								case 'time_stamp_2':
									timeStamp2 = elementText
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
								case 'c_health':
									cHealth = elementText.toInteger()
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
								case 'sound_1':
									sound1 = elementText.toInteger()
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
								case 'situp':
									situp = elementText.toInteger()
									break
								case 'stand':
									stand = elementText.toInteger()
									break
								case 'stand_alone':
									standAlone = elementText.toInteger()
									break
								case 'walk':
									walk = elementText.toInteger()
									break
								case 'scribble':
									scribble = elementText.toInteger()
									break
								case 'fork_spoon':
									forkSpoon = elementText.toInteger()
									break
								case 'talk_about':
									talkAbout = elementText.toInteger()
									break
								case 'pictures':
									pictures = elementText.toInteger()
									break
								case 'thinkof':
									thinkof = elementText.toInteger()
									break
								case 'hold_fun':
									holdFun = elementText.toInteger()
									break
								case 'give_fun':
									giveFun = elementText.toInteger()
									break
								case 'read':
									read = elementText.toInteger()
									break
								case 'read_freq':
									readFreq = elementText.toInteger()
									break
								case 'watch_tv':
									watchTv = elementText.toInteger()
									break
								case 'tv_freq':
									tvFreq = elementText.toInteger()
									break
								case 'play_freq':
									playFreq = elementText.toInteger()
									break
								case 'walks':
									walks = elementText.toInteger()
									break
								case 'time_stamp_3':
									timeStamp3 = elementText
									break
								case 'childcare':
									childcare = elementText.toInteger()
									break
								case 'family_care':
									familyCare = elementText.toInteger()
									break
								case 'family_care_hrs':
									familyCareHrs = elementText.toInteger()
									break
								case 'homecare':
									homecare = elementText.toInteger()
									break
								case 'homecare_hrs':
									homecareHrs = elementText.toInteger()
									break
								case 'daycare':
									daycare = elementText.toInteger()
									break
								case 'daycare_hrs':
									daycareHrs = elementText.toInteger()
									break
								case 'time_stamp_4':
									timeStamp4 = elementText
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
								case 'time_stamp_5':
									timeStamp5 = elementText
									break
								case 'ear_infection':
									earInfection = elementText.toInteger()
									break
								case 'gastro':
									gastro = elementText.toInteger()
									break
								case 'respiratory':
									respiratory = elementText.toInteger()
									break
								case 'fever':
									fever = elementText.toInteger()
									break
								case 'blind':
									blind = elementText.toInteger()
									break
								case 'eyesight':
									eyesight = elementText.toInteger()
									break
								case 'deaf':
									deaf = elementText.toInteger()
									break
								case 'birth_defect':
									birthDefect = elementText.toInteger()
									break
								case 'defect_type':
									defectType = elementText
									break
								case 'genetic':
									genetic = elementText.toInteger()
									break
								case 'genetic_type':
									geneticType = elementText
									break
								case 'fail_thrive':
									failThrive = elementText.toInteger()
									break
								case 'time_stamp_6':
									timeStamp6 = elementText
									break
								case 'insure':
									insure = elementText.toInteger()
									break
								case 'ins_employ':
									insEmploy = elementText.toInteger()
									break
								case 'ins_medicaid':
									insMedicaid = elementText.toInteger()
									break
								case 'ins_tricare':
									insTricare = elementText.toInteger()
									break
								case 'ins_ihs':
									insIhs = elementText.toInteger()
									break
								case 'ins_medicare':
									insMedicare = elementText.toInteger()
									break
								case 'ins_oth':
									insOth = elementText.toInteger()
									break
								case 'time_stamp_7':
									timeStamp7 = elementText
									break
								case 'lice_1':
									lice1 = elementText.toInteger()
									break
								case 'lice_oth_1':
									liceOth1 = elementText
									break
								case 'lice_oth_2':
									liceOth2 = elementText
									break
								case 'smoke_hours':
									smokeHours = elementText.toInteger()
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
		twelveMthId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		twelveMthDetailId(nullable: false, minSize:1, maxSize:36)
		childQnum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		childSex(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		cnameConfirm(nullable: false, inList:[1, 2, -1, -2, -4])
		cFname(nullable: true, maxSize:30)
		cLname(nullable: true, maxSize:30)
		cdobConfirm(nullable: false, inList:[1, 2, -1, -2, -4])
		childDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		calm(nullable: false, inList:[1, 2, -1, -2, -4])
		worried(nullable: false, inList:[1, 2, -1, -2, -4])
		social(nullable: false, inList:[1, 2, -1, -2, -4])
		angry(nullable: false, inList:[1, 2, -1, -2, -4])
		shy(nullable: false, inList:[1, 2, -1, -2, -4])
		stubborn(nullable: false, inList:[1, 2, -1, -2, -4])
		happy(nullable: false, inList:[1, 2, -1, -2, -4])
		cHealth(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
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
		sound1(nullable: false, inList:[1, 2, -1, -2, -4])
		sound2(nullable: false, inList:[1, 2, -1, -2, -4])
		sound3(nullable: false, inList:[1, 2, -1, -2, -4])
		speak1(nullable: false, inList:[1, 2, -1, -2, -4])
		speak2(nullable: false, inList:[1, 2, -1, -2, -4])
		headup(nullable: false, inList:[1, 2, -1, -2, -4])
		roll1(nullable: false, inList:[1, 2, -1, -2, -4])
		roll2(nullable: false, inList:[1, 2, -1, -2, -4])
		situp(nullable: false, inList:[1, 2, -1, -2, -4])
		stand(nullable: false, inList:[1, 2, -1, -2, -4])
		standAlone(nullable: false, inList:[1, 2, -1, -2, -4])
		walk(nullable: false, inList:[1, 2, -1, -2, -4])
		scribble(nullable: false, inList:[1, 2, -1, -2, -4])
		forkSpoon(nullable: false, inList:[1, 2, -1, -2, -4])
		talkAbout(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		pictures(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		thinkof(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		holdFun(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		giveFun(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		read(nullable: false, inList:[1, 2, -1, -2, -4])
		readFreq(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		watchTv(nullable: false, inList:[1, 2, -1, -2, -4])
		tvFreq(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		playFreq(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		walks(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		childcare(nullable: false, inList:[1, 2, -1, -2, -4])
		familyCare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		familyCareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		homecare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		homecareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		daycare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		daycareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rHcare(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -4])
		lastVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		visitWt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sameCare(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		hcareSick(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4])
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		earInfection(nullable: false, inList:[1, 2, -1, -2, -4])
		gastro(nullable: false, inList:[1, 2, -1, -2, -4])
		respiratory(nullable: false, inList:[1, 2, -1, -2, -4])
		fever(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		blind(nullable: false, inList:[1, 2, -1, -2, -4])
		eyesight(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		deaf(nullable: false, inList:[1, 2, -1, -2, -4])
		birthDefect(nullable: false, inList:[1, 2, -1, -2, -4])
		defectType(nullable: true, maxSize:255)
		genetic(nullable: false, inList:[1, 2, -1, -2, -4])
		geneticType(nullable: true, maxSize:255)
		failThrive(nullable: false, inList:[1, 2, -1, -2, -4])
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		insure(nullable: false, inList:[1, 2, -1, -2, -4])
		insEmploy(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insMedicaid(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insTricare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insIhs(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insMedicare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insOth(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		lice1(nullable: false, inList:[1, 2, -1, -2, -4])
		liceOth1(nullable: true, maxSize:255)
		liceOth2(nullable: true, maxSize:255)
		smokeHours(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_mother_detail'

		psuId column:'psu_id'
		twelveMthId column:'twelve_mth_id'
		pId column:'p_id'
		twelveMthDetailId column:'twelve_mth_detail_id'
		childQnum column:'child_qnum'
		childSex column:'child_sex'
		cnameConfirm column:'cname_confirm'
		cFname column:'c_fname'
		cLname column:'c_lname'
		cdobConfirm column:'cdob_confirm'
		childDob column:'child_dob'
		timeStamp2 column:'time_stamp_2'
		calm column:'calm'
		worried column:'worried'
		social column:'social'
		angry column:'angry'
		shy column:'shy'
		stubborn column:'stubborn'
		happy column:'happy'
		cHealth column:'c_health'
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
		sound1 column:'sound_1'
		sound2 column:'sound_2'
		sound3 column:'sound_3'
		speak1 column:'speak_1'
		speak2 column:'speak_2'
		headup column:'headup'
		roll1 column:'roll_1'
		roll2 column:'roll_2'
		situp column:'situp'
		stand column:'stand'
		standAlone column:'stand_alone'
		walk column:'walk'
		scribble column:'scribble'
		forkSpoon column:'fork_spoon'
		talkAbout column:'talk_about'
		pictures column:'pictures'
		thinkof column:'thinkof'
		holdFun column:'hold_fun'
		giveFun column:'give_fun'
		read column:'read_'
		readFreq column:'read_freq'
		watchTv column:'watch_tv'
		tvFreq column:'tv_freq'
		playFreq column:'play_freq'
		walks column:'walks'
		timeStamp3 column:'time_stamp_3'
		childcare column:'childcare'
		familyCare column:'family_care'
		familyCareHrs column:'family_care_hrs'
		homecare column:'homecare'
		homecareHrs column:'homecare_hrs'
		daycare column:'daycare'
		daycareHrs column:'daycare_hrs'
		timeStamp4 column:'time_stamp_4'
		rHcare column:'r_hcare'
		lastVisit column:'last_visit'
		visitWt column:'visit_wt'
		sameCare column:'same_care'
		hcareSick column:'hcare_sick'
		timeStamp5 column:'time_stamp_5'
		earInfection column:'ear_infection'
		gastro column:'gastro'
		respiratory column:'respiratory'
		fever column:'fever'
		blind column:'blind'
		eyesight column:'eyesight'
		deaf column:'deaf'
		birthDefect column:'birth_defect'
		defectType column:'defect_type'
		genetic column:'genetic'
		geneticType column:'genetic_type'
		failThrive column:'fail_thrive'
		timeStamp6 column:'time_stamp_6'
		insure column:'insure'
		insEmploy column:'ins_employ'
		insMedicaid column:'ins_medicaid'
		insTricare column:'ins_tricare'
		insIhs column:'ins_ihs'
		insMedicare column:'ins_medicare'
		insOth column:'ins_oth'
		timeStamp7 column:'time_stamp_7'
		lice1 column:'lice_1'
		liceOth1 column:'lice_oth_1'
		liceOth2 column:'lice_oth_2'
		smokeHours column:'smoke_hours'
		transactionType column:'transaction_type'
	}
}
