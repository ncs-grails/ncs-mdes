package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class IncidentMedia {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String incidentMediaId
	/**
	 * Status level 1
	 */
	String incidentId
	/**
	 * Status level 3
	 */
	MediaTypeCl1 inclossMedia
	/**
	 * PII level P
	 * Status level 1
	 */
	String inclossMediaOth
	/**
	 * Status level 3
	 */
	IncidentConsequenceCl1 inssev
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		incidentMediaId(nullable: false, minSize:1, maxSize:36)
		incidentId(nullable: false, minSize:1, maxSize:36)
		inclossMedia(nullable: false)
		inclossMediaOth(nullable: true, maxSize:255)
		inssev(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'incident_media'
		psuId column:'psu_id'
		incidentMediaId column:'incident_media_id'
		incidentId column:'incident_id'
		inclossMedia column:'incloss_media'
		inclossMediaOth column:'incloss_media_oth'
		inssev column:'inssev'
		transactionType column:'transaction_type'
	}
}
