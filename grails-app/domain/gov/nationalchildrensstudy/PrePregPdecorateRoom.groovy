package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PrePregPdecorateRoom {

	/**
	 * PII level P
	 * Status level 3
	 */
	String decorateRoomOth
	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ppDecorateRoomId
	/**
	 * Status level 1
	 */
	String ppId
	/**
	 * Status level 3
	 */
	RoomTypeCl2 decorateRoom
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		decorateRoomOth(nullable: true, maxSize:255)
		psuId(nullable: false)
		ppDecorateRoomId(nullable: false, minSize:1, maxSize:36)
		ppId(nullable: false, minSize:1, maxSize:36)
		decorateRoom(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pre_preg_pdecorate_room'
		decorateRoomOth column:'decorate_room_oth'
		psuId column:'psu_id'
		ppDecorateRoomId column:'pp_decorate_room_id'
		ppId column:'pp_id'
		decorateRoom column:'decorate_room'
		transactionType column:'transaction_type'
	}
}
