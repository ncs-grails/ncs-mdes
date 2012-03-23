package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecEquipment {

	/**
	 * PII level  
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * PII level  
	 * Status level 2
	 */
	String spscId
	/**
	 * PII level  
	 * Status level 2
	 */
	String equipId
	/**
	 * PII level  
	 * Status level 2
	 */
	EquipmentTypeCl1 equipmentType
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
	 * PII level  
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		spscId(nullable: false, minSize:1, maxSize:36)
		equipId(nullable: false, minSize:1, maxSize:36)
		equipmentType(nullable: false)
		equipmentTypeOth(nullable: true, maxSize:255)
		serialNo(nullable: true, maxSize:50)
		governmentAssetTagNo(nullable: true, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_equipment'
		psuId column:'psu_id'
		spscId column:'spsc_id'
		equipId column:'equip_id'
		equipmentType column:'equipment_type'
		equipmentTypeOth column:'equipment_type_oth'
		serialNo column:'serial_no'
		governmentAssetTagNo column:'government_asset_tag_no'
		transactionType column:'transaction_type'
	}
}
