package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class DrfThermVerification {

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
	String staffId
	/**
	 * Status level 2
	 */
	String drfThermVerificationDate
	/**
	 * Status level 2
	 */
	String drfVerificationId
	/**
	 * PII level  
	 * Status level 2
	 */
	String equipId
	/**
	 * Status level 2
	 */
	String rfThermometerEquipId
	/**
	 * Status level 2
	 */
	String certificationExpireDt
	/**
	 * Status level 2
	 */
	BigDecimal precisionTermTemp
	/**
	 * Status level 2
	 */
	BigDecimal rfTemp
	/**
	 * Status level 2
	 */
	BigDecimal correctionFactorTemp
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		srscId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		drfThermVerificationDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		drfVerificationId(nullable: false, minSize:1, maxSize:36)
		equipId(nullable: false, minSize:1, maxSize:36)
		rfThermometerEquipId(nullable: false, minSize:1, maxSize:36)
		certificationExpireDt(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		precisionTermTemp(nullable: false)
		rfTemp(nullable: false)
		correctionFactorTemp(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'drf_therm_verification'
		psuId column:'psu_id'
		srscId column:'srsc_id'
		staffId column:'staff_id'
		drfThermVerificationDate column:'drf_therm_verification_date'
		drfVerificationId column:'drf_verification_id'
		equipId column:'equip_id'
		rfThermometerEquipId column:'rf_thermometer_equip_id'
		certificationExpireDt column:'certification_expire_dt'
		precisionTermTemp column:'precision_term_temp'
		rfTemp column:'rf_temp'
		correctionFactorTemp column:'correction_factor_temp'
		transactionType column:'transaction_type'
	}
}
