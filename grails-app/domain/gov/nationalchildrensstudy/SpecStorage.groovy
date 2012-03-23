package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecStorage {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String spscId
	/**
	 * Status level 2
	 */
	String storageContainerId
	/**
	 * Status level 2
	 */
	String placedInStorageDt
	/**
	 * Status level 2
	 */
	String staffId
	/**
	 * PII level  
	 * Status level 2
	 */
	String equipId
	/**
	 * Status level 2
	 */
	StorageAreaCl1 masterStorageUnit
	/**
	 * PII level P
	 * Status level 2
	 */
	String storageComment
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
	String tempEventSt
	/**
	 * Status level 2
	 */
	String tempEventEt
	/**
	 * Status level 2
	 */
	BigDecimal tempEventLowTemp
	/**
	 * Status level 2
	 */
	BigDecimal tempEventHighTemp
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		spscId(nullable: false, minSize:1, maxSize:36)
		storageContainerId(nullable: false, minSize:1, maxSize:36)
		placedInStorageDt(nullable: false, minSize:1, maxSize:16, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9])?")
		staffId(nullable: false, minSize:1, maxSize:36)
		equipId(nullable: true, maxSize:36)
		masterStorageUnit(nullable: false)
		storageComment(nullable: false, minSize:1, maxSize:255)
		storageCommentOth(nullable: true, maxSize:255)
		removedFromStorageDt(nullable: false, minSize:1, maxSize:16, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9])?")
		tempEventSt(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		tempEventEt(nullable: true, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		tempEventLowTemp(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		tempEventHighTemp(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_storage'
		psuId column:'psu_id'
		spscId column:'spsc_id'
		storageContainerId column:'storage_container_id'
		placedInStorageDt column:'placed_in_storage_dt'
		staffId column:'staff_id'
		equipId column:'equip_id'
		masterStorageUnit column:'master_storage_unit'
		storageComment column:'storage_comment'
		storageCommentOth column:'storage_comment_oth'
		removedFromStorageDt column:'removed_from_storage_dt'
		tempEventSt column:'temp_event_st'
		tempEventEt column:'temp_event_et'
		tempEventLowTemp column:'temp_event_low_temp'
		tempEventHighTemp column:'temp_event_high_temp'
		transactionType column:'transaction_type'
	}
}
