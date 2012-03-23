package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwentyFourMthMotherCond {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String twentyFourMthHabitsId
	/**
	 * Status level 2
	 */
	String twentyFourMonthMotherCondId
	/**
	 * Status level 2
	 */
	ChildConditionCl2 cond
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twentyFourMthHabitsId(nullable: false, minSize:1, maxSize:36)
		twentyFourMonthMotherCondId(nullable: false, minSize:1, maxSize:36)
		cond(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_mother_cond'
		psuId column:'psu_id'
		twentyFourMthHabitsId column:'twenty_four_mth_habits_id'
		twentyFourMonthMotherCondId column:'twenty_four_month_mother_cond_id'
		cond column:'cond'
		transactionType column:'transaction_type'
	}
}
