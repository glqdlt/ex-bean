package com.glqdlt.ex.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created By iw.jhun
 * On 2018-04-11 , 오후 5:47
 */

@Component
public class CarFactory {

    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public Car sonataMake(){
        return new Car("sonata");
    }

    @Bean
    public Car avantte(){
        return new Car("avantte");
    }


}
