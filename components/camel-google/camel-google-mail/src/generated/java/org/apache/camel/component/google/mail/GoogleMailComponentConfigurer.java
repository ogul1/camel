/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.mail;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class GoogleMailComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApplicationName", java.lang.String.class);
        map.put("ClientId", java.lang.String.class);
        map.put("Configuration", org.apache.camel.component.google.mail.GoogleMailConfiguration.class);
        map.put("Delegate", java.lang.String.class);
        map.put("Scopes", java.util.Collection.class);
        map.put("BridgeErrorHandler", boolean.class);
        map.put("LazyStartProducer", boolean.class);
        map.put("AutowiredEnabled", boolean.class);
        map.put("ClientFactory", org.apache.camel.component.google.mail.GoogleMailClientFactory.class);
        map.put("AccessToken", java.lang.String.class);
        map.put("ClientSecret", java.lang.String.class);
        map.put("RefreshToken", java.lang.String.class);
        map.put("ServiceAccountKey", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.google.mail.GoogleMailConfiguration getOrCreateConfiguration(GoogleMailComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.google.mail.GoogleMailConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleMailComponent target = (GoogleMailComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": getOrCreateConfiguration(target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname":
        case "applicationName": getOrCreateConfiguration(target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientfactory":
        case "clientFactory": target.setClientFactory(property(camelContext, org.apache.camel.component.google.mail.GoogleMailClientFactory.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": getOrCreateConfiguration(target).setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.google.mail.GoogleMailConfiguration.class, value)); return true;
        case "delegate": getOrCreateConfiguration(target).setDelegate(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "refreshtoken":
        case "refreshToken": getOrCreateConfiguration(target).setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": getOrCreateConfiguration(target).setScopes(property(camelContext, java.util.Collection.class, value)); return true;
        case "serviceaccountkey":
        case "serviceAccountKey": getOrCreateConfiguration(target).setServiceAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return java.lang.String.class;
        case "applicationname":
        case "applicationName": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "clientfactory":
        case "clientFactory": return org.apache.camel.component.google.mail.GoogleMailClientFactory.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientsecret":
        case "clientSecret": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.google.mail.GoogleMailConfiguration.class;
        case "delegate": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "refreshtoken":
        case "refreshToken": return java.lang.String.class;
        case "scopes": return java.util.Collection.class;
        case "serviceaccountkey":
        case "serviceAccountKey": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GoogleMailComponent target = (GoogleMailComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return getOrCreateConfiguration(target).getAccessToken();
        case "applicationname":
        case "applicationName": return getOrCreateConfiguration(target).getApplicationName();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clientfactory":
        case "clientFactory": return target.getClientFactory();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "clientsecret":
        case "clientSecret": return getOrCreateConfiguration(target).getClientSecret();
        case "configuration": return target.getConfiguration();
        case "delegate": return getOrCreateConfiguration(target).getDelegate();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "refreshtoken":
        case "refreshToken": return getOrCreateConfiguration(target).getRefreshToken();
        case "scopes": return getOrCreateConfiguration(target).getScopes();
        case "serviceaccountkey":
        case "serviceAccountKey": return getOrCreateConfiguration(target).getServiceAccountKey();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "scopes": return java.lang.String.class;
        default: return null;
        }
    }
}

