package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Ssu {

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
	String ssuId
	/**
	 * Status level 1
	 */
	String ssuName
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		scId(nullable: false)
		psuId(nullable: false)
		ssuId(nullable: false, minSize:1, maxSize:36)
		ssuName(nullable: true, maxSize:100)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'ssu'
		scId column:'sc_id'
		psuId column:'psu_id'
		ssuId column:'ssu_id'
		ssuName column:'ssu_name'
		transactionType column:'transaction_type'
	}
}
