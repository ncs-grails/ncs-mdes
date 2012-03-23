package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class BirthVisitLiRenovateRoom {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String bvLiId
	/**
	 * Status level 2
	 */
	String bvRenovateRoomId
	/**
	 * Status level 2
	 */
	RoomTypeCl3 renovateRoom
	/**
	 * PII level P
	 * Status level 2
	 */
	String renovateRoomOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		bvLiId(nullable: false, minSize:1, maxSize:36)
		bvRenovateRoomId(nullable: false, minSize:1, maxSize:36)
		renovateRoom(nullable: false)
		renovateRoomOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'birth_visit_li_renovate_room'
		psuId column:'psu_id'
		bvLiId column:'bv_li_id'
		bvRenovateRoomId column:'bv_renovate_room_id'
		renovateRoom column:'renovate_room'
		renovateRoomOth column:'renovate_room_oth'
		transactionType column:'transaction_type'
	}
}
