package com.udemy.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    // define our init method
    @PostConstruct
    public void doStartUpStuff() {
        System.out.println("In doStartUpStuff: " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doCleanUpStuff() {
        System.out.println("In doCleanUpStuff: " + getClass().getSimpleName());
    }
    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
