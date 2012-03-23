package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class BirthVisitBabyName {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String bvId
	/**
	 * Status level 1
	 */
	String babyLoopId
	/**
	 * Status level 3
	 */
	BabyNameProvidedCl1 babyName
	/**
	 * PII level Y
	 * Status level 3
	 */
	String babyFname
	/**
	 * PII level Y
	 * Status level 3
	 */
	String babyMname
	/**
	 * PII level Y
	 * Status level 3
	 */
	String babyLname
	/**
	 * Status level 3
	 */
	GenderCl5 babySex
	/**
	 * Status level 1
	 */
	Integer babyBwtLb
	/**
	 * Status level 1
	 */
	Integer babyBwtOz
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		bvId(nullable: false, minSize:1, maxSize:36)
		babyLoopId(nullable: false, minSize:1, maxSize:36)
		babyName(nullable: false)
		babyFname(nullable: true, maxSize:30)
		babyMname(nullable: true, maxSize:30)
		babyLname(nullable: true, maxSize:30)
		babySex(nullable: false)
		babyBwtLb(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		babyBwtOz(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'birth_visit_baby_name'
		psuId column:'psu_id'
		bvId column:'bv_id'
		babyLoopId column:'baby_loop_id'
		babyName column:'baby_name'
		babyFname column:'baby_fname'
		babyMname column:'baby_mname'
		babyLname column:'baby_lname'
		babySex column:'baby_sex'
		babyBwtLb column:'baby_bwt_lb'
		babyBwtOz column:'baby_bwt_oz'
		transactionType column:'transaction_type'
	}
}
