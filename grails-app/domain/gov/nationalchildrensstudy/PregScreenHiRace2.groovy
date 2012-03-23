package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenHiRace2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String psRaceId
	/**
	 * Status level 2
	 */
	String psHiId
	/**
	 * Status level 2
	 */
	RaceCl2 race
	/**
	 * PII level P
	 * Status level 2
	 */
	String raceOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		psRaceId(nullable: false, minSize:1, maxSize:36)
		psHiId(nullable: false, minSize:1, maxSize:36)
		race(nullable: false)
		raceOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_hi_race_2'
		psuId column:'psu_id'
		psRaceId column:'ps_race_id'
		psHiId column:'ps_hi_id'
		race column:'race'
		raceOth column:'race_oth'
		transactionType column:'transaction_type'
	}
}
