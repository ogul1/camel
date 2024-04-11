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
 * Send requests to SAP NetWeaver Gateway using HTTP.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NetWeaverEndpointBuilderFactory {

    /**
     * Builder for endpoint for the SAP NetWeaver component.
     */
    public interface NetWeaverEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedNetWeaverEndpointBuilder advanced() {
            return (AdvancedNetWeaverEndpointBuilder) this;
        }

        /**
         * If the JSON Map contains only a single entry, then flattern by
         * storing that single entry value as the message body.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param flatternMap the value to set
         * @return the dsl builder
         */
        default NetWeaverEndpointBuilder flatternMap(boolean flatternMap) {
            doSetProperty("flatternMap", flatternMap);
            return this;
        }
        /**
         * If the JSON Map contains only a single entry, then flattern by
         * storing that single entry value as the message body.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param flatternMap the value to set
         * @return the dsl builder
         */
        default NetWeaverEndpointBuilder flatternMap(String flatternMap) {
            doSetProperty("flatternMap", flatternMap);
            return this;
        }
        /**
         * Whether to return data in JSON format. If this option is false, then
         * XML is returned in Atom format.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param json the value to set
         * @return the dsl builder
         */
        default NetWeaverEndpointBuilder json(boolean json) {
            doSetProperty("json", json);
            return this;
        }
        /**
         * Whether to return data in JSON format. If this option is false, then
         * XML is returned in Atom format.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param json the value to set
         * @return the dsl builder
         */
        default NetWeaverEndpointBuilder json(String json) {
            doSetProperty("json", json);
            return this;
        }
        /**
         * To transform the JSON from a String to a Map in the message body.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param jsonAsMap the value to set
         * @return the dsl builder
         */
        default NetWeaverEndpointBuilder jsonAsMap(boolean jsonAsMap) {
            doSetProperty("jsonAsMap", jsonAsMap);
            return this;
        }
        /**
         * To transform the JSON from a String to a Map in the message body.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param jsonAsMap the value to set
         * @return the dsl builder
         */
        default NetWeaverEndpointBuilder jsonAsMap(String jsonAsMap) {
            doSetProperty("jsonAsMap", jsonAsMap);
            return this;
        }
        /**
         * Password for account.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default NetWeaverEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username for account.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default NetWeaverEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the SAP NetWeaver component.
     */
    public interface AdvancedNetWeaverEndpointBuilder
            extends
                EndpointProducerBuilder {
        default NetWeaverEndpointBuilder basic() {
            return (NetWeaverEndpointBuilder) this;
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
        default AdvancedNetWeaverEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default AdvancedNetWeaverEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface NetWeaverBuilders {
        /**
         * SAP NetWeaver (camel-sap-netweaver)
         * Send requests to SAP NetWeaver Gateway using HTTP.
         * 
         * Category: saas
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-sap-netweaver
         * 
         * @return the dsl builder for the headers' name.
         */
        default NetWeaverHeaderNameBuilder sapNetweaver() {
            return NetWeaverHeaderNameBuilder.INSTANCE;
        }
        /**
         * SAP NetWeaver (camel-sap-netweaver)
         * Send requests to SAP NetWeaver Gateway using HTTP.
         * 
         * Category: saas
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-sap-netweaver
         * 
         * Syntax: <code>sap-netweaver:url</code>
         * 
         * Path parameter: url (required)
         * Url to the SAP net-weaver gateway server.
         * 
         * @param path url
         * @return the dsl builder
         */
        default NetWeaverEndpointBuilder sapNetweaver(String path) {
            return NetWeaverEndpointBuilderFactory.endpointBuilder("sap-netweaver", path);
        }
        /**
         * SAP NetWeaver (camel-sap-netweaver)
         * Send requests to SAP NetWeaver Gateway using HTTP.
         * 
         * Category: saas
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-sap-netweaver
         * 
         * Syntax: <code>sap-netweaver:url</code>
         * 
         * Path parameter: url (required)
         * Url to the SAP net-weaver gateway server.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path url
         * @return the dsl builder
         */
        default NetWeaverEndpointBuilder sapNetweaver(String componentName, String path) {
            return NetWeaverEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the SAP NetWeaver component.
     */
    public static class NetWeaverHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final NetWeaverHeaderNameBuilder INSTANCE = new NetWeaverHeaderNameBuilder();

        /**
         * The command to execute in
         * http://msdn.microsoft.com/en-us/library/cc956153.aspxMS ADO.Net Data
         * Service format.
         * 
         * The option is a: {@code String} type.
         * 
         * Required: true
         * Group: producer
         * 
         * @return the name of the header {@code NetWeaverCommand}.
         */
        public String netWeaverCommand() {
            return "CamelNetWeaverCommand";
        }
        /**
         * The http path.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code HttpPath}.
         */
        public String httpPath() {
            return "CamelHttpPath";
        }
        /**
         * The media type.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code Accept}.
         */
        public String accept() {
            return "Accept";
        }
    }
    static NetWeaverEndpointBuilder endpointBuilder(String componentName, String path) {
        class NetWeaverEndpointBuilderImpl extends AbstractEndpointBuilder implements NetWeaverEndpointBuilder, AdvancedNetWeaverEndpointBuilder {
            public NetWeaverEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new NetWeaverEndpointBuilderImpl(path);
    }
}