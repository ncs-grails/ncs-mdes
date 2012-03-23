package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class StaffCertTraining {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String staffCertListId
	/**
	 * Status level 1
	 */
	String staffId
	/**
	 * Status level 1
	 */
	CertificateTypeCl1 certTrainType
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 certCompleted
	/**
	 * Status level 1
	 */
	String certDate
	/**
	 * Status level 3
	 */
	BackgroundChckLvlCl1 staffBgcheckLvl
	/**
	 * Status level 1
	 */
	String certTypeFrequency
	/**
	 * Status level 1
	 */
	String certTypeExpDate
	/**
	 * PII level P
	 * Status level 1
	 */
	String certComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		staffCertListId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		certTrainType(nullable: false)
		certCompleted(nullable: false)
		certDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		staffBgcheckLvl(nullable: false)
		certTypeFrequency(nullable: true, maxSize:10)
		certTypeExpDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		certComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'staff_cert_training'
		psuId column:'psu_id'
		staffCertListId column:'staff_cert_list_id'
		staffId column:'staff_id'
		certTrainType column:'cert_train_type'
		certCompleted column:'cert_completed'
		certDate column:'cert_date'
		staffBgcheckLvl column:'staff_bgcheck_lvl'
		certTypeFrequency column:'cert_type_frequency'
		certTypeExpDate column:'cert_type_exp_date'
		certComment column:'cert_comment'
		transactionType column:'transaction_type'
	}
}
