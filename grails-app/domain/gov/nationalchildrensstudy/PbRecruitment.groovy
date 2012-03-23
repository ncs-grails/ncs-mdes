package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PbRecruitment {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pbRecruitmentId
	/**
	 * Status level 3
	 */
	RecruitTypeCl1 recruitType
	/**
	 * Status level 1
	 */
	String duId
	/**
	 * Status level 1
	 */
	String providerId
	/**
	 * Status level 1
	 */
	String eventId
	/**
	 * Status level 3
	 */
	EventTypeCl1 eventType
	/**
	 * Status level 1
	 */
	Integer eventRepeatKey
	/**
	 * Status level 1
	 */
	String instrumentId
	/**
	 * Status level 3
	 */
	InstrumentTypeCl1 instrumentType
	/**
	 * Status level 3
	 */
	String instrumentVersion
	/**
	 * Status level 1
	 */
	Integer instrumentRepeatKey
	/**
	 * Status level 1
	 */
	String pbInstiInfoDate
	/**
	 * Status level 1
	 */
	String pbInstiFullname
	/**
	 * Status level 1
	 */
	Integer pbInstiId
	/**
	 * Status level 1
	 */
	Integer pbInstiSize
	/**
	 * Status level 1
	 */
	Integer pbProvTotal
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbPractRes
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbResPharm
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbResNetwork
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbResOth
	/**
	 * PII level P
	 * Status level 1
	 */
	String pbPracResOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbPracSpec
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbSpecMou
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbSpecLse
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbSpecPmt
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbSpecIrb
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbSpecCe
	/**
	 * Status level 3
	 */
	ConfirmTypeCl8 pbSpOthinc
	/**
	 * PII level P
	 * Status level 1
	 */
	String pbIncOth
	/**
	 * Status level 1
	 */
	String providerCompleteDate
	/**
	 * Status level 1
	 */
	String addressPbId
	/**
	 * PII level Y
	 * Status level 3
	 */
	String address1
	/**
	 * PII level Y
	 * Status level 3
	 */
	String address2
	/**
	 * PII level Y
	 * Status level 3
	 */
	String unit
	/**
	 * PII level Y
	 * Status level 3
	 */
	String city
	/**
	 * PII level Y
	 * Status level 3
	 */
	StateCl2 state
	/**
	 * PII level P
	 * Status level 1
	 */
	String zipcode
	/**
	 * PII level P
	 * Status level 1
	 */
	String zip4
	/**
	 * Status level 1
	 */
	Integer pbProvId
	/**
	 * Status level 1
	 */
	Integer pbProvSize
	/**
	 * Status level 1
	 */
	Integer numObgyn
	/**
	 * Status level 1
	 */
	Integer numFp
	/**
	 * Status level 1
	 */
	Integer numMidwives
	/**
	 * Status level 1
	 */
	Integer numOther
	/**
	 * Status level 3
	 */
	PracticeCharacteristicCl2 pbPracType
	/**
	 * PII level P
	 * Status level 1
	 */
	String pbPracTypeOth
	/**
	 * Status level 3
	 */
	String instName1
	/**
	 * Status level 1
	 */
	Integer instituteId1
	/**
	 * Status level 3
	 */
	String instName2
	/**
	 * Status level 1
	 */
	Integer instituteId2
	/**
	 * Status level 3
	 */
	String instName3
	/**
	 * Status level 1
	 */
	Integer instituteId3
	/**
	 * Status level 3
	 */
	String instName4
	/**
	 * Status level 1
	 */
	Integer instituteId4
	/**
	 * Status level 3
	 */
	String instName5
	/**
	 * Status level 1
	 */
	Integer instituteId5
	/**
	 * Status level 1
	 */
	Integer numBirths
	/**
	 * Status level 1
	 */
	Integer numNewPts
	/**
	 * Status level 3
	 */
	PercentRateCl2 ptRaceAian
	/**
	 * Status level 3
	 */
	PercentRateCl2 ptRaceAsian
	/**
	 * Status level 3
	 */
	PercentRateCl2 ptRaceBlack
	/**
	 * Status level 3
	 */
	PercentRateCl2 ptRaceHisp
	/**
	 * Status level 3
	 */
	PercentRateCl2 ptRaceNhpi
	/**
	 * Status level 3
	 */
	PercentRateCl2 ptRaceWhite
	/**
	 * Status level 3
	 */
	PercentRateCl2 ptLangEng
	/**
	 * Status level 3
	 */
	PercentRateCl2 ptLangSpan
	/**
	 * Status level 3
	 */
	PercentRateCl2 ptLangOth
	/**
	 * PII level P
	 * Status level 1
	 */
	String ptLangSpec
	/**
	 * Status level 3
	 */
	PercentRateCl2 payInsTricare
	/**
	 * Status level 3
	 */
	PercentRateCl2 payInsMedicaid
	/**
	 * Status level 3
	 */
	PercentRateCl2 payInsComm
	/**
	 * Status level 3
	 */
	PercentRateCl2 payInsHmo
	/**
	 * Status level 3
	 */
	PercentRateCl2 paySelf
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsTrn
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsInfowt
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsInfoex
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsAcc
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsAlt
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsLtr
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsPnltr
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsInfo
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsStf
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsRfr
	/**
	 * Status level 3
	 */
	ConfirmTypeCl16 providerNcsPartic
	/**
	 * PII level P
	 * Status level 1
	 */
	String providerNcsOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pbRecruitmentId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false)
		duId(nullable: true, maxSize:36)
		providerId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false)
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false)
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbInstiInfoDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		pbInstiFullname(nullable: true, maxSize:60)
		pbInstiId(nullable: false)
		pbInstiSize(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbProvTotal(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbPractRes(nullable: false)
		pbResPharm(nullable: false)
		pbResNetwork(nullable: false)
		pbResOth(nullable: false)
		pbPracResOth(nullable: true, maxSize:255)
		pbPracSpec(nullable: false)
		pbSpecMou(nullable: false)
		pbSpecLse(nullable: false)
		pbSpecPmt(nullable: false)
		pbSpecIrb(nullable: false)
		pbSpecCe(nullable: false)
		pbSpOthinc(nullable: false)
		pbIncOth(nullable: true, maxSize:255)
		providerCompleteDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		addressPbId(nullable: true, maxSize:36)
		address1(nullable: true, maxSize:100)
		address2(nullable: true, maxSize:100)
		unit(nullable: true, maxSize:10)
		city(nullable: true, maxSize:50)
		state(nullable: false)
		zipcode(nullable: true, maxSize:5)
		zip4(nullable: true, maxSize:4)
		pbProvId(nullable: false)
		pbProvSize(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numObgyn(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numFp(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numMidwives(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numOther(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbPracType(nullable: false)
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
		ptRaceAian(nullable: false)
		ptRaceAsian(nullable: false)
		ptRaceBlack(nullable: false)
		ptRaceHisp(nullable: false)
		ptRaceNhpi(nullable: false)
		ptRaceWhite(nullable: false)
		ptLangEng(nullable: false)
		ptLangSpan(nullable: false)
		ptLangOth(nullable: false)
		ptLangSpec(nullable: true, maxSize:255)
		payInsTricare(nullable: false)
		payInsMedicaid(nullable: false)
		payInsComm(nullable: false)
		payInsHmo(nullable: false)
		paySelf(nullable: false)
		providerNcsTrn(nullable: false)
		providerNcsInfowt(nullable: false)
		providerNcsInfoex(nullable: false)
		providerNcsAcc(nullable: false)
		providerNcsAlt(nullable: false)
		providerNcsLtr(nullable: false)
		providerNcsPnltr(nullable: false)
		providerNcsInfo(nullable: false)
		providerNcsStf(nullable: false)
		providerNcsRfr(nullable: false)
		providerNcsPartic(nullable: false)
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
