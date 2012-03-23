package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1RoomMold2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv1RoomMoldId
	/**
	 * Status level 2
	 */
	String pv1Id
	/**
	 * Status level 2
	 */
	RoomTypeCl2 roomMold
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
		pv1RoomMoldId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		roomMold(nullable: false)
		roomMoldOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_room_mold_2'
		psuId column:'psu_id'
		pv1RoomMoldId column:'pv1_room_mold_id'
		pv1Id column:'pv1_id'
		roomMold column:'room_mold'
		roomMoldOth column:'room_mold_oth'
		transactionType column:'transaction_type'
	}
}
