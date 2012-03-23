package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenEhRace2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String psEhRaceId
	/**
	 * Status level 2
	 */
	String psEhId
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
		psEhRaceId(nullable: false, minSize:1, maxSize:36)
		psEhId(nullable: false, minSize:1, maxSize:36)
		race(nullable: false)
		raceOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_eh_race_2'
		psuId column:'psu_id'
		psEhRaceId column:'ps_eh_race_id'
		psEhId column:'ps_eh_id'
		race column:'race'
		raceOth column:'race_oth'
		transactionType column:'transaction_type'
	}
}
