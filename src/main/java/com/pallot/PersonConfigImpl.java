package com.pallot;
 
import org.springframework.stereotype.Component;
 
@Component
public class PersonConfigImpl implements PersonConfig {
 /*
 * (non-Javadoc)
 * @see com.hascode.tutorial.spring.PersonConfig#printName()
 */
 public String printName() {
 return "Mr. X";
 }
}