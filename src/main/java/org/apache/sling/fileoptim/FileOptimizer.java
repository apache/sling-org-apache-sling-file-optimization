/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.fileoptim;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * Interface for File Optimizers to extend to implement
 */
@ConsumerType
public interface FileOptimizer {

    /**
     * Optimize a single file.
     * 
     * @param original the original file to optimize
     * @param metaType the type of the file to optimize
     * @return the optimized file
     */
    @Nullable
    byte[] optimizeFile(byte[] original, String metaType);

    /**
     * Gets the name of the optimizer
     * 
     * @return the name of the optimizer
     */
    @NotNull
    String getName();

}
