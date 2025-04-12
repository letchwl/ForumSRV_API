package com.raullalves.forum.dtos.reply;

import com.raullalves.forum.model.Reply;

import java.time.LocalDateTime;

public record ReplyResponse(Long id,
                            String content,
                            LocalDateTime createdAt,
                            String authorUsername,
                            Long topicId) {

    public ReplyResponse(Reply reply) {
        this(reply.getId(),
                reply.getContent(),
                reply.getCreatedAt(),
                reply.getAuthor(),
                reply.getTopic().getId()
                );
    }
}
