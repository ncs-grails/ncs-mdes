package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenPbRace {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String psPbRaceId
	/**
	 * Status level 1
	 */
	String psPbId
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
		psPbRaceId(nullable: false, minSize:1, maxSize:36)
		psPbId(nullable: false, minSize:1, maxSize:36)
		race(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_pb_race'
		psuId column:'psu_id'
		psPbRaceId column:'ps_pb_race_id'
		psPbId column:'ps_pb_id'
		race column:'race'
		transactionType column:'transaction_type'
	}
}
