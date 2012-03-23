package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1RoomMold {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1RoomMoldId
	/**
	 * Status level 1
	 */
	String pv1Id
	/**
	 * Status level 3
	 */
	RoomTypeCl2 roomMold
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1RoomMoldId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		roomMold(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_room_mold'
		psuId column:'psu_id'
		pv1RoomMoldId column:'pv1_room_mold_id'
		pv1Id column:'pv1_id'
		roomMold column:'room_mold'
		transactionType column:'transaction_type'
	}
}
