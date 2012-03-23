package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PrePregRoomMold {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ppRoomMoldId
	/**
	 * Status level 1
	 */
	String ppId
	/**
	 * Status level 3
	 */
	RoomTypeCl1 roomMold
	/**
	 * PII level P
	 * Status level 3
	 */
	String roomMoldOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ppRoomMoldId(nullable: false, minSize:1, maxSize:36)
		ppId(nullable: false, minSize:1, maxSize:36)
		roomMold(nullable: false)
		roomMoldOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pre_preg_room_mold'
		psuId column:'psu_id'
		ppRoomMoldId column:'pp_room_mold_id'
		ppId column:'pp_id'
		roomMold column:'room_mold'
		roomMoldOth column:'room_mold_oth'
		transactionType column:'transaction_type'
	}
}
