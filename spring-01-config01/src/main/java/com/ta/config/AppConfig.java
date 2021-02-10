package com.ta.config;

import com.ta.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ta.pojo")
public class AppConfig {

    @Bean
    public Person getPerson(){

        Person person = new Person();
        person.setName("xiaosna");
        return person;
    }


}
