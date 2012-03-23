package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwentyFourMthRenovateRoom {

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
	String twentyFourMthRenovateRoomId
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
		twentyFourMthId(nullable: false, minSize:1, maxSize:36)
		twentyFourMthRenovateRoomId(nullable: false, minSize:1, maxSize:36)
		renovateRoom(nullable: false)
		renovateRoomOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_renovate_room'
		psuId column:'psu_id'
		twentyFourMthId column:'twenty_four_mth_id'
		twentyFourMthRenovateRoomId column:'twenty_four_mth_renovate_room_id'
		renovateRoom column:'renovate_room'
		renovateRoomOth column:'renovate_room_oth'
		transactionType column:'transaction_type'
	}
}
