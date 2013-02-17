package com.pallot;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class App {
 public static void main(String[] args) {
 ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
 Person person = context.getBean(Person.class);
 System.out.println(person.getName());
 }
}