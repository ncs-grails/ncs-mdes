package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthMotherDetail {

	Integer psuId
	String sixMthId
	String pId
	String sixMthDetailId
	Integer childQnum
	Integer childSex
	Integer cnameConfirm
	String cFname
	String cLname
	Integer cdobConfirm
	String childDob
	String timeStamp2
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
	Integer situp
	Integer stand
	String timeStamp3
	Integer sleepPlace1
	Integer sleepPlace2
	String sleepPlace2Oth
	Integer sleepPositionNight
	Integer sleepPositionNap
	Integer sleepRoutine
	Integer sleepHrsDay
	Integer sleepHrsNight
	String sleepTimeNight
	String sleepTimeWake
	Integer sleepDifficult
	Integer sleepThrough
	String timeStamp4
	Integer cHealth
	Integer cold
	Integer coldAge
	Integer coldAgeUnit
	Integer earInfection
	Integer earInfectionAge
	Integer earInfectionAgeUnit
	Integer gastro
	Integer gastroAge
	Integer gastroAgeUnit
	Integer respiratory
	Integer respiratoryAge
	Integer respiratoryAgeUnit
	Integer fever
	Integer failThrive
	String timeStamp5
	Integer rHcare
	String lastVisit
	Integer visitWt
	Integer sameCare
	Integer hcareSick
	String timeStamp6
	Integer insure
	Integer insEmploy
	Integer insMedicaid
	Integer insTricare
	Integer insIhs
	Integer insMedicare
	Integer insOth
	String timeStamp7
	Integer childcare
	Integer familyCare
	Integer familyCareHrs
	Integer homecare
	Integer homecareHrs
	Integer daycare
	Integer daycareHrs
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		sixMthId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		sixMthDetailId(nullable: false, minSize:1, maxSize:36)
		childQnum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		childSex(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		cnameConfirm(nullable: false, inList:[1, 2, -1, -2, -4])
		cFname(nullable: true, maxSize:30)
		cLname(nullable: true, maxSize:30)
		cdobConfirm(nullable: false, inList:[1, 2, -1, -2, -4])
		childDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
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
		situp(nullable: false, inList:[1, 2, -1, -2, -4])
		stand(nullable: false, inList:[1, 2, -1, -2, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		sleepPlace1(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		sleepPlace2(nullable: false, inList:[1, 2, 3, 4, -5, -1, -2, -4])
		sleepPlace2Oth(nullable: true, maxSize:255)
		sleepPositionNight(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		sleepPositionNap(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		sleepRoutine(nullable: false, inList:[1, 2, -1, -2, -4])
		sleepHrsDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sleepHrsNight(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sleepTimeNight(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		sleepTimeWake(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		sleepDifficult(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		sleepThrough(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cHealth(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		cold(nullable: false, inList:[1, 2, -1, -2, -4])
		coldAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		coldAgeUnit(nullable: false, inList:[1, 2, 3, -3, -4])
		earInfection(nullable: false, inList:[1, 2, -1, -2, -4])
		earInfectionAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		earInfectionAgeUnit(nullable: false, inList:[1, 2, 3, -3, -4])
		gastro(nullable: false, inList:[1, 2, -1, -2, -4])
		gastroAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		gastroAgeUnit(nullable: false, inList:[1, 2, 3, -3, -4])
		respiratory(nullable: false, inList:[1, 2, -1, -2, -4])
		respiratoryAge(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		respiratoryAgeUnit(nullable: false, inList:[1, 2, 3, -3, -4])
		fever(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		failThrive(nullable: false, inList:[1, 2, -1, -2, -4])
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rHcare(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -4])
		lastVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		visitWt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sameCare(nullable: false, inList:[1, 2, -1, -2, -3, -4, -7])
		hcareSick(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4, -7])
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		insure(nullable: false, inList:[1, 2, -1, -2, -4])
		insEmploy(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insMedicaid(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insTricare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insIhs(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insMedicare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		insOth(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		childcare(nullable: false, inList:[1, 2, -1, -2, -4])
		familyCare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		familyCareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		homecare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		homecareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		daycare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		daycareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'six_mth_mother_detail'
		psuId column:'psu_id'
		sixMthId column:'six_mth_id'
		pId column:'p_id'
		sixMthDetailId column:'six_mth_detail_id'
		childQnum column:'child_qnum'
		childSex column:'child_sex'
		cnameConfirm column:'cname_confirm'
		cFname column:'c_fname'
		cLname column:'c_lname'
		cdobConfirm column:'cdob_confirm'
		childDob column:'child_dob'
		timeStamp2 column:'time_stamp_2'
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
		situp column:'situp'
		stand column:'stand'
		timeStamp3 column:'time_stamp_3'
		sleepPlace1 column:'sleep_place_1'
		sleepPlace2 column:'sleep_place_2'
		sleepPlace2Oth column:'sleep_place_2_oth'
		sleepPositionNight column:'sleep_position_night'
		sleepPositionNap column:'sleep_position_nap'
		sleepRoutine column:'sleep_routine'
		sleepHrsDay column:'sleep_hrs_day'
		sleepHrsNight column:'sleep_hrs_night'
		sleepTimeNight column:'sleep_time_night'
		sleepTimeWake column:'sleep_time_wake'
		sleepDifficult column:'sleep_difficult'
		sleepThrough column:'sleep_through'
		timeStamp4 column:'time_stamp_4'
		cHealth column:'c_health'
		cold column:'cold'
		coldAge column:'cold_age'
		coldAgeUnit column:'cold_age_unit'
		earInfection column:'ear_infection'
		earInfectionAge column:'ear_infection_age'
		earInfectionAgeUnit column:'ear_infection_age_unit'
		gastro column:'gastro'
		gastroAge column:'gastro_age'
		gastroAgeUnit column:'gastro_age_unit'
		respiratory column:'respiratory'
		respiratoryAge column:'respiratory_age'
		respiratoryAgeUnit column:'respiratory_age_unit'
		fever column:'fever'
		failThrive column:'fail_thrive'
		timeStamp5 column:'time_stamp_5'
		rHcare column:'r_hcare'
		lastVisit column:'last_visit'
		visitWt column:'visit_wt'
		sameCare column:'same_care'
		hcareSick column:'hcare_sick'
		timeStamp6 column:'time_stamp_6'
		insure column:'insure'
		insEmploy column:'ins_employ'
		insMedicaid column:'ins_medicaid'
		insTricare column:'ins_tricare'
		insIhs column:'ins_ihs'
		insMedicare column:'ins_medicare'
		insOth column:'ins_oth'
		timeStamp7 column:'time_stamp_7'
		childcare column:'childcare'
		familyCare column:'family_care'
		familyCareHrs column:'family_care_hrs'
		homecare column:'homecare'
		homecareHrs column:'homecare_hrs'
		daycare column:'daycare'
		daycareHrs column:'daycare_hrs'
		transactionType column:'transaction_type'
	}
}
