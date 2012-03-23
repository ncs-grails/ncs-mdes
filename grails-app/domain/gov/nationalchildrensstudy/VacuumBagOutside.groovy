package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class VacuumBagOutside {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String vacuumBagId
	/**
	 * Status level 2
	 */
	String vacuumBagOutsideId
	/**
	 * Status level 2
	 */
	VacuumUseCl1 vacUsedOutside
	/**
	 * PII level P
	 * Status level 2
	 */
	String vacUsedOutsideOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		vacuumBagId(nullable: false, minSize:1, maxSize:36)
		vacuumBagOutsideId(nullable: true, minSize:1, maxSize:36)
		vacUsedOutside(nullable: false)
		vacUsedOutsideOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'vacuum_bag_outside'
		psuId column:'psu_id'
		vacuumBagId column:'vacuum_bag_id'
		vacuumBagOutsideId column:'vacuum_bag_outside_id'
		vacUsedOutside column:'vac_used_outside'
		vacUsedOutsideOth column:'vac_used_outside_oth'
		transactionType column:'transaction_type'
	}
}
