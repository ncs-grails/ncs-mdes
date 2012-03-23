package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PpgDetails {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ppgDetailsId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	ParticipantStatusCl1 ppgPidStatus
	/**
	 * Status level 3
	 */
	PpgStatusCl2 ppgFirst
	/**
	 * Status level 1
	 */
	String origDueDate
	/**
	 * Status level 1
	 */
	String dueDate2
	/**
	 * Status level 1
	 */
	String dueDate3
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ppgDetailsId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		ppgPidStatus(nullable: false)
		ppgFirst(nullable: false)
		origDueDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		dueDate2(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		dueDate3(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'ppg_details'
		psuId column:'psu_id'
		ppgDetailsId column:'ppg_details_id'
		pId column:'p_id'
		ppgPidStatus column:'ppg_pid_status'
		ppgFirst column:'ppg_first'
		origDueDate column:'orig_due_date'
		dueDate2 column:'due_date_2'
		dueDate3 column:'due_date_3'
		transactionType column:'transaction_type'
	}
}
