package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class EighteenMthMotherRenovateRoom {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String eighteenMthMotherId
	/**
	 * Status level 2
	 */
	String eighteenMthMotherRenovateRoomId
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
		eighteenMthMotherId(nullable: false, minSize:1, maxSize:36)
		eighteenMthMotherRenovateRoomId(nullable: false, minSize:1, maxSize:36)
		renovateRoom(nullable: false)
		renovateRoomOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'eighteen_mth_mother_renovate_room'
		psuId column:'psu_id'
		eighteenMthMotherId column:'eighteen_mth_mother_id'
		eighteenMthMotherRenovateRoomId column:'eighteen_mth_mother_renovate_room_id'
		renovateRoom column:'renovate_room'
		renovateRoomOth column:'renovate_room_oth'
		transactionType column:'transaction_type'
	}
}
