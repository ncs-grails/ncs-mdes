package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2RoomMold {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv2RoomMoldId
	/**
	 * Status level 1
	 */
	String pv2Id
	/**
	 * Status level 3
	 */
	RoomTypeCl1 roomMold
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv2RoomMoldId(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		roomMold(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_room_mold'
		psuId column:'psu_id'
		pv2RoomMoldId column:'pv2_room_mold_id'
		pv2Id column:'pv2_id'
		roomMold column:'room_mold'
		transactionType column:'transaction_type'
	}
}
