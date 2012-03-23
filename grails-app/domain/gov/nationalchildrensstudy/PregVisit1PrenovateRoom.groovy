package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1PrenovateRoom {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1PrenovateRoomId
	/**
	 * Status level 1
	 */
	String pv1Id
	/**
	 * Status level 3
	 */
	RoomTypeCl2 prenovateRoom
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1PrenovateRoomId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		prenovateRoom(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_prenovate_room'
		psuId column:'psu_id'
		pv1PrenovateRoomId column:'pv1_prenovate_room_id'
		pv1Id column:'pv1_id'
		prenovateRoom column:'prenovate_room'
		transactionType column:'transaction_type'
	}
}
