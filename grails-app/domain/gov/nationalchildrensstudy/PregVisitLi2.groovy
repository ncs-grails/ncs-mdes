package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class PregVisitLi2 {

	Integer psuId
	String pvLiId
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
	Integer female1
	String bestTtc1
	Integer bestTtc2
	Integer bestTtc3
	Integer phone
	String phoneNbr
	String timeStamp2
	Integer pregnant
	String timeStamp3
	Integer lossInfo
	String dueDate
	Integer knowDate
	String datePeriod
	Integer knewDate
	String timeStamp4
	Integer homeTest
	Integer birthPlan
	String birthPlanOth
	String birthPlace
	String bAddressId
	String bAddress1
	String bAddress2
	String bCity
	Integer bState
	String bZipcode
	Integer pnVitamin
	Integer pregVitamin
	String dateVisit
	Integer diabetes1
	Integer highbpPreg
	Integer urine
	Integer preeclamp
	Integer earlyLabor
	Integer anemia
	Integer nausea
	Integer kidney
	Integer rhDisease
	Integer groupB
	Integer herpes
	Integer vaginosis
	Integer othCondition
	String conditionOth
	String timeStamp5
	Integer health
	Integer heightFt
	Integer htInch
	Integer weight
	Integer asthma
	Integer highbpNotpreg
	Integer diabetesNotpreg
	Integer diabetes2
	Integer diabetes3
	Integer thyroid1
	Integer thyroid2
	Integer hlthCare
	String timeStamp6
	Integer insure
	Integer insEmploy
	Integer insMedicaid
	Integer insTricare
	Integer insIhs
	Integer insMedicare
	Integer insOth
	String timeStamp7
	Integer ageHome
	Integer mainHeat
	String mainHeatOth
	Integer waterDrink
	String waterDrinkOth
	String timeStamp8
	Integer cigNow
	Integer cigNowFreq
	Integer cigNowNum
	Integer drinkNow
	Integer drinkNowNum
	Integer drinkNow5
	String timeStamp9
	String timeStamp10
	Integer learn
	Integer help
	Integer incent
	Integer research
	Integer envir
	Integer community
	Integer knowOthers
	Integer family
	Integer doctor
	Integer opinSpouse
	Integer opinFamily
	Integer opinFriend
	Integer opinDr
	Integer experience
	Integer improve
	Integer intLength
	Integer intStress
	Integer intRepeat
	String timeStamp11
	String timeStamp12
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "preg_visit_li_2"

	public PregVisitLi2(XMLStreamReader reader, boolean strict) {
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
								case 'pv_li_id':
									pvLiId = elementText
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
								case 'female_1':
									female1 = elementText.toInteger()
									break
								case 'best_ttc_1':
									bestTtc1 = elementText
									break
								case 'best_ttc_2':
									bestTtc2 = elementText.toInteger()
									break
								case 'best_ttc_3':
									bestTtc3 = elementText.toInteger()
									break
								case 'phone':
									phone = elementText.toInteger()
									break
								case 'phone_nbr':
									phoneNbr = elementText
									break
								case 'time_stamp_2':
									timeStamp2 = elementText
									break
								case 'pregnant':
									pregnant = elementText.toInteger()
									break
								case 'time_stamp_3':
									timeStamp3 = elementText
									break
								case 'loss_info':
									lossInfo = elementText.toInteger()
									break
								case 'due_date':
									dueDate = elementText
									break
								case 'know_date':
									knowDate = elementText.toInteger()
									break
								case 'date_period':
									datePeriod = elementText
									break
								case 'knew_date':
									knewDate = elementText.toInteger()
									break
								case 'time_stamp_4':
									timeStamp4 = elementText
									break
								case 'home_test':
									homeTest = elementText.toInteger()
									break
								case 'birth_plan':
									birthPlan = elementText.toInteger()
									break
								case 'birth_plan_oth':
									birthPlanOth = elementText
									break
								case 'birth_place':
									birthPlace = elementText
									break
								case 'b_address_id':
									bAddressId = elementText
									break
								case 'b_address_1':
									bAddress1 = elementText
									break
								case 'b_address_2':
									bAddress2 = elementText
									break
								case 'b_city':
									bCity = elementText
									break
								case 'b_state':
									bState = elementText.toInteger()
									break
								case 'b_zipcode':
									bZipcode = elementText
									break
								case 'pn_vitamin':
									pnVitamin = elementText.toInteger()
									break
								case 'preg_vitamin':
									pregVitamin = elementText.toInteger()
									break
								case 'date_visit':
									dateVisit = elementText
									break
								case 'diabetes_1':
									diabetes1 = elementText.toInteger()
									break
								case 'highbp_preg':
									highbpPreg = elementText.toInteger()
									break
								case 'urine':
									urine = elementText.toInteger()
									break
								case 'preeclamp':
									preeclamp = elementText.toInteger()
									break
								case 'early_labor':
									earlyLabor = elementText.toInteger()
									break
								case 'anemia':
									anemia = elementText.toInteger()
									break
								case 'nausea':
									nausea = elementText.toInteger()
									break
								case 'kidney':
									kidney = elementText.toInteger()
									break
								case 'rh_disease':
									rhDisease = elementText.toInteger()
									break
								case 'group_b':
									groupB = elementText.toInteger()
									break
								case 'herpes':
									herpes = elementText.toInteger()
									break
								case 'vaginosis':
									vaginosis = elementText.toInteger()
									break
								case 'oth_condition':
									othCondition = elementText.toInteger()
									break
								case 'condition_oth':
									conditionOth = elementText
									break
								case 'time_stamp_5':
									timeStamp5 = elementText
									break
								case 'health':
									health = elementText.toInteger()
									break
								case 'height_ft':
									heightFt = elementText.toInteger()
									break
								case 'ht_inch':
									htInch = elementText.toInteger()
									break
								case 'weight':
									weight = elementText.toInteger()
									break
								case 'asthma':
									asthma = elementText.toInteger()
									break
								case 'highbp_notpreg':
									highbpNotpreg = elementText.toInteger()
									break
								case 'diabetes_notpreg':
									diabetesNotpreg = elementText.toInteger()
									break
								case 'diabetes_2':
									diabetes2 = elementText.toInteger()
									break
								case 'diabetes_3':
									diabetes3 = elementText.toInteger()
									break
								case 'thyroid_1':
									thyroid1 = elementText.toInteger()
									break
								case 'thyroid_2':
									thyroid2 = elementText.toInteger()
									break
								case 'hlth_care':
									hlthCare = elementText.toInteger()
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
								case 'age_home':
									ageHome = elementText.toInteger()
									break
								case 'main_heat':
									mainHeat = elementText.toInteger()
									break
								case 'main_heat_oth':
									mainHeatOth = elementText
									break
								case 'water_drink':
									waterDrink = elementText.toInteger()
									break
								case 'water_drink_oth':
									waterDrinkOth = elementText
									break
								case 'time_stamp_8':
									timeStamp8 = elementText
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
								case 'drink_now':
									drinkNow = elementText.toInteger()
									break
								case 'drink_now_num':
									drinkNowNum = elementText.toInteger()
									break
								case 'drink_now_5':
									drinkNow5 = elementText.toInteger()
									break
								case 'time_stamp_9':
									timeStamp9 = elementText
									break
								case 'time_stamp_10':
									timeStamp10 = elementText
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
								case 'time_stamp_11':
									timeStamp11 = elementText
									break
								case 'time_stamp_12':
									timeStamp12 = elementText
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
		pvLiId(nullable: false, minSize:1, maxSize:36)
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
		female1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bestTtc1(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		bestTtc2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bestTtc3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		phone(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		phoneNbr(nullable: true, maxSize:10)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregnant(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		lossInfo(nullable: false, inList:[1, 2, -3, -4])
		dueDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		knowDate(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		datePeriod(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		knewDate(nullable: false, inList:[1, 2, -3, -4])
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		homeTest(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		birthPlan(nullable: false, inList:[1, 2, 3, -5, -1, -2, -3, -4])
		birthPlanOth(nullable: false, minSize:1, maxSize:255)
		birthPlace(nullable: true, maxSize:100)
		bAddressId(nullable: true, maxSize:36)
		bAddress1(nullable: true, maxSize:100)
		bAddress2(nullable: true, maxSize:100)
		bCity(nullable: true, maxSize:50)
		bState(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		bZipcode(nullable: true, maxSize:5)
		pnVitamin(nullable: false, inList:[1, 2, -1, -2, -4])
		pregVitamin(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		dateVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		diabetes1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		highbpPreg(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		urine(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		preeclamp(nullable: false, inList:[1, 2, -1, -2, -4])
		earlyLabor(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		anemia(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		nausea(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		kidney(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		rhDisease(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		groupB(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		herpes(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		vaginosis(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		othCondition(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		conditionOth(nullable: true, maxSize:255)
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		health(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		heightFt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		htInch(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		weight(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		asthma(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		highbpNotpreg(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		diabetesNotpreg(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		diabetes2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		diabetes3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		thyroid1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		thyroid2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		hlthCare(nullable: false, inList:[1, 2, 3, 4, -5, 6, -7, -1, -2, -3, -4])
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		insure(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insEmploy(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insMedicaid(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insTricare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insIhs(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insMedicare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insOth(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		ageHome(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		mainHeat(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, -7, -5, -1, -2, -3, -4])
		mainHeatOth(nullable: true, maxSize:255)
		waterDrink(nullable: false, inList:[1, 2, 3, -5, -1, -2, -3, -4])
		waterDrinkOth(nullable: true, maxSize:255)
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cigNow(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cigNowFreq(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4])
		cigNowNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		drinkNow(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4])
		drinkNowNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		drinkNow5(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		learn(nullable: false, inList:[1, 2, 3, -3, -4])
		help(nullable: false, inList:[1, 2, 3, -3, -4])
		incent(nullable: false, inList:[1, 2, 3, -3, -4])
		research(nullable: false, inList:[1, 2, 3, -3, -4])
		envir(nullable: false, inList:[1, 2, 3, -3, -4])
		community(nullable: false, inList:[1, 2, 3, -3, -4])
		knowOthers(nullable: false, inList:[1, 2, 3, -3, -4])
		family(nullable: false, inList:[1, 2, 3, -3, -4])
		doctor(nullable: false, inList:[1, 2, 3, -3, -4])
		opinSpouse(nullable: false, inList:[1, 2, 3, 4, 5, -7, -3, -4])
		opinFamily(nullable: false, inList:[1, 2, 3, 4, 5, -7, -3, -4])
		opinFriend(nullable: false, inList:[1, 2, 3, 4, 5, -7, -3, -4])
		opinDr(nullable: false, inList:[1, 2, 3, 4, 5, -7, -3, -4])
		experience(nullable: false, inList:[1, 2, 3, 4, 5, -3, -4])
		improve(nullable: false, inList:[1, 2, 3, 4, -4])
		intLength(nullable: false, inList:[1, 2, 3, -3, -4])
		intStress(nullable: false, inList:[1, 2, 3, 4, -3, -4])
		intRepeat(nullable: false, inList:[1, 2, -4])
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_li_2'

		psuId column:'psu_id'
		pvLiId column:'pv_li_id'
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
		female1 column:'female_1'
		bestTtc1 column:'best_ttc_1'
		bestTtc2 column:'best_ttc_2'
		bestTtc3 column:'best_ttc_3'
		phone column:'phone'
		phoneNbr column:'phone_nbr'
		timeStamp2 column:'time_stamp_2'
		pregnant column:'pregnant'
		timeStamp3 column:'time_stamp_3'
		lossInfo column:'loss_info'
		dueDate column:'due_date'
		knowDate column:'know_date'
		datePeriod column:'date_period'
		knewDate column:'knew_date'
		timeStamp4 column:'time_stamp_4'
		homeTest column:'home_test'
		birthPlan column:'birth_plan'
		birthPlanOth column:'birth_plan_oth'
		birthPlace column:'birth_place'
		bAddressId column:'b_address_id'
		bAddress1 column:'b_address_1'
		bAddress2 column:'b_address_2'
		bCity column:'b_city'
		bState column:'b_state'
		bZipcode column:'b_zipcode'
		pnVitamin column:'pn_vitamin'
		pregVitamin column:'preg_vitamin'
		dateVisit column:'date_visit'
		diabetes1 column:'diabetes_1'
		highbpPreg column:'highbp_preg'
		urine column:'urine'
		preeclamp column:'preeclamp'
		earlyLabor column:'early_labor'
		anemia column:'anemia'
		nausea column:'nausea'
		kidney column:'kidney'
		rhDisease column:'rh_disease'
		groupB column:'group_b'
		herpes column:'herpes'
		vaginosis column:'vaginosis'
		othCondition column:'oth_condition'
		conditionOth column:'condition_oth'
		timeStamp5 column:'time_stamp_5'
		health column:'health'
		heightFt column:'height_ft'
		htInch column:'ht_inch'
		weight column:'weight'
		asthma column:'asthma'
		highbpNotpreg column:'highbp_notpreg'
		diabetesNotpreg column:'diabetes_notpreg'
		diabetes2 column:'diabetes_2'
		diabetes3 column:'diabetes_3'
		thyroid1 column:'thyroid_1'
		thyroid2 column:'thyroid_2'
		hlthCare column:'hlth_care'
		timeStamp6 column:'time_stamp_6'
		insure column:'insure'
		insEmploy column:'ins_employ'
		insMedicaid column:'ins_medicaid'
		insTricare column:'ins_tricare'
		insIhs column:'ins_ihs'
		insMedicare column:'ins_medicare'
		insOth column:'ins_oth'
		timeStamp7 column:'time_stamp_7'
		ageHome column:'age_home'
		mainHeat column:'main_heat'
		mainHeatOth column:'main_heat_oth'
		waterDrink column:'water_drink'
		waterDrinkOth column:'water_drink_oth'
		timeStamp8 column:'time_stamp_8'
		cigNow column:'cig_now'
		cigNowFreq column:'cig_now_freq'
		cigNowNum column:'cig_now_num'
		drinkNow column:'drink_now'
		drinkNowNum column:'drink_now_num'
		drinkNow5 column:'drink_now_5'
		timeStamp9 column:'time_stamp_9'
		timeStamp10 column:'time_stamp_10'
		learn column:'learn'
		help column:'help'
		incent column:'incent'
		research column:'research'
		envir column:'envir'
		community column:'community'
		knowOthers column:'know_others'
		family column:'family'
		doctor column:'doctor'
		opinSpouse column:'opin_spouse'
		opinFamily column:'opin_family'
		opinFriend column:'opin_friend'
		opinDr column:'opin_dr'
		experience column:'experience'
		improve column:'improve'
		intLength column:'int_length'
		intStress column:'int_stress'
		intRepeat column:'int_repeat'
		timeStamp11 column:'time_stamp_11'
		timeStamp12 column:'time_stamp_12'
		transactionType column:'transaction_type'
	}
}
