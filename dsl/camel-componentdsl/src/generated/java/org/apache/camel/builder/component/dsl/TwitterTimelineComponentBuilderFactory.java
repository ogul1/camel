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
import org.apache.camel.component.twitter.timeline.TwitterTimelineComponent;

/**
 * Send tweets and receive tweets from user's timeline.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface TwitterTimelineComponentBuilderFactory {

    /**
     * Twitter Timeline (camel-twitter)
     * Send tweets and receive tweets from user's timeline.
     * 
     * Category: saas,social
     * Since: 2.10
     * Maven coordinates: org.apache.camel:camel-twitter
     * 
     * @return the dsl builder
     */
    static TwitterTimelineComponentBuilder twitterTimeline() {
        return new TwitterTimelineComponentBuilderImpl();
    }

    /**
     * Builder for the Twitter Timeline component.
     */
    interface TwitterTimelineComponentBuilder extends ComponentBuilder<TwitterTimelineComponent> {
    
        
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
        default TwitterTimelineComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
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
        default TwitterTimelineComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default TwitterTimelineComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default TwitterTimelineComponentBuilder healthCheckConsumerEnabled(boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
    
        
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component. Notice: Camel has by default disabled all producer
         * based health-checks. You can turn on producer checks globally by
         * setting camel.health.producersEnabled=true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default TwitterTimelineComponentBuilder healthCheckProducerEnabled(boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
    
        /**
         * The http proxy host which can be used for the camel-twitter.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyHost the value to set
         * @return the dsl builder
         */
        default TwitterTimelineComponentBuilder httpProxyHost(java.lang.String httpProxyHost) {
            doSetProperty("httpProxyHost", httpProxyHost);
            return this;
        }
    
        /**
         * The http proxy password which can be used for the camel-twitter.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyPassword the value to set
         * @return the dsl builder
         */
        default TwitterTimelineComponentBuilder httpProxyPassword(java.lang.String httpProxyPassword) {
            doSetProperty("httpProxyPassword", httpProxyPassword);
            return this;
        }
    
        /**
         * The http proxy port which can be used for the camel-twitter.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyPort the value to set
         * @return the dsl builder
         */
        default TwitterTimelineComponentBuilder httpProxyPort(int httpProxyPort) {
            doSetProperty("httpProxyPort", httpProxyPort);
            return this;
        }
    
        /**
         * The http proxy user which can be used for the camel-twitter.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyUser the value to set
         * @return the dsl builder
         */
        default TwitterTimelineComponentBuilder httpProxyUser(java.lang.String httpProxyUser) {
            doSetProperty("httpProxyUser", httpProxyUser);
            return this;
        }
    
        /**
         * The access token.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessToken the value to set
         * @return the dsl builder
         */
        default TwitterTimelineComponentBuilder accessToken(java.lang.String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
    
        /**
         * The access token secret.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessTokenSecret the value to set
         * @return the dsl builder
         */
        default TwitterTimelineComponentBuilder accessTokenSecret(java.lang.String accessTokenSecret) {
            doSetProperty("accessTokenSecret", accessTokenSecret);
            return this;
        }
    
        /**
         * The consumer key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param consumerKey the value to set
         * @return the dsl builder
         */
        default TwitterTimelineComponentBuilder consumerKey(java.lang.String consumerKey) {
            doSetProperty("consumerKey", consumerKey);
            return this;
        }
    
        /**
         * The consumer secret.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param consumerSecret the value to set
         * @return the dsl builder
         */
        default TwitterTimelineComponentBuilder consumerSecret(java.lang.String consumerSecret) {
            doSetProperty("consumerSecret", consumerSecret);
            return this;
        }
    }

    class TwitterTimelineComponentBuilderImpl
            extends AbstractComponentBuilder<TwitterTimelineComponent>
            implements TwitterTimelineComponentBuilder {
        @Override
        protected TwitterTimelineComponent buildConcreteComponent() {
            return new TwitterTimelineComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((TwitterTimelineComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((TwitterTimelineComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((TwitterTimelineComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((TwitterTimelineComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((TwitterTimelineComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            case "httpProxyHost": ((TwitterTimelineComponent) component).setHttpProxyHost((java.lang.String) value); return true;
            case "httpProxyPassword": ((TwitterTimelineComponent) component).setHttpProxyPassword((java.lang.String) value); return true;
            case "httpProxyPort": ((TwitterTimelineComponent) component).setHttpProxyPort((int) value); return true;
            case "httpProxyUser": ((TwitterTimelineComponent) component).setHttpProxyUser((java.lang.String) value); return true;
            case "accessToken": ((TwitterTimelineComponent) component).setAccessToken((java.lang.String) value); return true;
            case "accessTokenSecret": ((TwitterTimelineComponent) component).setAccessTokenSecret((java.lang.String) value); return true;
            case "consumerKey": ((TwitterTimelineComponent) component).setConsumerKey((java.lang.String) value); return true;
            case "consumerSecret": ((TwitterTimelineComponent) component).setConsumerSecret((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}