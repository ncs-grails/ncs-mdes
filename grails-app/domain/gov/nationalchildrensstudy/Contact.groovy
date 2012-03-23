package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class Contact {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String contactId
	/**
	 * Status level 1
	 */
	Integer contactDisp
	/**
	 * Status level 3
	 */
	ContactTypeCl1 contactType
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactTypeOth
	/**
	 * Status level 1
	 */
	String contactDate
	/**
	 * Status level 1
	 */
	String contactStartTime
	/**
	 * Status level 1
	 */
	String contactEndTime
	/**
	 * Status level 3
	 */
	LanguageCl2 contactLang
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactLangOth
	/**
	 * Status level 3
	 */
	TranslationMethodCl3 contactInterpret
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactInterpretOth
	/**
	 * Status level 3
	 */
	ContactLocationCl1 contactLocation
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactLocationOth
	/**
	 * Status level 3
	 */
	ConfirmTypeCl2 contactPrivate
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactPrivateDetail
	/**
	 * Status level 1
	 */
	BigDecimal contactDistance
	/**
	 * Status level 3
	 */
	ContactedPersonCl1 whoContacted
	/**
	 * PII level P
	 * Status level 1
	 */
	String whoContactOth
	/**
	 * PII level P
	 * Status level 1
	 */
	String contactComment
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		contactId(nullable: false, minSize:1, maxSize:36)
		contactDisp(nullable: true, matches:"([-+]?[\\d]{1,9})?")
		contactType(nullable: false)
		contactTypeOth(nullable: true, maxSize:255)
		contactDate(nullable: true, maxSize:10, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9])?")
		contactStartTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		contactEndTime(nullable: true, maxSize:5, matches:"([0-9][0-9]:[0-9][0-9])?")
		contactLang(nullable: false)
		contactLangOth(nullable: true, maxSize:255)
		contactInterpret(nullable: false)
		contactInterpretOth(nullable: true, maxSize:255)
		contactLocation(nullable: false)
		contactLocationOth(nullable: true, maxSize:255)
		contactPrivate(nullable: false)
		contactPrivateDetail(nullable: true, maxSize:255)
		contactDistance(nullable: true, matches:"(([-+]?\\d{1,12})|([-+]?\\d{0,12}\\.\\d{1,6})|(\\d{0,12}\\.\\d{1,6})|([-+]?\\d{1,12}\\.\\d{0,6}))?")
		whoContacted(nullable: false)
		whoContactOth(nullable: true, maxSize:255)
		contactComment(nullable: true, maxSize:8000)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'contact'
		psuId column:'psu_id'
		contactId column:'contact_id'
		contactDisp column:'contact_disp'
		contactType column:'contact_type'
		contactTypeOth column:'contact_type_oth'
		contactDate column:'contact_date'
		contactStartTime column:'contact_start_time'
		contactEndTime column:'contact_end_time'
		contactLang column:'contact_lang'
		contactLangOth column:'contact_lang_oth'
		contactInterpret column:'contact_interpret'
		contactInterpretOth column:'contact_interpret_oth'
		contactLocation column:'contact_location'
		contactLocationOth column:'contact_location_oth'
		contactPrivate column:'contact_private'
		contactPrivateDetail column:'contact_private_detail'
		contactDistance column:'contact_distance'
		whoContacted column:'who_contacted'
		whoContactOth column:'who_contact_oth'
		contactComment column:'contact_comment'
		transactionType column:'transaction_type'
	}
}
