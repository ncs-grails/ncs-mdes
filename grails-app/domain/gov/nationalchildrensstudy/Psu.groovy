package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Psu {

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
	String psuName
	/**
	 * Status level 3
	 */
	RecruitTypeCl1 recruitType
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		scId(nullable: false)
		psuId(nullable: false)
		psuName(nullable: true, maxSize:100)
		recruitType(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'psu'
		scId column:'sc_id'
		psuId column:'psu_id'
		psuName column:'psu_name'
		recruitType column:'recruit_type'
		transactionType column:'transaction_type'
	}
}
