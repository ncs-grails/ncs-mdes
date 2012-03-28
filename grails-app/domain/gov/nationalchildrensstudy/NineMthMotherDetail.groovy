package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class NineMthMotherDetail {

	Integer psuId
	String nineMthId
	String pId
	String nineMthDetailId
	Integer childQnum
	Integer childSex
	Integer respRel
	String respRelOth
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
	Integer grab
	Integer switchHands
	Integer pickup
	Integer hold
	Integer sound3
	Integer speak1
	Integer speak2
	Integer headup
	Integer roll2
	Integer situp
	Integer stand
	Integer standAlone
	Integer walk
	Integer scribble
	Integer forkSpoon
	String timeStamp3
	Integer cHealth
	Integer rHcare
	String lastVisit
	Integer visitWt
	Integer sameCare
	Integer hcareSick
	String timeStamp4
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		nineMthId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		nineMthDetailId(nullable: false, minSize:1, maxSize:36)
		childQnum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		childSex(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		respRel(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		respRelOth(nullable: true, maxSize:255)
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
		grab(nullable: false, inList:[1, 2, -1, -2, -4])
		switchHands(nullable: false, inList:[1, 2, -1, -2, -4])
		pickup(nullable: false, inList:[1, 2, -1, -2, -4])
		hold(nullable: false, inList:[1, 2, -1, -2, -4])
		sound3(nullable: false, inList:[1, 2, -1, -2, -4])
		speak1(nullable: false, inList:[1, 2, -1, -2, -4])
		speak2(nullable: false, inList:[1, 2, -1, -2, -4])
		headup(nullable: false, inList:[1, 2, -1, -2, -4])
		roll2(nullable: false, inList:[1, 2, -1, -2, -4])
		situp(nullable: false, inList:[1, 2, -1, -2, -4])
		stand(nullable: false, inList:[1, 2, -1, -2, -4])
		standAlone(nullable: false, inList:[1, 2, -1, -2, -4])
		walk(nullable: false, inList:[1, 2, -1, -2, -4])
		scribble(nullable: false, inList:[1, 2, -1, -2, -4])
		forkSpoon(nullable: false, inList:[1, 2, -1, -2, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cHealth(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		rHcare(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -4])
		lastVisit(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		visitWt(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		sameCare(nullable: false, inList:[1, 2, -1, -2, -3, -4, -7])
		hcareSick(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4, -7])
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
