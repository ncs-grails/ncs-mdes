package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenPbRace2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String psPbRaceId
	/**
	 * Status level 2
	 */
	String psPbId
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
		psPbRaceId(nullable: false, minSize:1, maxSize:36)
		psPbId(nullable: false, minSize:1, maxSize:36)
		race(nullable: false)
		raceOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_pb_race_2'
		psuId column:'psu_id'
		psPbRaceId column:'ps_pb_race_id'
		psPbId column:'ps_pb_id'
		race column:'race'
		raceOth column:'race_oth'
		transactionType column:'transaction_type'
	}
}
