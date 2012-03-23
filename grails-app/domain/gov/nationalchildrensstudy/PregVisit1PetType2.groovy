package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1PetType2 {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String pv1PetTypeId
	/**
	 * Status level 2
	 */
	String pv1Id
	/**
	 * Status level 2
	 */
	PetTypeCl1 petType
	/**
	 * PII level P
	 * Status level 2
	 */
	String petTypeOth
	/**
	 * Status level 2
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1PetTypeId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		petType(nullable: false)
		petTypeOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_pet_type_2'
		psuId column:'psu_id'
		pv1PetTypeId column:'pv1_pet_type_id'
		pv1Id column:'pv1_id'
		petType column:'pet_type'
		petTypeOth column:'pet_type_oth'
		transactionType column:'transaction_type'
	}
}
