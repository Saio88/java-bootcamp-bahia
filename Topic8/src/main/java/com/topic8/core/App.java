package com.topic8.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.topic8.config.SpringMongoConfig;
import com.topic8.model.*;

public class App {
public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		//Key point 2
		System.out.println ("Point 2:");
		List<Student> listStudents = fetchStudents(mongoOperation,"1","40");
		for (Student student : listStudents) {
			System.out.println("-Student = " + student.getSt_lastname()+", " +student.getSt_name());	
		}
		//Key point 3
		System.out.println ("Point 3:");
		List<Course> listCourses = fetchCourses(mongoOperation, "1");
		for (Course course : listCourses) {
			System.out.println("-Course = "+ course.getName());
		}
		//Key point 2
		System.out.println ("Point 4:");
		List<Course> listCourses2 = fetchFinishedCourses(mongoOperation);
		for (Course course2 : listCourses2) {
			System.out.println("-Course = "+ course2.getName());
		}
	}

	
	private static List<Student> fetchStudents(MongoOperations mongoOperation, String courseId, String note) {
		Query studentQuery = new Query (Criteria.where("stc_course").is(courseId).and
				("stc_fnote").gt(note));
		List<StudentCourse> list = mongoOperation.find(studentQuery, StudentCourse.class);
		List<Student> students = new ArrayList<Student>();
		for (StudentCourse stc: list) {
			studentQuery = new Query (Criteria.where("st_id").is(stc.getStc_student()));
			students.add(mongoOperation.findOne(studentQuery, Student.class));
		}
		return students;
	}

	private static List<Course> fetchCourses(MongoOperations mongoOperation, String teacherId) {
		Query coursesQuery = new Query(Criteria.where("co_teacher").is(teacherId));
		coursesQuery.with(new Sort(Sort.Direction.DESC, "co_name"));
		return mongoOperation.find(coursesQuery, Course.class);	
	}
	
	
	private static List<Course> fetchFinishedCourses (MongoOperations mongoOperation) {
		Query finishedQuery = new Query(Criteria.where("co_status").is("false"));
		return mongoOperation.find(finishedQuery, Course.class);
	}
}