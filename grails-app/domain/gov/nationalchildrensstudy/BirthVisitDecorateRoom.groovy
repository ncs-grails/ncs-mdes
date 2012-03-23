package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class BirthVisitDecorateRoom {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String bvDecorateRoomId
	/**
	 * Status level 3
	 */
	RoomTypeCl3 decorateRoom
	/**
	 * Status level 1
	 */
	String bvId
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		bvDecorateRoomId(nullable: false, minSize:1, maxSize:36)
		decorateRoom(nullable: false)
		bvId(nullable: false, minSize:1, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'birth_visit_decorate_room'
		psuId column:'psu_id'
		bvDecorateRoomId column:'bv_decorate_room_id'
		decorateRoom column:'decorate_room'
		bvId column:'bv_id'
		transactionType column:'transaction_type'
	}
}
