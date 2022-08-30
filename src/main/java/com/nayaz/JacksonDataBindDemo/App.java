package com.nayaz.JacksonDataBindDemo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nayaz.JacksonDataBindDemo.json.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ObjectMapper objectMapper = new ObjectMapper();
    		
    		Student student  = objectMapper.readValue(new File("data/simple-lite.json"), Student.class);
    		
    		System.out.println("First Name :" + student.getFirstName());
    		System.out.println("Last Name :" + student.getLastName());
    		
    		Student student1  = objectMapper.readValue(new File("data/simple-full.json"), Student.class);
    		
    		System.out.println("First Name :" + student1.getFirstName());
    		System.out.println("Last Name :" + student1.getLastName());
    		
    		System.out.println("Street :" +student1.getAddress().getStreet());
    		System.out.println("City :" +student1.getAddress().getCity());
    		
    		for(String language: student1.getLanguages()) {
    			System.out.println(language);
    		}

    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}
