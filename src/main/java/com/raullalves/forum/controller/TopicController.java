package com.raullalves.forum.controller;

import com.raullalves.forum.dtos.topic.CreateTopicDto;
import com.raullalves.forum.dtos.topic.TopicDto;
import com.raullalves.forum.dtos.topic.UpdateTopicDto;
import com.raullalves.forum.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService service;

    @GetMapping
    public ResponseEntity<List<TopicDto>> list() {
      service.list();
      return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<TopicDto> create(@RequestBody CreateTopicDto dto, UriComponentsBuilder uriBuilder) {
        TopicDto topic = service.create(dto);
        var uri = uriBuilder.path("/topic/create/{id}").buildAndExpand(topic.getId()).toUri();

        return ResponseEntity.created(uri).body(topic);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TopicDto> update(
            @PathVariable Long id,
            @RequestBody UpdateTopicDto dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}