package io.javabrains.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import io.javabrains.springboot.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
