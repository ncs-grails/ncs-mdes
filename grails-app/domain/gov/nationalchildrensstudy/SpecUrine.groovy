package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecUrine {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String specUrineId
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
	ConfirmTypeCl23 urineIntro
	/**
	 * Status level 2
	 */
	String ltUrine1
	/**
	 * Status level 2
	 */
	String ltUrine2
	/**
	 * Status level 2
	 */
	TimeOfDayCl1 ltUrine3
	/**
	 * Status level 2
	 */
	String ltEatDrink1
	/**
	 * Status level 2
	 */
	String ltEatDrink2
	/**
	 * Status level 2
	 */
	TimeOfDayCl1 ltEatDrink3
	/**
	 * Status level 2
	 */
	FoodQuantityCl1 ateMeat
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 creatineSupp
	/**
	 * Status level 2
	 */
	SpecimenStatusCl8 specimenStatus
	/**
	 * Status level 2
	 */
	SpecimenCommentsCl1 specimenComments
	/**
	 * PII level P
	 * Status level 2
	 */
	String specimenCommentOth
	/**
	 * Status level 2
	 */
	String specimenId
	/**
	 * Status level 2
	 */
	SpecimenCllctnLocationCl1 collectionLocation
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 urCollDifficult
	/**
	 * PII level P
	 * Status level 2
	 */
	String urCollEasierComment
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
		specUrineId(nullable: false, minSize:1, maxSize:36)
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
		urineIntro(nullable: false)
		ltUrine1(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		ltUrine2(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		ltUrine3(nullable: false)
		ltEatDrink1(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		ltEatDrink2(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		ltEatDrink3(nullable: false)
		ateMeat(nullable: false)
		creatineSupp(nullable: false)
		specimenStatus(nullable: false)
		specimenComments(nullable: false)
		specimenCommentOth(nullable: true, maxSize:255)
		specimenId(nullable: false, minSize:1, maxSize:36)
		collectionLocation(nullable: false)
		urCollDifficult(nullable: false)
		urCollEasierComment(nullable: true, maxSize:255)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_urine'
		psuId column:'psu_id'
		specUrineId column:'spec_urine_id'
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
		urineIntro column:'urine_intro'
		ltUrine1 column:'lt_urine_1'
		ltUrine2 column:'lt_urine_2'
		ltUrine3 column:'lt_urine_3'
		ltEatDrink1 column:'lt_eat_drink_1'
		ltEatDrink2 column:'lt_eat_drink_2'
		ltEatDrink3 column:'lt_eat_drink_3'
		ateMeat column:'ate_meat'
		creatineSupp column:'creatine_supp'
		specimenStatus column:'specimen_status'
		specimenComments column:'specimen_comments'
		specimenCommentOth column:'specimen_comment_oth'
		specimenId column:'specimen_id'
		collectionLocation column:'collection_location'
		urCollDifficult column:'ur_coll_difficult'
		urCollEasierComment column:'ur_coll_easier_comment'
		timeStamp2 column:'time_stamp_2'
		transactionType column:'transaction_type'
	}
}
