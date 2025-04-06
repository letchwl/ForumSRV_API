package com.raullalves.forum.dto;

import com.raullalves.forum.model.Topic;

public record TopicDto(
        Long id,
        String title,
        String menssage) {

        public TopicDto(Topic topic) {
                this(topic.getId(),
                        topic.getTitle(),
                        topic.getMenssage());
        }

}