package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PrePregHeat2 {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ppHeat2Id
	/**
	 * Status level 1
	 */
	String ppId
	/**
	 * Status level 3
	 */
	HeatTypeCl1 heat2
	/**
	 * PII level P
	 * Status level 3
	 */
	String heat2Oth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ppHeat2Id(nullable: false, minSize:1, maxSize:36)
		ppId(nullable: false, minSize:1, maxSize:36)
		heat2(nullable: false)
		heat2Oth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pre_preg_heat2'
		psuId column:'psu_id'
		ppHeat2Id column:'pp_heat2_id'
		ppId column:'pp_id'
		heat2 column:'heat2'
		heat2Oth column:'heat2_oth'
		transactionType column:'transaction_type'
	}
}
