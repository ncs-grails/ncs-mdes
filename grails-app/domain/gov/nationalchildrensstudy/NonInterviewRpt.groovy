package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class NonInterviewRpt {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String nirId
	/**
	 * Status level 1
	 */
	String contactId
	/**
	 * PII level P
	 * Status level 1
	 */
	String nir
	/**
	 * Status level 1
	 */
	String duId
	/**
	 * Status level 1
	 */
	String personId
	/**
	 * Status level 3
	 */
	DuVacancyInfoSourceCl1 nirVacInfo
	/**
	 * PII level P
	 * Status level 1
	 */
	String nirVacInfoOth
	/**
	 * Status level 4
	 */
	NoAccessDescrCl1 nirNoaccess
	/**
	 * PII level P
	 * Status level 4
	 */
	String nirNoaccessOth
	/**
	 * Status level 3
	 */
	AccessAttemptCl1 nirAccessAttempt
	/**
	 * PII level P
	 * Status level 1
	 */
	String nirAccessAttemptOth
	/**
	 * Status level 3
	 */
	NirReasonPersonCl1 nirTypePerson
	/**
	 * PII level P
	 * Status level 1
	 */
	String nirTypePersonOth
	/**
	 * Status level 3
	 */
	NirInformRelationCl1 cogInformRelation
	/**
	 * PII level P
	 * Status level 1
	 */
	String cogInformRelationOth
	/**
	 * PII level P
	 * Status level 1
	 */
	String cogDisDesc
	/**
	 * Status level 3
	 */
	ConfirmTypeCl10 permDisability
	/**
	 * Status level 3
	 */
	NirInformRelationCl1 deceasedInformRelation
	/**
	 * PII level P
	 * Status level 1
	 */
	String deceasedInformOth
	/**
	 * Status level 1
	 */
	Integer yod
	/**
	 * PII level Y
	 * Status level 3
	 */
	StateCl3 stateDeath
	/**
	 * Status level 3
	 */
	NirInformRelationCl2 whoRefused
	/**
	 * PII level P
	 * Status level 1
	 */
	String whoRefusedOth
	/**
	 * Status level 3
	 */
	RefusalIntensityCl1 refuserStrength
	/**
	 * Status level 3
	 */
	RefusalActionCl1 refAction
	/**
	 * PII level P
	 * Status level 1
	 */
	String ltIllnessDesc
	/**
	 * Status level 3
	 */
	ConfirmTypeCl10 permLtr
	/**
	 * Status level 3
	 */
	UnavailableReasonCl1 reasonUnavail
	/**
	 * PII level P
	 * Status level 1
	 */
	String reasonUnavailOth
	/**
	 * Status level 1
	 */
	String dateAvailable
	/**
	 * Status level 1
	 */
	String dateMoved
	/**
	 * Status level 1
	 */
	BigDecimal movedLengthTime
	/**
	 * Status level 3
	 */
	TimeUnitPastCl1 movedUnit
	/**
	 * Status level 3
	 */
	MovedInformRelationCl1 movedInformRelation
	/**
	 * PII level P
	 * Status level 1
	 */
	String movedRelationOth
	/**
	 * PII level P
	 * Status level 1
	 */
	String nirOther
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		nirId(nullable: false, minSize:1, maxSize:36)
		contactId(nullable: false, minSize:1, maxSize:36)
		nir(nullable: true, maxSize:8000)
		duId(nullable: true, maxSize:36)
		personId(nullable: true, maxSize:36)
		nirVacInfo(nullable: false)
		nirVacInfoOth(nullable: true, maxSize:255)
		nirNoaccess(nullable: false)
		nirNoaccessOth(nullable: true, maxSize:255)
		nirAccessAttempt(nullable: false)
		nirAccessAttemptOth(nullable: true, maxSize:255)
		nirTypePerson(nullable: false)
		nirTypePersonOth(nullable: true, maxSize:255)
		cogInformRelation(nullable: false)
		cogInformRelationOth(nullable: true, maxSize:255)
		cogDisDesc(nullable: true, maxSize:8000)
		permDisability(nullable: false)
		deceasedInformRelation(nullable: false)
		deceasedInformOth(nullable: true, maxSize:255)
		yod(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		stateDeath(nullable: false)
		whoRefused(nullable: false)
		whoRefusedOth(nullable: true, maxSize:255)
		refuserStrength(nullable: false)
		refAction(nullable: false)
		ltIllnessDesc(nullable: true, maxSize:8000)
		permLtr(nullable: false)
		reasonUnavail(nullable: false)
		reasonUnavailOth(nullable: true, maxSize:255)
		dateAvailable(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		dateMoved(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		movedLengthTime(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		movedUnit(nullable: false)
		movedInformRelation(nullable: false)
		movedRelationOth(nullable: true, maxSize:255)
		nirOther(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'non_interview_rpt'
		psuId column:'psu_id'
		nirId column:'nir_id'
		contactId column:'contact_id'
		nir column:'nir'
		duId column:'du_id'
		personId column:'person_id'
		nirVacInfo column:'nir_vac_info'
		nirVacInfoOth column:'nir_vac_info_oth'
		nirNoaccess column:'nir_noaccess'
		nirNoaccessOth column:'nir_noaccess_oth'
		nirAccessAttempt column:'nir_access_attempt'
		nirAccessAttemptOth column:'nir_access_attempt_oth'
		nirTypePerson column:'nir_type_person'
		nirTypePersonOth column:'nir_type_person_oth'
		cogInformRelation column:'cog_inform_relation'
		cogInformRelationOth column:'cog_inform_relation_oth'
		cogDisDesc column:'cog_dis_desc'
		permDisability column:'perm_disability'
		deceasedInformRelation column:'deceased_inform_relation'
		deceasedInformOth column:'deceased_inform_oth'
		yod column:'yod'
		stateDeath column:'state_death'
		whoRefused column:'who_refused'
		whoRefusedOth column:'who_refused_oth'
		refuserStrength column:'refuser_strength'
		refAction column:'ref_action'
		ltIllnessDesc column:'lt_illness_desc'
		permLtr column:'perm_ltr'
		reasonUnavail column:'reason_unavail'
		reasonUnavailOth column:'reason_unavail_oth'
		dateAvailable column:'date_available'
		dateMoved column:'date_moved'
		movedLengthTime column:'moved_length_time'
		movedUnit column:'moved_unit'
		movedInformRelation column:'moved_inform_relation'
		movedRelationOth column:'moved_relation_oth'
		nirOther column:'nir_other'
		transactionType column:'transaction_type'
	}
}
