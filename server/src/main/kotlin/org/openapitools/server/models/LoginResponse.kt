/**
* WhoseHouse
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models


/**
 * 
 * @param userId 
 * @param username 
 * @param firstName 
 * @param lastName 
 * @param permissions 
 * @param locale 
 */
data class LoginResponse (
    val userId: kotlin.Long,
    val username: kotlin.String,
    val firstName: kotlin.String,
    val lastName: kotlin.String,
    val permissions: kotlin.Array<kotlin.Any>,
    val locale: kotlin.String? = null
) 

