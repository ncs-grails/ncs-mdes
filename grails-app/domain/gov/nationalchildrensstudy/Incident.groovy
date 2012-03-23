package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Incident {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String incidentId
	/**
	 * Status level 1
	 */
	String incidentDate
	/**
	 * Status level 1
	 */
	String incidentTime
	/**
	 * Status level 1
	 */
	String incReportDate
	/**
	 * Status level 1
	 */
	String incReportTime
	/**
	 * Status level 1
	 */
	String incStaffReporterId
	/**
	 * Status level 1
	 */
	String incStaffSupervisorId
	/**
	 * Status level 1
	 */
	String incRecipIsParticipant
	/**
	 * Status level 1
	 */
	String incRecipIsDu
	/**
	 * Status level 1
	 */
	String incRecipIsStaff
	/**
	 * Status level 1
	 */
	String incRecipIsFamily
	/**
	 * Status level 1
	 */
	String incRecipIsAcquaintance
	/**
	 * Status level 1
	 */
	Integer incRecipIsOther
	/**
	 * Status level 1
	 */
	String incContactPerson
	/**
	 * Status level 3
	 */
	IncidentTypeCl1 inctype
	/**
	 * PII level P
	 * Status level 1
	 */
	String inctypeOth
	/**
	 * Status level 1
	 */
	String inclossCmptrModel
	/**
	 * Status level 1
	 */
	String inclossCmptrSn
	/**
	 * Status level 1
	 */
	String inclossCmptrDecal
	/**
	 * Status level 1
	 */
	String inclossRemMedia
	/**
	 * Status level 1
	 */
	String inclossPaper
	/**
	 * PII level P
	 * Status level 1
	 */
	String inclossOth
	/**
	 * PII level P
	 * Status level 1
	 */
	String incDescription
	/**
	 * PII level P
	 * Status level 1
	 */
	String incAction
	/**
	 * Status level 3
	 */
	ConfirmTypeCl3 incReported
	/**
	 * Status level 1
	 */
	String contactId
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		incidentId(nullable: false, minSize:1, maxSize:36)
		incidentDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		incidentTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		incReportDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		incReportTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		incStaffReporterId(nullable: true, maxSize:36)
		incStaffSupervisorId(nullable: true, maxSize:36)
		incRecipIsParticipant(nullable: true, maxSize:36)
		incRecipIsDu(nullable: true, maxSize:36)
		incRecipIsStaff(nullable: true, maxSize:36)
		incRecipIsFamily(nullable: true, maxSize:36)
		incRecipIsAcquaintance(nullable: true, maxSize:36)
		incRecipIsOther(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		incContactPerson(nullable: true, maxSize:36)
		inctype(nullable: false)
		inctypeOth(nullable: true, maxSize:255)
		inclossCmptrModel(nullable: true, maxSize:16)
		inclossCmptrSn(nullable: true, maxSize:32)
		inclossCmptrDecal(nullable: true, maxSize:32)
		inclossRemMedia(nullable: true, maxSize:32)
		inclossPaper(nullable: true, maxSize:32)
		inclossOth(nullable: true, maxSize:255)
		incDescription(nullable: true, maxSize:8000)
		incAction(nullable: true, maxSize:8000)
		incReported(nullable: false)
		contactId(nullable: true, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'incident'
		psuId column:'psu_id'
		incidentId column:'incident_id'
		incidentDate column:'incident_date'
		incidentTime column:'incident_time'
		incReportDate column:'inc_report_date'
		incReportTime column:'inc_report_time'
		incStaffReporterId column:'inc_staff_reporter_id'
		incStaffSupervisorId column:'inc_staff_supervisor_id'
		incRecipIsParticipant column:'inc_recip_is_participant'
		incRecipIsDu column:'inc_recip_is_du'
		incRecipIsStaff column:'inc_recip_is_staff'
		incRecipIsFamily column:'inc_recip_is_family'
		incRecipIsAcquaintance column:'inc_recip_is_acquaintance'
		incRecipIsOther column:'inc_recip_is_other'
		incContactPerson column:'inc_contact_person'
		inctype column:'inctype'
		inctypeOth column:'inctype_oth'
		inclossCmptrModel column:'incloss_cmptr_model'
		inclossCmptrSn column:'incloss_cmptr_sn'
		inclossCmptrDecal column:'incloss_cmptr_decal'
		inclossRemMedia column:'incloss_rem_media'
		inclossPaper column:'incloss_paper'
		inclossOth column:'incloss_oth'
		incDescription column:'inc_description'
		incAction column:'inc_action'
		incReported column:'inc_reported'
		contactId column:'contact_id'
		transactionType column:'transaction_type'
	}
}
