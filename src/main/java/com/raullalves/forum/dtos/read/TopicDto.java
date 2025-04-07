package com.raullalves.forum.dtos.read;

import com.raullalves.forum.model.Topic;

public record TopicDto(
        Long id,
        String title,
        String message) {

        public TopicDto(Topic topic) {
                this(topic.getId(),
                        topic.getTitle(),
                        topic.getMessage());
        }

        public Long getId() {
                return id();
        }
}