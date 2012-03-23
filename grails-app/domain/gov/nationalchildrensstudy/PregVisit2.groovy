package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2 {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv2Id
	/**
	 * Status level 3
	 */
	RecruitTypeCl1 recruitType
	/**
	 * Status level 1
	 */
	String duId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	String eventId
	/**
	 * Status level 3
	 */
	EventTypeCl1 eventType
	/**
	 * Status level 1
	 */
	Integer eventRepeatKey
	/**
	 * Status level 1
	 */
	String instrumentId
	/**
	 * Status level 3
	 */
	InstrumentTypeCl1 instrumentType
	/**
	 * Status level 3
	 */
	String instrumentVersion
	/**
	 * Status level 1
	 */
	Integer instrumentRepeatKey
	/**
	 * Status level 1
	 */
	String timeStamp1
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 nameConfirm
	/**
	 * PII level Y
	 * Status level 3
	 */
	String rFname
	/**
	 * PII level Y
	 * Status level 3
	 */
	String rLname
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 dobConfirm
	/**
	 * PII level P
	 * Status level 1
	 */
	String personDob
	/**
	 * Status level 3
	 */
	AgeEligibleCl1 ageElig
	/**
	 * Status level 1
	 */
	String timeStamp2
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 pregnant
	/**
	 * Status level 1
	 */
	String timeStamp3
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 lossInfo
	/**
	 * Status level 1
	 */
	String dueDate
	/**
	 * Status level 3
	 */
	DateGivenCl1 dateKnown
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 bplanChange
	/**
	 * Status level 3
	 */
	BirthPlacePlanCl1 birthPlan
	/**
	 * PII level Y
	 * Status level 3
	 */
	String birthPlace
	/**
	 * Status level 1
	 */
	String bAddressId
	/**
	 * PII level Y
	 * Status level 3
	 */
	String bAddress1
	/**
	 * PII level Y
	 * Status level 3
	 */
	String bAddress2
	/**
	 * PII level Y
	 * Status level 3
	 */
	String bCity
	/**
	 * PII level Y
	 * Status level 3
	 */
	StateCl2 bState
	/**
	 * PII level P
	 * Status level 1
	 */
	String bZipcode
	/**
	 * Status level 1
	 */
	String dateVisit
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 diabetes1
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 highbpPreg
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 urine
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 preeclamp
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 earlyLabor
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 anemia
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 nausea
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 kidney
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 rhDisease
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 groupB
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 herpes
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 vaginosis
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 othCondition
	/**
	 * PII level P
	 * Status level 1
	 */
	String conditionOth
	/**
	 * Status level 1
	 */
	String timeStamp4
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 hospital
	/**
	 * Status level 1
	 */
	String adminDate
	/**
	 * Status level 3
	 */
	Integer hospNights
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 diagnose
	/**
	 * PII level P
	 * Status level 3
	 */
	String diagnoseOth
	/**
	 * Status level 1
	 */
	String timeStamp5
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 recentMove
	/**
	 * Status level 3
	 */
	HomeOwnershipCl1 ownHome
	/**
	 * PII level P
	 * Status level 1
	 */
	String ownHomeOth
	/**
	 * Status level 3
	 */
	AgeHomeCl1 ageHome
	/**
	 * Status level 3
	 */
	Integer lengthReside
	/**
	 * Status level 3
	 */
	TimeUnitCl2 lengthResideUnit
	/**
	 * Status level 3
	 */
	HeatTypeCl2 mainHeat
	/**
	 * PII level P
	 * Status level 1
	 */
	String mainHeatOth
	/**
	 * PII level P
	 * Status level 1
	 */
	String heat2Oth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 cooling
	/**
	 * PII level P
	 * Status level 3
	 */
	String coolOth
	/**
	 * Status level 1
	 */
	String timeStamp6
	/**
	 * Status level 3
	 */
	WaterTypeCl2 waterDrink
	/**
	 * PII level P
	 * Status level 3
	 */
	String waterDrinkOth
	/**
	 * Status level 3
	 */
	WaterTypeCl2 waterCook
	/**
	 * PII level P
	 * Status level 1
	 */
	String waterCookOth
	/**
	 * Status level 1
	 */
	String timeStamp7
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 water
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 mold
	/**
	 * PII level P
	 * Status level 3
	 */
	String roomMoldOth
	/**
	 * Status level 1
	 */
	String timeStamp8
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 prenovate2
	/**
	 * PII level P
	 * Status level 1
	 */
	String prenovate2RoomOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 pdecorate2
	/**
	 * PII level P
	 * Status level 1
	 */
	String pdecorate2RoomOth
	/**
	 * Status level 1
	 */
	String timeStamp9
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 working
	/**
	 * Status level 3
	 */
	Integer hours
	/**
	 * Status level 3
	 */
	ConfirmTypeCl13 shiftWork
	/**
	 * Status level 1
	 */
	String timeStamp10
	/**
	 * Status level 3
	 */
	RecurrenceRateCl1 listen
	/**
	 * Status level 3
	 */
	RecurrenceRateCl1 advice
	/**
	 * Status level 3
	 */
	RecurrenceRateCl1 affection
	/**
	 * Status level 3
	 */
	RecurrenceRateCl1 dailyHelp
	/**
	 * Status level 3
	 */
	RecurrenceRateCl1 emotSupport
	/**
	 * Status level 3
	 */
	RecurrenceRateCl1 amtSupport
	/**
	 * Status level 1
	 */
	String timeStamp11
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 insure
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 insEmploy
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 insMedicaid
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 insTricare
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 insIhs
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 insMedicare
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 insOth
	/**
	 * Status level 1
	 */
	String timeStamp12
	/**
	 * Status level 3
	 */
	ConfirmTypeCl12 commEmail
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 haveEmail
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 email2
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 email3
	/**
	 * PII level Y
	 * Status level 3
	 */
	String email
	/**
	 * Status level 3
	 */
	ConfirmTypeCl12 commCell
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 cellPhone1
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 cellPhone2
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 cellPhone3
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 cellPhone4
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cellPhone
	/**
	 * Status level 1
	 */
	String timeStamp13
	/**
	 * Status level 3
	 */
	ConfirmTypeCl12 commContact
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 contact1
	/**
	 * PII level Y
	 * Status level 3
	 */
	String contactFname1
	/**
	 * PII level Y
	 * Status level 3
	 */
	String contactLname1
	/**
	 * Status level 3
	 */
	ContactRelationshipCl2 contactRelate1
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactRelate1Oth
	/**
	 * PII level Y
	 * Status level 4
	 */
	String contactAddr1
	/**
	 * Status level 1
	 */
	String cAddr1Id
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cAddr11
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cAddr21
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cUnit1
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cCity1
	/**
	 * PII level Y
	 * Status level 3
	 */
	StateCl2 cState1
	/**
	 * PII level P
	 * Status level 1
	 */
	String cZipcode1
	/**
	 * PII level P
	 * Status level 1
	 */
	String cZip41
	/**
	 * PII level Y
	 * Status level 3
	 */
	String contactPhone1
	/**
	 * PII level Y
	 * Status level 4
	 */
	String contact2
	/**
	 * PII level Y
	 * Status level 3
	 */
	String contactFname2
	/**
	 * PII level Y
	 * Status level 3
	 */
	String contactLname2
	/**
	 * Status level 3
	 */
	ContactRelationshipCl2 contactRelate2
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactRelate2Oth
	/**
	 * PII level Y
	 * Status level 4
	 */
	String contactAddr2
	/**
	 * Status level 1
	 */
	String cAddr2Id
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cAddr12
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cAddr22
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cUnit2
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cCity2
	/**
	 * PII level Y
	 * Status level 3
	 */
	StateCl2 cState2
	/**
	 * PII level P
	 * Status level 1
	 */
	String cZipcode2
	/**
	 * PII level P
	 * Status level 1
	 */
	String cZip42
	/**
	 * PII level Y
	 * Status level 3
	 */
	String contactPhone2
	/**
	 * Status level 1
	 */
	String timeStamp14
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false)
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false)
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		nameConfirm(nullable: false)
		rFname(nullable: true, maxSize:30)
		rLname(nullable: true, maxSize:30)
		dobConfirm(nullable: false)
		personDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		ageElig(nullable: false)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregnant(nullable: false)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		lossInfo(nullable: false)
		dueDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		dateKnown(nullable: false)
		bplanChange(nullable: false)
		birthPlan(nullable: false)
		birthPlace(nullable: true, maxSize:100)
		bAddressId(nullable: true, maxSize:36)
		bAddress1(nullable: true, maxSize:100)
		bAddress2(nullable: true, maxSize:100)
		bCity(nullable: true, maxSize:50)
		bState(nullable: false)
		bZipcode(nullable: true, maxSize:5)
		dateVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		diabetes1(nullable: false)
		highbpPreg(nullable: false)
		urine(nullable: false)
		preeclamp(nullable: false)
		earlyLabor(nullable: false)
		anemia(nullable: false)
		nausea(nullable: false)
		kidney(nullable: false)
		rhDisease(nullable: false)
		groupB(nullable: false)
		herpes(nullable: false)
		vaginosis(nullable: false)
		othCondition(nullable: false)
		conditionOth(nullable: true, maxSize:255)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hospital(nullable: false)
		adminDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		hospNights(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		diagnose(nullable: false)
		diagnoseOth(nullable: true, maxSize:255)
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		recentMove(nullable: false)
		ownHome(nullable: false)
		ownHomeOth(nullable: true, maxSize:255)
		ageHome(nullable: false)
		lengthReside(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		lengthResideUnit(nullable: false)
		mainHeat(nullable: false)
		mainHeatOth(nullable: true, maxSize:255)
		heat2Oth(nullable: true, maxSize:255)
		cooling(nullable: false)
		coolOth(nullable: true, maxSize:255)
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		waterDrink(nullable: false)
		waterDrinkOth(nullable: true, maxSize:255)
		waterCook(nullable: false)
		waterCookOth(nullable: true, maxSize:255)
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		water(nullable: false)
		mold(nullable: false)
		roomMoldOth(nullable: true, maxSize:255)
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		prenovate2(nullable: false)
		prenovate2RoomOth(nullable: true, maxSize:255)
		pdecorate2(nullable: false)
		pdecorate2RoomOth(nullable: true, maxSize:255)
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		working(nullable: false)
		hours(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		shiftWork(nullable: false)
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		listen(nullable: false)
		advice(nullable: false)
		affection(nullable: false)
		dailyHelp(nullable: false)
		emotSupport(nullable: false)
		amtSupport(nullable: false)
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		insure(nullable: false)
		insEmploy(nullable: false)
		insMedicaid(nullable: false)
		insTricare(nullable: false)
		insIhs(nullable: false)
		insMedicare(nullable: false)
		insOth(nullable: false)
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		commEmail(nullable: false)
		haveEmail(nullable: false)
		email2(nullable: false)
		email3(nullable: false)
		email(nullable: true, maxSize:100)
		commCell(nullable: false)
		cellPhone1(nullable: false)
		cellPhone2(nullable: false)
		cellPhone3(nullable: false)
		cellPhone4(nullable: false)
		cellPhone(nullable: true, maxSize:10)
		timeStamp13(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		commContact(nullable: false)
		contact1(nullable: false)
		contactFname1(nullable: true, maxSize:30)
		contactLname1(nullable: true, maxSize:30)
		contactRelate1(nullable: false)
		contactRelate1Oth(nullable: true, maxSize:255)
		contactAddr1(nullable: true, maxSize:100)
		cAddr1Id(nullable: true, maxSize:36)
		cAddr11(nullable: true, maxSize:100)
		cAddr21(nullable: true, maxSize:100)
		cUnit1(nullable: true, maxSize:10)
		cCity1(nullable: true, maxSize:50)
		cState1(nullable: false)
		cZipcode1(nullable: true, maxSize:5)
		cZip41(nullable: true, maxSize:4)
		contactPhone1(nullable: true, maxSize:10)
		contact2(nullable: true, maxSize:60)
		contactFname2(nullable: true, maxSize:30)
		contactLname2(nullable: true, maxSize:30)
		contactRelate2(nullable: false)
		contactRelate2Oth(nullable: true, maxSize:255)
		contactAddr2(nullable: true, maxSize:100)
		cAddr2Id(nullable: true, maxSize:36)
		cAddr12(nullable: true, maxSize:100)
		cAddr22(nullable: true, maxSize:100)
		cUnit2(nullable: true, maxSize:10)
		cCity2(nullable: true, maxSize:50)
		cState2(nullable: false)
		cZipcode2(nullable: true, maxSize:5)
		cZip42(nullable: true, maxSize:4)
		contactPhone2(nullable: true, maxSize:10)
		timeStamp14(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2'
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
		diagnoseOth column:'diagnose_oth'
		timeStamp5 column:'time_stamp_5'
		recentMove column:'recent_move'
		ownHome column:'own_home'
		ownHomeOth column:'own_home_oth'
		ageHome column:'age_home'
		lengthReside column:'length_reside'
		lengthResideUnit column:'length_reside_unit'
		mainHeat column:'main_heat'
		mainHeatOth column:'main_heat_oth'
		heat2Oth column:'heat2_oth'
		cooling column:'cooling'
		coolOth column:'cool_oth'
		timeStamp6 column:'time_stamp_6'
		waterDrink column:'water_drink'
		waterDrinkOth column:'water_drink_oth'
		waterCook column:'water_cook'
		waterCookOth column:'water_cook_oth'
		timeStamp7 column:'time_stamp_7'
		water column:'water'
		mold column:'mold'
		roomMoldOth column:'room_mold_oth'
		timeStamp8 column:'time_stamp_8'
		prenovate2 column:'prenovate2'
		prenovate2RoomOth column:'prenovate2_room_oth'
		pdecorate2 column:'pdecorate2'
		pdecorate2RoomOth column:'pdecorate2_room_oth'
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
		contactAddr1 column:'contact_addr_1'
		cAddr1Id column:'c_addr1_id'
		cAddr11 column:'c_addr1_1'
		cAddr21 column:'c_addr2_1'
		cUnit1 column:'c_unit_1'
		cCity1 column:'c_city_1'
		cState1 column:'c_state_1'
		cZipcode1 column:'c_zipcode_1'
		cZip41 column:'c_zip4_1'
		contactPhone1 column:'contact_phone_1'
		contact2 column:'contact_2'
		contactFname2 column:'contact_fname_2'
		contactLname2 column:'contact_lname_2'
		contactRelate2 column:'contact_relate_2'
		contactRelate2Oth column:'contact_relate2_oth'
		contactAddr2 column:'contact_addr_2'
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
