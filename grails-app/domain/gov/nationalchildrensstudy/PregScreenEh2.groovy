package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregScreenEh2 {

	Integer psuId
	String psEhId
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
	Integer femaleAvail
	String timeStamp2
	String personDob
	Integer age
	Integer ageRange
	Integer ageElig
	String timeStamp3
	String addressId
	String address1
	String address2
	String unit
	String city
	Integer state
	String zip
	String zip4
	Integer duEligConfirm
	Integer ownHome
	String ownHomeOth
	String timeStamp4
	Integer knowNcs
	String elig
	String timeStamp5
	Integer pregnant
	String origDueDate
	String datePeriod
	Integer weeksPreg
	Integer monthPreg
	Integer trimester
	String timeStamp6
	Integer trying
	Integer hyster
	Integer ovaries
	Integer tubesTied
	Integer menopause
	Integer medUnable
	String medUnableOth
	String timeStamp7
	Integer maristat
	Integer educ
	Integer employ
	String employOth
	Integer ethnicity
	Integer personLang
	String personLangOth
	String timeStamp8
	Integer hhMembers
	Integer numChild
	Integer income
	String timeStamp9
	String rFname
	String rLname
	String phoneNbr
	String phoneNbrOth
	Integer phoneType
	String phoneTypeOth
	String homePhone
	Integer cellPhone1
	Integer cellPhone2
	Integer cellPhone3
	Integer cellPhone4
	String cellPhone
	Integer sameAddr
	String mailAddressId
	String mailAddress1
	String mailAddress2
	String mailUnit
	String mailCity
	Integer mailState
	String mailZip
	String mailZip4
	Integer haveEmail
	String email
	Integer emailType
	Integer emailShare
	Integer planMove
	Integer whereMove
	Integer moveInfo
	String newAddressId
	String newAddress1
	String newAddress2
	String newUnit
	String newCity
	Integer newState
	String newZip
	String newZip4
	Integer whenMove
	String dateMove
	String timeStamp10
	Integer ppgFirst
	Integer bioFatherHome
	Integer partnerTrying
	Integer biofatherRaise
	Integer socfatherRaise
	Integer fatherAvail
	String timeStamp11
	Integer english
	Integer contactLang
	String contactLangOth
	Integer interpret
	Integer contactInterpret
	String contactInterpretOth
	String timeStamp12
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		psEhId(nullable: false, minSize:1, maxSize:36)
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
		femaleAvail(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp2(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		personDob(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		age(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		ageRange(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4])
		ageElig(nullable: false, inList:[1, 2, 3, -6, -3, -4])
		timeStamp3(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		addressId(nullable: true, maxSize:36)
		address1(nullable: true, maxSize:100)
		address2(nullable: true, maxSize:100)
		unit(nullable: true, maxSize:10)
		city(nullable: true, maxSize:50)
		state(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		zip(nullable: true, maxSize:5)
		zip4(nullable: true, maxSize:4)
		duEligConfirm(nullable: false, inList:[1, 2, -6, -4])
		ownHome(nullable: false, inList:[1, 2, -5, -1, -2, -3, -4])
		ownHomeOth(nullable: true, maxSize:255)
		timeStamp4(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		knowNcs(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		elig(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		timeStamp5(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		pregnant(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		origDueDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		datePeriod(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		weeksPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		monthPreg(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		trimester(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		timeStamp6(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		trying(nullable: false, inList:[1, 2, 3, 4, 5, -1, -2, -3, -4])
		hyster(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		ovaries(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		tubesTied(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		menopause(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		medUnable(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		medUnableOth(nullable: true, maxSize:255)
		timeStamp7(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		maristat(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -1, -2, -3, -4])
		educ(nullable: false, inList:[1, 2, 3, 4, 5, 6, -1, -2, -3, -4])
		employ(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, -5, -1, -2, -3, -4])
		employOth(nullable: true, maxSize:255)
		ethnicity(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		personLang(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, -5, -1, -2, -3, -4])
		personLangOth(nullable: true, maxSize:255)
		timeStamp8(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		hhMembers(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		numChild(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		income(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4])
		timeStamp9(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		rFname(nullable: true, maxSize:30)
		rLname(nullable: true, maxSize:30)
		phoneNbr(nullable: true, maxSize:10)
		phoneNbrOth(nullable: true, maxSize:10)
		phoneType(nullable: false, inList:[1, 2, 3, 4, -5, -1, -2, -3, -4])
		phoneTypeOth(nullable: true, maxSize:255)
		homePhone(nullable: true, maxSize:10)
		cellPhone1(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone2(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone3(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone4(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		cellPhone(nullable: true, maxSize:10)
		sameAddr(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		mailAddressId(nullable: true, maxSize:36)
		mailAddress1(nullable: true, maxSize:100)
		mailAddress2(nullable: true, maxSize:100)
		mailUnit(nullable: true, maxSize:10)
		mailCity(nullable: true, maxSize:50)
		mailState(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		mailZip(nullable: true, maxSize:5)
		mailZip4(nullable: true, maxSize:4)
		haveEmail(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		email(nullable: true, maxSize:100)
		emailType(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		emailShare(nullable: false, inList:[1, 2, -3, -4])
		planMove(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		whereMove(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		moveInfo(nullable: false, inList:[1, 2, 3, -1, -2, -3, -4])
		newAddressId(nullable: true, maxSize:36)
		newAddress1(nullable: true, maxSize:100)
		newAddress2(nullable: true, maxSize:100)
		newUnit(nullable: true, maxSize:10)
		newCity(nullable: true, maxSize:50)
		newState(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -2, -3, -4])
		newZip(nullable: true, maxSize:5)
		newZip4(nullable: true, maxSize:4)
		whenMove(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		dateMove(nullable: true, maxSize:7, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9])?")
		timeStamp10(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		ppgFirst(nullable: false, inList:[1, 2, 3, 4, 5, 6, -4])
		bioFatherHome(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		partnerTrying(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		biofatherRaise(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		socfatherRaise(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		fatherAvail(nullable: false, inList:[1, 2, -1, -2, -3, -4])
		timeStamp11(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		english(nullable: false, inList:[1, 2, -4])
		contactLang(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, -5, -3, -4])
		contactLangOth(nullable: true, maxSize:255)
		interpret(nullable: false, inList:[1, 2, -4])
		contactInterpret(nullable: false, inList:[1, 2, 3, 4, 5, 6, -5, -3, -4])
		contactInterpretOth(nullable: true, maxSize:255)
		timeStamp12(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_screen_eh_2'
		psuId column:'psu_id'
		psEhId column:'ps_eh_id'
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
		femaleAvail column:'female_avail'
		timeStamp2 column:'time_stamp_2'
		personDob column:'person_dob'
		age column:'age'
		ageRange column:'age_range'
		ageElig column:'age_elig'
		timeStamp3 column:'time_stamp_3'
		addressId column:'address_id'
		address1 column:'address_1'
		address2 column:'address_2'
		unit column:'unit'
		city column:'city'
		state column:'state'
		zip column:'zip'
		zip4 column:'zip4'
		duEligConfirm column:'du_elig_confirm'
		ownHome column:'own_home'
		ownHomeOth column:'own_home_oth'
		timeStamp4 column:'time_stamp_4'
		knowNcs column:'know_ncs'
		elig column:'elig'
		timeStamp5 column:'time_stamp_5'
		pregnant column:'pregnant'
		origDueDate column:'orig_due_date'
		datePeriod column:'date_period'
		weeksPreg column:'weeks_preg'
		monthPreg column:'month_preg'
		trimester column:'trimester'
		timeStamp6 column:'time_stamp_6'
		trying column:'trying'
		hyster column:'hyster'
		ovaries column:'ovaries'
		tubesTied column:'tubes_tied'
		menopause column:'menopause'
		medUnable column:'med_unable'
		medUnableOth column:'med_unable_oth'
		timeStamp7 column:'time_stamp_7'
		maristat column:'maristat'
		educ column:'educ'
		employ column:'employ'
		employOth column:'employ_oth'
		ethnicity column:'ethnicity'
		personLang column:'person_lang'
		personLangOth column:'person_lang_oth'
		timeStamp8 column:'time_stamp_8'
		hhMembers column:'hh_members'
		numChild column:'num_child'
		income column:'income'
		timeStamp9 column:'time_stamp_9'
		rFname column:'r_fname'
		rLname column:'r_lname'
		phoneNbr column:'phone_nbr'
		phoneNbrOth column:'phone_nbr_oth'
		phoneType column:'phone_type'
		phoneTypeOth column:'phone_type_oth'
		homePhone column:'home_phone'
		cellPhone1 column:'cell_phone_1'
		cellPhone2 column:'cell_phone_2'
		cellPhone3 column:'cell_phone_3'
		cellPhone4 column:'cell_phone_4'
		cellPhone column:'cell_phone'
		sameAddr column:'same_addr'
		mailAddressId column:'mail_address_id'
		mailAddress1 column:'mail_address1'
		mailAddress2 column:'mail_address2'
		mailUnit column:'mail_unit'
		mailCity column:'mail_city'
		mailState column:'mail_state'
		mailZip column:'mail_zip'
		mailZip4 column:'mail_zip4'
		haveEmail column:'have_email'
		email column:'email'
		emailType column:'email_type'
		emailShare column:'email_share'
		planMove column:'plan_move'
		whereMove column:'where_move'
		moveInfo column:'move_info'
		newAddressId column:'new_address_id'
		newAddress1 column:'new_address1'
		newAddress2 column:'new_address2'
		newUnit column:'new_unit'
		newCity column:'new_city'
		newState column:'new_state'
		newZip column:'new_zip'
		newZip4 column:'new_zip4'
		whenMove column:'when_move'
		dateMove column:'date_move'
		timeStamp10 column:'time_stamp_10'
		ppgFirst column:'ppg_first'
		bioFatherHome column:'bio_father_home'
		partnerTrying column:'partner_trying'
		biofatherRaise column:'biofather_raise'
		socfatherRaise column:'socfather_raise'
		fatherAvail column:'father_avail'
		timeStamp11 column:'time_stamp_11'
		english column:'english'
		contactLang column:'contact_lang'
		contactLangOth column:'contact_lang_oth'
		interpret column:'interpret'
		contactInterpret column:'contact_interpret'
		contactInterpretOth column:'contact_interpret_oth'
		timeStamp12 column:'time_stamp_12'
		transactionType column:'transaction_type'
	}
}
