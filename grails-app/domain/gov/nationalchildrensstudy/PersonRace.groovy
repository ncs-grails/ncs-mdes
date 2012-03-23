package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PersonRace {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String personRaceId
	/**
	 * Status level 1
	 */
	String personId
	/**
	 * Status level 1
	 */
	RaceCl1 race
	/**
	 * PII level P
	 * Status level 1
	 */
	String raceOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		personRaceId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: false, minSize:1, maxSize:36)
		race(nullable: false)
		raceOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'person_race'
		psuId column:'psu_id'
		personRaceId column:'person_race_id'
		personId column:'person_id'
		race column:'race'
		raceOth column:'race_oth'
		transactionType column:'transaction_type'
	}
}
