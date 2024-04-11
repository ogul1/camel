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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.jgroups.raft.JGroupsRaftComponent;

/**
 * Exchange messages with JGroups-raft clusters.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface JgroupsRaftComponentBuilderFactory {

    /**
     * JGroups raft (camel-jgroups-raft)
     * Exchange messages with JGroups-raft clusters.
     * 
     * Category: clustering,messaging
     * Since: 2.24
     * Maven coordinates: org.apache.camel:camel-jgroups-raft
     * 
     * @return the dsl builder
     */
    static JgroupsRaftComponentBuilder jgroupsRaft() {
        return new JgroupsRaftComponentBuilderImpl();
    }

    /**
     * Builder for the JGroups raft component.
     */
    interface JgroupsRaftComponentBuilder extends ComponentBuilder<JGroupsRaftComponent> {
    
        
        /**
         * Specifies configuration properties of the RaftHandle JChannel used by
         * the endpoint (ignored if raftHandle ref is provided).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: raft.xml
         * Group: common
         * 
         * @param channelProperties the value to set
         * @return the dsl builder
         */
        default JgroupsRaftComponentBuilder channelProperties(java.lang.String channelProperties) {
            doSetProperty("channelProperties", channelProperties);
            return this;
        }
    
        /**
         * RaftHandle to use.
         * 
         * The option is a: &lt;code&gt;org.jgroups.raft.RaftHandle&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param raftHandle the value to set
         * @return the dsl builder
         */
        default JgroupsRaftComponentBuilder raftHandle(org.jgroups.raft.RaftHandle raftHandle) {
            doSetProperty("raftHandle", raftHandle);
            return this;
        }
    
        /**
         * Unique raftId to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param raftId the value to set
         * @return the dsl builder
         */
        default JgroupsRaftComponentBuilder raftId(java.lang.String raftId) {
            doSetProperty("raftId", raftId);
            return this;
        }
    
        
        /**
         * StateMachine to use.
         * 
         * The option is a:
         * &lt;code&gt;org.jgroups.raft.StateMachine&lt;/code&gt; type.
         * 
         * Default: NopStateMachine
         * Group: common
         * 
         * @param stateMachine the value to set
         * @return the dsl builder
         */
        default JgroupsRaftComponentBuilder stateMachine(org.jgroups.raft.StateMachine stateMachine) {
            doSetProperty("stateMachine", stateMachine);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default JgroupsRaftComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default JgroupsRaftComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default JgroupsRaftComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class JgroupsRaftComponentBuilderImpl
            extends AbstractComponentBuilder<JGroupsRaftComponent>
            implements JgroupsRaftComponentBuilder {
        @Override
        protected JGroupsRaftComponent buildConcreteComponent() {
            return new JGroupsRaftComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "channelProperties": ((JGroupsRaftComponent) component).setChannelProperties((java.lang.String) value); return true;
            case "raftHandle": ((JGroupsRaftComponent) component).setRaftHandle((org.jgroups.raft.RaftHandle) value); return true;
            case "raftId": ((JGroupsRaftComponent) component).setRaftId((java.lang.String) value); return true;
            case "stateMachine": ((JGroupsRaftComponent) component).setStateMachine((org.jgroups.raft.StateMachine) value); return true;
            case "bridgeErrorHandler": ((JGroupsRaftComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((JGroupsRaftComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((JGroupsRaftComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}