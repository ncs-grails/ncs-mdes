package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2PrenovateRoom2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv2Prenovate2RoomId
	/**
	 * Status level 2
	 */
	String pv2Id
	/**
	 * Status level 2
	 */
	RoomTypeCl1 prenovate2Room
	/**
	 * PII level P
	 * Status level 2
	 */
	String prenovate2RoomOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv2Prenovate2RoomId(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		prenovate2Room(nullable: false)
		prenovate2RoomOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_prenovate_room_2'
		psuId column:'psu_id'
		pv2Prenovate2RoomId column:'pv2_prenovate2_room_id'
		pv2Id column:'pv2_id'
		prenovate2Room column:'prenovate2_room'
		prenovate2RoomOth column:'prenovate2_room_oth'
		transactionType column:'transaction_type'
	}
}
