package com.raullalves.forum.dto;

import com.raullalves.forum.model.Reply;

public record ReplyDto(Long id,
                       String menssage) {

    public ReplyDto(Reply reply) {
        this(reply.getId(),
                reply.getMenssage());
    }

}
