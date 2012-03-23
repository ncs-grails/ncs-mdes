package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class StaffExpDataCllctnTasks {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String staffExpDataCollTaskId
	/**
	 * Status level 1
	 */
	String staffWeeklyExpenseId
	/**
	 * Status level 1
	 */
	StudyDataCllctnTskTypeCl1 dataCollTaskType
	/**
	 * PII level P
	 * Status level 1
	 */
	String dataCollTaskTypeOth
	/**
	 * Status level 1
	 */
	BigDecimal dataCollTasksHrs
	/**
	 * Status level 1
	 */
	Integer dataCollTaskCases
	/**
	 * Status level 1
	 */
	Integer dataCollTransmit
	/**
	 * PII level P
	 * Status level 1
	 */
	String dataCollTaskComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		staffExpDataCollTaskId(nullable: false, minSize:1, maxSize:36)
		staffWeeklyExpenseId(nullable: false, minSize:1, maxSize:36)
		dataCollTaskType(nullable: false)
		dataCollTaskTypeOth(nullable: true, maxSize:255)
		dataCollTasksHrs(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		dataCollTaskCases(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		dataCollTransmit(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		dataCollTaskComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'staff_exp_data_cllctn_tasks'
		psuId column:'psu_id'
		staffExpDataCollTaskId column:'staff_exp_data_coll_task_id'
		staffWeeklyExpenseId column:'staff_weekly_expense_id'
		dataCollTaskType column:'data_coll_task_type'
		dataCollTaskTypeOth column:'data_coll_task_type_oth'
		dataCollTasksHrs column:'data_coll_tasks_hrs'
		dataCollTaskCases column:'data_coll_task_cases'
		dataCollTransmit column:'data_coll_transmit'
		dataCollTaskComment column:'data_coll_task_comment'
		transactionType column:'transaction_type'
	}
}
