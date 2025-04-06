package com.raullalves.forum.controller;

import com.raullalves.forum.dto.TopicDto;
import com.raullalves.forum.model.Topic;
import com.raullalves.forum.repository.TopicRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicRepository repository;

    @PostMapping
    public ResponseEntity create(@RequestBody TopicDto dto, UriComponentsBuilder uriBuilder) {
        Topic topic = new Topic();
        topic.setTitle(dto.title());
        topic.setMenssage(dto.menssage());
        repository.save(topic);

        var uri = uriBuilder.path("/topic/create/{id}").buildAndExpand(topic.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public List<TopicDto> list() {
        return repository.findAll().stream()
                .map(topic -> new TopicDto(topic.getId(), topic.getTitle(), topic.getMenssage()))
                .toList();
    }

}