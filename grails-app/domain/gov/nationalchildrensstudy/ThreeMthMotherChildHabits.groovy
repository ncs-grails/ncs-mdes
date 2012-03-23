package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ThreeMthMotherChildHabits {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String threeMthId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	String threeMonthHabitsLoopId
	/**
	 * Status level 3
	 */
	ChildSleepRoomCl1 sleepPlace1
	/**
	 * Status level 3
	 */
	ChildSleepArrangementCl1 sleepPlace2
	/**
	 * PII level P
	 * Status level 1
	 */
	String sleepPlace2Oth
	/**
	 * Status level 3
	 */
	SleepPositionCl1 sleepPositionNight
	/**
	 * Status level 1
	 */
	Integer sleepHrsDay
	/**
	 * Status level 1
	 */
	Integer sleepHrsNight
	/**
	 * Status level 3
	 */
	RegularityLevelCl8 sleepDifficult
	/**
	 * Status level 3
	 */
	CryRankCl1 cryMore
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 cryConsole
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 cryColic
	/**
	 * Status level 3
	 */
	RegularityLevelCl12 colicFreq
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 cryProblem
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 calm
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 worried
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 social
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 angry
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 shy
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 stubborn
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 happy
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 eyesFollow
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 smile
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 reach1
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 feed
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 wave
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 reach2
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 grab
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 switchHands
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pickup
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 hold
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 sound2
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 sound3
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 speak1
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 speak2
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 headup
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 roll1
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 roll2
	/**
	 * Status level 1
	 */
	String timeStamp4
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 childcare
	/**
	 * Status level 1
	 */
	Integer familyCareHrs
	/**
	 * Status level 1
	 */
	Integer homecareHrs
	/**
	 * Status level 1
	 */
	Integer daycareHrs
	/**
	 * Status level 1
	 */
	String timeStamp5
	/**
	 * Status level 3
	 */
	HealthStatusCl3 cHealth
	/**
	 * Status level 3
	 */
	WellchildCarePlaceCl1 rHcare
	/**
	 * Status level 1
	 */
	String lastVisit
	/**
	 * Status level 1
	 */
	Integer visitWt
	/**
	 * Status level 3
	 */
	ConfirmTypeCl15 sameCare
	/**
	 * Status level 3
	 */
	HealthcarePlaceCl2 hcareSick
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 hospital
	/**
	 * Status level 3
	 */
	ConfirmTypeCl7 diagnosis
	/**
	 * PII level P
	 * Status level 1
	 */
	String diagnosisSpecify
	/**
	 * Status level 1
	 */
	String timeStamp6
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		threeMthId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		threeMonthHabitsLoopId(nullable: false, minSize:1, maxSize:36)
		sleepPlace1(nullable: false)
		sleepPlace2(nullable: false)
		sleepPlace2Oth(nullable: true, maxSize:255)
		sleepPositionNight(nullable: false)
		sleepHrsDay(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sleepHrsNight(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sleepDifficult(nullable: false)
		cryMore(nullable: false)
		cryConsole(nullable: false)
		cryColic(nullable: false)
		colicFreq(nullable: false)
		cryProblem(nullable: false)
		calm(nullable: false)
		worried(nullable: false)
		social(nullable: false)
		angry(nullable: false)
		shy(nullable: false)
		stubborn(nullable: false)
		happy(nullable: false)
		eyesFollow(nullable: false)
		smile(nullable: false)
		reach1(nullable: false)
		feed(nullable: false)
		wave(nullable: false)
		reach2(nullable: false)
		grab(nullable: false)
		switchHands(nullable: false)
		pickup(nullable: false)
		hold(nullable: false)
		sound2(nullable: false)
		sound3(nullable: false)
		speak1(nullable: false)
		speak2(nullable: false)
		headup(nullable: false)
		roll1(nullable: false)
		roll2(nullable: false)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		childcare(nullable: false)
		familyCareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		homecareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		daycareHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cHealth(nullable: false)
		rHcare(nullable: false)
		lastVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		visitWt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sameCare(nullable: false)
		hcareSick(nullable: false)
		hospital(nullable: false)
		diagnosis(nullable: false)
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
