package io.javabrains.springboot.controller;

import java.util.Arrays;
import java.util.List;
import io.javabrains.springboot.entity.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping(value = "/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
					new Topic("Spring", "Spring Boot Framework", "The best framework java"),
					new Topic("Android", "Android", "Really cool"),
					new Topic("Angular", "Angular", "Learn")
				);
	}

}
