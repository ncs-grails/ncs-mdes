package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class EighteenMthMotherCond {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String eighteenMthHabitsId
	/**
	 * Status level 2
	 */
	String eighteenMthMotherCondId
	/**
	 * Status level 2
	 */
	ChildConditionCl1 cond
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		eighteenMthHabitsId(nullable: false, minSize:1, maxSize:36)
		eighteenMthMotherCondId(nullable: false, minSize:1, maxSize:36)
		cond(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'eighteen_mth_mother_cond'
		psuId column:'psu_id'
		eighteenMthHabitsId column:'eighteen_mth_habits_id'
		eighteenMthMotherCondId column:'eighteen_mth_mother_cond_id'
		cond column:'cond'
		transactionType column:'transaction_type'
	}
}
