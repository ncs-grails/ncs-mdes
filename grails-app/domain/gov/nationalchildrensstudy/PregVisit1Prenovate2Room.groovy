package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1Prenovate2Room {

	/**
	 * Status level 4
	 */
	PsuCl1 psuId
	/**
	 * Status level 4
	 */
	String pv1Prenovate2RoomId
	/**
	 * Status level 4
	 */
	String pv1Id
	/**
	 * Status level 4
	 */
	RoomTypeCl2 prenovate2Room
	/**
	 * Status level 4
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1Prenovate2RoomId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		prenovate2Room(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_prenovate2_room'
		psuId column:'psu_id'
		pv1Prenovate2RoomId column:'pv1_prenovate2_room_id'
		pv1Id column:'pv1_id'
		prenovate2Room column:'prenovate2_room'
		transactionType column:'transaction_type'
	}
}
