package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1PdecorateRoom2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv1PdecorateRoomId
	/**
	 * Status level 2
	 */
	String pv1Id
	/**
	 * Status level 2
	 */
	RoomTypeCl2 pdecorateRoom
	/**
	 * PII level P
	 * Status level 2
	 */
	String pdecorateRoomOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1PdecorateRoomId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		pdecorateRoom(nullable: false)
		pdecorateRoomOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_pdecorate_room_2'
		psuId column:'psu_id'
		pv1PdecorateRoomId column:'pv1_pdecorate_room_id'
		pv1Id column:'pv1_id'
		pdecorateRoom column:'pdecorate_room'
		pdecorateRoomOth column:'pdecorate_room_oth'
		transactionType column:'transaction_type'
	}
}
