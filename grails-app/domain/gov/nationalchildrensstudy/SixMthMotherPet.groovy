package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SixMthMotherPet {

	/**
	 * Status level 1
	 */
	PsuCl1 psuId
	/**
	 * Status level 1
	 */
	String sixMthId
	/**
	 * Status level 1
	 */
	String sixMthPetId
	/**
	 * Status level 3
	 */
	PetTypeCl1 petType
	/**
	 * PII level P
	 * Status level 1
	 */
	String petTypeOth
	/**
	 * Status level 1
	 */
	String transactionType

	static constraints = {
		psuId(nullable: false)
		sixMthId(nullable: false, minSize:1, maxSize:36)
		sixMthPetId(nullable: false, minSize:1, maxSize:36)
		petType(nullable: false)
		petTypeOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'six_mth_mother_pet'
		psuId column:'psu_id'
		sixMthId column:'six_mth_id'
		sixMthPetId column:'six_mth_pet_id'
		petType column:'pet_type'
		petTypeOth column:'pet_type_oth'
		transactionType column:'transaction_type'
	}
}
