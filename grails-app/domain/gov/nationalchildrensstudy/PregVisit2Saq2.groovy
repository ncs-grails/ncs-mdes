package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit2Saq2 {

	Integer psuId
	String pv2SaqId
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
	Integer learn
	Integer help
	Integer incent
	Integer research
	Integer envir
	Integer community
	Integer knowOthers
	Integer family
	Integer doctor
	Integer staff
	Integer opinSpouse
	Integer opinFamily
	Integer opinFriend
	Integer opinDr
	Integer experience
	Integer improve
	Integer intLength
	Integer intStress
	Integer intRepeat
	String timeStamp2
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		pv2SaqId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: true, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		learn(nullable: false, inList:[1, 2, 3, -4])
		help(nullable: false, inList:[1, 2, 3, -4])
		incent(nullable: false, inList:[1, 2, 3, -4])
		research(nullable: false, inList:[1, 2, 3, -4])
		envir(nullable: false, inList:[1, 2, 3, -4])
		community(nullable: false, inList:[1, 2, 3, -4])
		knowOthers(nullable: false, inList:[1, 2, 3, -4])
		family(nullable: false, inList:[1, 2, 3, -4])
		doctor(nullable: false, inList:[1, 2, 3, -4])
		staff(nullable: false, inList:[1, 2, 3, -4])
		opinSpouse(nullable: false, inList:[1, 2, 3, 4, 5, 6, -4])
		opinFamily(nullable: false, inList:[1, 2, 3, 4, 5, 6, -4])
		opinFriend(nullable: false, inList:[1, 2, 3, 4, 5, 6, -4])
		opinDr(nullable: false, inList:[1, 2, 3, 4, 5, 6, -4])
		experience(nullable: false, inList:[1, 2, 3, 4, 5, -4])
		improve(nullable: false, inList:[1, 2, 3, 4, -4])
		intLength(nullable: false, inList:[1, 2, 3, -4])
		intStress(nullable: false, inList:[1, 2, 3, 4, -4])
		intRepeat(nullable: false, inList:[1, 2, -4])
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_2_saq_2'
		psuId column:'psu_id'
		pv2SaqId column:'pv2_saq_id'
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
		learn column:'learn'
		help column:'help'
		incent column:'incent'
		research column:'research'
		envir column:'envir'
		community column:'community'
		knowOthers column:'know_others'
		family column:'family'
		doctor column:'doctor'
		staff column:'staff'
		opinSpouse column:'opin_spouse'
		opinFamily column:'opin_family'
		opinFriend column:'opin_friend'
		opinDr column:'opin_dr'
		experience column:'experience'
		improve column:'improve'
		intLength column:'int_length'
		intStress column:'int_stress'
		intRepeat column:'int_repeat'
		timeStamp2 column:'time_stamp_2'
		transactionType column:'transaction_type'
	}
}
