package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SrscInfo {

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
	String addressId
	/**
	 * PII level  
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		srscId(nullable: false, minSize:1, maxSize:36)
		addressId(nullable: true, maxSize:36)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'srsc_info'
		psuId column:'psu_id'
		srscId column:'srsc_id'
		addressId column:'address_id'
		transactionType column:'transaction_type'
	}
}
