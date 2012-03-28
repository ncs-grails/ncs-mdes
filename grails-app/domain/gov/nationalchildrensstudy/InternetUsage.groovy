package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class InternetUsage {

	Integer psuId
	String internetUsageId
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
	Integer preferContact
	Integer everConnect
	Integer useWeb
	Integer haveEmail
	Integer checkEmail
	Integer okEmailAddr
	String email
	Integer preferSurvey
	Integer dcModeSimple
	Integer dcModeConvenient
	Integer dcModeChoice
	String timeStamp2
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		internetUsageId(nullable: false, minSize:1, maxSize:36)
		recruitType(nullable: false, inList:[1, 2, 3, 4, -4])
		duId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		eventId(nullable: false, minSize:1, maxSize:36)
		eventType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, -5, -4])
		eventRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instrumentId(nullable: false, minSize:1, maxSize:36)
		instrumentType(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, -5, -4])
		instrumentVersion(nullable: false, minSize:1, maxSize:36)
		instrumentRepeatKey(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		timeStamp1(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		preferContact(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -4])
		everConnect(nullable: false, inList:[1, 2, -1, -2, -4])
		useWeb(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		haveEmail(nullable: false, inList:[1, 2, -1, -2, -4])
		checkEmail(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, -1, -2, -3, -4])
		okEmailAddr(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		email(nullable: true, maxSize:100)
		preferSurvey(nullable: false, inList:[1, 2, 3, -1, -2, -4])
		dcModeSimple(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		dcModeConvenient(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		dcModeChoice(nullable: false, inList:[1, 2, 3, 4, -1, -2, -4])
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'internet_usage'
		psuId column:'psu_id'
		internetUsageId column:'internet_usage_id'
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
		preferContact column:'prefer_contact'
		everConnect column:'ever_connect'
		useWeb column:'use_web'
		haveEmail column:'have_email'
		checkEmail column:'check_email'
		okEmailAddr column:'ok_email_addr'
		email column:'email'
		preferSurvey column:'prefer_survey'
		dcModeSimple column:'dc_mode_simple'
		dcModeConvenient column:'dc_mode_convenient'
		dcModeChoice column:'dc_mode_choice'
		timeStamp2 column:'time_stamp_2'
		transactionType column:'transaction_type'
	}
}
