package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class LinkPersonParticipant {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String personPidId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	String personId
	/**
	 * Status level 3
	 */
	PersonPartcpntReltnshpCl1 relation
	/**
	 * PII level P
	 * Status level 1
	 */
	String relationOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 isActive
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		personPidId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: false, minSize:1, maxSize:36)
		relation(nullable: false)
		relationOth(nullable: true, maxSize:255)
		isActive(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'link_person_participant'
		psuId column:'psu_id'
		personPidId column:'person_pid_id'
		pId column:'p_id'
		personId column:'person_id'
		relation column:'relation'
		relationOth column:'relation_oth'
		isActive column:'is_active'
		transactionType column:'transaction_type'
	}
}
