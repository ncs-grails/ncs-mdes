package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TwentyFourMthPetType {

	/**
	 * Status level 2
	 */
	PsuCl1 psuId
	/**
	 * Status level 2
	 */
	String twentyFourMthId
	/**
	 * Status level 2
	 */
	String twentyFourMthPetTypeId
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
		twentyFourMthId(nullable: false, minSize:1, maxSize:36)
		twentyFourMthPetTypeId(nullable: false, minSize:1, maxSize:36)
		petType(nullable: false)
		petTypeOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'twenty_four_mth_pet_type'
		psuId column:'psu_id'
		twentyFourMthId column:'twenty_four_mth_id'
		twentyFourMthPetTypeId column:'twenty_four_mth_pet_type_id'
		petType column:'pet_type'
		petTypeOth column:'pet_type_oth'
		transactionType column:'transaction_type'
	}
}
