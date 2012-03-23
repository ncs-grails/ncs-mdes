package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2RoomMold2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv2RoomMoldId
	/**
	 * Status level 2
	 */
	String pv2Id
	/**
	 * Status level 2
	 */
	RoomTypeCl1 roomMold
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
		pv2RoomMoldId(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		roomMold(nullable: false)
		roomMoldOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_room_mold_2'
		psuId column:'psu_id'
		pv2RoomMoldId column:'pv2_room_mold_id'
		pv2Id column:'pv2_id'
		roomMold column:'room_mold'
		roomMoldOth column:'room_mold_oth'
		transactionType column:'transaction_type'
	}
}
