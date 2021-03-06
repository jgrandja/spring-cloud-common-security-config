/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.common.security.support;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Gunnar Hillert
 *
 * @since 1.3.0
 *
 */
public interface AuthoritiesMapper {

	/**
	 * Map the provided Scopes to authorities.
	 *
	 * @param providerId If null, then the default providerId is used
	 * @param scopes the scopes to map
	 * @param token some implementation may need to make additional requests
	 *
	 * @return the mapped authorities
	 */
	Set<GrantedAuthority> mapScopesToAuthorities(String providerId, Set<String> scopes, String token);

}
