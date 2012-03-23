package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwentyFourMthMotherHabits {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String twentyFourMthId
	/**
	 * Status level 2
	 */
	String pId
	/**
	 * Status level 2
	 */
	String twentyFourMthHabitsId
	/**
	 * Status level 2
	 */
	Integer sleepHrsDay
	/**
	 * Status level 2
	 */
	Integer sleepHrsNight
	/**
	 * Status level 2
	 */
	String sleepTimeNight
	/**
	 * Status level 2
	 */
	String sleepTimeWake
	/**
	 * Status level 2
	 */
	RegularityLevelCl8 sleepDifficult
	/**
	 * Status level 2
	 */
	NightWakeFrequencyCl1 sleepThrough
	/**
	 * Status level 2
	 */
	TvWatchFrequencyCl1 tvFreqHrs
	/**
	 * Status level 2
	 */
	String timeStamp3
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 childcareChange
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 childcare
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 familyCare
	/**
	 * Status level 2
	 */
	Integer familyCareHrs
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 homecare
	/**
	 * Status level 2
	 */
	Integer homecareHrs
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 daycare
	/**
	 * Status level 2
	 */
	Integer daycareHrs
	/**
	 * Status level 2
	 */
	String timeStamp4
	/**
	 * Status level 2
	 */
	WellchildCarePlaceCl1 rHcare
	/**
	 * Status level 2
	 */
	HealthStatusCl3 cHealth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 useIcLog
	/**
	 * Status level 2
	 */
	NoLogReasonCl1 reasonNoIcLog
	/**
	 * PII level P
	 * Status level 2
	 */
	String reasonNoIcLogOth
	/**
	 * Status level 2
	 */
	Integer numProvIcLog
	/**
	 * Status level 2
	 */
	Integer numProvRec
	/**
	 * Status level 2
	 */
	String lastVisit
	/**
	 * Status level 2
	 */
	Integer visitWt
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 hospital
	/**
	 * Status level 2
	 */
	String adminDate
	/**
	 * Status level 2
	 */
	Integer hospNights
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 diagnose
	/**
	 * PII level P
	 * Status level 2
	 */
	String diagnoseOth
	/**
	 * Status level 2
	 */
	String timeStamp5
	/**
	 * Status level 2
	 */
	Integer fever
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 asthma
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 eyesight
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 deaf
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 ihmob
	/**
	 * Status level 2
	 */
	String timeStamp6
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 prescrTake
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 otcTake
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 supplTake
	/**
	 * Status level 2
	 */
	DrugDoseUnitCl1 suppleFreqUnit
	/**
	 * Status level 2
	 */
	String timeStamp7
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 insure
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 insEmploy
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 insMedicaid
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 insTricare
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 insIhs
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 insOth
	/**
	 * Status level 2
	 */
	String timeStamp8
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 lice1
	/**
	 * Status level 2
	 */
	PersonTreatedCl1 lice2
	/**
	 * PII level P
	 * Status level 2
	 */
	String liceOth1
	/**
	 * PII level P
	 * Status level 2
	 */
	String liceOth2
	/**
	 * Status level 2
	 */
	Integer smokeHours
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twentyFourMthId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		twentyFourMthHabitsId(nullable: false, minSize:1, maxSize:36)
		sleepHrsDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sleepHrsNight(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sleepTimeNight(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		sleepTimeWake(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		sleepDifficult(nullable: false)
		sleepThrough(nullable: false)
		tvFreqHrs(nullable: false)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		childcareChange(nullable: false)
		childcare(nullable: false)
		familyCare(nullable: false)
		familyCareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		homecare(nullable: false)
		homecareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		daycare(nullable: false)
		daycareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rHcare(nullable: false)
		cHealth(nullable: false)
		useIcLog(nullable: false)
		reasonNoIcLog(nullable: false)
		reasonNoIcLogOth(nullable: true, maxSize:255)
		numProvIcLog(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numProvRec(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		lastVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		visitWt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		hospital(nullable: false)
		adminDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		hospNights(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		diagnose(nullable: false)
		diagnoseOth(nullable: true, maxSize:255)
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		fever(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		asthma(nullable: false)
		eyesight(nullable: false)
		deaf(nullable: false)
		ihmob(nullable: false)
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		prescrTake(nullable: false)
		otcTake(nullable: false)
		supplTake(nullable: false)
		suppleFreqUnit(nullable: false)
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		insure(nullable: false)
		insEmploy(nullable: false)
		insMedicaid(nullable: false)
		insTricare(nullable: false)
		insIhs(nullable: false)
		insOth(nullable: false)
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		lice1(nullable: false)
		lice2(nullable: false)
		liceOth1(nullable: true, maxSize:255)
		liceOth2(nullable: true, maxSize:255)
		smokeHours(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_mother_habits'
		psuId column:'psu_id'
		twentyFourMthId column:'twenty_four_mth_id'
		pId column:'p_id'
		twentyFourMthHabitsId column:'twenty_four_mth_habits_id'
		sleepHrsDay column:'sleep_hrs_day'
		sleepHrsNight column:'sleep_hrs_night'
		sleepTimeNight column:'sleep_time_night'
		sleepTimeWake column:'sleep_time_wake'
		sleepDifficult column:'sleep_difficult'
		sleepThrough column:'sleep_through'
		tvFreqHrs column:'tv_freq_hrs'
		timeStamp3 column:'time_stamp_3'
		childcareChange column:'childcare_change'
		childcare column:'childcare'
		familyCare column:'family_care'
		familyCareHrs column:'family_care_hrs'
		homecare column:'homecare'
		homecareHrs column:'homecare_hrs'
		daycare column:'daycare'
		daycareHrs column:'daycare_hrs'
		timeStamp4 column:'time_stamp_4'
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
		timeStamp5 column:'time_stamp_5'
		fever column:'fever'
		asthma column:'asthma'
		eyesight column:'eyesight'
		deaf column:'deaf'
		ihmob column:'ihmob'
		timeStamp6 column:'time_stamp_6'
		prescrTake column:'prescr_take'
		otcTake column:'otc_take'
		supplTake column:'suppl_take'
		suppleFreqUnit column:'supple_freq_unit'
		timeStamp7 column:'time_stamp_7'
		insure column:'insure'
		insEmploy column:'ins_employ'
		insMedicaid column:'ins_medicaid'
		insTricare column:'ins_tricare'
		insIhs column:'ins_ihs'
		insOth column:'ins_oth'
		timeStamp8 column:'time_stamp_8'
		lice1 column:'lice_1'
		lice2 column:'lice_2'
		liceOth1 column:'lice_oth_1'
		liceOth2 column:'lice_oth_2'
		smokeHours column:'smoke_hours'
		transactionType column:'transaction_type'
	}
}
