package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class StaffLanguage {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String staffLanguageId
	/**
	 * Status level 1
	 */
	String staffId
	/**
	 * Status level 1
	 */
	LanguageCl2 staffLang
	/**
	 * PII level P
	 * Status level 1
	 */
	String staffLangOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		staffLanguageId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		staffLang(nullable: false)
		staffLangOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'staff_language'
		psuId column:'psu_id'
		staffLanguageId column:'staff_language_id'
		staffId column:'staff_id'
		staffLang column:'staff_lang'
		staffLangOth column:'staff_lang_oth'
		transactionType column:'transaction_type'
	}
}
