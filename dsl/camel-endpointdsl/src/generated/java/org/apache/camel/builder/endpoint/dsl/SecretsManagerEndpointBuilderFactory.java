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
 * Manage secrets using AWS Secrets Manager.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SecretsManagerEndpointBuilderFactory {

    /**
     * Builder for endpoint for the AWS Secrets Manager component.
     */
    public interface SecretsManagerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSecretsManagerEndpointBuilder advanced() {
            return (AdvancedSecretsManagerEndpointBuilder) this;
        }

        /**
         * Set if the secret is binary or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param binaryPayload the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder binaryPayload(boolean binaryPayload) {
            doSetProperty("binaryPayload", binaryPayload);
            return this;
        }
        /**
         * Set if the secret is binary or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param binaryPayload the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder binaryPayload(String binaryPayload) {
            doSetProperty("binaryPayload", binaryPayload);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws.secretsmanager.SecretsManagerOperations&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder operation(org.apache.camel.component.aws.secretsmanager.SecretsManagerOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws.secretsmanager.SecretsManagerOperations&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set the need for overriding the endpoint. This option needs to be
         * used in combination with the uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder overrideEndpoint(boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the need for overriding the endpoint. This option needs to be
         * used in combination with the uriEndpointOverride option.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder overrideEndpoint(String overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder pojoRequest(String pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If using a profile credentials provider, this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder profileCredentialsName(String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * The region in which a Secrets Manager client needs to work. When
         * using this parameter, the configuration will expect the lowercase
         * name of the region (for example, ap-east-1) You'll need to use the
         * name Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder uriEndpointOverride(String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the Secrets Manager client should expect to load
         * credentials through a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder useProfileCredentialsProvider(boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Secrets Manager client should expect to load
         * credentials through a profile credentials provider.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder useProfileCredentialsProvider(String useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Secrets Manager client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Secrets Manager client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Secrets Manager client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Secrets Manager
         * client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder proxyProtocol(software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Secrets Manager
         * client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Amazon AWS Session Token used when the user needs to assume an IAM
         * role.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sessionToken the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder sessionToken(String sessionToken) {
            doSetProperty("sessionToken", sessionToken);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder trustAllCertificates(boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder trustAllCertificates(String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set whether the Translate client should expect to load credentials
         * through a default credentials provider or to expect static
         * credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder useDefaultCredentialsProvider(boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Translate client should expect to load credentials
         * through a default credentials provider or to expect static
         * credentials to be passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder useDefaultCredentialsProvider(String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Secrets Manager client should expect to use Session
         * Credentials. This is useful in a situation in which the user needs to
         * assume an IAM role for doing operations in Secrets Manager.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useSessionCredentials the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder useSessionCredentials(boolean useSessionCredentials) {
            doSetProperty("useSessionCredentials", useSessionCredentials);
            return this;
        }
        /**
         * Set whether the Secrets Manager client should expect to use Session
         * Credentials. This is useful in a situation in which the user needs to
         * assume an IAM role for doing operations in Secrets Manager.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useSessionCredentials the value to set
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder useSessionCredentials(String useSessionCredentials) {
            doSetProperty("useSessionCredentials", useSessionCredentials);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Secrets Manager component.
     */
    public interface AdvancedSecretsManagerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SecretsManagerEndpointBuilder basic() {
            return (SecretsManagerEndpointBuilder) this;
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
        default AdvancedSecretsManagerEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default AdvancedSecretsManagerEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use an existing configured AWS Secrets Manager client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.secretsmanager.SecretsManagerClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param secretsManagerClient the value to set
         * @return the dsl builder
         */
        default AdvancedSecretsManagerEndpointBuilder secretsManagerClient(software.amazon.awssdk.services.secretsmanager.SecretsManagerClient secretsManagerClient) {
            doSetProperty("secretsManagerClient", secretsManagerClient);
            return this;
        }
        /**
         * To use an existing configured AWS Secrets Manager client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.secretsmanager.SecretsManagerClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param secretsManagerClient the value to set
         * @return the dsl builder
         */
        default AdvancedSecretsManagerEndpointBuilder secretsManagerClient(String secretsManagerClient) {
            doSetProperty("secretsManagerClient", secretsManagerClient);
            return this;
        }
    }

    public interface SecretsManagerBuilders {
        /**
         * AWS Secrets Manager (camel-aws-secrets-manager)
         * Manage secrets using AWS Secrets Manager.
         * 
         * Category: cloud,management
         * Since: 3.9
         * Maven coordinates: org.apache.camel:camel-aws-secrets-manager
         * 
         * @return the dsl builder for the headers' name.
         */
        default SecretsManagerHeaderNameBuilder awsSecretsManager() {
            return SecretsManagerHeaderNameBuilder.INSTANCE;
        }
        /**
         * AWS Secrets Manager (camel-aws-secrets-manager)
         * Manage secrets using AWS Secrets Manager.
         * 
         * Category: cloud,management
         * Since: 3.9
         * Maven coordinates: org.apache.camel:camel-aws-secrets-manager
         * 
         * Syntax: <code>aws-secrets-manager:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param path label
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder awsSecretsManager(String path) {
            return SecretsManagerEndpointBuilderFactory.endpointBuilder("aws-secrets-manager", path);
        }
        /**
         * AWS Secrets Manager (camel-aws-secrets-manager)
         * Manage secrets using AWS Secrets Manager.
         * 
         * Category: cloud,management
         * Since: 3.9
         * Maven coordinates: org.apache.camel:camel-aws-secrets-manager
         * 
         * Syntax: <code>aws-secrets-manager:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path label
         * @return the dsl builder
         */
        default SecretsManagerEndpointBuilder awsSecretsManager(String componentName, String path) {
            return SecretsManagerEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the AWS Secrets Manager component.
     */
    public static class SecretsManagerHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final SecretsManagerHeaderNameBuilder INSTANCE = new SecretsManagerHeaderNameBuilder();

        /**
         * The operation we want to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSecretsManagerOperation}.
         */
        public String awsSecretsManagerOperation() {
            return "CamelAwsSecretsManagerOperation";
        }
        /**
         * The number of results to include in the response.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSecretsManagerMaxResults}.
         */
        public String awsSecretsManagerMaxResults() {
            return "CamelAwsSecretsManagerMaxResults";
        }
        /**
         * The name of the secret.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSecretsManagerSecretName}.
         */
        public String awsSecretsManagerSecretName() {
            return "CamelAwsSecretsManagerSecretName";
        }
        /**
         * The description of the secret.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsSecretsManagerSecretDescription}.
         */
        public String awsSecretsManagerSecretDescription() {
            return "CamelAwsSecretsManagerSecretDescription";
        }
        /**
         * The ARN or name of the secret.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSecretsManagerSecretId}.
         */
        public String awsSecretsManagerSecretId() {
            return "CamelAwsSecretsManagerSecretId";
        }
        /**
         * The ARN of the Lambda rotation function that can rotate the secret.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsSecretsManagerLambdaRotationFunctionArn}.
         */
        public String awsSecretsManagerLambdaRotationFunctionArn() {
            return "CamelAwsSecretsManagerLambdaRotationFunctionArn";
        }
        /**
         * The unique identifier of the version of the secret.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsSecretsManagerSecretVersionId}.
         */
        public String awsSecretsManagerSecretVersionId() {
            return "CamelAwsSecretsManagerSecretVersionId";
        }
        /**
         * A comma separated list of Regions in which to replicate the secret.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsSecretsManagerSecretReplicationRegions}.
         */
        public String awsSecretsManagerSecretReplicationRegions() {
            return "CamelAwsSecretsManagerSecretReplicationRegions";
        }
    }
    static SecretsManagerEndpointBuilder endpointBuilder(String componentName, String path) {
        class SecretsManagerEndpointBuilderImpl extends AbstractEndpointBuilder implements SecretsManagerEndpointBuilder, AdvancedSecretsManagerEndpointBuilder {
            public SecretsManagerEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SecretsManagerEndpointBuilderImpl(path);
    }
}