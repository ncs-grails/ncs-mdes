package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ThreeMthMotherRace {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String threeMthId
	/**
	 * Status level 1
	 */
	String threeMthRaceId
	/**
	 * Status level 3
	 */
	RaceCl2 race
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
		threeMthId(nullable: false, minSize:1, maxSize:36)
		threeMthRaceId(nullable: false, minSize:1, maxSize:36)
		race(nullable: false)
		raceOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'three_mth_mother_race'
		psuId column:'psu_id'
		threeMthId column:'three_mth_id'
		threeMthRaceId column:'three_mth_race_id'
		race column:'race'
		raceOth column:'race_oth'
		transactionType column:'transaction_type'
	}
}
