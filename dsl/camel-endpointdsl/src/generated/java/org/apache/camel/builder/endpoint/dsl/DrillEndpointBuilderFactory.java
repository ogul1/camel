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
 * Perform queries against an Apache Drill cluster.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DrillEndpointBuilderFactory {

    /**
     * Builder for endpoint for the Drill component.
     */
    public interface DrillEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDrillEndpointBuilder advanced() {
            return (AdvancedDrillEndpointBuilder) this;
        }

        /**
         * Cluster ID
         * https://drill.apache.org/docs/using-the-jdbc-driver/#determining-the-cluster-id.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param clusterId the value to set
         * @return the dsl builder
         */
        default DrillEndpointBuilder clusterId(String clusterId) {
            doSetProperty("clusterId", clusterId);
            return this;
        }
        /**
         * Drill directory.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param directory the value to set
         * @return the dsl builder
         */
        default DrillEndpointBuilder directory(String directory) {
            doSetProperty("directory", directory);
            return this;
        }
        /**
         * Connection mode: zk: Zookeeper drillbit: Drillbit direct connection
         * https://drill.apache.org/docs/using-the-jdbc-driver/.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.drill.DrillConnectionMode&lt;/code&gt; type.
         * 
         * Default: ZK
         * Group: producer
         * 
         * @param mode the value to set
         * @return the dsl builder
         */
        default DrillEndpointBuilder mode(org.apache.camel.component.drill.DrillConnectionMode mode) {
            doSetProperty("mode", mode);
            return this;
        }
        /**
         * Connection mode: zk: Zookeeper drillbit: Drillbit direct connection
         * https://drill.apache.org/docs/using-the-jdbc-driver/.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.drill.DrillConnectionMode&lt;/code&gt; type.
         * 
         * Default: ZK
         * Group: producer
         * 
         * @param mode the value to set
         * @return the dsl builder
         */
        default DrillEndpointBuilder mode(String mode) {
            doSetProperty("mode", mode);
            return this;
        }
        /**
         * Port number.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 2181
         * Group: producer
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default DrillEndpointBuilder port(Integer port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Port number.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 2181
         * Group: producer
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default DrillEndpointBuilder port(String port) {
            doSetProperty("port", port);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Drill component.
     */
    public interface AdvancedDrillEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DrillEndpointBuilder basic() {
            return (DrillEndpointBuilder) this;
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
        default AdvancedDrillEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default AdvancedDrillEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface DrillBuilders {
        /**
         * Drill (camel-drill)
         * Perform queries against an Apache Drill cluster.
         * 
         * Category: database,bigdata
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-drill
         * 
         * @return the dsl builder for the headers' name.
         */
        default DrillHeaderNameBuilder drill() {
            return DrillHeaderNameBuilder.INSTANCE;
        }
        /**
         * Drill (camel-drill)
         * Perform queries against an Apache Drill cluster.
         * 
         * Category: database,bigdata
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-drill
         * 
         * Syntax: <code>drill:host</code>
         * 
         * Path parameter: host (required)
         * Host name or IP address
         * 
         * @param path host
         * @return the dsl builder
         */
        default DrillEndpointBuilder drill(String path) {
            return DrillEndpointBuilderFactory.endpointBuilder("drill", path);
        }
        /**
         * Drill (camel-drill)
         * Perform queries against an Apache Drill cluster.
         * 
         * Category: database,bigdata
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-drill
         * 
         * Syntax: <code>drill:host</code>
         * 
         * Path parameter: host (required)
         * Host name or IP address
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host
         * @return the dsl builder
         */
        default DrillEndpointBuilder drill(String componentName, String path) {
            return DrillEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the Drill component.
     */
    public static class DrillHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final DrillHeaderNameBuilder INSTANCE = new DrillHeaderNameBuilder();

        /**
         * The drill query.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DrillQuery}.
         */
        public String drillQuery() {
            return "CamelDrillQuery";
        }
    }
    static DrillEndpointBuilder endpointBuilder(String componentName, String path) {
        class DrillEndpointBuilderImpl extends AbstractEndpointBuilder implements DrillEndpointBuilder, AdvancedDrillEndpointBuilder {
            public DrillEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DrillEndpointBuilderImpl(path);
    }
}