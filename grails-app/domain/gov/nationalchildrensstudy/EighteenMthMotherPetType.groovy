package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class EighteenMthMotherPetType {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String eighteenMthMotherId
	/**
	 * Status level 2
	 */
	String eighteenMthMotherPetTypeId
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
		eighteenMthMotherId(nullable: false, minSize:1, maxSize:36)
		eighteenMthMotherPetTypeId(nullable: false, minSize:1, maxSize:36)
		petType(nullable: false)
		petTypeOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'eighteen_mth_mother_pet_type'
		psuId column:'psu_id'
		eighteenMthMotherId column:'eighteen_mth_mother_id'
		eighteenMthMotherPetTypeId column:'eighteen_mth_mother_pet_type_id'
		petType column:'pet_type'
		petTypeOth column:'pet_type_oth'
		transactionType column:'transaction_type'
	}
}
