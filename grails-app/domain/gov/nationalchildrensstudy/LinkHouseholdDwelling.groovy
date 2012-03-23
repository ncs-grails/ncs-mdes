package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class LinkHouseholdDwelling {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String hhDuId
	/**
	 * Status level 1
	 */
	String hhId
	/**
	 * Status level 1
	 */
	String duId
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 isActive
	/**
	 * Status level 3
	 */
	CommunicationRankCl1 duRank
	/**
	 * PII level P
	 * Status level 1
	 */
	String duRankOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		hhDuId(nullable: false, minSize:1, maxSize:36)
		hhId(nullable: false, minSize:1, maxSize:36)
		duId(nullable: false, minSize:1, maxSize:36)
		isActive(nullable: false)
		duRank(nullable: false)
		duRankOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'link_household_dwelling'
		psuId column:'psu_id'
		hhDuId column:'hh_du_id'
		hhId column:'hh_id'
		duId column:'du_id'
		isActive column:'is_active'
		duRank column:'du_rank'
		duRankOth column:'du_rank_oth'
		transactionType column:'transaction_type'
	}
}
