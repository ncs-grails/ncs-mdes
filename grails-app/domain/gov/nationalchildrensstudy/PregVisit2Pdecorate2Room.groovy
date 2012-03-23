package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2Pdecorate2Room {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv2Pdecorate2RoomId
	/**
	 * Status level 1
	 */
	String pv2Id
	/**
	 * Status level 3
	 */
	RoomTypeCl1 pdecorate2Room
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv2Pdecorate2RoomId(nullable: false, minSize:1, maxSize:36)
		pv2Id(nullable: false, minSize:1, maxSize:36)
		pdecorate2Room(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_pdecorate2_room'
		psuId column:'psu_id'
		pv2Pdecorate2RoomId column:'pv2_pdecorate2_room_id'
		pv2Id column:'pv2_id'
		pdecorate2Room column:'pdecorate2_room'
		transactionType column:'transaction_type'
	}
}
