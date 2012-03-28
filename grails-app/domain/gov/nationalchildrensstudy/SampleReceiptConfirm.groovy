package gov.nationalchildrensstudy

/** Generated from Grails XSD plugin */
class SampleReceiptConfirm {

	Integer psuId
	String srscId
	Integer shipmentReceiptConfirmed
	String shipperId
	String shipmentTrackingNo
	String shipmentReceiptDt
	Integer shipmentCondition
	String shipmentDamagedReason
	String sampleId
	BigDecimal sampleReceiptTemp
	Integer sampleCondition
	String shipmentReceivedBy
	String transactionType

	static constraints = {
		psuId(nullable: false, inList:[20000054, 20000032, 20000032, 20000032, 20000032, 20000016, 20000039, 20000200, 20000028, 20000063, 20000067, 20000201, 20000202, 20000203, 20000090, 20000083, 20000204, 20000205, 20000042, 20000037, 20000206, 20000040, 20000207, 20000208, 20000209, 20000091, 20000210, 20000069, 20000211, 20000094, 20000212, 20000213, 20000102, 20000214, 20000215, 20000044, 20000216, 20000216, 20000216, 20000030, 20000217, 20000218, 20000218, 20000218, 20000219, 20000220, 20000221, 20000092, 20000222, 20000223, 20000224, 20000225, 20000225, 20000088, 20000087, 20000226, 20000103, 20000227, 20000228, 20000229, 20000230, 20000231, 20000232, 20000025, 20000233, 20000233, 20000233, 20000048, 20000234, 20000235, 20000050, 20000236, 20000035, 20000237, 20000238, 20000239, 20000240, 20000052, 20000241, 20000243, 20000244, 20000245, 20000246, 20000247, 20000248, 20000113, 20000249, 20000250, 20000251, 20000086, 20000252, 20000253, 20000254, 20000255, 20000256, 20000018, 20000058, 20000014, 20000257, 20000258, 20000259, 20000259, 20000098, 20000060, 20000260, 20000260, 20000260, 20000260, 20000261, 20000262, 20000263, 20000097, 20000264, 20000264, 20000265, 20000062, 20000117, 20000266, 20000267, 20000268, 20000269, 20000270, 20000271, 20000272, 20000273, -4, 20000000])
		srscId(nullable: false, minSize:1, maxSize:36)
		shipmentReceiptConfirmed(nullable: false, inList:[1, 2, -7, -4])
		shipperId(nullable: false, minSize:1, maxSize:36)
		shipmentTrackingNo(nullable: false, minSize:1, maxSize:36)
		shipmentReceiptDt(nullable: false, minSize:1, maxSize:16, matches:"([0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]T[0-9][0-9]:[0-9][0-9])?")
		shipmentCondition(nullable: false, inList:[1, 2, -4])
		shipmentDamagedReason(nullable: true, maxSize:255)
		sampleId(nullable: false, minSize:1, maxSize:36)
		sampleReceiptTemp(nullable: false)
		sampleCondition(nullable: false, inList:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -5, -4])
		shipmentReceivedBy(nullable: false, minSize:1, maxSize:255)
		transactionType(nullable: true, maxSize:36)
	}
	static mapping = {
		table 'sample_receipt_confirm'
		psuId column:'psu_id'
		srscId column:'srsc_id'
		shipmentReceiptConfirmed column:'shipment_receipt_confirmed'
		shipperId column:'shipper_id'
		shipmentTrackingNo column:'shipment_tracking_no'
		shipmentReceiptDt column:'shipment_receipt_dt'
		shipmentCondition column:'shipment_condition'
		shipmentDamagedReason column:'shipment_damaged_reason'
		sampleId column:'sample_id'
		sampleReceiptTemp column:'sample_receipt_temp'
		sampleCondition column:'sample_condition'
		shipmentReceivedBy column:'shipment_received_by'
		transactionType column:'transaction_type'
	}
}
