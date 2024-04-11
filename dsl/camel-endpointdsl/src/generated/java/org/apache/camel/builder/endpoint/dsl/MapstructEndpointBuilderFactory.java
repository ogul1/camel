/* Generated by camel build tools - do NOT edit this file! */
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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Type Conversion using Mapstruct
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MapstructEndpointBuilderFactory {

    /**
     * Builder for endpoint for the MapStruct component.
     */
    public interface MapstructEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedMapstructEndpointBuilder advanced() {
            return (AdvancedMapstructEndpointBuilder) this;
        }

        /**
         * Whether there must exist a mapstruct converter to convert to the
         * POJO.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param mandatory the value to set
         * @return the dsl builder
         */
        default MapstructEndpointBuilder mandatory(boolean mandatory) {
            doSetProperty("mandatory", mandatory);
            return this;
        }
        /**
         * Whether there must exist a mapstruct converter to convert to the
         * POJO.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param mandatory the value to set
         * @return the dsl builder
         */
        default MapstructEndpointBuilder mandatory(String mandatory) {
            doSetProperty("mandatory", mandatory);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the MapStruct component.
     */
    public interface AdvancedMapstructEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MapstructEndpointBuilder basic() {
            return (MapstructEndpointBuilder) this;
        }

        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedMapstructEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedMapstructEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface MapstructBuilders {
        /**
         * MapStruct (camel-mapstruct)
         * Type Conversion using Mapstruct
         * 
         * Category: transformation
         * Since: 3.19
         * Maven coordinates: org.apache.camel:camel-mapstruct
         * 
         * Syntax: <code>mapstruct:className</code>
         * 
         * Path parameter: className (required)
         * The fully qualified class name of the POJO that mapstruct should
         * convert to (target)
         * 
         * @param path className
         * @return the dsl builder
         */
        default MapstructEndpointBuilder mapstruct(String path) {
            return MapstructEndpointBuilderFactory.endpointBuilder("mapstruct", path);
        }
        /**
         * MapStruct (camel-mapstruct)
         * Type Conversion using Mapstruct
         * 
         * Category: transformation
         * Since: 3.19
         * Maven coordinates: org.apache.camel:camel-mapstruct
         * 
         * Syntax: <code>mapstruct:className</code>
         * 
         * Path parameter: className (required)
         * The fully qualified class name of the POJO that mapstruct should
         * convert to (target)
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path className
         * @return the dsl builder
         */
        default MapstructEndpointBuilder mapstruct(String componentName, String path) {
            return MapstructEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    static MapstructEndpointBuilder endpointBuilder(String componentName, String path) {
        class MapstructEndpointBuilderImpl extends AbstractEndpointBuilder implements MapstructEndpointBuilder, AdvancedMapstructEndpointBuilder {
            public MapstructEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new MapstructEndpointBuilderImpl(path);
    }
}