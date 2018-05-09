/*
 * Copyright 2017 the original author or authors.
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

package org.gradle.api.artifacts;

import org.gradle.api.Action;

/**
 * Describes a metadata about a dependency - direct dependency or dependency constraint - declared in a resolved component's metadata.
 *
 * @param <SELF> type extending this interface
 * @since 4.4
 */
public interface DependencyMetadata<SELF extends DependencyMetadata> {

    /**
     * Returns the group of the module that is targeted by this dependency or dependency constraint.
     * The group allows the definition of modules of the same name in different organizations or contexts.
     */
    String getGroup();

    /**
     * Returns the name of the module that is targeted by this dependency or dependency constraint.
     */
    String getName();

    /**
     * Returns the version of the module that is targeted by this dependency or dependency constraint.
     * which usually expresses what API level of the module you are compatible with.
     *
     * @since 4.5
     */
    VersionConstraint getVersionConstraint();

    /**
     * Adjust the version constraints of the dependency or dependency constraint.
     *
     * @param configureAction modify version details
     * @since 4.5
     */
    SELF version(Action<? super MutableVersionConstraint> configureAction);
}
