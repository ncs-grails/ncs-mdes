package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwelveMthMotherRoomMold {

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
	String twelveMthRoomMoldId
	/**
	 * Status level 3
	 */
	RoomTypeCl3 roomMold
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
		twelveMthId(nullable: false, minSize:1, maxSize:36)
		twelveMthRoomMoldId(nullable: false, minSize:1, maxSize:36)
		roomMold(nullable: false)
		roomMoldOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twelve_mth_mother_room_mold'
		psuId column:'psu_id'
		twelveMthId column:'twelve_mth_id'
		twelveMthRoomMoldId column:'twelve_mth_room_mold_id'
		roomMold column:'room_mold'
		roomMoldOth column:'room_mold_oth'
		transactionType column:'transaction_type'
	}
}
