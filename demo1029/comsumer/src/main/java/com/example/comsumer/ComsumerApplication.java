package com.example.comsumer;

import com.suixingpay.zss.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ImportResource("classpath:consumer.xml")
@SpringBootApplication
public class ComsumerApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

    public static void main(String[] args) {
        SpringApplication springbootapplication = new  SpringApplication(ComsumerApplication.class);
        springbootapplication.run(ComsumerApplication.class, args);

        @SuppressWarnings("resource")
        ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        Demo dubbo=(Demo)content.getBean("demo");
        System.out.print(dubbo.success());
    }



    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(9080);
    }
}
