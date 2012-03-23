package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class EighteenMthMotherRoomMold {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String eighteenMthRoomMoldId
	/**
	 * Status level 2
	 */
	String eighteenMthMotherId
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
		eighteenMthRoomMoldId(nullable: false, minSize:1, maxSize:36)
		eighteenMthMotherId(nullable: false, minSize:1, maxSize:36)
		roomMold(nullable: false)
		roomMoldOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'eighteen_mth_mother_room_mold'
		psuId column:'psu_id'
		eighteenMthRoomMoldId column:'eighteen_mth_room_mold_id'
		eighteenMthMotherId column:'eighteen_mth_mother_id'
		roomMold column:'room_mold'
		roomMoldOth column:'room_mold_oth'
		transactionType column:'transaction_type'
	}
}
