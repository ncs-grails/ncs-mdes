package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PbRecruitment {

	Integer psuId
	String pbRecruitmentId
	Integer recruitType
	String duId
	String providerId
	String eventId
	Integer eventType
	Integer eventRepeatKey
	String instrumentId
	Integer instrumentType
	String instrumentVersion
	Integer instrumentRepeatKey
	String pbInstiInfoDate
	String pbInstiFullname
	Integer pbInstiId
	Integer pbInstiSize
	Integer pbProvTotal
	Integer pbPractRes
	Integer pbResPharm
	Integer pbResNetwork
	Integer pbResOth
	String pbPracResOth
	Integer pbPracSpec
	Integer pbSpecMou
	Integer pbSpecLse
	Integer pbSpecPmt
	Integer pbSpecIrb
	Integer pbSpecCe
	Integer pbSpOthinc
	String pbIncOth
	String providerCompleteDate
	String addressPbId
	String address1
	String address2
	String unit
	String city
	Integer state
	String zipcode
	String zip4
	Integer pbProvId
	Integer pbProvSize
	Integer numObgyn
	Integer numFp
	Integer numMidwives
	Integer numOther
	Integer pbPracType
	String pbPracTypeOth
	String instName1
	Integer instituteId1
	String instName2
	Integer instituteId2
	String instName3
	Integer instituteId3
	String instName4
	Integer instituteId4
	String instName5
	Integer instituteId5
	Integer numBirths
	Integer numNewPts
	Integer ptRaceAian
	Integer ptRaceAsian
	Integer ptRaceBlack
	Integer ptRaceHisp
	Integer ptRaceNhpi
	Integer ptRaceWhite
	Integer ptLangEng
	Integer ptLangSpan
	Integer ptLangOth
	String ptLangSpec
	Integer payInsTricare
	Integer payInsMedicaid
	Integer payInsComm
	Integer payInsHmo
	Integer paySelf
	Integer providerNcsTrn
	Integer providerNcsInfowt
	Integer providerNcsInfoex
	Integer providerNcsAcc
	Integer providerNcsAlt
	Integer providerNcsLtr
	Integer providerNcsPnltr
	Integer providerNcsInfo
	Integer providerNcsStf
	Integer providerNcsRfr
	Integer providerNcsPartic
	String providerNcsOth
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		pbRecruitmentId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: true, maxSize:36)
		providerId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbInstiInfoDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		pbInstiFullname(nullable: true, maxSize:60)
		pbInstiId(nullable: false)
		pbInstiSize(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbProvTotal(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbPractRes(nullable: false, inList:[1, 2, -1, -2, -4])
		pbResPharm(nullable: false, inList:[1, 2, -1, -2, -4])
		pbResNetwork(nullable: false, inList:[1, 2, -1, -2, -4])
		pbResOth(nullable: false, inList:[1, 2, -1, -2, -4])
		pbPracResOth(nullable: true, maxSize:255)
		pbPracSpec(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecMou(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecLse(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecPmt(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecIrb(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecCe(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpOthinc(nullable: false, inList:[1, 2, -1, -2, -4])
		pbIncOth(nullable: true, maxSize:255)
		providerCompleteDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		addressPbId(nullable: true, maxSize:36)
		address1(nullable: true, maxSize:100)
		address2(nullable: true, maxSize:100)
		unit(nullable: true, maxSize:10)
		city(nullable: true, maxSize:50)
		state(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		zipcode(nullable: true, maxSize:5)
		zip4(nullable: true, maxSize:4)
		pbProvId(nullable: false)
		pbProvSize(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numObgyn(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numFp(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numMidwives(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numOther(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbPracType(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -5, -4])
		pbPracTypeOth(nullable: true, maxSize:255)
		instName1(nullable: false, minSize:1, maxSize:36)
		instituteId1(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instName2(nullable: false, minSize:1, maxSize:36)
		instituteId2(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instName3(nullable: false, minSize:1, maxSize:36)
		instituteId3(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instName4(nullable: false, minSize:1, maxSize:36)
		instituteId4(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instName5(nullable: false, minSize:1, maxSize:36)
		instituteId5(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numBirths(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numNewPts(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		ptRaceAian(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		ptRaceAsian(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		ptRaceBlack(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		ptRaceHisp(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		ptRaceNhpi(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		ptRaceWhite(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		ptLangEng(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		ptLangSpan(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		ptLangOth(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		ptLangSpec(nullable: true, maxSize:255)
		payInsTricare(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		payInsMedicaid(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		payInsComm(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		payInsHmo(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		paySelf(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		providerNcsTrn(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsInfowt(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsInfoex(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsAcc(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsAlt(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsLtr(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsPnltr(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsInfo(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsStf(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsRfr(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsPartic(nullable: false, inList:[1, 2, -1, -2, -4, -7])
		providerNcsOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pb_recruitment'
		psuId column:'psu_id'
		pbRecruitmentId column:'pb_recruitment_id'
		recruitType column:'recruit_type'
		duId column:'du_id'
		providerId column:'provider_id'
		eventId column:'event_id'
		eventType column:'event_type'
		eventRepeatKey column:'event_repeat_key'
		instrumentId column:'instrument_id'
		instrumentType column:'instrument_type'
		instrumentVersion column:'instrument_version'
		instrumentRepeatKey column:'instrument_repeat_key'
		pbInstiInfoDate column:'pb_insti_info_date'
		pbInstiFullname column:'pb_insti_fullname'
		pbInstiId column:'pb_insti_id'
		pbInstiSize column:'pb_insti_size'
		pbProvTotal column:'pb_prov_total'
		pbPractRes column:'pb_pract_res'
		pbResPharm column:'pb_res_pharm'
		pbResNetwork column:'pb_res_network'
		pbResOth column:'pb_res_oth'
		pbPracResOth column:'pb_prac_res_oth'
		pbPracSpec column:'pb_prac_spec'
		pbSpecMou column:'pb_spec_mou'
		pbSpecLse column:'pb_spec_lse'
		pbSpecPmt column:'pb_spec_pmt'
		pbSpecIrb column:'pb_spec_irb'
		pbSpecCe column:'pb_spec_ce'
		pbSpOthinc column:'pb_sp_othinc'
		pbIncOth column:'pb_inc_oth'
		providerCompleteDate column:'provider_complete_date'
		addressPbId column:'address_pb_id'
		address1 column:'address_1'
		address2 column:'address_2'
		unit column:'unit'
		city column:'city'
		state column:'state'
		zipcode column:'zipcode'
		zip4 column:'zip4'
		pbProvId column:'pb_prov_id'
		pbProvSize column:'pb_prov_size'
		numObgyn column:'num_obgyn'
		numFp column:'num_fp'
		numMidwives column:'num_midwives'
		numOther column:'num_other'
		pbPracType column:'pb_prac_type'
		pbPracTypeOth column:'pb_prac_type_oth'
		instName1 column:'inst_name1'
		instituteId1 column:'institute_id1'
		instName2 column:'inst_name2'
		instituteId2 column:'institute_id2'
		instName3 column:'inst_name3'
		instituteId3 column:'institute_id3'
		instName4 column:'inst_name4'
		instituteId4 column:'institute_id4'
		instName5 column:'inst_name5'
		instituteId5 column:'institute_id5'
		numBirths column:'num_births'
		numNewPts column:'num_new_pts'
		ptRaceAian column:'pt_race_aian'
		ptRaceAsian column:'pt_race_asian'
		ptRaceBlack column:'pt_race_black'
		ptRaceHisp column:'pt_race_hisp'
		ptRaceNhpi column:'pt_race_nhpi'
		ptRaceWhite column:'pt_race_white'
		ptLangEng column:'pt_lang_eng'
		ptLangSpan column:'pt_lang_span'
		ptLangOth column:'pt_lang_oth'
		ptLangSpec column:'pt_lang_spec'
		payInsTricare column:'pay_ins_tricare'
		payInsMedicaid column:'pay_ins_medicaid'
		payInsComm column:'pay_ins_comm'
		payInsHmo column:'pay_ins_hmo'
		paySelf column:'pay_self'
		providerNcsTrn column:'provider_ncs_trn'
		providerNcsInfowt column:'provider_ncs_infowt'
		providerNcsInfoex column:'provider_ncs_infoex'
		providerNcsAcc column:'provider_ncs_acc'
		providerNcsAlt column:'provider_ncs_alt'
		providerNcsLtr column:'provider_ncs_ltr'
		providerNcsPnltr column:'provider_ncs_pnltr'
		providerNcsInfo column:'provider_ncs_info'
		providerNcsStf column:'provider_ncs_stf'
		providerNcsRfr column:'provider_ncs_rfr'
		providerNcsPartic column:'provider_ncs_partic'
		providerNcsOth column:'provider_ncs_oth'
		transactionType column:'transaction_type'
	}
}
