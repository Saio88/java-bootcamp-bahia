package com.t7;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.t7.model.Student;
import com.t7.service.impl.StudentServiceImpl;



public class Application {

    public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(
    	        "spring.xml");

    	StudentServiceImpl studentServiceImpl = (StudentServiceImpl) ctx.getBean("studentServiceImpl");

    	    List<Student> list = studentServiceImpl.getAllStudents();
    	    System.out.println("Student count: " + list.size());

    }
}