package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Tsu {

	/**
	 * Status level 1
	 */
	StudyCenterCl1 scId
	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String tsuId
	/**
	 * Status level 1
	 */
	String tsuName
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		scId(nullable: false)
		psuId(nullable: false)
		tsuId(nullable: false, minSize:1, maxSize:36)
		tsuName(nullable: true, maxSize:100)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'tsu'
		scId column:'sc_id'
		psuId column:'psu_id'
		tsuId column:'tsu_id'
		tsuName column:'tsu_name'
		transactionType column:'transaction_type'
	}
}
