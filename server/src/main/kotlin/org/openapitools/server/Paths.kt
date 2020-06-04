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
package org.openapitools.server

import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location

object Paths {
    /**
     * Get a list of all groups of logged in user
     * 
     * @param userId User ID 
     */
    @KtorExperimentalLocationsAPI
    @Location("/{userId}/groups") class groups(val userId: kotlin.Long)

}
