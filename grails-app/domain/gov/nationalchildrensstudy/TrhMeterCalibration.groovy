package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TrhMeterCalibration {

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
	 * Status level 2
	 */
	String calibrationId
	/**
	 * Status level 2
	 */
	String calibrationExpireDt
	/**
	 * Status level 2
	 */
	String verificationDt
	/**
	 * Status level 2
	 */
	String thrEquipId
	/**
	 * Status level 2
	 */
	BigDecimal precisionTermTemp
	/**
	 * Status level 2
	 */
	BigDecimal trhTemp
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 saltsMoist
	/**
	 * Status level 2
	 */
	BigDecimal s33rhReading
	/**
	 * Status level 2
	 */
	BigDecimal s75rhReading
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 s33RhNeedCalib
	/**
	 * Status level 2
	 */
	ConfirmTypeCl21 s75RhNeedCalib
	/**
	 * Status level 2
	 */
	BigDecimal s33rhReadingCalib
	/**
	 * Status level 2
	 */
	BigDecimal s75rhReadingCalib
	/**
	 * Status level 2
	 */
	CalibErrorReasonCl1 trhCalibFailRsn
	/**
	 * PII level P
	 * Status level 2
	 */
	String trhCalibFailReasOther
	/**
	 * Status level 2
	 */
	ValidationStatusCl2 trhCalibStatus
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		srscId(nullable: false, minSize:1, maxSize:36)
		equipId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		calibrationId(nullable: false, minSize:1, maxSize:36)
		calibrationExpireDt(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		verificationDt(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		thrEquipId(nullable: false, minSize:1, maxSize:36)
		precisionTermTemp(nullable: false)
		trhTemp(nullable: false)
		saltsMoist(nullable: false)
		s33rhReading(nullable: false)
		s75rhReading(nullable: false)
		s33RhNeedCalib(nullable: false)
		s75RhNeedCalib(nullable: false)
		s33rhReadingCalib(nullable: false)
		s75rhReadingCalib(nullable: false)
		trhCalibFailRsn(nullable: false)
		trhCalibFailReasOther(nullable: true, maxSize:255)
		trhCalibStatus(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'trh_meter_calibration'
		psuId column:'psu_id'
		srscId column:'srsc_id'
		equipId column:'equip_id'
		staffId column:'staff_id'
		calibrationId column:'calibration_id'
		calibrationExpireDt column:'calibration_expire_dt'
		verificationDt column:'verification_dt'
		thrEquipId column:'thr_equip_id'
		precisionTermTemp column:'precision_term_temp'
		trhTemp column:'trh_temp'
		saltsMoist column:'salts_moist'
		s33rhReading column:'s_33rh_reading'
		s75rhReading column:'s_75rh_reading'
		s33RhNeedCalib column:'s_33_rh_need_calib'
		s75RhNeedCalib column:'s_75_rh_need_calib'
		s33rhReadingCalib column:'s_33rh_reading_calib'
		s75rhReadingCalib column:'s_75rh_reading_calib'
		trhCalibFailRsn column:'trh_calib_fail_rsn'
		trhCalibFailReasOther column:'trh_calib_fail_reas_other'
		trhCalibStatus column:'trh_calib_status'
		transactionType column:'transaction_type'
	}
}
