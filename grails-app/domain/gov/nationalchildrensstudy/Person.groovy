package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Person {

	Integer psuId
	String personId
	Integer prefix
	String firstName
	String lastName
	String middleName
	String maidenName
	Integer suffix
	String title
	Integer sex
	Integer age
	Integer ageRange
	String personDob
	Integer deceased
	Integer ethnicGroup
	Integer personLang
	String personLangOth
	Integer maristat
	String maristatOth
	Integer prefContact
	String prefContactOth
	Integer planMove
	Integer moveInfo
	String newAddressId
	Integer whenMove
	String dateMove
	Integer pTracing
	Integer pInfoSource
	String pInfoSourceOth
	String pInfoDate
	String pInfoUpdate
	String personComment
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		personId(nullable: false, minSize:1, maxSize:36)
		prefix(nullable: false, inList:[1, 2, 3, 4, 5, -7, -4])
		firstName(nullable: true, maxSize:30)
		lastName(nullable: true, maxSize:30)
		middleName(nullable: true, maxSize:30)
		maidenName(nullable: true, maxSize:30)
		suffix(nullable: false, inList:[1, 2, 3, -7, -4])
		title(nullable: true, maxSize:5)
		sex(nullable: false, inList:[1, 2, 3, -6, -4])
		age(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		ageRange(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -6, -4])
		personDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		deceased(nullable: false, inList:[1, 2, -4])
		ethnicGroup(nullable: false, inList:[1, 2, -1, -6, -4])
		personLang(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, -1, -5, -6, -4])
		personLangOth(nullable: true, maxSize:255)
		maristat(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -6, -4])
		maristatOth(nullable: true, maxSize:255)
		prefContact(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -4])
		prefContactOth(nullable: true, maxSize:255)
		planMove(nullable: false, inList:[1, 2, -1, -6, -4])
		moveInfo(nullable: false, inList:[1, 2, 3, 4, -7, -4])
		newAddressId(nullable: true, maxSize:36)
		whenMove(nullable: false, inList:[1, 2, -1, -6, -7, -4])
		dateMove(nullable: true, maxSize:7, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9])?")
		pTracing(nullable: false, inList:[1, 2, -4])
		pInfoSource(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, -5, -4])
		pInfoSourceOth(nullable: true, maxSize:255)
		pInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		pInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		personComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'person'
		psuId column:'psu_id'
		personId column:'person_id'
		prefix column:'prefix'
		firstName column:'first_name'
		lastName column:'last_name'
		middleName column:'middle_name'
		maidenName column:'maiden_name'
		suffix column:'suffix'
		title column:'title'
		sex column:'sex'
		age column:'age'
		ageRange column:'age_range'
		personDob column:'person_dob'
		deceased column:'deceased'
		ethnicGroup column:'ethnic_group'
		personLang column:'person_lang'
		personLangOth column:'person_lang_oth'
		maristat column:'maristat'
		maristatOth column:'maristat_oth'
		prefContact column:'pref_contact'
		prefContactOth column:'pref_contact_oth'
		planMove column:'plan_move'
		moveInfo column:'move_info'
		newAddressId column:'new_address_id'
		whenMove column:'when_move'
		dateMove column:'date_move'
		pTracing column:'p_tracing'
		pInfoSource column:'p_info_source'
		pInfoSourceOth column:'p_info_source_oth'
		pInfoDate column:'p_info_date'
		pInfoUpdate column:'p_info_update'
		personComment column:'person_comment'
		transactionType column:'transaction_type'
	}
}
