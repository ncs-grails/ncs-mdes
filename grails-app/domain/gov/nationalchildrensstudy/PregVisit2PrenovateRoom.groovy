package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2PrenovateRoom {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv2Prenovate2RoomId
	/**
	 * Status level 1
	 */
	String pv2Id
	/**
	 * Status level 3
	 */
	RoomTypeCl1 prenovate2Room
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv2Prenovate2RoomId(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		prenovate2Room(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_prenovate_room'
		psuId column:'psu_id'
		pv2Prenovate2RoomId column:'pv2_prenovate2_room_id'
		pv2Id column:'pv2_id'
		prenovate2Room column:'prenovate2_room'
		transactionType column:'transaction_type'
	}
}
