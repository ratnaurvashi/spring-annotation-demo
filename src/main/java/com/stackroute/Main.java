package com.stackroute;

import com.stackroute.config.BeanConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println(context.getBean("movie"));
        System.out.println(context.getBean("movie1"));
        System.out.println(context.getBean("movie2"));

    }
}