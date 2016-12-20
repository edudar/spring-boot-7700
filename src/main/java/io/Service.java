package io;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = WebClientAutoConfiguration.class)
public class Service {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder().web(false).sources(Service.class).run(args);
//        ObjectRepository repository = context.getBean(ObjectRepository.class);
//        repository.count();
    }

}
