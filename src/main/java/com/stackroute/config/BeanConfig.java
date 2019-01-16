package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class BeanConfig {
    @Bean(name = "actor")
    public Actor getActorBean() {
        Actor actor=new Actor("Vicky Kaushal","male",30);
        return actor;
    }
    @Bean("movie")
    public Movie getMovieBean(){
        return new Movie(getActorBean());
    }
    @Bean("actor1")
    public Actor getActorBean1() {
        Actor actor=new Actor("Deepika","female",33);
        return actor;
    }
    @Bean("movie1")
    public Movie getMovieBean1(){
        return new Movie(getActorBean1());
    }
    @Bean("actor2")
    public Actor getActorBean2() {
        Actor actor=new Actor("Alia","female",25);
        return actor;
    }
    @Bean("movie2")
    public Movie getMovieBean2(){
        return new Movie(getActorBean2());
    }

}