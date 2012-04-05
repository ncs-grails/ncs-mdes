package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class PregVisit22 {

	Integer psuId
	String pv2Id
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
	Integer nameConfirm
	String rFname
	String rLname
	Integer dobConfirm
	String personDob
	Integer ageElig
	String timeStamp2
	Integer pregnant
	String timeStamp3
	Integer lossInfo
	String dueDate
	Integer dateKnown
	Integer bplanChange
	Integer birthPlan
	String birthPlace
	String bAddressId
	String bAddress1
	String bAddress2
	String bCity
	Integer bState
	String bZipcode
	Integer usePrLog
	Integer reasonNoPrLog
	String reasonNoPrLogOth
	Integer numProvPrLog
	Integer numProvRec
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
	String timeStamp4
	Integer hospital
	String adminDate
	Integer hospNights
	Integer diagnose
	String timeStamp5
	Integer recentMove
	Integer ownHome
	String ownHomeOth
	Integer ageHome
	Integer lengthReside
	Integer lengthResideUnit
	Integer mainHeat
	String mainHeatOth
	Integer cooling
	String timeStamp6
	Integer waterDrink
	String waterDrinkOth
	Integer waterCook
	String waterCookOth
	String timeStamp7
	Integer water
	Integer mold
	String timeStamp8
	Integer prenovate2
	Integer pdecorate2
	String timeStamp9
	Integer working
	Integer hours
	Integer shiftWork
	String timeStamp10
	Integer listen
	Integer advice
	Integer affection
	Integer dailyHelp
	Integer emotSupport
	Integer amtSupport
	String timeStamp11
	Integer insure
	Integer insEmploy
	Integer insMedicaid
	Integer insTricare
	Integer insIhs
	Integer insMedicare
	Integer insOth
	String timeStamp12
	Integer commEmail
	Integer haveEmail
	Integer email2
	Integer email3
	String email
	Integer commCell
	Integer cellPhone1
	Integer cellPhone2
	Integer cellPhone3
	Integer cellPhone4
	String cellPhone
	String timeStamp13
	Integer commContact
	Integer contact1
	String contactFname1
	String contactLname1
	Integer contactRelate1
	String contactRelate1Oth
	String cAddr1Id
	String cAddr11
	String cAddr21
	String cUnit1
	String cCity1
	Integer cState1
	String cZipcode1
	String cZip41
	String contactPhone1
	String contactFname2
	String contactLname2
	Integer contactRelate2
	String contactRelate2Oth
	String cAddr2Id
	String cAddr12
	String cAddr22
	String cUnit2
	String cCity2
	Integer cState2
	String cZipcode2
	String cZip42
	String contactPhone2
	String timeStamp14
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "preg_visit_2_2"

	public PregVisit22(XMLStreamReader reader, boolean strict) {
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
								case 'pv2_id':
									pv2Id = elementText
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
								case 'name_confirm':
									nameConfirm = elementText.toInteger()
									break
								case 'r_fname':
									rFname = elementText
									break
								case 'r_lname':
									rLname = elementText
									break
								case 'dob_confirm':
									dobConfirm = elementText.toInteger()
									break
								case 'person_dob':
									personDob = elementText
									break
								case 'age_elig':
									ageElig = elementText.toInteger()
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
								case 'date_known':
									dateKnown = elementText.toInteger()
									break
								case 'bplan_change':
									bplanChange = elementText.toInteger()
									break
								case 'birth_plan':
									birthPlan = elementText.toInteger()
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
								case 'use_pr_log':
									usePrLog = elementText.toInteger()
									break
								case 'reason_no_pr_log':
									reasonNoPrLog = elementText.toInteger()
									break
								case 'reason_no_pr_log_oth':
									reasonNoPrLogOth = elementText
									break
								case 'num_prov_pr_log':
									numProvPrLog = elementText.toInteger()
									break
								case 'num_prov_rec':
									numProvRec = elementText.toInteger()
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
								case 'time_stamp_4':
									timeStamp4 = elementText
									break
								case 'hospital':
									hospital = elementText.toInteger()
									break
								case 'admin_date':
									adminDate = elementText
									break
								case 'hosp_nights':
									hospNights = elementText.toInteger()
									break
								case 'diagnose':
									diagnose = elementText.toInteger()
									break
								case 'time_stamp_5':
									timeStamp5 = elementText
									break
								case 'recent_move':
									recentMove = elementText.toInteger()
									break
								case 'own_home':
									ownHome = elementText.toInteger()
									break
								case 'own_home_oth':
									ownHomeOth = elementText
									break
								case 'age_home':
									ageHome = elementText.toInteger()
									break
								case 'length_reside':
									lengthReside = elementText.toInteger()
									break
								case 'length_reside_unit':
									lengthResideUnit = elementText.toInteger()
									break
								case 'main_heat':
									mainHeat = elementText.toInteger()
									break
								case 'main_heat_oth':
									mainHeatOth = elementText
									break
								case 'cooling':
									cooling = elementText.toInteger()
									break
								case 'time_stamp_6':
									timeStamp6 = elementText
									break
								case 'water_drink':
									waterDrink = elementText.toInteger()
									break
								case 'water_drink_oth':
									waterDrinkOth = elementText
									break
								case 'water_cook':
									waterCook = elementText.toInteger()
									break
								case 'water_cook_oth':
									waterCookOth = elementText
									break
								case 'time_stamp_7':
									timeStamp7 = elementText
									break
								case 'water':
									water = elementText.toInteger()
									break
								case 'mold':
									mold = elementText.toInteger()
									break
								case 'time_stamp_8':
									timeStamp8 = elementText
									break
								case 'prenovate2':
									prenovate2 = elementText.toInteger()
									break
								case 'pdecorate2':
									pdecorate2 = elementText.toInteger()
									break
								case 'time_stamp_9':
									timeStamp9 = elementText
									break
								case 'working':
									working = elementText.toInteger()
									break
								case 'hours':
									hours = elementText.toInteger()
									break
								case 'shift_work':
									shiftWork = elementText.toInteger()
									break
								case 'time_stamp_10':
									timeStamp10 = elementText
									break
								case 'listen':
									listen = elementText.toInteger()
									break
								case 'advice':
									advice = elementText.toInteger()
									break
								case 'affection':
									affection = elementText.toInteger()
									break
								case 'daily_help':
									dailyHelp = elementText.toInteger()
									break
								case 'emot_support':
									emotSupport = elementText.toInteger()
									break
								case 'amt_support':
									amtSupport = elementText.toInteger()
									break
								case 'time_stamp_11':
									timeStamp11 = elementText
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
								case 'time_stamp_12':
									timeStamp12 = elementText
									break
								case 'comm_email':
									commEmail = elementText.toInteger()
									break
								case 'have_email':
									haveEmail = elementText.toInteger()
									break
								case 'email_2':
									email2 = elementText.toInteger()
									break
								case 'email_3':
									email3 = elementText.toInteger()
									break
								case 'email':
									email = elementText
									break
								case 'comm_cell':
									commCell = elementText.toInteger()
									break
								case 'cell_phone_1':
									cellPhone1 = elementText.toInteger()
									break
								case 'cell_phone_2':
									cellPhone2 = elementText.toInteger()
									break
								case 'cell_phone_3':
									cellPhone3 = elementText.toInteger()
									break
								case 'cell_phone_4':
									cellPhone4 = elementText.toInteger()
									break
								case 'cell_phone':
									cellPhone = elementText
									break
								case 'time_stamp_13':
									timeStamp13 = elementText
									break
								case 'comm_contact':
									commContact = elementText.toInteger()
									break
								case 'contact_1':
									contact1 = elementText.toInteger()
									break
								case 'contact_fname_1':
									contactFname1 = elementText
									break
								case 'contact_lname_1':
									contactLname1 = elementText
									break
								case 'contact_relate_1':
									contactRelate1 = elementText.toInteger()
									break
								case 'contact_relate1_oth':
									contactRelate1Oth = elementText
									break
								case 'c_addr1_id':
									cAddr1Id = elementText
									break
								case 'c_addr1_1':
									cAddr11 = elementText
									break
								case 'c_addr2_1':
									cAddr21 = elementText
									break
								case 'c_unit_1':
									cUnit1 = elementText
									break
								case 'c_city_1':
									cCity1 = elementText
									break
								case 'c_state_1':
									cState1 = elementText.toInteger()
									break
								case 'c_zipcode_1':
									cZipcode1 = elementText
									break
								case 'c_zip4_1':
									cZip41 = elementText
									break
								case 'contact_phone_1':
									contactPhone1 = elementText
									break
								case 'contact_fname_2':
									contactFname2 = elementText
									break
								case 'contact_lname_2':
									contactLname2 = elementText
									break
								case 'contact_relate_2':
									contactRelate2 = elementText.toInteger()
									break
								case 'contact_relate2_oth':
									contactRelate2Oth = elementText
									break
								case 'c_addr2_id':
									cAddr2Id = elementText
									break
								case 'c_addr1_2':
									cAddr12 = elementText
									break
								case 'c_addr2_2':
									cAddr22 = elementText
									break
								case 'c_unit_2':
									cUnit2 = elementText
									break
								case 'c_city_2':
									cCity2 = elementText
									break
								case 'c_state_2':
									cState2 = elementText.toInteger()
									break
								case 'c_zipcode_2':
									cZipcode2 = elementText
									break
								case 'c_zip4_2':
									cZip42 = elementText
									break
								case 'contact_phone_2':
									contactPhone2 = elementText
									break
								case 'time_stamp_14':
									timeStamp14 = elementText
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
		pv2Id(nullable: false, minSize:1, maxSize:36)
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
		nameConfirm(nullable: false, inList:[1, 2, -1, -2, -4])
		rFname(nullable: true, maxSize:30)
		rLname(nullable: true, maxSize:30)
		dobConfirm(nullable: false, inList:[1, 2, -1, -2, -4])
		personDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		ageElig(nullable: false, inList:[1, 2, 3, 4, -4])
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregnant(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		lossInfo(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		dueDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		dateKnown(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		bplanChange(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		birthPlan(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		birthPlace(nullable: true, maxSize:100)
		bAddressId(nullable: true, maxSize:36)
		bAddress1(nullable: true, maxSize:100)
		bAddress2(nullable: true, maxSize:100)
		bCity(nullable: true, maxSize:50)
		bState(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		bZipcode(nullable: true, maxSize:5)
		usePrLog(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		reasonNoPrLog(nullable: false, inList:[1, 2, 3, 4, 5, -5, -1, -2, -3, -4])
		reasonNoPrLogOth(nullable: true, maxSize:255)
		numProvPrLog(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numProvRec(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		dateVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		diabetes1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		highbpPreg(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		urine(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		preeclamp(nullable: false, inList:[1, 2, -1, -2, -3, -4])
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
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hospital(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		adminDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		hospNights(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		diagnose(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		recentMove(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		ownHome(nullable: false, inList:[1, 2, 3, -5, -1, -2, -3, -4])
		ownHomeOth(nullable: true, maxSize:255)
		ageHome(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		lengthReside(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		lengthResideUnit(nullable: false, inList:[1, 2, 3, -3, -4])
		mainHeat(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, -5, -1, -2, -3, -4])
		mainHeatOth(nullable: true, maxSize:255)
		cooling(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		waterDrink(nullable: false, inList:[1, 2, 3, -5, -1, -2, -3, -4])
		waterDrinkOth(nullable: true, maxSize:255)
		waterCook(nullable: false, inList:[1, 2, 3, -5, -1, -2, -3, -4])
		waterCookOth(nullable: true, maxSize:255)
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		water(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		mold(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		prenovate2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		pdecorate2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		working(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		hours(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		shiftWork(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		listen(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		advice(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		affection(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		dailyHelp(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		emotSupport(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		amtSupport(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		insure(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insEmploy(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insMedicaid(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insTricare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insIhs(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insMedicare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insOth(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		commEmail(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		haveEmail(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		email2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		email3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		email(nullable: true, maxSize:100)
		commCell(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		cellPhone1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone4(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone(nullable: true, maxSize:10)
		timeStamp13(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		commContact(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		contact1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		contactFname1(nullable: true, maxSize:30)
		contactLname1(nullable: true, maxSize:30)
		contactRelate1(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -2, -3, -4])
		contactRelate1Oth(nullable: true, maxSize:255)
		cAddr1Id(nullable: true, maxSize:36)
		cAddr11(nullable: true, maxSize:100)
		cAddr21(nullable: true, maxSize:100)
		cUnit1(nullable: true, maxSize:10)
		cCity1(nullable: true, maxSize:50)
		cState1(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		cZipcode1(nullable: true, maxSize:5)
		cZip41(nullable: true, maxSize:4)
		contactPhone1(nullable: true, maxSize:10)
		contactFname2(nullable: true, maxSize:30)
		contactLname2(nullable: true, maxSize:30)
		contactRelate2(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -2, -3, -4])
		contactRelate2Oth(nullable: true, maxSize:255)
		cAddr2Id(nullable: true, maxSize:36)
		cAddr12(nullable: true, maxSize:100)
		cAddr22(nullable: true, maxSize:100)
		cUnit2(nullable: true, maxSize:10)
		cCity2(nullable: true, maxSize:50)
		cState2(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		cZipcode2(nullable: true, maxSize:5)
		cZip42(nullable: true, maxSize:4)
		contactPhone2(nullable: true, maxSize:10)
		timeStamp14(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_2'

		psuId column:'psu_id'
		pv2Id column:'pv2_id'
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
		nameConfirm column:'name_confirm'
		rFname column:'r_fname'
		rLname column:'r_lname'
		dobConfirm column:'dob_confirm'
		personDob column:'person_dob'
		ageElig column:'age_elig'
		timeStamp2 column:'time_stamp_2'
		pregnant column:'pregnant'
		timeStamp3 column:'time_stamp_3'
		lossInfo column:'loss_info'
		dueDate column:'due_date'
		dateKnown column:'date_known'
		bplanChange column:'bplan_change'
		birthPlan column:'birth_plan'
		birthPlace column:'birth_place'
		bAddressId column:'b_address_id'
		bAddress1 column:'b_address_1'
		bAddress2 column:'b_address_2'
		bCity column:'b_city'
		bState column:'b_state'
		bZipcode column:'b_zipcode'
		usePrLog column:'use_pr_log'
		reasonNoPrLog column:'reason_no_pr_log'
		reasonNoPrLogOth column:'reason_no_pr_log_oth'
		numProvPrLog column:'num_prov_pr_log'
		numProvRec column:'num_prov_rec'
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
		timeStamp4 column:'time_stamp_4'
		hospital column:'hospital'
		adminDate column:'admin_date'
		hospNights column:'hosp_nights'
		diagnose column:'diagnose'
		timeStamp5 column:'time_stamp_5'
		recentMove column:'recent_move'
		ownHome column:'own_home'
		ownHomeOth column:'own_home_oth'
		ageHome column:'age_home'
		lengthReside column:'length_reside'
		lengthResideUnit column:'length_reside_unit'
		mainHeat column:'main_heat'
		mainHeatOth column:'main_heat_oth'
		cooling column:'cooling'
		timeStamp6 column:'time_stamp_6'
		waterDrink column:'water_drink'
		waterDrinkOth column:'water_drink_oth'
		waterCook column:'water_cook'
		waterCookOth column:'water_cook_oth'
		timeStamp7 column:'time_stamp_7'
		water column:'water'
		mold column:'mold'
		timeStamp8 column:'time_stamp_8'
		prenovate2 column:'prenovate2'
		pdecorate2 column:'pdecorate2'
		timeStamp9 column:'time_stamp_9'
		working column:'working'
		hours column:'hours'
		shiftWork column:'shift_work'
		timeStamp10 column:'time_stamp_10'
		listen column:'listen'
		advice column:'advice'
		affection column:'affection'
		dailyHelp column:'daily_help'
		emotSupport column:'emot_support'
		amtSupport column:'amt_support'
		timeStamp11 column:'time_stamp_11'
		insure column:'insure'
		insEmploy column:'ins_employ'
		insMedicaid column:'ins_medicaid'
		insTricare column:'ins_tricare'
		insIhs column:'ins_ihs'
		insMedicare column:'ins_medicare'
		insOth column:'ins_oth'
		timeStamp12 column:'time_stamp_12'
		commEmail column:'comm_email'
		haveEmail column:'have_email'
		email2 column:'email_2'
		email3 column:'email_3'
		email column:'email'
		commCell column:'comm_cell'
		cellPhone1 column:'cell_phone_1'
		cellPhone2 column:'cell_phone_2'
		cellPhone3 column:'cell_phone_3'
		cellPhone4 column:'cell_phone_4'
		cellPhone column:'cell_phone'
		timeStamp13 column:'time_stamp_13'
		commContact column:'comm_contact'
		contact1 column:'contact_1'
		contactFname1 column:'contact_fname_1'
		contactLname1 column:'contact_lname_1'
		contactRelate1 column:'contact_relate_1'
		contactRelate1Oth column:'contact_relate1_oth'
		cAddr1Id column:'c_addr1_id'
		cAddr11 column:'c_addr1_1'
		cAddr21 column:'c_addr2_1'
		cUnit1 column:'c_unit_1'
		cCity1 column:'c_city_1'
		cState1 column:'c_state_1'
		cZipcode1 column:'c_zipcode_1'
		cZip41 column:'c_zip4_1'
		contactPhone1 column:'contact_phone_1'
		contactFname2 column:'contact_fname_2'
		contactLname2 column:'contact_lname_2'
		contactRelate2 column:'contact_relate_2'
		contactRelate2Oth column:'contact_relate2_oth'
		cAddr2Id column:'c_addr2_id'
		cAddr12 column:'c_addr1_2'
		cAddr22 column:'c_addr2_2'
		cUnit2 column:'c_unit_2'
		cCity2 column:'c_city_2'
		cState2 column:'c_state_2'
		cZipcode2 column:'c_zipcode_2'
		cZip42 column:'c_zip4_2'
		contactPhone2 column:'contact_phone_2'
		timeStamp14 column:'time_stamp_14'
		transactionType column:'transaction_type'
	}
}
