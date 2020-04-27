package com.cg.lab1_1config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.lab1_1entities.Employee;
/*Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions.*/

@Configuration
@ComponentScan("com.cg")

public class MyConfig {

}
