package io.javabrains.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springboot.entity.Course;
import io.javabrains.springboot.entity.Topic;
import io.javabrains.springboot.route.Routes;
import io.javabrains.springboot.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value = Routes.TOPICS_ID_COURSES, method = RequestMethod.GET)
	public List<Course> getAllCourses(@PathVariable("id") String id){
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping(value = Routes.TOPICS_ID_COURSES_ID, method = RequestMethod.GET)
	public Course getCourse(@PathVariable("id") String id){
		return courseService.getCourse(id);
	}
	
	@RequestMapping(value = Routes.TOPICS_TOPICID_COURSES, method = RequestMethod.POST)
	public void addCourse(@RequestBody Course course, @PathVariable("topicId") String topicId){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(value = Routes.TOPICS_ID_COURSES_ID, method = RequestMethod.PUT)
	public void updateCourse(@RequestBody Course course, @PathVariable("topicId") String topicId, @PathVariable("id") String id){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(value = Routes.TOPICS_ID_COURSES_ID, method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable("id") String id){
		courseService.deleteCourse(id);
	}
	
}
