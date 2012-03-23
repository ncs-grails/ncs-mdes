package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Address {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String addressId
	/**
	 * Status level 1
	 */
	String personId
	/**
	 * Status level 1
	 */
	String instituteId
	/**
	 * Status level 1
	 */
	String providerId
	/**
	 * Status level 1
	 */
	String duId
	/**
	 * Status level 3
	 */
	CommunicationRankCl1 addressRank
	/**
	 * PII level P
	 * Status level 1
	 */
	String addressRankOth
	/**
	 * Status level 3
	 */
	InformationSourceCl1 addressInfoSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String addressInfoSourceOth
	/**
	 * Status level 3
	 */
	ContactTypeCl1 addressInfoMode
	/**
	 * PII level P
	 * Status level 1
	 */
	String addressInfoModeOth
	/**
	 * Status level 1
	 */
	String addressInfoDate
	/**
	 * Status level 1
	 */
	String addressInfoUpdate
	/**
	 * Status level 1
	 */
	String addressStartDate
	/**
	 * Status level 1
	 */
	String addressEndDate
	/**
	 * Status level 3
	 */
	AddressCategoryCl1 addressType
	/**
	 * PII level P
	 * Status level 1
	 */
	String addressTypeOth
	/**
	 * Status level 3
	 */
	ResidenceTypeCl1 addressDescription
	/**
	 * PII level P
	 * Status level 1
	 */
	String addressDescriptionOth
	/**
	 * PII level Y
	 * Status level 3
	 */
	String address1
	/**
	 * PII level Y
	 * Status level 3
	 */
	String address2
	/**
	 * PII level Y
	 * Status level 3
	 */
	String unit
	/**
	 * PII level Y
	 * Status level 3
	 */
	String city
	/**
	 * PII level Y
	 * Status level 3
	 */
	StateCl1 state
	/**
	 * PII level P
	 * Status level 1
	 */
	String zip
	/**
	 * PII level P
	 * Status level 1
	 */
	String zip4
	/**
	 * PII level Y
	 * Status level 3
	 */
	String addressComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		addressId(nullable: false, minSize:1, maxSize:36)
		personId(nullable: true, maxSize:36)
		instituteId(nullable: true, maxSize:36)
		providerId(nullable: true, maxSize:36)
		duId(nullable: true, maxSize:36)
		addressRank(nullable: false)
		addressRankOth(nullable: true, maxSize:255)
		addressInfoSource(nullable: false)
		addressInfoSourceOth(nullable: true, maxSize:255)
		addressInfoMode(nullable: false)
		addressInfoModeOth(nullable: true, maxSize:255)
		addressInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		addressInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		addressStartDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		addressEndDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		addressType(nullable: false)
		addressTypeOth(nullable: true, maxSize:255)
		addressDescription(nullable: false)
		addressDescriptionOth(nullable: true, maxSize:255)
		address1(nullable: true, maxSize:100)
		address2(nullable: true, maxSize:100)
		unit(nullable: true, maxSize:10)
		city(nullable: true, maxSize:50)
		state(nullable: false)
		zip(nullable: true, maxSize:5)
		zip4(nullable: true, maxSize:4)
		addressComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'address'
		psuId column:'psu_id'
		addressId column:'address_id'
		personId column:'person_id'
		instituteId column:'institute_id'
		providerId column:'provider_id'
		duId column:'du_id'
		addressRank column:'address_rank'
		addressRankOth column:'address_rank_oth'
		addressInfoSource column:'address_info_source'
		addressInfoSourceOth column:'address_info_source_oth'
		addressInfoMode column:'address_info_mode'
		addressInfoModeOth column:'address_info_mode_oth'
		addressInfoDate column:'address_info_date'
		addressInfoUpdate column:'address_info_update'
		addressStartDate column:'address_start_date'
		addressEndDate column:'address_end_date'
		addressType column:'address_type'
		addressTypeOth column:'address_type_oth'
		addressDescription column:'address_description'
		addressDescriptionOth column:'address_description_oth'
		address1 column:'address_1'
		address2 column:'address_2'
		unit column:'unit'
		city column:'city'
		state column:'state'
		zip column:'zip'
		zip4 column:'zip4'
		addressComment column:'address_comment'
		transactionType column:'transaction_type'
	}
}
