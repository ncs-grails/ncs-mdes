package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwelveMthMotherLice {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String twelveMthId
	/**
	 * Status level 2
	 */
	String twelveMthMotherLiceId
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
		twelveMthId(nullable: false, minSize:1, maxSize:36)
		twelveMthMotherLiceId(nullable: false, minSize:1, maxSize:36)
		lice2(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_mother_lice'
		psuId column:'psu_id'
		twelveMthId column:'twelve_mth_id'
		twelveMthMotherLiceId column:'twelve_mth_mother_lice_id'
		lice2 column:'lice_2'
		transactionType column:'transaction_type'
	}
}
