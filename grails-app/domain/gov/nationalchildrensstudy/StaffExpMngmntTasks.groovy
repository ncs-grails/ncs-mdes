package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class StaffExpMngmntTasks {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String staffExpMgmtTaskId
	/**
	 * Status level 1
	 */
	String staffWeeklyExpenseId
	/**
	 * Status level 1
	 */
	StudyMngmntTskTypeCl1 mgmtTaskType
	/**
	 * PII level P
	 * Status level 1
	 */
	String mgmtTaskTypeOth
	/**
	 * Status level 1
	 */
	BigDecimal mgmtTaskHrs
	/**
	 * PII level P
	 * Status level 1
	 */
	String mgmtTaskComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		staffExpMgmtTaskId(nullable: false, minSize:1, maxSize:36)
		staffWeeklyExpenseId(nullable: false, minSize:1, maxSize:36)
		mgmtTaskType(nullable: false)
		mgmtTaskTypeOth(nullable: true, maxSize:255)
		mgmtTaskHrs(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		mgmtTaskComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'staff_exp_mngmnt_tasks'
		psuId column:'psu_id'
		staffExpMgmtTaskId column:'staff_exp_mgmt_task_id'
		staffWeeklyExpenseId column:'staff_weekly_expense_id'
		mgmtTaskType column:'mgmt_task_type'
		mgmtTaskTypeOth column:'mgmt_task_type_oth'
		mgmtTaskHrs column:'mgmt_task_hrs'
		mgmtTaskComment column:'mgmt_task_comment'
		transactionType column:'transaction_type'
	}
}
