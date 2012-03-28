package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class EighteenMthMotherHabits {

	Integer psuId
	String eighteenMthMotherId
	String pId
	String eighteenMthMotherHabitsId
	String timeStamp3
	Integer sleepHrsDay
	Integer sleepHrsNight
	String sleepTimeNight
	String sleepTimeWake
	Integer sleepDifficult
	Integer sleepThrough
	Integer tvFreqHrs
	String timeStamp4
	Integer childcareChange
	Integer childcare
	Integer familyCare
	Integer familyCareHrs
	Integer homecare
	Integer homecareHrs
	Integer daycare
	Integer daycareHrs
	String timeStamp5
	Integer rHcare
	Integer cHealth
	Integer useIcLog
	Integer reasonNoIcLog
	String reasonNoIcLogOth
	Integer numProvIcLog
	Integer numProvRec
	String lastVisit
	Integer visitWt
	Integer hospital
	String adminDate
	Integer hospNights
	Integer diagnose
	String diagnoseOth
	String timeStamp6
	Integer fever
	Integer asthma
	Integer ihmob
	String timeStamp7
	Integer prescrTake
	Integer otcTake
	Integer supplTake
	String timeStamp8
	Integer lice1
	String liceOth1
	String liceOth2
	Integer smokeHours
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		eighteenMthMotherId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eighteenMthMotherHabitsId(nullable: false, minSize:1, maxSize:36)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		sleepHrsDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sleepHrsNight(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sleepTimeNight(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		sleepTimeWake(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		sleepDifficult(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		sleepThrough(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		tvFreqHrs(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -4])
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		childcareChange(nullable: false, inList:[1, 2, -1, -2, -4])
		childcare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		familyCare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		familyCareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		homecare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		homecareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		daycare(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		daycareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rHcare(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -4])
		cHealth(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		useIcLog(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		reasonNoIcLog(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4])
		reasonNoIcLogOth(nullable: true, maxSize:255)
		numProvIcLog(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numProvRec(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		lastVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		visitWt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		hospital(nullable: false, inList:[1, 2, -1, -2, -4])
		adminDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		hospNights(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		diagnose(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		diagnoseOth(nullable: true, maxSize:255)
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		fever(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		asthma(nullable: false, inList:[1, 2, -1, -2, -4])
		ihmob(nullable: false, inList:[1, 2, -1, -2, -4])
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		prescrTake(nullable: false, inList:[1, 2, -1, -2, -4])
		otcTake(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		supplTake(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		lice1(nullable: false, inList:[1, 2, -1, -2, -4])
		liceOth1(nullable: true, maxSize:255)
		liceOth2(nullable: true, maxSize:255)
		smokeHours(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'eighteen_mth_mother_habits'
		psuId column:'psu_id'
		eighteenMthMotherId column:'eighteen_mth_mother_id'
		pId column:'p_id'
		eighteenMthMotherHabitsId column:'eighteen_mth_mother_habits_id'
		timeStamp3 column:'time_stamp_3'
		sleepHrsDay column:'sleep_hrs_day'
		sleepHrsNight column:'sleep_hrs_night'
		sleepTimeNight column:'sleep_time_night'
		sleepTimeWake column:'sleep_time_wake'
		sleepDifficult column:'sleep_difficult'
		sleepThrough column:'sleep_through'
		tvFreqHrs column:'tv_freq_hrs'
		timeStamp4 column:'time_stamp_4'
		childcareChange column:'childcare_change'
		childcare column:'childcare'
		familyCare column:'family_care'
		familyCareHrs column:'family_care_hrs'
		homecare column:'homecare'
		homecareHrs column:'homecare_hrs'
		daycare column:'daycare'
		daycareHrs column:'daycare_hrs'
		timeStamp5 column:'time_stamp_5'
		rHcare column:'r_hcare'
		cHealth column:'c_health'
		useIcLog column:'use_ic_log'
		reasonNoIcLog column:'reason_no_ic_log'
		reasonNoIcLogOth column:'reason_no_ic_log_oth'
		numProvIcLog column:'num_prov_ic_log'
		numProvRec column:'num_prov_rec'
		lastVisit column:'last_visit'
		visitWt column:'visit_wt'
		hospital column:'hospital'
		adminDate column:'admin_date'
		hospNights column:'hosp_nights'
		diagnose column:'diagnose'
		diagnoseOth column:'diagnose_oth'
		timeStamp6 column:'time_stamp_6'
		fever column:'fever'
		asthma column:'asthma'
		ihmob column:'ihmob'
		timeStamp7 column:'time_stamp_7'
		prescrTake column:'prescr_take'
		otcTake column:'otc_take'
		supplTake column:'suppl_take'
		timeStamp8 column:'time_stamp_8'
		lice1 column:'lice_1'
		liceOth1 column:'lice_oth_1'
		liceOth2 column:'lice_oth_2'
		smokeHours column:'smoke_hours'
		transactionType column:'transaction_type'
	}
}
