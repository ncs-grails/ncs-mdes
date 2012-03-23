package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class BirthVisitDecorateRoom2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String bvId
	/**
	 * Status level 2
	 */
	String bvDecorateRoomId
	/**
	 * Status level 2
	 */
	RoomTypeCl3 decorateRoom
	/**
	 * PII level P
	 * Status level 2
	 */
	String decorateRoomOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		bvId(nullable: false, minSize:1, maxSize:36)
		bvDecorateRoomId(nullable: false, minSize:1, maxSize:36)
		decorateRoom(nullable: false)
		decorateRoomOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'birth_visit_decorate_room_2'
		psuId column:'psu_id'
		bvId column:'bv_id'
		bvDecorateRoomId column:'bv_decorate_room_id'
		decorateRoom column:'decorate_room'
		decorateRoomOth column:'decorate_room_oth'
		transactionType column:'transaction_type'
	}
}
