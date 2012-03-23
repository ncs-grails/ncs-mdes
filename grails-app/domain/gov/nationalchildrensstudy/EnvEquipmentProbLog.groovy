package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class EnvEquipmentProbLog {

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
	String problemId
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
	String staffId
	/**
	 * Status level 2
	 */
	String problemDt
	/**
	 * Status level 2
	 */
	EquipmentIssuesCl2 equipIssue
	/**
	 * PII level P
	 * Status level 2
	 */
	EquipmentActionCl1 equipAction
	/**
	 * PII level  
	 * Status level 2
	 */
	String staffIdReviewer
	/**
	 * PII level  
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		srscId(nullable: false, minSize:1, maxSize:36)
		equipId(nullable: false, minSize:1, maxSize:36)
		problemId(nullable: false, minSize:1, maxSize:36)
		equipmentType(nullable: false)
		equipmentTypeOth(nullable: true, maxSize:255)
		staffId(nullable: false, minSize:1, maxSize:36)
		problemDt(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		equipIssue(nullable: false)
		equipAction(nullable: false)
		staffIdReviewer(nullable: true, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'env_equipment_prob_log'
		psuId column:'psu_id'
		srscId column:'srsc_id'
		equipId column:'equip_id'
		problemId column:'problem_id'
		equipmentType column:'equipment_type'
		equipmentTypeOth column:'equipment_type_oth'
		staffId column:'staff_id'
		problemDt column:'problem_dt'
		equipIssue column:'equip_issue'
		equipAction column:'equip_action'
		staffIdReviewer column:'staff_id_reviewer'
		transactionType column:'transaction_type'
	}
}
