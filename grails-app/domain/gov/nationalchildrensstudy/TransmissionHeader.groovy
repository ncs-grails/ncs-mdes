package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class TransmissionHeader {

	StudyCenterCl1 scId
	PsuCl1 psuId
	String specificationVersion
	Boolean isSnapshot

	static constraints = {
		scId(nullable: false)
		psuId(nullable: false)
		specificationVersion(nullable: false)
		isSnapshot(nullable: false)
	}
	static mapping = {
		table 'transmission_header'
		scId column:'sc_id'
		psuId column:'psu_id'
		specificationVersion column:'specification_version'
		isSnapshot column:'is_snapshot'
	}
}
