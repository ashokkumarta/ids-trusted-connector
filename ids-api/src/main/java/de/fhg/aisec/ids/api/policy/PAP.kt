/*-
 * ========================LICENSE_START=================================
 * ids-api
 * %%
 * Copyright (C) 2019 Fraunhofer AISEC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package de.fhg.aisec.ids.api.policy

import de.fhg.aisec.ids.api.router.RouteVerificationProof

/**
 * Policy Administration Point Interface.
 *
 * @author Julian Schütte (julian.schuette@aisec.fraunhofer.de)
 */
interface PAP {
    /**
     * Loads a policy into the registered PDPs.
     *
     * @param theory The policy theory to load
     */
    fun loadPolicy(theory: String)

    /**
     * Returns the currently active policy in its string representation.
     *
     *
     * The representation depends on the implementation and can be XML, JSON or any other
     * serialization.
     *
     * @return Active policy as prolog
     */
    val policy: String
    fun listRules(): List<String>
    fun verifyRoute(routeId: String): RouteVerificationProof?
}
