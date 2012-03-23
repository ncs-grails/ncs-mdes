package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwentyFourMthRoomMold {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String twentyFourMthId
	/**
	 * Status level 2
	 */
	String twentyFourMthRoomMoldId
	/**
	 * Status level 2
	 */
	RoomTypeCl3 roomMold
	/**
	 * PII level P
	 * Status level 2
	 */
	String roomMoldOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twentyFourMthId(nullable: false, minSize:1, maxSize:36)
		twentyFourMthRoomMoldId(nullable: false, minSize:1, maxSize:36)
		roomMold(nullable: false)
		roomMoldOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_room_mold'
		psuId column:'psu_id'
		twentyFourMthId column:'twenty_four_mth_id'
		twentyFourMthRoomMoldId column:'twenty_four_mth_room_mold_id'
		roomMold column:'room_mold'
		roomMoldOth column:'room_mold_oth'
		transactionType column:'transaction_type'
	}
}
