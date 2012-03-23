package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class InternetUsageParticipate {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String internetUsageId
	/**
	 * Status level 2
	 */
	String internetUsageParticipateId
	/**
	 * Status level 2
	 */
	ContactTypeCl6 ableParticipate
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		internetUsageId(nullable: false, minSize:1, maxSize:36)
		internetUsageParticipateId(nullable: false, minSize:1, maxSize:36)
		ableParticipate(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'internet_usage_participate'
		psuId column:'psu_id'
		internetUsageId column:'internet_usage_id'
		internetUsageParticipateId column:'internet_usage_participate_id'
		ableParticipate column:'able_participate'
		transactionType column:'transaction_type'
	}
}
