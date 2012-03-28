package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Incident {

	Integer psuId
	String incidentId
	String incidentDate
	String incidentTime
	String incReportDate
	String incReportTime
	String incStaffReporterId
	String incStaffSupervisorId
	String incRecipIsParticipant
	String incRecipIsDu
	String incRecipIsStaff
	String incRecipIsFamily
	String incRecipIsAcquaintance
	Integer incRecipIsOther
	String incContactPerson
	Integer inctype
	String inctypeOth
	String inclossCmptrModel
	String inclossCmptrSn
	String inclossCmptrDecal
	String inclossRemMedia
	String inclossPaper
	String inclossOth
	String incDescription
	String incAction
	Integer incReported
	String contactId
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
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
		inctype(nullable: false, inList:[1, 2, 3, 4, 5, -5, -4])
		inctypeOth(nullable: true, maxSize:255)
		inclossCmptrModel(nullable: true, maxSize:16)
		inclossCmptrSn(nullable: true, maxSize:32)
		inclossCmptrDecal(nullable: true, maxSize:32)
		inclossRemMedia(nullable: true, maxSize:32)
		inclossPaper(nullable: true, maxSize:32)
		inclossOth(nullable: true, maxSize:255)
		incDescription(nullable: true, maxSize:8000)
		incAction(nullable: true, maxSize:8000)
		incReported(nullable: false, inList:[1, 2, -6, -4])
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
