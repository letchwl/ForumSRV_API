package com.raullalves.forum.service;

import com.raullalves.forum.dtos.reply.ReplyRequest;
import com.raullalves.forum.dtos.reply.ReplyResponse;
import com.raullalves.forum.model.Reply;
import com.raullalves.forum.model.Topic;
import com.raullalves.forum.model.User;
import com.raullalves.forum.repository.ReplyRepository;
import com.raullalves.forum.repository.TopicRepository;
import com.raullalves.forum.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ReplyService {

    @Autowired
    private ReplyRepository replyRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TopicRepository topicRepository;

    public ReplyResponse create(ReplyRequest dados) {
        Topic topic = topicRepository.findById(dados.topicId())
                .orElseThrow(() -> new EntityNotFoundException("Tópico não encontrado"));
        User author = userRepository.findById(dados.userId())
                .orElseThrow(() -> new EntityNotFoundException("Autor não encontrado"));

        Reply reply = new Reply();
        reply.setContent(dados.content());
        reply.setTopic(topic);
        reply.setAuthor(author);

        replyRepository.save(reply);

        return new ReplyResponse(reply.getId(), reply.getContent(), reply.getCreatedAt(), author.getUsername(), reply.getTopic().getId());
    }

}
