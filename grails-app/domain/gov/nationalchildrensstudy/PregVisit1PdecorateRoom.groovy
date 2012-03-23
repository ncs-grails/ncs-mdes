package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1PdecorateRoom {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1PdecorateRoomId
	/**
	 * Status level 1
	 */
	String pv1Id
	/**
	 * Status level 3
	 */
	RoomTypeCl2 pdecorateRoom
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1PdecorateRoomId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		pdecorateRoom(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_pdecorate_room'
		psuId column:'psu_id'
		pv1PdecorateRoomId column:'pv1_pdecorate_room_id'
		pv1Id column:'pv1_id'
		pdecorateRoom column:'pdecorate_room'
		transactionType column:'transaction_type'
	}
}
