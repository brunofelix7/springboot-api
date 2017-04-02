package io.javabrains.springboot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.javabrains.springboot.entity.Topic;
import io.javabrains.springboot.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){
		return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic){
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic){
		addTopic(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
	
}
