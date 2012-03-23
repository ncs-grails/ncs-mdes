package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PrecThermCert {

	/**
	 * PII level  
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * PII level  
	 * Status level 2
	 */
	String srscId
	/**
	 * PII level  
	 * Status level 2
	 */
	String equipId
	/**
	 * PII level  
	 * Status level 2
	 */
	String staffId
	/**
	 * PII level  
	 * Status level 2
	 */
	String certificationId
	/**
	 * Status level 2
	 */
	ValidationStatusCl3 precisionCertStatus
	/**
	 * Status level 2
	 */
	String certificationDate
	/**
	 * Status level 2
	 */
	String certificationExpireDt
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		srscId(nullable: false, minSize:1, maxSize:36)
		equipId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		certificationId(nullable: false, minSize:1, maxSize:36)
		precisionCertStatus(nullable: false)
		certificationDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		certificationExpireDt(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'prec_therm_cert'
		psuId column:'psu_id'
		srscId column:'srsc_id'
		equipId column:'equip_id'
		staffId column:'staff_id'
		certificationId column:'certification_id'
		precisionCertStatus column:'precision_cert_status'
		certificationDate column:'certification_date'
		certificationExpireDt column:'certification_expire_dt'
		transactionType column:'transaction_type'
	}
}
