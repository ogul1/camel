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
 * Perform operations on AWS Redshift using Redshift Data API.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RedshiftData2EndpointBuilderFactory {

    /**
     * Builder for endpoint for the AWS RedshiftData component.
     */
    public interface RedshiftData2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedRedshiftData2EndpointBuilder advanced() {
            return (AdvancedRedshiftData2EndpointBuilder) this;
        }

        /**
         * The operation to perform. It can be batchExecuteStatement,
         * cancelStatement, describeStatement, describeTable, executeStatement,
         * getStatementResult, listDatabases, listSchemas, listStatements or
         * listTables.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.redshift.data.RedshiftData2Operations&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder operation(org.apache.camel.component.aws2.redshift.data.RedshiftData2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform. It can be batchExecuteStatement,
         * cancelStatement, describeStatement, describeTable, executeStatement,
         * getStatementResult, listDatabases, listSchemas, listStatements or
         * listTables.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws2.redshift.data.RedshiftData2Operations&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder operation(String operation) {
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
        default RedshiftData2EndpointBuilder overrideEndpoint(boolean overrideEndpoint) {
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
        default RedshiftData2EndpointBuilder overrideEndpoint(String overrideEndpoint) {
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
        default RedshiftData2EndpointBuilder pojoRequest(boolean pojoRequest) {
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
        default RedshiftData2EndpointBuilder pojoRequest(String pojoRequest) {
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
        default RedshiftData2EndpointBuilder profileCredentialsName(String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * The region in which RedshiftData client needs to work. When using
         * this parameter, the configuration will expect the lowercase name of
         * the region (for example, ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder trustAllCertificates(boolean trustAllCertificates) {
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
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder trustAllCertificates(String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
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
        default RedshiftData2EndpointBuilder uriEndpointOverride(String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the RedshiftData client should expect to load credentials
         * through a default credentials provider or to expect static
         * credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder useDefaultCredentialsProvider(boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the RedshiftData client should expect to load credentials
         * through a default credentials provider or to expect static
         * credentials to be passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder useDefaultCredentialsProvider(String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the RedshiftData client should expect to load credentials
         * through a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder useProfileCredentialsProvider(boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Set whether the RedshiftData client should expect to load credentials
         * through a profile credentials provider.
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
        default RedshiftData2EndpointBuilder useProfileCredentialsProvider(String useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * To define a proxy host when instantiating the RedshiftData client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the RedshiftData client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the RedshiftData client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the RedshiftData
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
        default RedshiftData2EndpointBuilder proxyProtocol(software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the RedshiftData
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
        default RedshiftData2EndpointBuilder proxyProtocol(String proxyProtocol) {
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
        default RedshiftData2EndpointBuilder accessKey(String accessKey) {
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
        default RedshiftData2EndpointBuilder secretKey(String secretKey) {
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
        default RedshiftData2EndpointBuilder sessionToken(String sessionToken) {
            doSetProperty("sessionToken", sessionToken);
            return this;
        }
        /**
         * Set whether the Redshift client should expect to use Session
         * Credentials. This is useful in a situation in which the user needs to
         * assume an IAM role for doing operations in Redshift.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useSessionCredentials the value to set
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder useSessionCredentials(boolean useSessionCredentials) {
            doSetProperty("useSessionCredentials", useSessionCredentials);
            return this;
        }
        /**
         * Set whether the Redshift client should expect to use Session
         * Credentials. This is useful in a situation in which the user needs to
         * assume an IAM role for doing operations in Redshift.
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
        default RedshiftData2EndpointBuilder useSessionCredentials(String useSessionCredentials) {
            doSetProperty("useSessionCredentials", useSessionCredentials);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS RedshiftData component.
     */
    public interface AdvancedRedshiftData2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default RedshiftData2EndpointBuilder basic() {
            return (RedshiftData2EndpointBuilder) this;
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
        default AdvancedRedshiftData2EndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default AdvancedRedshiftData2EndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use an existing configured AwsRedshiftDataClient client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.redshiftdata.RedshiftDataClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param awsRedshiftDataClient the value to set
         * @return the dsl builder
         */
        default AdvancedRedshiftData2EndpointBuilder awsRedshiftDataClient(software.amazon.awssdk.services.redshiftdata.RedshiftDataClient awsRedshiftDataClient) {
            doSetProperty("awsRedshiftDataClient", awsRedshiftDataClient);
            return this;
        }
        /**
         * To use an existing configured AwsRedshiftDataClient client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.redshiftdata.RedshiftDataClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param awsRedshiftDataClient the value to set
         * @return the dsl builder
         */
        default AdvancedRedshiftData2EndpointBuilder awsRedshiftDataClient(String awsRedshiftDataClient) {
            doSetProperty("awsRedshiftDataClient", awsRedshiftDataClient);
            return this;
        }
    }

    public interface RedshiftData2Builders {
        /**
         * AWS RedshiftData (camel-aws2-redshift)
         * Perform operations on AWS Redshift using Redshift Data API.
         * 
         * Category: cloud,serverless,database,bigdata
         * Since: 4.1
         * Maven coordinates: org.apache.camel:camel-aws2-redshift
         * 
         * @return the dsl builder for the headers' name.
         */
        default RedshiftData2HeaderNameBuilder aws2RedshiftData() {
            return RedshiftData2HeaderNameBuilder.INSTANCE;
        }
        /**
         * AWS RedshiftData (camel-aws2-redshift)
         * Perform operations on AWS Redshift using Redshift Data API.
         * 
         * Category: cloud,serverless,database,bigdata
         * Since: 4.1
         * Maven coordinates: org.apache.camel:camel-aws2-redshift
         * 
         * Syntax: <code>aws2-redshift-data:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param path label
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder aws2RedshiftData(String path) {
            return RedshiftData2EndpointBuilderFactory.endpointBuilder("aws2-redshift-data", path);
        }
        /**
         * AWS RedshiftData (camel-aws2-redshift)
         * Perform operations on AWS Redshift using Redshift Data API.
         * 
         * Category: cloud,serverless,database,bigdata
         * Since: 4.1
         * Maven coordinates: org.apache.camel:camel-aws2-redshift
         * 
         * Syntax: <code>aws2-redshift-data:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path label
         * @return the dsl builder
         */
        default RedshiftData2EndpointBuilder aws2RedshiftData(String componentName, String path) {
            return RedshiftData2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the AWS RedshiftData component.
     */
    public static class RedshiftData2HeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final RedshiftData2HeaderNameBuilder INSTANCE = new RedshiftData2HeaderNameBuilder();

        /**
         * The operation we want to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataOperation}.
         */
        public String awsRedshiftDataOperation() {
            return "CamelAwsRedshiftDataOperation";
        }
        /**
         * The cluster identifier.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsRedshiftDataClusterIdentifier}.
         */
        public String awsRedshiftDataClusterIdentifier() {
            return "CamelAwsRedshiftDataClusterIdentifier";
        }
        /**
         * The name or ARN of the secret that enables access to the database.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataSecretArn}.
         */
        public String awsRedshiftDataSecretArn() {
            return "CamelAwsRedshiftDataSecretArn";
        }
        /**
         * The name of the database.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataDatabase}.
         */
        public String awsRedshiftDataDatabase() {
            return "CamelAwsRedshiftDataDatabase";
        }
        /**
         * The serverless workgroup name or Amazon Resource Name (ARN).
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataWorkGroupName}.
         */
        public String awsRedshiftDataWorkGroupName() {
            return "CamelAwsRedshiftDataWorkGroupName";
        }
        /**
         * The maximum number of databases to return in the response.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsRedshiftDataDatabasesMaxResults}.
         */
        public String awsRedshiftDataDatabasesMaxResults() {
            return "CamelAwsRedshiftDataDatabasesMaxResults";
        }
        /**
         * The database user name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataDbUser}.
         */
        public String awsRedshiftDataDbUser() {
            return "CamelAwsRedshiftDataDbUser";
        }
        /**
         * A database name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsRedshiftDataConnectedDatabase}.
         */
        public String awsRedshiftDataConnectedDatabase() {
            return "CamelAwsRedshiftDataConnectedDatabase";
        }
        /**
         * A pattern to filter results by schema name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataSchemaPattern}.
         */
        public String awsRedshiftDataSchemaPattern() {
            return "CamelAwsRedshiftDataSchemaPattern";
        }
        /**
         * The maximum number of schemas to return in the response.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsRedshiftDataSchemasMaxResults}.
         */
        public String awsRedshiftDataSchemasMaxResults() {
            return "CamelAwsRedshiftDataSchemasMaxResults";
        }
        /**
         * The maximum number of SQL statements to return in the response.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsRedshiftDataStatementsMaxResults}.
         */
        public String awsRedshiftDataStatementsMaxResults() {
            return "CamelAwsRedshiftDataStatementsMaxResults";
        }
        /**
         * The name of the SQL statement specified as input to
         * BatchExecuteStatement or ExecuteStatement to identify the query.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataStatementName}.
         */
        public String awsRedshiftDataStatementName() {
            return "CamelAwsRedshiftDataStatementName";
        }
        /**
         * The status of the SQL statement to list.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataStatus}.
         */
        public String awsRedshiftDataStatus() {
            return "CamelAwsRedshiftDataStatus";
        }
        /**
         * A value that filters which statements to return in the response.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataRoleLevel}.
         */
        public String awsRedshiftDataRoleLevel() {
            return "CamelAwsRedshiftDataRoleLevel";
        }
        /**
         * The maximum number of tables to return in the response.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsRedshiftDataTablesMaxResults}.
         */
        public String awsRedshiftDataTablesMaxResults() {
            return "CamelAwsRedshiftDataTablesMaxResults";
        }
        /**
         * A pattern to filter results by table name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataTablePattern}.
         */
        public String awsRedshiftDataTablePattern() {
            return "CamelAwsRedshiftDataTablePattern";
        }
        /**
         * The name of the table.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataTable}.
         */
        public String awsRedshiftDataTable() {
            return "CamelAwsRedshiftDataTable";
        }
        /**
         * The schema that contains the table.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataSchema}.
         */
        public String awsRedshiftDataSchema() {
            return "CamelAwsRedshiftDataSchema";
        }
        /**
         * The maximum number of tables to return in the response.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsRedshiftDataDescribeTableMaxResults}.
         */
        public String awsRedshiftDataDescribeTableMaxResults() {
            return "CamelAwsRedshiftDataDescribeTableMaxResults";
        }
        /**
         * ID of the statement.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataStatementId}.
         */
        public String awsRedshiftDataStatementId() {
            return "CamelAwsRedshiftDataStatementId";
        }
        /**
         * A value that indicates whether to send an event to the Amazon
         * EventBridge event bus after the SQL statement runs.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataWithEvent}.
         */
        public String awsRedshiftDataWithEvent() {
            return "CamelAwsRedshiftDataWithEvent";
        }
        /**
         * A unique, case-sensitive identifier that you provide to ensure the
         * idempotency of the request.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataClientToken}.
         */
        public String awsRedshiftDataClientToken() {
            return "CamelAwsRedshiftDataClientToken";
        }
        /**
         * The SQL statement text to run.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsRedshiftDataSqlStatement}.
         */
        public String awsRedshiftDataSqlStatement() {
            return "CamelAwsRedshiftDataSqlStatement";
        }
        /**
         * The parameters for the SQL statement.
         * 
         * The option is a: {@code List<SqlParameterList>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsRedshiftDataSqlParameterList}.
         */
        public String awsRedshiftDataSqlParameterList() {
            return "CamelAwsRedshiftDataSqlParameterList";
        }
        /**
         * The List of SQL statements text to run.
         * 
         * The option is a: {@code List} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsRedshiftDataSqlStatementList}.
         */
        public String awsRedshiftDataSqlStatementList() {
            return "CamelAwsRedshiftDataSqlStatementList";
        }
    }
    static RedshiftData2EndpointBuilder endpointBuilder(String componentName, String path) {
        class RedshiftData2EndpointBuilderImpl extends AbstractEndpointBuilder implements RedshiftData2EndpointBuilder, AdvancedRedshiftData2EndpointBuilder {
            public RedshiftData2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new RedshiftData2EndpointBuilderImpl(path);
    }
}