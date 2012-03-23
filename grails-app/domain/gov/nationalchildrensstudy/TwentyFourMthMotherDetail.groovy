package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwentyFourMthMotherDetail {

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
	String twentyFourMthDetailId
	/**
	 * Status level 2
	 */
	Integer childQnum
	/**
	 * Status level 2
	 */
	GenderCl3 childSex
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 cnameConfirm
	/**
	 * PII level Y
	 * Status level 2
	 */
	String cFname
	/**
	 * PII level Y
	 * Status level 2
	 */
	String cLname
	/**
	 * Status level 2
	 */
	ConfirmTypeCl8 cdobConfirm
	/**
	 * PII level P
	 * Status level 2
	 */
	String childDob
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twentyFourMthId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		twentyFourMthDetailId(nullable: false, minSize:1, maxSize:36)
		childQnum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		childSex(nullable: false)
		cnameConfirm(nullable: false)
		cFname(nullable: true, maxSize:30)
		cLname(nullable: true, maxSize:30)
		cdobConfirm(nullable: false)
		childDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_mother_detail'
		psuId column:'psu_id'
		twentyFourMthId column:'twenty_four_mth_id'
		pId column:'p_id'
		twentyFourMthDetailId column:'twenty_four_mth_detail_id'
		childQnum column:'child_qnum'
		childSex column:'child_sex'
		cnameConfirm column:'cname_confirm'
		cFname column:'c_fname'
		cLname column:'c_lname'
		cdobConfirm column:'cdob_confirm'
		childDob column:'child_dob'
		transactionType column:'transaction_type'
	}
}
