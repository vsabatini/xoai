/**
 * Copyright 2012 Lyncode
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lyncode.xoai.dataprovider.data.internal;

import javax.xml.transform.Transformer;

/**

 * @version 3.1.0
 */
public class MetadataFormat extends MetadataFormatSuper {
    private Transformer xsltTransformer;
    public MetadataFormat(String prefix, Transformer transformer, String namespace, String schemaLocation) {
        this.prefix = prefix;
        this.xsltTransformer = transformer;
        this.namespace = namespace;
        this.schemaLocation = schemaLocation;
    }

    public Transformer getTransformer() {
        return xsltTransformer;
    }
}
