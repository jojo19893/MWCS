/*
 * Generated by asn1c-0.9.22 (http://lionet.info/asn1c)
 * From ASN.1 module "Protocol"
 * 	found in "module.asn1"
 * 	`asn1c -S/skeletons`
 */

#ifndef	_Request_H_
#define	_Request_H_


#include <asn_application.h>

/* Including external dependencies */
#include <NativeInteger.h>
#include <constr_SEQUENCE.h>

#ifdef __cplusplus
extern "C" {
#endif

/* Request */
typedef struct Request {
	long	 value;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} Request_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_Request;

#ifdef __cplusplus
}
#endif

#endif	/* _Request_H_ */
