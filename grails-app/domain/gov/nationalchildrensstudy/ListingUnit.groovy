package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class ListingUnit {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String listId
	/**
	 * Status level 1
	 */
	String ssuId
	/**
	 * Status level 1
	 */
	String tsuId
	/**
	 * Status level 1
	 */
	Integer listLine
	/**
	 * Status level 1
	 */
	ListingSourceCl1 listSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String listComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		listId(nullable: false, minSize:1, maxSize:36)
		ssuId(nullable: false, minSize:1, maxSize:36)
		tsuId(nullable: true, maxSize:36)
		listLine(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		listSource(nullable: false)
		listComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'listing_unit'
		psuId column:'psu_id'
		listId column:'list_id'
		ssuId column:'ssu_id'
		tsuId column:'tsu_id'
		listLine column:'list_line'
		listSource column:'list_source'
		listComment column:'list_comment'
		transactionType column:'transaction_type'
	}
}
