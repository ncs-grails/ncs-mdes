package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecReceipt {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String specimenId
	/**
	 * Status level 2
	 */
	String spscId
	/**
	 * Status level 2
	 */
	String staffId
	/**
	 * Status level 2
	 */
	SpecimenStatusCl3 receiptComment
	/**
	 * PII level P
	 * Status level 2
	 */
	String receiptCommentOth
	/**
	 * Status level 2
	 */
	String receiptDt
	/**
	 * Status level 2
	 */
	BigDecimal coolerTemp
	/**
	 * Status level 2
	 */
	TriggerStatusCl1 monitorStatus
	/**
	 * Status level 2
	 */
	TriggerStatusCl1 upperTrigger
	/**
	 * Status level 2
	 */
	TriggerStatusCl2 upperTriggerLvl
	/**
	 * Status level 2
	 */
	TriggerStatusCl1 lowerTriggerCold
	/**
	 * Status level 2
	 */
	TriggerStatusCl1 lowerTriggerAmbient
	/**
	 * Status level 2
	 */
	String storageContainerId
	/**
	 * Status level 2
	 */
	SpecimenStatusCl4 centrifugeComment
	/**
	 * PII level P
	 * Status level 2
	 */
	String centrifugeCommentOth
	/**
	 * Status level 2
	 */
	String centrifugeSt
	/**
	 * Status level 2
	 */
	String centrifugeEt
	/**
	 * Status level 2
	 */
	String centrifugeStaffId
	/**
	 * Status level 2
	 */
	String equipId
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		specimenId(nullable: false, minSize:1, maxSize:36)
		spscId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		receiptComment(nullable: false)
		receiptCommentOth(nullable: true, maxSize:255)
		receiptDt(nullable: false, minSize:1, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		coolerTemp(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		monitorStatus(nullable: false)
		upperTrigger(nullable: false)
		upperTriggerLvl(nullable: false)
		lowerTriggerCold(nullable: false)
		lowerTriggerAmbient(nullable: false)
		storageContainerId(nullable: false, minSize:1, maxSize:36)
		centrifugeComment(nullable: false)
		centrifugeCommentOth(nullable: true, maxSize:255)
		centrifugeSt(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		centrifugeEt(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		centrifugeStaffId(nullable: true, maxSize:36)
		equipId(nullable: true, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_receipt'
		psuId column:'psu_id'
		specimenId column:'specimen_id'
		spscId column:'spsc_id'
		staffId column:'staff_id'
		receiptComment column:'receipt_comment'
		receiptCommentOth column:'receipt_comment_oth'
		receiptDt column:'receipt_dt'
		coolerTemp column:'cooler_temp'
		monitorStatus column:'monitor_status'
		upperTrigger column:'upper_trigger'
		upperTriggerLvl column:'upper_trigger_lvl'
		lowerTriggerCold column:'lower_trigger_cold'
		lowerTriggerAmbient column:'lower_trigger_ambient'
		storageContainerId column:'storage_container_id'
		centrifugeComment column:'centrifuge_comment'
		centrifugeCommentOth column:'centrifuge_comment_oth'
		centrifugeSt column:'centrifuge_st'
		centrifugeEt column:'centrifuge_et'
		centrifugeStaffId column:'centrifuge_staff_id'
		equipId column:'equip_id'
		transactionType column:'transaction_type'
	}
}
