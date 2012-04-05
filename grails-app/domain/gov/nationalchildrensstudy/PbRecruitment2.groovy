package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class PbRecruitment2 {

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
	String pbInstiId
	Integer pbInstiSize
	Integer pbProvTotal
	Integer pbPractRes
	Integer pbResPharm
	Integer pbResNetwork
	Integer pbOther
	String pbOth
	Integer pbPracSpec
	Integer pbSpecMou
	Integer pbSpecLse
	Integer pbSpecPmt
	Integer pbSpecIrb
	Integer pbSpecCe
	Integer pbSpecInc
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
	String pbProvId
	Integer pbProvSize
	Integer numObgyn
	Integer numFp
	Integer numMidwives
	Integer numOth
	Integer pbPracType
	String pbPracTypeOth
	String instName1
	String instituteId1
	String instName2
	String instituteId2
	String instName3
	String instituteId3
	String instName4
	String instituteId4
	String instName5
	String instituteId5
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
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "pb_recruitment_2"

	public PbRecruitment2(XMLStreamReader reader, boolean strict) {
		if (reader.startElement) {
			if (reader.localName() == XSD_TABLE_NAME) {
				// We're in the table, load the first column
				if ( reader.hasNext() ) { reader.next() }

				while ( reader.hasNext() ) {
					if ( reader.endElement ) {
						if (reader.localName() == XSD_TABLE_NAME) {
							break
						}
					} else if ( reader.startElement ) {
						String elementName = reader.localName()
						String elementText = reader.text()
						if ( elementText ) {
							switch ( elementName ) {

								case 'psu_id':
									psuId = elementText.toInteger()
									break
								case 'pb_recruitment_id':
									pbRecruitmentId = elementText
									break
								case 'recruit_type':
									recruitType = elementText.toInteger()
									break
								case 'du_id':
									duId = elementText
									break
								case 'provider_id':
									providerId = elementText
									break
								case 'event_id':
									eventId = elementText
									break
								case 'event_type':
									eventType = elementText.toInteger()
									break
								case 'event_repeat_key':
									eventRepeatKey = elementText.toInteger()
									break
								case 'instrument_id':
									instrumentId = elementText
									break
								case 'instrument_type':
									instrumentType = elementText.toInteger()
									break
								case 'instrument_version':
									instrumentVersion = elementText
									break
								case 'instrument_repeat_key':
									instrumentRepeatKey = elementText.toInteger()
									break
								case 'pb_insti_info_date':
									pbInstiInfoDate = elementText
									break
								case 'pb_insti_fullname':
									pbInstiFullname = elementText
									break
								case 'pb_insti_id':
									pbInstiId = elementText
									break
								case 'pb_insti_size':
									pbInstiSize = elementText.toInteger()
									break
								case 'pb_prov_total':
									pbProvTotal = elementText.toInteger()
									break
								case 'pb_pract_res':
									pbPractRes = elementText.toInteger()
									break
								case 'pb_res_pharm':
									pbResPharm = elementText.toInteger()
									break
								case 'pb_res_network':
									pbResNetwork = elementText.toInteger()
									break
								case 'pb_other':
									pbOther = elementText.toInteger()
									break
								case 'pb_oth':
									pbOth = elementText
									break
								case 'pb_prac_spec':
									pbPracSpec = elementText.toInteger()
									break
								case 'pb_spec_mou':
									pbSpecMou = elementText.toInteger()
									break
								case 'pb_spec_lse':
									pbSpecLse = elementText.toInteger()
									break
								case 'pb_spec_pmt':
									pbSpecPmt = elementText.toInteger()
									break
								case 'pb_spec_irb':
									pbSpecIrb = elementText.toInteger()
									break
								case 'pb_spec_ce':
									pbSpecCe = elementText.toInteger()
									break
								case 'pb_spec_inc':
									pbSpecInc = elementText.toInteger()
									break
								case 'pb_inc_oth':
									pbIncOth = elementText
									break
								case 'provider_complete_date':
									providerCompleteDate = elementText
									break
								case 'address_pb_id':
									addressPbId = elementText
									break
								case 'address_1':
									address1 = elementText
									break
								case 'address_2':
									address2 = elementText
									break
								case 'unit':
									unit = elementText
									break
								case 'city':
									city = elementText
									break
								case 'state':
									state = elementText.toInteger()
									break
								case 'zipcode':
									zipcode = elementText
									break
								case 'zip4':
									zip4 = elementText
									break
								case 'pb_prov_id':
									pbProvId = elementText
									break
								case 'pb_prov_size':
									pbProvSize = elementText.toInteger()
									break
								case 'num_obgyn':
									numObgyn = elementText.toInteger()
									break
								case 'num_fp':
									numFp = elementText.toInteger()
									break
								case 'num_midwives':
									numMidwives = elementText.toInteger()
									break
								case 'num_oth':
									numOth = elementText.toInteger()
									break
								case 'pb_prac_type':
									pbPracType = elementText.toInteger()
									break
								case 'pb_prac_type_oth':
									pbPracTypeOth = elementText
									break
								case 'inst_name1':
									instName1 = elementText
									break
								case 'institute_id1':
									instituteId1 = elementText
									break
								case 'inst_name2':
									instName2 = elementText
									break
								case 'institute_id2':
									instituteId2 = elementText
									break
								case 'inst_name3':
									instName3 = elementText
									break
								case 'institute_id3':
									instituteId3 = elementText
									break
								case 'inst_name4':
									instName4 = elementText
									break
								case 'institute_id4':
									instituteId4 = elementText
									break
								case 'inst_name5':
									instName5 = elementText
									break
								case 'institute_id5':
									instituteId5 = elementText
									break
								case 'num_births':
									numBirths = elementText.toInteger()
									break
								case 'num_new_pts':
									numNewPts = elementText.toInteger()
									break
								case 'pt_race_aian':
									ptRaceAian = elementText.toInteger()
									break
								case 'pt_race_asian':
									ptRaceAsian = elementText.toInteger()
									break
								case 'pt_race_black':
									ptRaceBlack = elementText.toInteger()
									break
								case 'pt_race_hisp':
									ptRaceHisp = elementText.toInteger()
									break
								case 'pt_race_nhpi':
									ptRaceNhpi = elementText.toInteger()
									break
								case 'pt_race_white':
									ptRaceWhite = elementText.toInteger()
									break
								case 'pt_lang_eng':
									ptLangEng = elementText.toInteger()
									break
								case 'pt_lang_span':
									ptLangSpan = elementText.toInteger()
									break
								case 'pt_lang_oth':
									ptLangOth = elementText.toInteger()
									break
								case 'pt_lang_spec':
									ptLangSpec = elementText
									break
								case 'pay_ins_tricare':
									payInsTricare = elementText.toInteger()
									break
								case 'pay_ins_medicaid':
									payInsMedicaid = elementText.toInteger()
									break
								case 'pay_ins_comm':
									payInsComm = elementText.toInteger()
									break
								case 'pay_ins_hmo':
									payInsHmo = elementText.toInteger()
									break
								case 'pay_self':
									paySelf = elementText.toInteger()
									break
								case 'provider_ncs_trn':
									providerNcsTrn = elementText.toInteger()
									break
								case 'provider_ncs_infowt':
									providerNcsInfowt = elementText.toInteger()
									break
								case 'provider_ncs_infoex':
									providerNcsInfoex = elementText.toInteger()
									break
								case 'provider_ncs_acc':
									providerNcsAcc = elementText.toInteger()
									break
								case 'provider_ncs_alt':
									providerNcsAlt = elementText.toInteger()
									break
								case 'provider_ncs_ltr':
									providerNcsLtr = elementText.toInteger()
									break
								case 'provider_ncs_pnltr':
									providerNcsPnltr = elementText.toInteger()
									break
								case 'provider_ncs_info':
									providerNcsInfo = elementText.toInteger()
									break
								case 'provider_ncs_stf':
									providerNcsStf = elementText.toInteger()
									break
								case 'provider_ncs_rfr':
									providerNcsRfr = elementText.toInteger()
									break
								case 'provider_ncs_partic':
									providerNcsPartic = elementText.toInteger()
									break
								case 'provider_ncs_oth':
									providerNcsOth = elementText
									break
								case 'transaction_type':
									transactionType = elementText
									break
								default:
									if (strict) {
										throw new XMLStreamException(
											"malformed XML, unknown element: ${elementText}")
									} else {
										log.warn "Element: ${elementName} unknown, ignoring."
									}
									break
							}
						}
					}
					reader.next()
				}
			} else {
				throw new XMLStreamException("xml element did not start as ${XSD_TABLE_NAME}")
			}
		} else {
			throw new XMLStreamException("constructor must be passed the start element for the table in the XMLStreamReader")
		}
	}

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
		pbInstiId(nullable: false, minSize:1, maxSize:12)
		pbInstiSize(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbProvTotal(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbPractRes(nullable: false, inList:[1, 2, -1, -2, -4])
		pbResPharm(nullable: false, inList:[1, 2, -1, -2, -4])
		pbResNetwork(nullable: false, inList:[1, 2, -1, -2, -4])
		pbOther(nullable: false, inList:[1, 2, -1, -2, -4])
		pbOth(nullable: true, maxSize:255)
		pbPracSpec(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecMou(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecLse(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecPmt(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecIrb(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecCe(nullable: false, inList:[1, 2, -1, -2, -4])
		pbSpecInc(nullable: false, inList:[1, 2, -1, -2, -4])
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
		pbProvId(nullable: false, minSize:1, maxSize:15)
		pbProvSize(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numObgyn(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numFp(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numMidwives(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numOth(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		pbPracType(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -5, -4])
		pbPracTypeOth(nullable: true, maxSize:255)
		instName1(nullable: false, minSize:1, maxSize:100)
		instituteId1(nullable: true, maxSize:12)
		instName2(nullable: false, minSize:1, maxSize:100)
		instituteId2(nullable: true, maxSize:12)
		instName3(nullable: false, minSize:1, maxSize:100)
		instituteId3(nullable: true, maxSize:12)
		instName4(nullable: false, minSize:1, maxSize:100)
		instituteId4(nullable: true, maxSize:12)
		instName5(nullable: false, minSize:1, maxSize:100)
		instituteId5(nullable: true, maxSize:12)
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
		providerNcsTrn(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsInfowt(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsInfoex(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsAcc(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsAlt(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsLtr(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsPnltr(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsInfo(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsStf(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsRfr(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsPartic(nullable: false, inList:[1, 2, -1, -2, -4])
		providerNcsOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'pb_recruitment_2'

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
		pbOther column:'pb_other'
		pbOth column:'pb_oth'
		pbPracSpec column:'pb_prac_spec'
		pbSpecMou column:'pb_spec_mou'
		pbSpecLse column:'pb_spec_lse'
		pbSpecPmt column:'pb_spec_pmt'
		pbSpecIrb column:'pb_spec_irb'
		pbSpecCe column:'pb_spec_ce'
		pbSpecInc column:'pb_spec_inc'
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
		numOth column:'num_oth'
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
