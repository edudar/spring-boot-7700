package io;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.BeanNames;
import org.springframework.data.couchbase.core.convert.CustomConversions;

import java.util.Arrays;

@Configuration
public class ServiceContext {

    @Bean(name = BeanNames.COUCHBASE_CUSTOM_CONVERSIONS)
    CustomConversions customConversions() {
        System.err.println("CUSTOM CONVERSION ARE HERE!");
        return new CustomConversions(Arrays.asList());
    }

}