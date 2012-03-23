package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PpgStatusHistory {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String ppgHistoryId
	/**
	 * Status level 1
	 */
	String pId
	/**
	 * Status level 1
	 */
	PpgStatusCl1 ppgStatus
	/**
	 * Status level 1
	 */
	String ppgStatusDate
	/**
	 * Status level 3
	 */
	InformationSourceCl3 ppgInfoSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String ppgInfoSourceOth
	/**
	 * Status level 3
	 */
	ContactTypeCl1 ppgInfoMode
	/**
	 * PII level P
	 * Status level 1
	 */
	String ppgInfoModeOth
	/**
	 * PII level P
	 * Status level 1
	 */
	String ppgComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		ppgHistoryId(nullable: false, minSize:1, maxSize:36)
		pId(nullable: false, minSize:1, maxSize:36)
		ppgStatus(nullable: false)
		ppgStatusDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		ppgInfoSource(nullable: false)
		ppgInfoSourceOth(nullable: true, maxSize:255)
		ppgInfoMode(nullable: false)
		ppgInfoModeOth(nullable: true, maxSize:255)
		ppgComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'ppg_status_history'
		psuId column:'psu_id'
		ppgHistoryId column:'ppg_history_id'
		pId column:'p_id'
		ppgStatus column:'ppg_status'
		ppgStatusDate column:'ppg_status_date'
		ppgInfoSource column:'ppg_info_source'
		ppgInfoSourceOth column:'ppg_info_source_oth'
		ppgInfoMode column:'ppg_info_mode'
		ppgInfoModeOth column:'ppg_info_mode_oth'
		ppgComment column:'ppg_comment'
		transactionType column:'transaction_type'
	}
}
