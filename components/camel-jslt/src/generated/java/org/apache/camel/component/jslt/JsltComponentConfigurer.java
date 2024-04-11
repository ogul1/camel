/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jslt;

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
public class JsltComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JsltComponent target = (JsltComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": target.setAllowTemplateFromHeader(property(camelContext, boolean.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "functions": target.setFunctions(property(camelContext, java.util.Collection.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "objectfilter":
        case "objectFilter": target.setObjectFilter(property(camelContext, com.schibsted.spt.data.jslt.filters.JsonFilter.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": return boolean.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "functions": return java.util.Collection.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "objectfilter":
        case "objectFilter": return com.schibsted.spt.data.jslt.filters.JsonFilter.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JsltComponent target = (JsltComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": return target.isAllowTemplateFromHeader();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "functions": return target.getFunctions();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "objectfilter":
        case "objectFilter": return target.getObjectFilter();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "functions": return com.schibsted.spt.data.jslt.Function.class;
        default: return null;
        }
    }
}

