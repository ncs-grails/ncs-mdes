package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1PrenovateRoom2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv1PrenovateRoomId
	/**
	 * Status level 2
	 */
	String pv1Id
	/**
	 * Status level 2
	 */
	RoomTypeCl2 prenovateRoom
	/**
	 * PII level P
	 * Status level 2
	 */
	String prenovateRoomOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1PrenovateRoomId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		prenovateRoom(nullable: false)
		prenovateRoomOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_prenovate_room_2'
		psuId column:'psu_id'
		pv1PrenovateRoomId column:'pv1_prenovate_room_id'
		pv1Id column:'pv1_id'
		prenovateRoom column:'prenovate_room'
		prenovateRoomOth column:'prenovate_room_oth'
		transactionType column:'transaction_type'
	}
}
