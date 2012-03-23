package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class DwellingUnit {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String duId
	/**
	 * Status level 1
	 */
	String listId
	/**
	 * Status level 2
	 */
	String tsuId
	/**
	 * Status level 2
	 */
	String ssuId
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 duplicateDu
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 missedDu
	/**
	 * Status level 3
	 */
	ResidenceTypeCl2 duType
	/**
	 * PII level P
	 * Status level 1
	 */
	String duTypeOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl3 duIneligible
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 duAccess
	/**
	 * PII level P
	 * Status level 1
	 */
	String duidComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		duId(nullable: false, minSize:1, maxSize:36)
		listId(nullable: true, maxSize:36)
		tsuId(nullable: true, maxSize:36)
		ssuId(nullable: true, maxSize:36)
		duplicateDu(nullable: false)
		missedDu(nullable: false)
		duType(nullable: false)
		duTypeOth(nullable: true, maxSize:255)
		duIneligible(nullable: false)
		duAccess(nullable: false)
		duidComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'dwelling_unit'
		psuId column:'psu_id'
		duId column:'du_id'
		listId column:'list_id'
		tsuId column:'tsu_id'
		ssuId column:'ssu_id'
		duplicateDu column:'duplicate_du'
		missedDu column:'missed_du'
		duType column:'du_type'
		duTypeOth column:'du_type_oth'
		duIneligible column:'du_ineligible'
		duAccess column:'du_access'
		duidComment column:'duid_comment'
		transactionType column:'transaction_type'
	}
}
