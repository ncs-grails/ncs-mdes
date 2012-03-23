package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class RefFreezerVerification {

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
	String verificationId
	/**
	 * Status level 2
	 */
	String verificationDt
	/**
	 * Status level 2
	 */
	String rfThermometerEquipId
	/**
	 * Status level 2
	 */
	BigDecimal correctionFactorTemp
	/**
	 * Status level 2
	 */
	BigDecimal currentTemp
	/**
	 * Status level 2
	 */
	BigDecimal maximumTemp
	/**
	 * Status level 2
	 */
	BigDecimal minimumTemp
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		srscId(nullable: false, minSize:1, maxSize:36)
		equipId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		verificationId(nullable: false, minSize:1, maxSize:36)
		verificationDt(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		rfThermometerEquipId(nullable: false, minSize:1, maxSize:36)
		correctionFactorTemp(nullable: false)
		currentTemp(nullable: false)
		maximumTemp(nullable: false)
		minimumTemp(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'ref_freezer_verification'
		psuId column:'psu_id'
		srscId column:'srsc_id'
		equipId column:'equip_id'
		staffId column:'staff_id'
		verificationId column:'verification_id'
		verificationDt column:'verification_dt'
		rfThermometerEquipId column:'rf_thermometer_equip_id'
		correctionFactorTemp column:'correction_factor_temp'
		currentTemp column:'current_temp'
		maximumTemp column:'maximum_temp'
		minimumTemp column:'minimum_temp'
		transactionType column:'transaction_type'
	}
}
