package com.raullalves.forum.controller;

import com.raullalves.forum.dtos.reply.ReplyRequest;
import com.raullalves.forum.dtos.reply.ReplyResponse;
import com.raullalves.forum.repository.ReplyRepository;
import com.raullalves.forum.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/replies")
public class ReplyComtroller {

    @Autowired
    private ReplyRepository repository;

    @Autowired
    private ReplyService replyService;

    @PostMapping
    public ResponseEntity<ReplyResponse> create(@RequestBody ReplyRequest dados, UriComponentsBuilder uriBuilder) {
        ReplyResponse replyResponse = replyService.create(dados);

        var uri = uriBuilder
                .path("/replies/{id}")
                .buildAndExpand(replyResponse.id())
                .toUri();

        return ResponseEntity.created(uri).body(replyResponse);
    }

    @GetMapping
    public ResponseEntity<Page<ReplyResponse>> list(@PageableDefault(size = 10) Pageable paginacao) {
        var page = repository.findAllByAtivoTrue(paginacao).map(ReplyResponse::new);
        return ResponseEntity.ok(page);
    }
}
