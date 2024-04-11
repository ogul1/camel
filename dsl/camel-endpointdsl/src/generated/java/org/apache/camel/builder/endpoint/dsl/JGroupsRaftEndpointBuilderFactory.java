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
 * Exchange messages with JGroups-raft clusters.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JGroupsRaftEndpointBuilderFactory {

    /**
     * Builder for endpoint consumers for the JGroups raft component.
     */
    public interface JGroupsRaftEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedJGroupsRaftEndpointConsumerBuilder advanced() {
            return (AdvancedJGroupsRaftEndpointConsumerBuilder) this;
        }
        /**
         * If set to true, the consumer endpoint will receive roleChange event
         * as well (not just connecting and/or using the state machine). By
         * default it is set to false.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param enableRoleChangeEvents the value to set
         * @return the dsl builder
         */
        default JGroupsRaftEndpointConsumerBuilder enableRoleChangeEvents(boolean enableRoleChangeEvents) {
            doSetProperty("enableRoleChangeEvents", enableRoleChangeEvents);
            return this;
        }
        /**
         * If set to true, the consumer endpoint will receive roleChange event
         * as well (not just connecting and/or using the state machine). By
         * default it is set to false.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param enableRoleChangeEvents the value to set
         * @return the dsl builder
         */
        default JGroupsRaftEndpointConsumerBuilder enableRoleChangeEvents(String enableRoleChangeEvents) {
            doSetProperty("enableRoleChangeEvents", enableRoleChangeEvents);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the JGroups raft component.
     */
    public interface AdvancedJGroupsRaftEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default JGroupsRaftEndpointConsumerBuilder basic() {
            return (JGroupsRaftEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJGroupsRaftEndpointConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJGroupsRaftEndpointConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJGroupsRaftEndpointConsumerBuilder exceptionHandler(org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedJGroupsRaftEndpointConsumerBuilder exceptionHandler(String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedJGroupsRaftEndpointConsumerBuilder exchangePattern(org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedJGroupsRaftEndpointConsumerBuilder exchangePattern(String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the JGroups raft component.
     */
    public interface JGroupsRaftEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedJGroupsRaftEndpointProducerBuilder advanced() {
            return (AdvancedJGroupsRaftEndpointProducerBuilder) this;
        }

    }

    /**
     * Advanced builder for endpoint producers for the JGroups raft component.
     */
    public interface AdvancedJGroupsRaftEndpointProducerBuilder extends EndpointProducerBuilder {
        default JGroupsRaftEndpointProducerBuilder basic() {
            return (JGroupsRaftEndpointProducerBuilder) this;
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
        default AdvancedJGroupsRaftEndpointProducerBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default AdvancedJGroupsRaftEndpointProducerBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the JGroups raft component.
     */
    public interface JGroupsRaftEndpointBuilder
            extends
                JGroupsRaftEndpointConsumerBuilder,
                JGroupsRaftEndpointProducerBuilder {
        default AdvancedJGroupsRaftEndpointBuilder advanced() {
            return (AdvancedJGroupsRaftEndpointBuilder) this;
        }

    }

    /**
     * Advanced builder for endpoint for the JGroups raft component.
     */
    public interface AdvancedJGroupsRaftEndpointBuilder
            extends
                AdvancedJGroupsRaftEndpointConsumerBuilder,
                AdvancedJGroupsRaftEndpointProducerBuilder {
        default JGroupsRaftEndpointBuilder basic() {
            return (JGroupsRaftEndpointBuilder) this;
        }

    }

    public interface JGroupsRaftBuilders {
        /**
         * JGroups raft (camel-jgroups-raft)
         * Exchange messages with JGroups-raft clusters.
         * 
         * Category: clustering,messaging
         * Since: 2.24
         * Maven coordinates: org.apache.camel:camel-jgroups-raft
         * 
         * @return the dsl builder for the headers' name.
         */
        default JGroupsRaftHeaderNameBuilder jgroupsRaft() {
            return JGroupsRaftHeaderNameBuilder.INSTANCE;
        }
        /**
         * JGroups raft (camel-jgroups-raft)
         * Exchange messages with JGroups-raft clusters.
         * 
         * Category: clustering,messaging
         * Since: 2.24
         * Maven coordinates: org.apache.camel:camel-jgroups-raft
         * 
         * Syntax: <code>jgroups-raft:clusterName</code>
         * 
         * Path parameter: clusterName (required)
         * The name of the JGroupsraft cluster the component should connect to.
         * 
         * @param path clusterName
         * @return the dsl builder
         */
        default JGroupsRaftEndpointBuilder jgroupsRaft(String path) {
            return JGroupsRaftEndpointBuilderFactory.endpointBuilder("jgroups-raft", path);
        }
        /**
         * JGroups raft (camel-jgroups-raft)
         * Exchange messages with JGroups-raft clusters.
         * 
         * Category: clustering,messaging
         * Since: 2.24
         * Maven coordinates: org.apache.camel:camel-jgroups-raft
         * 
         * Syntax: <code>jgroups-raft:clusterName</code>
         * 
         * Path parameter: clusterName (required)
         * The name of the JGroupsraft cluster the component should connect to.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path clusterName
         * @return the dsl builder
         */
        default JGroupsRaftEndpointBuilder jgroupsRaft(String componentName, String path) {
            return JGroupsRaftEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the JGroups raft component.
     */
    public static class JGroupsRaftHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final JGroupsRaftHeaderNameBuilder INSTANCE = new JGroupsRaftHeaderNameBuilder();

        /**
         * The Raft log size in number of entries.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code JGROUPSRAFT_LOG_SIZE}.
         */
        public String jgroupsraftLogSize() {
            return "JGROUPSRAFT_LOG_SIZE";
        }
        /**
         * The commit index.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code JGROUPSRAFT_COMMIT_INDEX}.
         */
        public String jgroupsraftCommitIndex() {
            return "JGROUPSRAFT_COMMIT_INDEX";
        }
        /**
         * The current raft term.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code JGROUPSRAFT_CURRENT_TERM}.
         */
        public String jgroupsraftCurrentTerm() {
            return "JGROUPSRAFT_CURRENT_TERM";
        }
        /**
         * Whether the node is the Raft Leader or not.
         * 
         * The option is a: {@code boolean} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code JGROUPSRAFT_IS_LEADER}.
         */
        public String jgroupsraftIsLeader() {
            return "JGROUPSRAFT_IS_LEADER";
        }
        /**
         * The index of the last log entry that was appended to the log.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code JGROUPSRAFT_LAST_APPLIED}.
         */
        public String jgroupsraftLastApplied() {
            return "JGROUPSRAFT_LAST_APPLIED";
        }
        /**
         * The Address ot Raft Leader or not.
         * 
         * The option is a: {@code org.jgroups.Address} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code JGROUPSRAFT_LEADER_ADDRESS}.
         */
        public String jgroupsraftLeaderAddress() {
            return "JGROUPSRAFT_LEADER_ADDRESS";
        }
        /**
         * The Raft id of the node.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code JGROUPSRAFT_RAFT_ID}.
         */
        public String jgroupsraftRaftId() {
            return "JGROUPSRAFT_RAFT_ID";
        }
        /**
         * The event type.
         * 
         * The option is a: {@code
         * org.apache.camel.component.jgroups.raft.JGroupsRaftEventType} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code JGROUPSRAFT_EVENT_TYPE}.
         */
        public String jgroupsraftEventType() {
            return "JGROUPSRAFT_EVENT_TYPE";
        }
        /**
         * Offset to use in the byte buffer to be set().
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code JGROUPSRAFT_SET_OFFSET}.
         */
        public String jgroupsraftSetOffset() {
            return "JGROUPSRAFT_SET_OFFSET";
        }
        /**
         * Length to use in the byte buffer to be set().
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code JGROUPSRAFT_SET_LENGTH}.
         */
        public String jgroupsraftSetLength() {
            return "JGROUPSRAFT_SET_LENGTH";
        }
        /**
         * Timeout to be used in set() operation.
         * 
         * The option is a: {@code Long} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code JGROUPSRAFT_SET_TIMEOUT}.
         */
        public String jgroupsraftSetTimeout() {
            return "JGROUPSRAFT_SET_TIMEOUT";
        }
        /**
         * Timeunit to be used in set() operation.
         * 
         * The option is a: {@code java.util.concurrent.TimeUnit} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code JGROUPSRAFT_SET_TIMEUNIT}.
         */
        public String jgroupsraftSetTimeunit() {
            return "JGROUPSRAFT_SET_TIMEUNIT";
        }
    }
    static JGroupsRaftEndpointBuilder endpointBuilder(String componentName, String path) {
        class JGroupsRaftEndpointBuilderImpl extends AbstractEndpointBuilder implements JGroupsRaftEndpointBuilder, AdvancedJGroupsRaftEndpointBuilder {
            public JGroupsRaftEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new JGroupsRaftEndpointBuilderImpl(path);
    }
}