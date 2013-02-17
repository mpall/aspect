package com.pallot;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class Person {
 private PersonConfig personConfig;
 
 @Autowired
 public void setPersonConfig(PersonConfig personConfig) {
 this.personConfig = personConfig;
 }
 
 public String getName() {
 return personConfig.printName();
 }
}