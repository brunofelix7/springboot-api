package io.javabrains.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springboot.entity.Topic;
import io.javabrains.springboot.route.Routes;
import io.javabrains.springboot.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value = Routes.TOPICS, method = RequestMethod.GET)
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping(value = Routes.TOPICS_ID, method = RequestMethod.GET)
	public Topic getTopic(@PathVariable("id") String id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value = Routes.TOPICS, method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	@RequestMapping(value = Routes.TOPICS_ID, method = RequestMethod.PUT)
	public void updateTopic(@PathVariable("id") String id, @RequestBody Topic topic){
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(value = Routes.TOPICS_ID, method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable("id") String id){
		topicService.deleteTopic(id);
	}

}
