package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1SpRace {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1SpRaceId
	/**
	 * Status level 1
	 */
	String pv1Id
	/**
	 * Status level 3
	 */
	RaceCl2 spRace
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1SpRaceId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		spRace(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_sp_race'
		psuId column:'psu_id'
		pv1SpRaceId column:'pv1_sp_race_id'
		pv1Id column:'pv1_id'
		spRace column:'sp_race'
		transactionType column:'transaction_type'
	}
}
