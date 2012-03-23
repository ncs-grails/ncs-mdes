package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class EnvEquipment {

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
	EquipmentTypeCl2 equipmentType
	/**
	 * PII level P
	 * Status level 2
	 */
	String equipmentTypeOth
	/**
	 * PII level  
	 * Status level 2
	 */
	String serialNo
	/**
	 * Status level 2
	 */
	String governmentAssetTagNo
	/**
	 * Status level 2
	 */
	String retiredDate
	/**
	 * Status level 2
	 */
	EquipmentIssuesCl1 retiredReason
	/**
	 * PII level P
	 * Status level 2
	 */
	String retiredReasonOth
	/**
	 * PII level  
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		srscId(nullable: false, minSize:1, maxSize:36)
		equipId(nullable: false, minSize:1, maxSize:36)
		equipmentType(nullable: false)
		equipmentTypeOth(nullable: true, maxSize:255)
		serialNo(nullable: false, minSize:1, maxSize:50)
		governmentAssetTagNo(nullable: true, maxSize:36)
		retiredDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		retiredReason(nullable: false)
		retiredReasonOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'env_equipment'
		psuId column:'psu_id'
		srscId column:'srsc_id'
		equipId column:'equip_id'
		equipmentType column:'equipment_type'
		equipmentTypeOth column:'equipment_type_oth'
		serialNo column:'serial_no'
		governmentAssetTagNo column:'government_asset_tag_no'
		retiredDate column:'retired_date'
		retiredReason column:'retired_reason'
		retiredReasonOth column:'retired_reason_oth'
		transactionType column:'transaction_type'
	}
}
