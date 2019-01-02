/*
 * Copyright 2017-2019 the original author or authors.
 *
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
 */
package org.springframework.data.util.nonnull;

import javax.annotation.meta.When;

import org.springframework.lang.Nullable;

/**
 * @author Mark Paluch
 */
public interface NullableAnnotatedType {

	String nonNullMethod(String parameter);

	@Nullable
	String nullableReturn();

	@javax.annotation.Nullable
	String jsr305NullableReturn();

	@javax.annotation.Nonnull(when = When.MAYBE)
	String jsr305NullableReturnWhen();
}
