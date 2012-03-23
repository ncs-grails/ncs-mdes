package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenHiRace {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String psRaceId
	/**
	 * Status level 1
	 */
	String psHiId
	/**
	 * Status level 3
	 */
	RaceCl2 race
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		psRaceId(nullable: false, minSize:1, maxSize:36)
		psHiId(nullable: false, minSize:1, maxSize:36)
		race(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_hi_race'
		psuId column:'psu_id'
		psRaceId column:'ps_race_id'
		psHiId column:'ps_hi_id'
		race column:'race'
		transactionType column:'transaction_type'
	}
}
