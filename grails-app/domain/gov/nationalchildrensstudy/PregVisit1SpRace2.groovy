package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1SpRace2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv1SpRaceId
	/**
	 * Status level 2
	 */
	String pv1Id
	/**
	 * Status level 2
	 */
	RaceCl2 spRace
	/**
	 * PII level P
	 * Status level 2
	 */
	String spRaceOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1SpRaceId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		spRace(nullable: false)
		spRaceOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_sp_race_2'
		psuId column:'psu_id'
		pv1SpRaceId column:'pv1_sp_race_id'
		pv1Id column:'pv1_id'
		spRace column:'sp_race'
		spRaceOth column:'sp_race_oth'
		transactionType column:'transaction_type'
	}
}
