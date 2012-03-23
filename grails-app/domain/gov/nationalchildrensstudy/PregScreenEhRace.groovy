package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenEhRace {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String psEhRaceId
	/**
	 * Status level 1
	 */
	String psEhId
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
		psEhRaceId(nullable: false, minSize:1, maxSize:36)
		psEhId(nullable: false, minSize:1, maxSize:36)
		race(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_eh_race'
		psuId column:'psu_id'
		psEhRaceId column:'ps_eh_race_id'
		psEhId column:'ps_eh_id'
		race column:'race'
		transactionType column:'transaction_type'
	}
}
