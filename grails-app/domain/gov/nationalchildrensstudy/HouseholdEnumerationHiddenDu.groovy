package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class HouseholdEnumerationHiddenDu {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String hduId
	/**
	 * Status level 1
	 */
	String hhenumId
	/**
	 * Status level 1
	 */
	String hduAddressId
	/**
	 * PII level Y
	 * Status level 3
	 */
	String hduAddress1
	/**
	 * PII level Y
	 * Status level 3
	 */
	String hduAddress2
	/**
	 * PII level Y
	 * Status level 3
	 */
	String hduUnit
	/**
	 * PII level Y
	 * Status level 3
	 */
	String hduCity
	/**
	 * PII level Y
	 * Status level 3
	 */
	StateCl2 hduState
	/**
	 * PII level P
	 * Status level 3
	 */
	String hduZip
	/**
	 * PII level P
	 * Status level 3
	 */
	String hduZip4
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		hduId(nullable: false, minSize:1, maxSize:36)
		hhenumId(nullable: false, minSize:1, maxSize:36)
		hduAddressId(nullable: true, maxSize:36)
		hduAddress1(nullable: true, maxSize:100)
		hduAddress2(nullable: true, maxSize:100)
		hduUnit(nullable: true, maxSize:10)
		hduCity(nullable: true, maxSize:50)
		hduState(nullable: false)
		hduZip(nullable: true, maxSize:5)
		hduZip4(nullable: true, maxSize:4)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'household_enumeration_hidden_du'
		psuId column:'psu_id'
		hduId column:'hdu_id'
		hhenumId column:'hhenum_id'
		hduAddressId column:'hdu_address_id'
		hduAddress1 column:'hdu_address_1'
		hduAddress2 column:'hdu_address_2'
		hduUnit column:'hdu_unit'
		hduCity column:'hdu_city'
		hduState column:'hdu_state'
		hduZip column:'hdu_zip'
		hduZip4 column:'hdu_zip4'
		transactionType column:'transaction_type'
	}
}
