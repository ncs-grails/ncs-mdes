package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class LinkPersonHousehold {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String personHhId
	/**
	 * Status level 1
	 */
	String personId
	/**
	 * Status level 1
	 */
	String hhId
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 isActive
	/**
	 * Status level 3
	 */
	CommunicationRankCl1 hhRank
	/**
	 * PII level P
	 * Status level 1
	 */
	String hhRankOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		personHhId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: false, minSize:1, maxSize:36)
		hhId(nullable: false, minSize:1, maxSize:36)
		isActive(nullable: false)
		hhRank(nullable: false)
		hhRankOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'link_person_household'
		psuId column:'psu_id'
		personHhId column:'person_hh_id'
		personId column:'person_id'
		hhId column:'hh_id'
		isActive column:'is_active'
		hhRank column:'hh_rank'
		hhRankOth column:'hh_rank_oth'
		transactionType column:'transaction_type'
	}
}
