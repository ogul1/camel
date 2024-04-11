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
 * Perform operations on the Milvus Vector Database.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MilvusEndpointBuilderFactory {

    /**
     * Builder for endpoint for the Milvus component.
     */
    public interface MilvusEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedMilvusEndpointBuilder advanced() {
            return (AdvancedMilvusEndpointBuilder) this;
        }

        /**
         * The host to connect to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: localhost
         * Group: producer
         * 
         * @param host the value to set
         * @return the dsl builder
         */
        default MilvusEndpointBuilder host(String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * The port to connect to.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 19530
         * Group: producer
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default MilvusEndpointBuilder port(int port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * The port to connect to.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 19530
         * Group: producer
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default MilvusEndpointBuilder port(String port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Sets a default timeout for all requests.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default MilvusEndpointBuilder timeout(long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Sets a default timeout for all requests.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default MilvusEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Sets the API key to use for authentication.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param token the value to set
         * @return the dsl builder
         */
        default MilvusEndpointBuilder token(String token) {
            doSetProperty("token", token);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Milvus component.
     */
    public interface AdvancedMilvusEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MilvusEndpointBuilder basic() {
            return (MilvusEndpointBuilder) this;
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
        default AdvancedMilvusEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default AdvancedMilvusEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface MilvusBuilders {
        /**
         * Milvus (camel-milvus)
         * Perform operations on the Milvus Vector Database.
         * 
         * Category: database,ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-milvus
         * 
         * @return the dsl builder for the headers' name.
         */
        default MilvusHeaderNameBuilder milvus() {
            return MilvusHeaderNameBuilder.INSTANCE;
        }
        /**
         * Milvus (camel-milvus)
         * Perform operations on the Milvus Vector Database.
         * 
         * Category: database,ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-milvus
         * 
         * Syntax: <code>milvus:collection</code>
         * 
         * Path parameter: collection (required)
         * The collection Name
         * 
         * @param path collection
         * @return the dsl builder
         */
        default MilvusEndpointBuilder milvus(String path) {
            return MilvusEndpointBuilderFactory.endpointBuilder("milvus", path);
        }
        /**
         * Milvus (camel-milvus)
         * Perform operations on the Milvus Vector Database.
         * 
         * Category: database,ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-milvus
         * 
         * Syntax: <code>milvus:collection</code>
         * 
         * Path parameter: collection (required)
         * The collection Name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path collection
         * @return the dsl builder
         */
        default MilvusEndpointBuilder milvus(String componentName, String path) {
            return MilvusEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the Milvus component.
     */
    public static class MilvusHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final MilvusHeaderNameBuilder INSTANCE = new MilvusHeaderNameBuilder();

        /**
         * The action to be performed.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code MilvusAction}.
         */
        public String milvusAction() {
            return "CamelMilvusAction";
        }
        /**
         * Operation Status.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code MilvusOperationStatus}.
         */
        public String milvusOperationStatus() {
            return "CamelMilvusOperationStatus";
        }
        /**
         * Operation Status Value.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code MilvusOperationStatusValue}.
         */
        public String milvusOperationStatusValue() {
            return "CamelMilvusOperationStatusValue";
        }
        /**
         * Text Field Name for Insert/Upsert operation.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code MilvusTextFieldName}.
         */
        public String milvusTextFieldName() {
            return "CamelMilvusTextFieldName";
        }
        /**
         * Vector Field Name for Insert/Upsert operation.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code MilvusVectorFieldName}.
         */
        public String milvusVectorFieldName() {
            return "CamelMilvusVectorFieldName";
        }
        /**
         * Collection Name for Insert/Upsert operation.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code MilvusCollectionName}.
         */
        public String milvusCollectionName() {
            return "CamelMilvusCollectionName";
        }
    }
    static MilvusEndpointBuilder endpointBuilder(String componentName, String path) {
        class MilvusEndpointBuilderImpl extends AbstractEndpointBuilder implements MilvusEndpointBuilder, AdvancedMilvusEndpointBuilder {
            public MilvusEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new MilvusEndpointBuilderImpl(path);
    }
}