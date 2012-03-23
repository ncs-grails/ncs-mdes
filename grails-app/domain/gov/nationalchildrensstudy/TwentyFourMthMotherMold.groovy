package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwentyFourMthMotherMold {

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
	String twentyFourMthMotherMoldId
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 roomMoldChild
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twentyFourMthId(nullable: false, minSize:1, maxSize:36)
		twentyFourMthMotherMoldId(nullable: false, minSize:1, maxSize:36)
		roomMoldChild(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_mother_mold'
		psuId column:'psu_id'
		twentyFourMthId column:'twenty_four_mth_id'
		twentyFourMthMotherMoldId column:'twenty_four_mth_mother_mold_id'
		roomMoldChild column:'room_mold_child'
		transactionType column:'transaction_type'
	}
}
