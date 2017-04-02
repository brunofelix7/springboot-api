package io.javabrains.springboot.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import io.javabrains.springboot.entity.Course;

public interface CourseRepository extends CrudRepository<Course, String>{

	public List<Course> findByTopicId(String topicId);
	
}
