package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Telephone {

	Integer psuId
	String phoneId
	String personId
	String instituteId
	String providerId
	Integer phoneInfoSource
	String phoneInfoSourceOth
	String phoneInfoDate
	String phoneInfoUpdate
	String phoneNbr
	String phoneExt
	Integer phoneType
	String phoneTypeOth
	Integer phoneRank
	String phoneRankOth
	Integer phoneLandline
	Integer phoneShare
	Integer cellPermission
	Integer textPermission
	String phoneComment
	String phoneStartDate
	String phoneEndDate
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		phoneId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: true, maxSize:36)
		instituteId(nullable: true, maxSize:36)
		providerId(nullable: true, maxSize:36)
		phoneInfoSource(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -5, -4])
		phoneInfoSourceOth(nullable: true, maxSize:255)
		phoneInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		phoneInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		phoneNbr(nullable: true, maxSize:10)
		phoneExt(nullable: true, maxSize:5)
		phoneType(nullable: false, inList:[1, 2, 3, 4, 5, -5, -1, -6, -4])
		phoneTypeOth(nullable: true, maxSize:255)
		phoneRank(nullable: false, inList:[1, 2, 3, 4, -5, -4])
		phoneRankOth(nullable: true, maxSize:255)
		phoneLandline(nullable: false, inList:[1, 2, -4])
		phoneShare(nullable: false, inList:[1, 2, -4])
		cellPermission(nullable: false, inList:[1, 2, -4])
		textPermission(nullable: false, inList:[1, 2, -4])
		phoneComment(nullable: true, maxSize:8000)
		phoneStartDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		phoneEndDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'telephone'
		psuId column:'psu_id'
		phoneId column:'phone_id'
		personId column:'person_id'
		instituteId column:'institute_id'
		providerId column:'provider_id'
		phoneInfoSource column:'phone_info_source'
		phoneInfoSourceOth column:'phone_info_source_oth'
		phoneInfoDate column:'phone_info_date'
		phoneInfoUpdate column:'phone_info_update'
		phoneNbr column:'phone_nbr'
		phoneExt column:'phone_ext'
		phoneType column:'phone_type'
		phoneTypeOth column:'phone_type_oth'
		phoneRank column:'phone_rank'
		phoneRankOth column:'phone_rank_oth'
		phoneLandline column:'phone_landline'
		phoneShare column:'phone_share'
		cellPermission column:'cell_permission'
		textPermission column:'text_permission'
		phoneComment column:'phone_comment'
		phoneStartDate column:'phone_start_date'
		phoneEndDate column:'phone_end_date'
		transactionType column:'transaction_type'
	}
}
