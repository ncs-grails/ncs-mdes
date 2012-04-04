package gov.nationalchildrensstudy

import javax.xml.stream.XMLStreamException
import javax.xml.stream.XMLStreamReader

/** Generated from Grails XSD plugin */
class SampleReceiptStore {

	Integer psuId
	String sampleId
	String srscId
	String staffId
	Integer sampleCondition
	String receiptCommentOth
	String receiptDt
	Integer coolerTempCond
	String equipId
	String placedInStorageDt
	Integer storageCompartmentArea
	String storageCommentOth
	String removedFromStorageDt
	Integer tempEventOccurred
	Integer tempEventAction
	String tempEventActionOth
	String transactionType
	public static final boolean DOMAIN_CLASS_FROM_XSD = true
	public static final String XSD_TABLE_NAME = "sample_receipt_store"

	public SampleReceiptStore(XMLStreamReader reader, boolean strict) {
		if (reader.startElement) {
			if (reader.localName() == XSD_TABLE_NAME) {
				// We're in the table, load the first column
				if ( reader.hasNext() ) { reader.next() }

				while ( reader.hasNext() ) {
					if ( reader.endElement ) {
						if (reader.localName() == XSD_TABLE_NAME) {
							break
						}
					} else if ( reader.startElement ) {
						String elementName = reader.localName()
						String elementText = reader.text()
						if ( elementText ) {
							switch ( elementName ) {

								case 'psu_id':
									psuId = elementText.toInteger()
									break
								case 'sample_id':
									sampleId = elementText
									break
								case 'srsc_id':
									srscId = elementText
									break
								case 'staff_id':
									staffId = elementText
									break
								case 'sample_condition':
									sampleCondition = elementText.toInteger()
									break
								case 'receipt_comment_oth':
									receiptCommentOth = elementText
									break
								case 'receipt_dt':
									receiptDt = elementText
									break
								case 'cooler_temp_cond':
									coolerTempCond = elementText.toInteger()
									break
								case 'equip_id':
									equipId = elementText
									break
								case 'placed_in_storage_dt':
									placedInStorageDt = elementText
									break
								case 'storage_compartment_area':
									storageCompartmentArea = elementText.toInteger()
									break
								case 'storage_comment_oth':
									storageCommentOth = elementText
									break
								case 'removed_from_storage_dt':
									removedFromStorageDt = elementText
									break
								case 'temp_event_occurred':
									tempEventOccurred = elementText.toInteger()
									break
								case 'temp_event_action':
									tempEventAction = elementText.toInteger()
									break
								case 'temp_event_action_oth':
									tempEventActionOth = elementText
									break
								case 'transaction_type':
									transactionType = elementText
									break
								default:
									if (strict) {
										throw new XMLStreamException(
											"malformed XML, unknown element: ${elementText}")
									} else {
										log.warn "Element: ${elementName} unknown, ignoring."
									}
									break
							}
						}
					}
					reader.next()
				}
			} else {
				throw new XMLStreamException("xml element did not start as ${XSD_TABLE_NAME}")
			}
		} else {
			throw new XMLStreamException("constructor must be passed the start element for the table in the XMLStreamReader")
		}
	}

	static constraints = {

		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		sampleId(nullable: false, minSize:1, maxSize:36)
		srscId(nullable: false, minSize:1, maxSize:36)
		staffId(nullable: false, minSize:1, maxSize:36)
		sampleCondition(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -5, -4])
		receiptCommentOth(nullable: true, maxSize:255)
		receiptDt(nullable: false, minSize:1, maxSize:19, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9]:[0-9][0-9])?")
		coolerTempCond(nullable: false, inList:[1, 2, 3, 4, -4])
		equipId(nullable: false, minSize:1, maxSize:36)
		placedInStorageDt(nullable: false, minSize:1, maxSize:16, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9])?")
		storageCompartmentArea(nullable: false, inList:[1, 2, -7, -4])
		storageCommentOth(nullable: true, maxSize:255)
		removedFromStorageDt(nullable: true, maxSize:16, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9])?")
		tempEventOccurred(nullable: false, inList:[1, -3, -4])
		tempEventAction(nullable: false, inList:[1, 2, -5, -4])
		tempEventActionOth(nullable: true, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'sample_receipt_store'

		psuId column:'psu_id'
		sampleId column:'sample_id'
		srscId column:'srsc_id'
		staffId column:'staff_id'
		sampleCondition column:'sample_condition'
		receiptCommentOth column:'receipt_comment_oth'
		receiptDt column:'receipt_dt'
		coolerTempCond column:'cooler_temp_cond'
		equipId column:'equip_id'
		placedInStorageDt column:'placed_in_storage_dt'
		storageCompartmentArea column:'storage_compartment_area'
		storageCommentOth column:'storage_comment_oth'
		removedFromStorageDt column:'removed_from_storage_dt'
		tempEventOccurred column:'temp_event_occurred'
		tempEventAction column:'temp_event_action'
		tempEventActionOth column:'temp_event_action_oth'
		transactionType column:'transaction_type'
	}
}
