/*
 * Copyright 2015 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.processors.tools.outputter;

import java.util.Collection;

import com.google.common.collect.ImmutableList;
import com.gwtplatform.processors.tools.domain.HasImports;

public class CodeSnippet implements HasImports {
    private final String code;
    private final Collection<String> imports;

    public CodeSnippet(
            String code,
            Collection<String> imports) {
        this.code = code;
        this.imports = ImmutableList.copyOf(imports);
    }

    public String getCode() {
        return code;
    }

    @Override
    public Collection<String> getImports() {
        return imports;
    }
}
