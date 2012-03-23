package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class OutreachRace {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String outreachRaceId
	/**
	 * Status level 1
	 */
	String outreachEventId
	/**
	 * Status level 3
	 */
	RaceCl3 outreachRace2
	/**
	 * PII level P
	 * Status level 1
	 */
	String outreachRaceOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		outreachRaceId(nullable: false, minSize:1, maxSize:36)
		outreachEventId(nullable: false, minSize:1, maxSize:36)
		outreachRace2(nullable: false)
		outreachRaceOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'outreach_race'
		psuId column:'psu_id'
		outreachRaceId column:'outreach_race_id'
		outreachEventId column:'outreach_event_id'
		outreachRace2 column:'outreach_race2'
		outreachRaceOth column:'outreach_race_oth'
		transactionType column:'transaction_type'
	}
}
