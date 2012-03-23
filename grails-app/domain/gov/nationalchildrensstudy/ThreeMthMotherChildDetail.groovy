package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ThreeMthMotherChildDetail {

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
	String threeMonthDetailLoopId
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
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		threeMthId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		threeMonthDetailLoopId(nullable: false, minSize:1, maxSize:36)
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
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'three_mth_mother_child_detail'
		psuId column:'psu_id'
		threeMthId column:'three_mth_id'
		pId column:'p_id'
		threeMonthDetailLoopId column:'three_month_detail_loop_id'
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
		transactionType column:'transaction_type'
	}
}
