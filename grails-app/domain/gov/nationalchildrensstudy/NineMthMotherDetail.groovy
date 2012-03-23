package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class NineMthMotherDetail {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String nineMthId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	String nineMthDetailId
	/**
	 * Status level 1
	 */
	Integer childQnum
	/**
	 * Status level 3
	 */
	GenderCl3 childSex
	/**
	 * Status level 3
	 */
	RespReltnshpCl1 respRel
	/**
	 * PII level P
	 * Status level 3
	 */
	String respRelOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 cnameConfirm
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cFname
	/**
	 * PII level Y
	 * Status level 3
	 */
	String cLname
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 cdobConfirm
	/**
	 * PII level P
	 * Status level 1
	 */
	String childDob
	/**
	 * Status level 1
	 */
	String timeStamp2
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
	ConfirmTypeCl8 roll2
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 situp
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 stand
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 standAlone
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 walk
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 scribble
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 forkSpoon
	/**
	 * Status level 1
	 */
	String timeStamp3
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
	 * Status level 1
	 */
	String timeStamp4
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		nineMthId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		nineMthDetailId(nullable: false, minSize:1, maxSize:36)
		childQnum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		childSex(nullable: false)
		respRel(nullable: false)
		respRelOth(nullable: true, maxSize:255)
		cnameConfirm(nullable: false)
		cFname(nullable: true, maxSize:30)
		cLname(nullable: true, maxSize:30)
		cdobConfirm(nullable: false)
		childDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		eyesFollow(nullable: false)
		smile(nullable: false)
		reach1(nullable: false)
		feed(nullable: false)
		wave(nullable: false)
		grab(nullable: false)
		switchHands(nullable: false)
		pickup(nullable: false)
		hold(nullable: false)
		sound3(nullable: false)
		speak1(nullable: false)
		speak2(nullable: false)
		headup(nullable: false)
		roll2(nullable: false)
		situp(nullable: false)
		stand(nullable: false)
		standAlone(nullable: false)
		walk(nullable: false)
		scribble(nullable: false)
		forkSpoon(nullable: false)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cHealth(nullable: false)
		rHcare(nullable: false)
		lastVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		visitWt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sameCare(nullable: false)
		hcareSick(nullable: false)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'nine_mth_mother_detail'
		psuId column:'psu_id'
		nineMthId column:'nine_mth_id'
		pId column:'p_id'
		nineMthDetailId column:'nine_mth_detail_id'
		childQnum column:'child_qnum'
		childSex column:'child_sex'
		respRel column:'resp_rel'
		respRelOth column:'resp_rel_oth'
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
		grab column:'grab'
		switchHands column:'switch_hands'
		pickup column:'pickup'
		hold column:'hold'
		sound3 column:'sound_3'
		speak1 column:'speak_1'
		speak2 column:'speak_2'
		headup column:'headup'
		roll2 column:'roll_2'
		situp column:'situp'
		stand column:'stand'
		standAlone column:'stand_alone'
		walk column:'walk'
		scribble column:'scribble'
		forkSpoon column:'fork_spoon'
		timeStamp3 column:'time_stamp_3'
		cHealth column:'c_health'
		rHcare column:'r_hcare'
		lastVisit column:'last_visit'
		visitWt column:'visit_wt'
		sameCare column:'same_care'
		hcareSick column:'hcare_sick'
		timeStamp4 column:'time_stamp_4'
		transactionType column:'transaction_type'
	}
}
