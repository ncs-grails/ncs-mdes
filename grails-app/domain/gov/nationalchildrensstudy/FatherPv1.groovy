package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class FatherPv1 {

	Integer psuId
	String fatherId
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
	String timeStamp1
	Integer fIntReady
	String timeStamp2
	String rFname
	String rLname
	String personDob
	Integer ageElig
	Integer fRelate
	String fRelateOth
	Integer fMaristat
	Integer ethnicity
	String timeStamp3
	Integer cigNow
	String timeStamp4
	Integer drink
	Integer drinkNow
	Integer drinkNow5
	String timeStamp5
	Integer fHealth
	Integer fAsthma
	Integer fEczema
	Integer fAllergies
	Integer fHighbp
	Integer fDiabetes
	Integer fHighcholest
	Integer fCancer
	String fCancerTypeOth
	Integer fSicklecell
	Integer fAutoimmune
	Integer fAutoimmuneType
	String fAutoimmuneTypeOth
	Integer fBirthDefect
	String fDefectType
	Integer fBlind
	Integer fDeaf
	Integer fAdd
	Integer fAutism
	Integer fBipolar
	Integer fDepression
	Integer fAnxiety
	Integer fOthCondition
	String fConditionOth
	String timeStamp6
	Integer working
	Integer workHrs
	Integer jobSatisfied
	Integer hhMembers
	Integer numChild
	Integer income
	String timeStamp7
	Integer bothered
	Integer appetitePoor
	Integer blues
	Integer goodAsOthers
	Integer trbKeepMind
	Integer depressed
	Integer evthgEffort
	Integer hopefulFuture
	Integer lifeFailure
	Integer feltFearful
	Integer sleepRestless
	Integer happy
	Integer talkedLess
	Integer feltLonely
	Integer peopleUnfriendly
	Integer enjoyedLife
	Integer cryingSpells
	Integer feltSad
	Integer feelPeopDislike
	Integer notGetGoing
	String timeStamp8
	Integer bornUs
	Integer timeUs
	Integer mBornUs
	Integer fBornUs
	Integer insEmploy
	Integer insPurchased
	Integer insMedicaid
	Integer insTricare
	Integer insIhs
	Integer insMedicare
	Integer insOth
	String timeStamp9
	Integer numPeopleComm
	Integer freqComm
	Integer socialSupport
	String timeStamp10
	Integer timing
	Integer discussPreg
	Integer seenSono
	Integer listenHeart
	Integer feltMove
	Integer attendLamaze
	Integer boughtBaby
	Integer planAttendBirth
	Integer childLname
	Integer wantChildLname
	Integer famAttendBirth
	Integer wantFamAttend
	Integer fTimeEssential
	Integer affectDifficult
	Integer fInvolvedAsM
	Integer fEffectsBaby
	Integer fProvideMatter
	Integer fSupportM
	Integer fReward
	String timeStamp11
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "father_pv1"

	public FatherPv1(XMLStreamReader reader, boolean strict) {
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
								case 'father_id':
									fatherId = elementText
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
								case 'time_stamp_1':
									timeStamp1 = elementText
									break
								case 'f_int_ready':
									fIntReady = elementText.toInteger()
									break
								case 'time_stamp_2':
									timeStamp2 = elementText
									break
								case 'r_fname':
									rFname = elementText
									break
								case 'r_lname':
									rLname = elementText
									break
								case 'person_dob':
									personDob = elementText
									break
								case 'age_elig':
									ageElig = elementText.toInteger()
									break
								case 'f_relate':
									fRelate = elementText.toInteger()
									break
								case 'f_relate_oth':
									fRelateOth = elementText
									break
								case 'f_maristat':
									fMaristat = elementText.toInteger()
									break
								case 'ethnicity':
									ethnicity = elementText.toInteger()
									break
								case 'time_stamp_3':
									timeStamp3 = elementText
									break
								case 'cig_now':
									cigNow = elementText.toInteger()
									break
								case 'time_stamp_4':
									timeStamp4 = elementText
									break
								case 'drink':
									drink = elementText.toInteger()
									break
								case 'drink_now':
									drinkNow = elementText.toInteger()
									break
								case 'drink_now_5':
									drinkNow5 = elementText.toInteger()
									break
								case 'time_stamp_5':
									timeStamp5 = elementText
									break
								case 'f_health':
									fHealth = elementText.toInteger()
									break
								case 'f_asthma':
									fAsthma = elementText.toInteger()
									break
								case 'f_eczema':
									fEczema = elementText.toInteger()
									break
								case 'f_allergies':
									fAllergies = elementText.toInteger()
									break
								case 'f_highbp':
									fHighbp = elementText.toInteger()
									break
								case 'f_diabetes':
									fDiabetes = elementText.toInteger()
									break
								case 'f_highcholest':
									fHighcholest = elementText.toInteger()
									break
								case 'f_cancer':
									fCancer = elementText.toInteger()
									break
								case 'f_cancer_type_oth':
									fCancerTypeOth = elementText
									break
								case 'f_sicklecell':
									fSicklecell = elementText.toInteger()
									break
								case 'f_autoimmune':
									fAutoimmune = elementText.toInteger()
									break
								case 'f_autoimmune_type':
									fAutoimmuneType = elementText.toInteger()
									break
								case 'f_autoimmune_type_oth':
									fAutoimmuneTypeOth = elementText
									break
								case 'f_birth_defect':
									fBirthDefect = elementText.toInteger()
									break
								case 'f_defect_type':
									fDefectType = elementText
									break
								case 'f_blind':
									fBlind = elementText.toInteger()
									break
								case 'f_deaf':
									fDeaf = elementText.toInteger()
									break
								case 'f_add':
									fAdd = elementText.toInteger()
									break
								case 'f_autism':
									fAutism = elementText.toInteger()
									break
								case 'f_bipolar':
									fBipolar = elementText.toInteger()
									break
								case 'f_depression':
									fDepression = elementText.toInteger()
									break
								case 'f_anxiety':
									fAnxiety = elementText.toInteger()
									break
								case 'f_oth_condition':
									fOthCondition = elementText.toInteger()
									break
								case 'f_condition_oth':
									fConditionOth = elementText
									break
								case 'time_stamp_6':
									timeStamp6 = elementText
									break
								case 'working':
									working = elementText.toInteger()
									break
								case 'work_hrs':
									workHrs = elementText.toInteger()
									break
								case 'job_satisfied':
									jobSatisfied = elementText.toInteger()
									break
								case 'hh_members':
									hhMembers = elementText.toInteger()
									break
								case 'num_child':
									numChild = elementText.toInteger()
									break
								case 'income':
									income = elementText.toInteger()
									break
								case 'time_stamp_7':
									timeStamp7 = elementText
									break
								case 'bothered':
									bothered = elementText.toInteger()
									break
								case 'appetite_poor':
									appetitePoor = elementText.toInteger()
									break
								case 'blues':
									blues = elementText.toInteger()
									break
								case 'good_as_others':
									goodAsOthers = elementText.toInteger()
									break
								case 'trb_keep_mind':
									trbKeepMind = elementText.toInteger()
									break
								case 'depressed':
									depressed = elementText.toInteger()
									break
								case 'evthg_effort':
									evthgEffort = elementText.toInteger()
									break
								case 'hopeful_future':
									hopefulFuture = elementText.toInteger()
									break
								case 'life_failure':
									lifeFailure = elementText.toInteger()
									break
								case 'felt_fearful':
									feltFearful = elementText.toInteger()
									break
								case 'sleep_restless':
									sleepRestless = elementText.toInteger()
									break
								case 'happy':
									happy = elementText.toInteger()
									break
								case 'talked_less':
									talkedLess = elementText.toInteger()
									break
								case 'felt_lonely':
									feltLonely = elementText.toInteger()
									break
								case 'people_unfriendly':
									peopleUnfriendly = elementText.toInteger()
									break
								case 'enjoyed_life':
									enjoyedLife = elementText.toInteger()
									break
								case 'crying_spells':
									cryingSpells = elementText.toInteger()
									break
								case 'felt_sad':
									feltSad = elementText.toInteger()
									break
								case 'feel_peop_dislike':
									feelPeopDislike = elementText.toInteger()
									break
								case 'not_get_going':
									notGetGoing = elementText.toInteger()
									break
								case 'time_stamp_8':
									timeStamp8 = elementText
									break
								case 'born_us':
									bornUs = elementText.toInteger()
									break
								case 'time_us':
									timeUs = elementText.toInteger()
									break
								case 'm_born_us':
									mBornUs = elementText.toInteger()
									break
								case 'f_born_us':
									fBornUs = elementText.toInteger()
									break
								case 'ins_employ':
									insEmploy = elementText.toInteger()
									break
								case 'ins_purchased':
									insPurchased = elementText.toInteger()
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
								case 'time_stamp_9':
									timeStamp9 = elementText
									break
								case 'num_people_comm':
									numPeopleComm = elementText.toInteger()
									break
								case 'freq_comm':
									freqComm = elementText.toInteger()
									break
								case 'social_support':
									socialSupport = elementText.toInteger()
									break
								case 'time_stamp_10':
									timeStamp10 = elementText
									break
								case 'timing':
									timing = elementText.toInteger()
									break
								case 'discuss_preg':
									discussPreg = elementText.toInteger()
									break
								case 'seen_sono':
									seenSono = elementText.toInteger()
									break
								case 'listen_heart':
									listenHeart = elementText.toInteger()
									break
								case 'felt_move':
									feltMove = elementText.toInteger()
									break
								case 'attend_lamaze':
									attendLamaze = elementText.toInteger()
									break
								case 'bought_baby':
									boughtBaby = elementText.toInteger()
									break
								case 'plan_attend_birth':
									planAttendBirth = elementText.toInteger()
									break
								case 'child_lname':
									childLname = elementText.toInteger()
									break
								case 'want_child_lname':
									wantChildLname = elementText.toInteger()
									break
								case 'fam_attend_birth':
									famAttendBirth = elementText.toInteger()
									break
								case 'want_fam_attend':
									wantFamAttend = elementText.toInteger()
									break
								case 'f_time_essential':
									fTimeEssential = elementText.toInteger()
									break
								case 'affect_difficult':
									affectDifficult = elementText.toInteger()
									break
								case 'f_involved_as_m':
									fInvolvedAsM = elementText.toInteger()
									break
								case 'f_effects_baby':
									fEffectsBaby = elementText.toInteger()
									break
								case 'f_provide_matter':
									fProvideMatter = elementText.toInteger()
									break
								case 'f_support_m':
									fSupportM = elementText.toInteger()
									break
								case 'f_reward':
									fReward = elementText.toInteger()
									break
								case 'time_stamp_11':
									timeStamp11 = elementText
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
		fatherId(nullable: false, minSize:1, maxSize:36)
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
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		fIntReady(nullable: false, inList:[1, 2, -4])
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rFname(nullable: true, maxSize:30)
		rLname(nullable: true, maxSize:30)
		personDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		ageElig(nullable: false, inList:[1, 2, -6, -4])
		fRelate(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		fRelateOth(nullable: true, maxSize:255)
		fMaristat(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -2, -3, -4])
		ethnicity(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cigNow(nullable: false, inList:[1, 2, -1, -2, -4])
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		drink(nullable: false, inList:[1, 2, -1, -2, -4])
		drinkNow(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4])
		drinkNow5(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		fHealth(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		fAsthma(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fEczema(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fAllergies(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fHighbp(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fDiabetes(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fHighcholest(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fCancer(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fCancerTypeOth(nullable: true, maxSize:255)
		fSicklecell(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fAutoimmune(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fAutoimmuneType(nullable: false, inList:[1, 2, 3, 4, 5, -5, -1, -2, -3, -4])
		fAutoimmuneTypeOth(nullable: true, maxSize:255)
		fBirthDefect(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fDefectType(nullable: true, maxSize:255)
		fBlind(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fDeaf(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fAdd(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fAutism(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fBipolar(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fDepression(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fAnxiety(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fOthCondition(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fConditionOth(nullable: true, maxSize:255)
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		working(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		workHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		jobSatisfied(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		hhMembers(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numChild(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		income(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		bothered(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		appetitePoor(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		blues(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		goodAsOthers(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		trbKeepMind(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		depressed(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		evthgEffort(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		hopefulFuture(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		lifeFailure(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		feltFearful(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		sleepRestless(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		happy(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		talkedLess(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		feltLonely(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		peopleUnfriendly(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		enjoyedLife(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		cryingSpells(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		feltSad(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		feelPeopDislike(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		notGetGoing(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		bornUs(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeUs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		mBornUs(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fBornUs(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insEmploy(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insPurchased(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insMedicaid(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insTricare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insIhs(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insMedicare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insOth(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		numPeopleComm(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		freqComm(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4])
		socialSupport(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timing(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		discussPreg(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		seenSono(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		listenHeart(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		feltMove(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		attendLamaze(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		boughtBaby(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		planAttendBirth(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		childLname(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		wantChildLname(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		famAttendBirth(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		wantFamAttend(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fTimeEssential(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		affectDifficult(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		fInvolvedAsM(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		fEffectsBaby(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		fProvideMatter(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		fSupportM(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		fReward(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'father_pv1'

		psuId column:'psu_id'
		fatherId column:'father_id'
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
		timeStamp1 column:'time_stamp_1'
		fIntReady column:'f_int_ready'
		timeStamp2 column:'time_stamp_2'
		rFname column:'r_fname'
		rLname column:'r_lname'
		personDob column:'person_dob'
		ageElig column:'age_elig'
		fRelate column:'f_relate'
		fRelateOth column:'f_relate_oth'
		fMaristat column:'f_maristat'
		ethnicity column:'ethnicity'
		timeStamp3 column:'time_stamp_3'
		cigNow column:'cig_now'
		timeStamp4 column:'time_stamp_4'
		drink column:'drink'
		drinkNow column:'drink_now'
		drinkNow5 column:'drink_now_5'
		timeStamp5 column:'time_stamp_5'
		fHealth column:'f_health'
		fAsthma column:'f_asthma'
		fEczema column:'f_eczema'
		fAllergies column:'f_allergies'
		fHighbp column:'f_highbp'
		fDiabetes column:'f_diabetes'
		fHighcholest column:'f_highcholest'
		fCancer column:'f_cancer'
		fCancerTypeOth column:'f_cancer_type_oth'
		fSicklecell column:'f_sicklecell'
		fAutoimmune column:'f_autoimmune'
		fAutoimmuneType column:'f_autoimmune_type'
		fAutoimmuneTypeOth column:'f_autoimmune_type_oth'
		fBirthDefect column:'f_birth_defect'
		fDefectType column:'f_defect_type'
		fBlind column:'f_blind'
		fDeaf column:'f_deaf'
		fAdd column:'f_add'
		fAutism column:'f_autism'
		fBipolar column:'f_bipolar'
		fDepression column:'f_depression'
		fAnxiety column:'f_anxiety'
		fOthCondition column:'f_oth_condition'
		fConditionOth column:'f_condition_oth'
		timeStamp6 column:'time_stamp_6'
		working column:'working'
		workHrs column:'work_hrs'
		jobSatisfied column:'job_satisfied'
		hhMembers column:'hh_members'
		numChild column:'num_child'
		income column:'income'
		timeStamp7 column:'time_stamp_7'
		bothered column:'bothered'
		appetitePoor column:'appetite_poor'
		blues column:'blues'
		goodAsOthers column:'good_as_others'
		trbKeepMind column:'trb_keep_mind'
		depressed column:'depressed'
		evthgEffort column:'evthg_effort'
		hopefulFuture column:'hopeful_future'
		lifeFailure column:'life_failure'
		feltFearful column:'felt_fearful'
		sleepRestless column:'sleep_restless'
		happy column:'happy'
		talkedLess column:'talked_less'
		feltLonely column:'felt_lonely'
		peopleUnfriendly column:'people_unfriendly'
		enjoyedLife column:'enjoyed_life'
		cryingSpells column:'crying_spells'
		feltSad column:'felt_sad'
		feelPeopDislike column:'feel_peop_dislike'
		notGetGoing column:'not_get_going'
		timeStamp8 column:'time_stamp_8'
		bornUs column:'born_us'
		timeUs column:'time_us'
		mBornUs column:'m_born_us'
		fBornUs column:'f_born_us'
		insEmploy column:'ins_employ'
		insPurchased column:'ins_purchased'
		insMedicaid column:'ins_medicaid'
		insTricare column:'ins_tricare'
		insIhs column:'ins_ihs'
		insMedicare column:'ins_medicare'
		insOth column:'ins_oth'
		timeStamp9 column:'time_stamp_9'
		numPeopleComm column:'num_people_comm'
		freqComm column:'freq_comm'
		socialSupport column:'social_support'
		timeStamp10 column:'time_stamp_10'
		timing column:'timing'
		discussPreg column:'discuss_preg'
		seenSono column:'seen_sono'
		listenHeart column:'listen_heart'
		feltMove column:'felt_move'
		attendLamaze column:'attend_lamaze'
		boughtBaby column:'bought_baby'
		planAttendBirth column:'plan_attend_birth'
		childLname column:'child_lname'
		wantChildLname column:'want_child_lname'
		famAttendBirth column:'fam_attend_birth'
		wantFamAttend column:'want_fam_attend'
		fTimeEssential column:'f_time_essential'
		affectDifficult column:'affect_difficult'
		fInvolvedAsM column:'f_involved_as_m'
		fEffectsBaby column:'f_effects_baby'
		fProvideMatter column:'f_provide_matter'
		fSupportM column:'f_support_m'
		fReward column:'f_reward'
		timeStamp11 column:'time_stamp_11'
		transactionType column:'transaction_type'
	}
}
