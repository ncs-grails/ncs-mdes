package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class VacuumBag {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String vacuumBagId
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
	ConfirmTypeCl2 vacuumParticipant
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 vacuumInHome
	/**
	 * Status level 2
	 */
	ConfirmTypeCl7 vacuumTechOkay
	/**
	 * Status level 2
	 */
	VacuumRefuseCl1 vacuumRefuse
	/**
	 * PII level P
	 * Status level 2
	 */
	String vacuumRefuseOth
	/**
	 * Status level 2
	 */
	VacuumTypeCl1 vacuumType
	/**
	 * PII level P
	 * Status level 2
	 */
	String vacTypeOth
	/**
	 * Status level 2
	 */
	String vacuumMakeModel
	/**
	 * Status level 2
	 */
	Integer vacuumBagChanged
	/**
	 * Status level 2
	 */
	TimeUnitCl2 vacuumBagChangedFreq
	/**
	 * Status level 2
	 */
	String timeStamp2
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 vacuumCollected
	/**
	 * Status level 2
	 */
	VacuumNotcolReasonCl1 rVacuumNCollected
	/**
	 * PII level P
	 * Status level 2
	 */
	String rVacuumNCollectedOth
	/**
	 * Status level 2
	 */
	ConfirmTypeCl2 vacuumMostUsed
	/**
	 * Status level 2
	 */
	Integer vacuumTemp
	/**
	 * Status level 2
	 */
	Integer vacuumRh
	/**
	 * Status level 2
	 */
	VacuumBagStatusCl1 vacuumBag
	/**
	 * PII level P
	 * Status level 2
	 */
	String vacuumBagOth
	/**
	 * Status level 2
	 */
	SampleTypeCl3 sampleNumber
	/**
	 * Status level 2
	 */
	String sampleId
	/**
	 * Status level 2
	 */
	VacuumCollecProbCl1 vacuumProblems
	/**
	 * PII level P
	 * Status level 2
	 */
	String vacuumProblemsOth
	/**
	 * Status level 2
	 */
	String timeStamp3
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		vacuumBagId(nullable: false, minSize:1, maxSize:36)
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
		vacuumParticipant(nullable: false)
		vacuumInHome(nullable: false)
		vacuumTechOkay(nullable: false)
		vacuumRefuse(nullable: false)
		vacuumRefuseOth(nullable: true, maxSize:255)
		vacuumType(nullable: false)
		vacTypeOth(nullable: true, maxSize:255)
		vacuumMakeModel(nullable: true, maxSize:255)
		vacuumBagChanged(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		vacuumBagChangedFreq(nullable: false)
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		vacuumCollected(nullable: false)
		rVacuumNCollected(nullable: false)
		rVacuumNCollectedOth(nullable: true, maxSize:255)
		vacuumMostUsed(nullable: false)
		vacuumTemp(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		vacuumRh(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		vacuumBag(nullable: false)
		vacuumBagOth(nullable: true, maxSize:255)
		sampleNumber(nullable: false)
		sampleId(nullable: true, maxSize:14)
		vacuumProblems(nullable: false)
		vacuumProblemsOth(nullable: true, maxSize:255)
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'vacuum_bag'
		psuId column:'psu_id'
		vacuumBagId column:'vacuum_bag_id'
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
		vacuumParticipant column:'vacuum_participant'
		vacuumInHome column:'vacuum_in_home'
		vacuumTechOkay column:'vacuum_tech_okay'
		vacuumRefuse column:'vacuum_refuse'
		vacuumRefuseOth column:'vacuum_refuse_oth'
		vacuumType column:'vacuum_type'
		vacTypeOth column:'vac_type_oth'
		vacuumMakeModel column:'vacuum_make_model'
		vacuumBagChanged column:'vacuum_bag_changed'
		vacuumBagChangedFreq column:'vacuum_bag_changed_freq'
		timeStamp2 column:'time_stamp_2'
		vacuumCollected column:'vacuum_collected'
		rVacuumNCollected column:'r_vacuum_n_collected'
		rVacuumNCollectedOth column:'r_vacuum_n_collected_oth'
		vacuumMostUsed column:'vacuum_most_used'
		vacuumTemp column:'vacuum_temp'
		vacuumRh column:'vacuum_rh'
		vacuumBag column:'vacuum_bag'
		vacuumBagOth column:'vacuum_bag_oth'
		sampleNumber column:'sample_number'
		sampleId column:'sample_id'
		vacuumProblems column:'vacuum_problems'
		vacuumProblemsOth column:'vacuum_problems_oth'
		timeStamp3 column:'time_stamp_3'
		transactionType column:'transaction_type'
	}
}
