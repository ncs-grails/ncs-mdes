package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class FatherPv1Race {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String fatherId
	/**
	 * Status level 2
	 */
	String fatherRaceId
	/**
	 * Status level 2
	 */
	RaceCl2 race
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		fatherId(nullable: false, minSize:1, maxSize:36)
		fatherRaceId(nullable: false, minSize:1, maxSize:36)
		race(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'father_pv1_race'
		psuId column:'psu_id'
		fatherId column:'father_id'
		fatherRaceId column:'father_race_id'
		race column:'race'
		transactionType column:'transaction_type'
	}
}
