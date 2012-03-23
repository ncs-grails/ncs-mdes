package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PrePregSpRace {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ppSpRaceId
	/**
	 * Status level 1
	 */
	String ppId
	/**
	 * Status level 3
	 */
	RaceCl2 spRace
	/**
	 * PII level P
	 * Status level 3
	 */
	String spRaceOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ppSpRaceId(nullable: false, minSize:1, maxSize:36)
		ppId(nullable: false, minSize:1, maxSize:36)
		spRace(nullable: false)
		spRaceOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pre_preg_sp_race'
		psuId column:'psu_id'
		ppSpRaceId column:'pp_sp_race_id'
		ppId column:'pp_id'
		spRace column:'sp_race'
		spRaceOth column:'sp_race_oth'
		transactionType column:'transaction_type'
	}
}
