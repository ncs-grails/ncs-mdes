package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SpecSpscInfo {

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
	String addressId
	/**
	 * PII level  
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		spscId(nullable: false, minSize:1, maxSize:36)
		addressId(nullable: true, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'spec_spsc_info'
		psuId column:'psu_id'
		spscId column:'spsc_id'
		addressId column:'address_id'
		transactionType column:'transaction_type'
	}
}
