package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class PregVisit1PetType {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String pv1PetTypeId
	/**
	 * Status level 1
	 */
	String pv1Id
	/**
	 * Status level 3
	 */
	PetTypeCl1 petType
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		pv1PetTypeId(nullable: false, minSize:1, maxSize:36)
		pv1Id(nullable: false, minSize:1, maxSize:36)
		petType(nullable: false)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'preg_visit_1_pet_type'
		psuId column:'psu_id'
		pv1PetTypeId column:'pv1_pet_type_id'
		pv1Id column:'pv1_id'
		petType column:'pet_type'
		transactionType column:'transaction_type'
	}
}
