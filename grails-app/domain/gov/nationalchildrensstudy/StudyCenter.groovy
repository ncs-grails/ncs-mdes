package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class StudyCenter {

	Integer scId
	String scName
	String comments
	String transactionType

	static constraints = {
		scId(nullable: false, inList:[20000013, 20000015, 20000019, 20000022, 20000024, 20000026, 20000029, 20000031, 20000033, 20000036, 20000038, 20000041, 20000043, 20000047, 20000049, 20000051, 20000053, 20000056, 20000059, 20000061, 20000064, 20000066, 20000068, 20000071, 20000073, 20000074, 20000075, 20000076, 20000077, 20000078, 20000080, 20000081, 20000082, 20000120, 20000121, 20000122, -4, 20000000])
		scName(nullable: true, maxSize:100)
		comments(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'study_center'
		scId column:'sc_id'
		scName column:'sc_name'
		comments column:'comments'
		transactionType column:'transaction_type'
	}
}
