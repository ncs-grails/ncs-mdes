package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthMother {

	Integer psuId
	String sixMthId
	Integer recruitType
	String duId
	String pId
	String eventId
	Integer eventType
	Integer eventRepeatKey
	String instrumentId
	Integer instrumentType
	String instrumentVersion
	Integer instrumentRepeatKey
	String timeStamp1
	Integer multChild
	Integer childNum
	String timeStamp8
	Integer pets
	Integer petMeds
	Integer petMedTime
	String timeStamp9
	Integer rodent
	Integer roach
	String timeStamp10
	Integer workPreg
	Integer workNow
	String workNowOth
	Integer workHrs
	String timeStamp11
	Integer cigNow
	Integer numSmoker
	Integer smokeInside
	Integer smokeRules
	Integer smokeHours
	String timeStamp12
	Integer payBills
	Integer wic
	Integer foodStamp
	Integer tanf
	String timeStamp13
	Integer nonenglishFreq
	String timeStamp14
	Integer income
	Integer income2
	Integer famSupport
	Integer famSupportNum
	String timeStamp15
	Integer commEmail
	Integer haveEmail
	Integer email2
	Integer email3
	String email
	Integer commCell
	Integer cellPhone1
	Integer cellPhone2
	Integer cellPhone3
	Integer cellPhone4
	String cellPhone
	String timeStamp16
	Integer commContact
	Integer contact1
	String contactFname1
	String contactLname1
	Integer contactRelate1
	String contactRelate1Oth
	String cAddr1Id
	String cAddr11
	String cAddr21
	String cUnit1
	String cCity1
	Integer cState1
	String cZipcode1
	String cZip41
	String contactPhone1
	String contactFname2
	String contactLname2
	Integer contactRelate2
	String contactRelate2Oth
	String cAddr2Id
	String cAddr12
	String cAddr22
	String cUnit2
	String cCity2
	Integer cState2
	String cZipcode2
	String cZip42
	String contactPhone2
	String timeStamp17
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		sixMthId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: false)
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		multChild(nullable: false, inList:[1, 2, -4])
		childNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pets(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		petMeds(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		petMedTime(nullable: false, inList:[1, 2, 3, 4, -1, -2, -3, -4])
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rodent(nullable: false, inList:[1, 2, -1, -2, -4])
		roach(nullable: false, inList:[1, 2, -1, -2, -4])
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		workPreg(nullable: false, inList:[1, 2, -1, -2, -4])
		workNow(nullable: false, inList:[1, 2, 3, 4, 5, -5, -1, -2, -3, -4])
		workNowOth(nullable: true, maxSize:255)
		workHrs(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		cigNow(nullable: false, inList:[1, 2, -1, -2, -4])
		numSmoker(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		smokeInside(nullable: false, inList:[1, 2, -1, -2, -4])
		smokeRules(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		smokeHours(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		payBills(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		wic(nullable: false, inList:[1, 2, -1, -2, -4])
		foodStamp(nullable: false, inList:[1, 2, -1, -2, -4])
		tanf(nullable: false, inList:[1, 2, -1, -2, -4])
		timeStamp13(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		nonenglishFreq(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		timeStamp14(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		income(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -4])
		income2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		famSupport(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		famSupportNum(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp15(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		commEmail(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		haveEmail(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		email2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		email3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		email(nullable: true, maxSize:100)
		commCell(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		cellPhone1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone4(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone(nullable: true, maxSize:10)
		timeStamp16(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		commContact(nullable: false, inList:[1, 2, -1, -2, -4])
		contact1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		contactFname1(nullable: true, maxSize:30)
		contactLname1(nullable: true, maxSize:30)
		contactRelate1(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -2, -3, -4])
		contactRelate1Oth(nullable: true, maxSize:255)
		cAddr1Id(nullable: true, maxSize:36)
		cAddr11(nullable: true, maxSize:100)
		cAddr21(nullable: true, maxSize:100)
		cUnit1(nullable: true, maxSize:10)
		cCity1(nullable: true, maxSize:50)
		cState1(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		cZipcode1(nullable: true, maxSize:5)
		cZip41(nullable: true, maxSize:4)
		contactPhone1(nullable: true, maxSize:10)
		contactFname2(nullable: true, maxSize:30)
		contactLname2(nullable: true, maxSize:30)
		contactRelate2(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -2, -3, -4])
		contactRelate2Oth(nullable: true, maxSize:255)
		cAddr2Id(nullable: true, maxSize:36)
		cAddr12(nullable: true, maxSize:100)
		cAddr22(nullable: true, maxSize:100)
		cUnit2(nullable: true, maxSize:10)
		cCity2(nullable: true, maxSize:50)
		cState2(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		cZipcode2(nullable: true, maxSize:5)
		cZip42(nullable: true, maxSize:4)
		contactPhone2(nullable: true, maxSize:10)
		timeStamp17(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'six_mth_mother'
		psuId column:'psu_id'
		sixMthId column:'six_mth_id'
		recruitType column:'recruit_type'
		duId column:'du_id'
		pId column:'p_id'
		eventId column:'event_id'
		eventType column:'event_type'
		eventRepeatKey column:'event_repeat_key'
		instrumentId column:'instrument_id'
		instrumentType column:'instrument_type'
		instrumentVersion column:'instrument_version'
		instrumentRepeatKey column:'instrument_repeat_key'
		timeStamp1 column:'time_stamp_1'
		multChild column:'mult_child'
		childNum column:'child_num'
		timeStamp8 column:'time_stamp_8'
		pets column:'pets'
		petMeds column:'pet_meds'
		petMedTime column:'pet_med_time'
		timeStamp9 column:'time_stamp_9'
		rodent column:'rodent'
		roach column:'roach'
		timeStamp10 column:'time_stamp_10'
		workPreg column:'work_preg'
		workNow column:'work_now'
		workNowOth column:'work_now_oth'
		workHrs column:'work_hrs'
		timeStamp11 column:'time_stamp_11'
		cigNow column:'cig_now'
		numSmoker column:'num_smoker'
		smokeInside column:'smoke_inside'
		smokeRules column:'smoke_rules'
		smokeHours column:'smoke_hours'
		timeStamp12 column:'time_stamp_12'
		payBills column:'pay_bills'
		wic column:'wic'
		foodStamp column:'food_stamp'
		tanf column:'tanf'
		timeStamp13 column:'time_stamp_13'
		nonenglishFreq column:'nonenglish_freq'
		timeStamp14 column:'time_stamp_14'
		income column:'income'
		income2 column:'income2'
		famSupport column:'fam_support'
		famSupportNum column:'fam_support_num'
		timeStamp15 column:'time_stamp_15'
		commEmail column:'comm_email'
		haveEmail column:'have_email'
		email2 column:'email_2'
		email3 column:'email_3'
		email column:'email'
		commCell column:'comm_cell'
		cellPhone1 column:'cell_phone_1'
		cellPhone2 column:'cell_phone_2'
		cellPhone3 column:'cell_phone_3'
		cellPhone4 column:'cell_phone_4'
		cellPhone column:'cell_phone'
		timeStamp16 column:'time_stamp_16'
		commContact column:'comm_contact'
		contact1 column:'contact_1'
		contactFname1 column:'contact_fname_1'
		contactLname1 column:'contact_lname_1'
		contactRelate1 column:'contact_relate_1'
		contactRelate1Oth column:'contact_relate1_oth'
		cAddr1Id column:'c_addr1_id'
		cAddr11 column:'c_addr1_1'
		cAddr21 column:'c_addr_2_1'
		cUnit1 column:'c_unit_1'
		cCity1 column:'c_city_1'
		cState1 column:'c_state_1'
		cZipcode1 column:'c_zipcode_1'
		cZip41 column:'c_zip4_1'
		contactPhone1 column:'contact_phone_1'
		contactFname2 column:'contact_fname_2'
		contactLname2 column:'contact_lname_2'
		contactRelate2 column:'contact_relate_2'
		contactRelate2Oth column:'contact_relate2_oth'
		cAddr2Id column:'c_addr2_id'
		cAddr12 column:'c_addr1_2'
		cAddr22 column:'c_addr_2_2'
		cUnit2 column:'c_unit_2'
		cCity2 column:'c_city_2'
		cState2 column:'c_state_2'
		cZipcode2 column:'c_zipcode_2'
		cZip42 column:'c_zip4_2'
		contactPhone2 column:'contact_phone_2'
		timeStamp17 column:'time_stamp_17'
		transactionType column:'transaction_type'
	}
}
