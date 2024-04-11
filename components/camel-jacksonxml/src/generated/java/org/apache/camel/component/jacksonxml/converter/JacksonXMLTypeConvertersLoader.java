/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jacksonxml.converter;

import javax.annotation.processing.Generated;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.TypeConverterLoaderGeneratorMojo")
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class JacksonXMLTypeConvertersLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public JacksonXMLTypeConvertersLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerFallbackConverters(registry);
    }


    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) {
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

    private void registerFallbackConverters(TypeConverterRegistry registry) {
        addFallbackTypeConverter(registry, false, false, (type, exchange, value) -> getJacksonXMLTypeConverters().convertTo(type, exchange, value, registry));
    }

    private static void addFallbackTypeConverter(TypeConverterRegistry registry, boolean allowNull, boolean canPromote, SimpleTypeConverter.ConversionMethod method) {
        registry.addFallbackTypeConverter(new SimpleTypeConverter(allowNull, method), canPromote);
    }

    private volatile org.apache.camel.component.jacksonxml.converter.JacksonXMLTypeConverters jacksonXMLTypeConverters;
    private org.apache.camel.component.jacksonxml.converter.JacksonXMLTypeConverters getJacksonXMLTypeConverters() {
        if (jacksonXMLTypeConverters == null) {
            jacksonXMLTypeConverters = new org.apache.camel.component.jacksonxml.converter.JacksonXMLTypeConverters();
            CamelContextAware.trySetCamelContext(jacksonXMLTypeConverters, camelContext);
        }
        return jacksonXMLTypeConverters;
    }
}
