package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class EighteenMthMotherLice {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String eighteenMthMotherId
	/**
	 * Status level 2
	 */
	String eighteenMthMotherLiceId
	/**
	 * Status level 2
	 */
	PersonTreatedCl1 lice2
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		eighteenMthMotherId(nullable: false, minSize:1, maxSize:36)
		eighteenMthMotherLiceId(nullable: false, minSize:1, maxSize:36)
		lice2(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'eighteen_mth_mother_lice'
		psuId column:'psu_id'
		eighteenMthMotherId column:'eighteen_mth_mother_id'
		eighteenMthMotherLiceId column:'eighteen_mth_mother_lice_id'
		lice2 column:'lice_2'
		transactionType column:'transaction_type'
	}
}
