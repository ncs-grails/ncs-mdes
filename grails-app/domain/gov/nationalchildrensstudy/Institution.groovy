package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Institution {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String instituteId
	/**
	 * Status level 3
	 */
	OrganizationTypeCl1 instituteType
	/**
	 * Status level 1
	 */
	String instituteName
	/**
	 * PII level P
	 * Status level 1
	 */
	String instituteTypeOth
	/**
	 * Status level 3
	 */
	PersonOrgnztnFunctionCl1 instituteRelation
	/**
	 * PII level P
	 * Status level 1
	 */
	String instituteRelationOth
	/**
	 * Status level 3
	 */
	OrganizationOwnershipCl1 instituteOwner
	/**
	 * PII level P
	 * Status level 1
	 */
	String instituteOwnerOth
	/**
	 * Status level 1
	 */
	Integer instituteSize
	/**
	 * Status level 3
	 */
	OrganizationSizeUnitCl1 instituteUnit
	/**
	 * PII level P
	 * Status level 1
	 */
	String instituteUnitOth
	/**
	 * Status level 3
	 */
	InformationSourceCl2 instituteInfoSource
	/**
	 * PII level P
	 * Status level 1
	 */
	String instituteInfoSourceOth
	/**
	 * Status level 1
	 */
	String instituteInfoDate
	/**
	 * Status level 1
	 */
	String instituteInfoUpdate
	/**
	 * PII level P
	 * Status level 1
	 */
	String instituteComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		instituteId(nullable: false, minSize:1, maxSize:36)
		instituteType(nullable: false)
		instituteName(nullable: true, maxSize:255)
		instituteTypeOth(nullable: true, maxSize:255)
		instituteRelation(nullable: false)
		instituteRelationOth(nullable: true, maxSize:255)
		instituteOwner(nullable: false)
		instituteOwnerOth(nullable: true, maxSize:255)
		instituteSize(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		instituteUnit(nullable: false)
		instituteUnitOth(nullable: true, maxSize:255)
		instituteInfoSource(nullable: false)
		instituteInfoSourceOth(nullable: true, maxSize:255)
		instituteInfoDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		instituteInfoUpdate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		instituteComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'institution'
		psuId column:'psu_id'
		instituteId column:'institute_id'
		instituteType column:'institute_type'
		instituteName column:'institute_name'
		instituteTypeOth column:'institute_type_oth'
		instituteRelation column:'institute_relation'
		instituteRelationOth column:'institute_relation_oth'
		instituteOwner column:'institute_owner'
		instituteOwnerOth column:'institute_owner_oth'
		instituteSize column:'institute_size'
		instituteUnit column:'institute_unit'
		instituteUnitOth column:'institute_unit_oth'
		instituteInfoSource column:'institute_info_source'
		instituteInfoSourceOth column:'institute_info_source_oth'
		instituteInfoDate column:'institute_info_date'
		instituteInfoUpdate column:'institute_info_update'
		instituteComment column:'institute_comment'
		transactionType column:'transaction_type'
	}
}
