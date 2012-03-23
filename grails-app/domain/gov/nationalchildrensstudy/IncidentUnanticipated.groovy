package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class IncidentUnanticipated {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String incUnanticipatedId
	/**
	 * Status level 1
	 */
	String incidentId
	/**
	 * Status level 3
	 */
	IncUnanticipatedCl1 incUnanticipated
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		incUnanticipatedId(nullable: false, minSize:1, maxSize:36)
		incidentId(nullable: false, minSize:1, maxSize:36)
		incUnanticipated(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'incident_unanticipated'
		psuId column:'psu_id'
		incUnanticipatedId column:'inc_unanticipated_id'
		incidentId column:'incident_id'
		incUnanticipated column:'inc_unanticipated'
		transactionType column:'transaction_type'
	}
}
