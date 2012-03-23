package gov.nationalchildrensstudy

/** Participant Pregnancy trying  status */
class PregnancyTryingStatusCl4 {

	/** The numeric code for this enumeration */
	Integer value
	/** Textual representation of this value */
	String label
	/** The name of the Master Class for this enumeration */
	String masterClass
	/** The global value, if any */
	String globalValue
	/** Description of class */
	String description

	static constraints = {
		value(index:'ix_value')
		label(maxLength:255)
		masterClass(nullable:true, maxLength:255)
		globalValue(nullable:true, maxLength:255)
		description(nullable:true, maxLength:255)
	}
	static mapping = {
		table 'pregnancy_trying_status_cl4'
		masterClass column: 'master_cl'
		description column: 'desc'
	}
}
