package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwelveMthMotherRenovateRoom {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String twelveMthId
	/**
	 * Status level 1
	 */
	String twelveMthRenRoomId
	/**
	 * Status level 3
	 */
	RoomTypeCl3 renovateRoom
	/**
	 * PII level P
	 * Status level 1
	 */
	String renovateRoomOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		twelveMthId(nullable: false, minSize:1, maxSize:36)
		twelveMthRenRoomId(nullable: false, minSize:1, maxSize:36)
		renovateRoom(nullable: false)
		renovateRoomOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_mother_renovate_room'
		psuId column:'psu_id'
		twelveMthId column:'twelve_mth_id'
		twelveMthRenRoomId column:'twelve_mth_ren_room_id'
		renovateRoom column:'renovate_room'
		renovateRoomOth column:'renovate_room_oth'
		transactionType column:'transaction_type'
	}
}
