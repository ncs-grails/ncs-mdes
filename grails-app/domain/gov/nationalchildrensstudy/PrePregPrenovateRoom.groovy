package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PrePregPrenovateRoom {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ppRenovateRoomId
	/**
	 * Status level 1
	 */
	String ppId
	/**
	 * Status level 3
	 */
	RoomTypeCl1 renovateRoom
	/**
	 * PII level P
	 * Status level 3
	 */
	String renovateRoomOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ppRenovateRoomId(nullable: false, minSize:1, maxSize:36)
		ppId(nullable: false, minSize:1, maxSize:36)
		renovateRoom(nullable: false)
		renovateRoomOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pre_preg_prenovate_room'
		psuId column:'psu_id'
		ppRenovateRoomId column:'pp_renovate_room_id'
		ppId column:'pp_id'
		renovateRoom column:'renovate_room'
		renovateRoomOth column:'renovate_room_oth'
		transactionType column:'transaction_type'
	}
}
