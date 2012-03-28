package gov.nationalchildrensstudy

/** This is a bse class to be extended by any enumeration type */
abstract class XsdEnumerationDefinition {

	/** The numeric value assigned to this enumeration */
	Integer value
	/** The textual representation of this enumeration if available */
	String label
	/** The name of a master class for this enumeration if available */
	String masterClass
	/** The global value, if any */
	String globalValue
	/** Description of this class, if 'desc' is defined */
	String description

	static constraints = {
		value(index:'ix_value')
		label(maxLength:255)
		masterClass(nullable:true, maxLength:255)
		globalValue(nullable:true, maxLength:255)
		description(nullable:true, maxLength:255)
	}
	static mapping = {
		table 'xsd_enumeration_definition'
		version false
		masterClass column: 'master_cl'
	}
}
