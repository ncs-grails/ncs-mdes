package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecCordBlood {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String specCordBloodId
	/**
	 * Status level 2
	 */
	RecruitTypeCl1 recruitType
	/**
	 * Status level 2
	 */
	String duId
	/**
	 * Status level 2
	 */
	String hhId
	/**
	 * Status level 2
	 */
	String pId
	/**
	 * Status level 2
	 */
	String eventId
	/**
	 * Status level 2
	 */
	EventTypeCl1 eventType
	/**
	 * Status level 2
	 */
	Integer eventRepeatKey
	/**
	 * Status level 2
	 */
	String instrumentId
	/**
	 * Status level 2
	 */
	InstrumentTypeCl1 instrumentType
	/**
	 * Status level 2
	 */
	String instrumentVersion
	/**
	 * Status level 2
	 */
	Integer instrumentRepeatKey
	/**
	 * Status level 2
	 */
	String timeStamp1
	/**
	 * Status level 2
	 */
	String personDob
	/**
	 * PII level P
	 * Status level 2
	 */
	String childDob
	/**
	 * Status level 2
	 */
	String cordBirthHr
	/**
	 * Status level 2
	 */
	String cordBirthMin
	/**
	 * Status level 2
	 */
	TimeOfDayCl1 cordBirthUnit
	/**
	 * Status level 2
	 */
	GenderCl3 childSex
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 cordCollection
	/**
	 * Status level 2
	 */
	CordNotcolReasonCl1 cordNotcolComment
	/**
	 * PII level P
	 * Status level 2
	 */
	String cordNotcolOth
	/**
	 * Status level 2
	 */
	String cordCollectDate
	/**
	 * Status level 2
	 */
	String cordCollectHr
	/**
	 * Status level 2
	 */
	String cordCollectMin
	/**
	 * Status level 2
	 */
	TimeOfDayCl1 cordCollectUnit
	/**
	 * Status level 2
	 */
	CordCllctnLocationCl1 cordWhereCollect
	/**
	 * Status level 2
	 */
	DeliveryTypeCl1 cordDelivery
	/**
	 * Status level 2
	 */
	CordContainerCl1 cordContainer
	/**
	 * Status level 2
	 */
	String timeStamp2
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		specCordBloodId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false)
		duId(nullable: false, minSize:1, maxSize:36)
		hhId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: true, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false)
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		personDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		childDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		cordBirthHr(nullable: true, maxSize:2)
		cordBirthMin(nullable: true, maxSize:2)
		cordBirthUnit(nullable: false)
		childSex(nullable: false)
		cordCollection(nullable: false)
		cordNotcolComment(nullable: false)
		cordNotcolOth(nullable: true, maxSize:255)
		cordCollectDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		cordCollectHr(nullable: true, maxSize:2)
		cordCollectMin(nullable: true, maxSize:2)
		cordCollectUnit(nullable: false)
		cordWhereCollect(nullable: false)
		cordDelivery(nullable: false)
		cordContainer(nullable: false)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_cord_blood'
		psuId column:'psu_id'
		specCordBloodId column:'spec_cord_blood_id'
		recruitType column:'recruit_type'
		duId column:'du_id'
		hhId column:'hh_id'
		pId column:'p_id'
		eventId column:'event_id'
		eventType column:'event_type'
		eventRepeatKey column:'event_repeat_key'
		instrumentId column:'instrument_id'
		instrumentType column:'instrument_type'
		instrumentVersion column:'instrument_version'
		instrumentRepeatKey column:'instrument_repeat_key'
		timeStamp1 column:'time_stamp_1'
		personDob column:'person_dob'
		childDob column:'child_dob'
		cordBirthHr column:'cord_birth_hr'
		cordBirthMin column:'cord_birth_min'
		cordBirthUnit column:'cord_birth_unit'
		childSex column:'child_sex'
		cordCollection column:'cord_collection'
		cordNotcolComment column:'cord_notcol_comment'
		cordNotcolOth column:'cord_notcol_oth'
		cordCollectDate column:'cord_collect_date'
		cordCollectHr column:'cord_collect_hr'
		cordCollectMin column:'cord_collect_min'
		cordCollectUnit column:'cord_collect_unit'
		cordWhereCollect column:'cord_where_collect'
		cordDelivery column:'cord_delivery'
		cordContainer column:'cord_container'
		timeStamp2 column:'time_stamp_2'
		transactionType column:'transaction_type'
	}
}
