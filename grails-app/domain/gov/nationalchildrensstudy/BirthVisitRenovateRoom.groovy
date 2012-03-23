package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class BirthVisitRenovateRoom {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String bvRenovateRoomId
	/**
	 * Status level 1
	 */
	String bvId
	/**
	 * Status level 3
	 */
	RoomTypeCl3 renovateRoom
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		bvRenovateRoomId(nullable: false, minSize:1, maxSize:36)
		bvId(nullable: false, minSize:1, maxSize:36)
		renovateRoom(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'birth_visit_renovate_room'
		psuId column:'psu_id'
		bvRenovateRoomId column:'bv_renovate_room_id'
		bvId column:'bv_id'
		renovateRoom column:'renovate_room'
		transactionType column:'transaction_type'
	}
}
