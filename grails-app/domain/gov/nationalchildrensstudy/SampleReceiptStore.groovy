package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SampleReceiptStore {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String sampleId
	/**
	 * Status level 2
	 */
	String srscId
	/**
	 * Status level 2
	 */
	String staffId
	/**
	 * Status level 2
	 */
	SpecimenStatusCl7 sampleCondition
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
	CoolerTempCl1 coolerTempCond
	/**
	 * Status level 2
	 */
	String equipId
	/**
	 * Status level 2
	 */
	String placedInStorageDt
	/**
	 * Status level 2
	 */
	StorageAreaCl2 storageCompartmentArea
	/**
	 * PII level P
	 * Status level 2
	 */
	String storageCommentOth
	/**
	 * Status level 2
	 */
	String removedFromStorageDt
	/**
	 * Status level 2
	 */
	ConfirmTypeCl20 tempEventOccurred
	/**
	 * Status level 2
	 */
	SpecimenStatusCl6 tempEventAction
	/**
	 * PII level P
	 * Status level 2
	 */
	String tempEventActionOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		sampleId(nullable: false, minSize:1, maxSize:36)
		srscId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		sampleCondition(nullable: false)
		receiptCommentOth(nullable: true, maxSize:255)
		receiptDt(nullable: false, minSize:1, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		coolerTempCond(nullable: false)
		equipId(nullable: false, minSize:1, maxSize:36)
		placedInStorageDt(nullable: false, minSize:1, maxSize:16, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9])?")
		storageCompartmentArea(nullable: false)
		storageCommentOth(nullable: true, maxSize:255)
		removedFromStorageDt(nullable: true, maxSize:16, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9])?")
		tempEventOccurred(nullable: false)
		tempEventAction(nullable: false)
		tempEventActionOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'sample_receipt_store'
		psuId column:'psu_id'
		sampleId column:'sample_id'
		srscId column:'srsc_id'
		staffId column:'staff_id'
		sampleCondition column:'sample_condition'
		receiptCommentOth column:'receipt_comment_oth'
		receiptDt column:'receipt_dt'
		coolerTempCond column:'cooler_temp_cond'
		equipId column:'equip_id'
		placedInStorageDt column:'placed_in_storage_dt'
		storageCompartmentArea column:'storage_compartment_area'
		storageCommentOth column:'storage_comment_oth'
		removedFromStorageDt column:'removed_from_storage_dt'
		tempEventOccurred column:'temp_event_occurred'
		tempEventAction column:'temp_event_action'
		tempEventActionOth column:'temp_event_action_oth'
		transactionType column:'transaction_type'
	}
}
