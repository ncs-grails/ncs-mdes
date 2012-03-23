package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class StaffWeeklyExpense {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String weeklyExpId
	/**
	 * Status level 1
	 */
	String staffId
	/**
	 * Status level 3
	 */
	String weekStartDate
	/**
	 * Status level 1
	 */
	BigDecimal staffPay
	/**
	 * Status level 1
	 */
	BigDecimal staffHours
	/**
	 * Status level 1
	 */
	BigDecimal staffExpenses
	/**
	 * Status level 1
	 */
	BigDecimal staffMiles
	/**
	 * PII level P
	 * Status level 1
	 */
	String weeklyExpensesComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		weeklyExpId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		weekStartDate(nullable: false, minSize:1, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		staffPay(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		staffHours(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		staffExpenses(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		staffMiles(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		weeklyExpensesComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'staff_weekly_expense'
		psuId column:'psu_id'
		weeklyExpId column:'weekly_exp_id'
		staffId column:'staff_id'
		weekStartDate column:'week_start_date'
		staffPay column:'staff_pay'
		staffHours column:'staff_hours'
		staffExpenses column:'staff_expenses'
		staffMiles column:'staff_miles'
		weeklyExpensesComment column:'weekly_expenses_comment'
		transactionType column:'transaction_type'
	}
}
