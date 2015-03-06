package com.t7.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.t7.Application;
import com.t7.service.*;
import com.t7.model.*;
import com.t7.service.impl.*;
import com.t7.dao.*;
import com.t7.dao.impl.*;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class Topic7ApplicationTests {

	@Test
	public void getAllTeachersTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
    	        "spring.xml");

		TeacherService teacherService = (TeacherService) ctx.getBean("teacherServiceImpl");

    	List<Teacher> list = teacherService.getAllTeachers();
    	assertEquals(3,list.size());
	}
	

}