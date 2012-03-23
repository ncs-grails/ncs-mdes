package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class BirthVisitLiBabyName {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String bvLiId
	/**
	 * Status level 2
	 */
	String birthVisitLiBabyNameId
	/**
	 * Status level 2
	 */
	BabyNameProvidedCl1 babyName
	/**
	 * PII level Y
	 * Status level 2
	 */
	String babyFname
	/**
	 * PII level Y
	 * Status level 2
	 */
	String babyMname
	/**
	 * PII level Y
	 * Status level 2
	 */
	String babyLname
	/**
	 * Status level 2
	 */
	GenderCl3 babySex
	/**
	 * Status level 2
	 */
	Integer babyBwtLb
	/**
	 * Status level 2
	 */
	Integer babyBwtOz
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		bvLiId(nullable: false, minSize:1, maxSize:36)
		birthVisitLiBabyNameId(nullable: false, minSize:1, maxSize:36)
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
		table 'birth_visit_li_baby_name'
		psuId column:'psu_id'
		bvLiId column:'bv_li_id'
		birthVisitLiBabyNameId column:'birth_visit_li_baby_name_id'
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
