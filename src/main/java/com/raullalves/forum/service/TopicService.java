package com.raullalves.forum.service;

import com.raullalves.forum.dtos.create.CreateTopicDto;
import com.raullalves.forum.dtos.read.TopicDto;
import com.raullalves.forum.dtos.update.UpdateTopicDto;
import com.raullalves.forum.model.Topic;
import com.raullalves.forum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository repository;

    public List<TopicDto> list() {
        return repository.findAll().stream()
                .map(topic -> new TopicDto(topic.getId(), topic.getTitle(), topic.getMessage()))
                .toList();
    }

    public TopicDto create(CreateTopicDto dto) {
        Topic topic = new Topic();
        topic.setTitle(dto.title());
        topic.setMessage(dto.mensage());
        repository.save(topic);

        return new TopicDto(topic.getId(), topic.getTitle(), topic.getMessage());
    }

    public TopicDto update(Long id, UpdateTopicDto dto) {
        Topic topic = repository.getReferenceById(id);
        topic.setTitle(dto.title());
        topic.setMessage(dto.message());
        return new TopicDto(topic);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
