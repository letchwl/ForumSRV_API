package com.raullalves.forum.model;

import com.raullalves.forum.dtos.reply.ReplyResponse;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(of = "id")
@Entity(name = "reply")
@Table(name = "replys")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    private String content;
    private LocalDateTime createdAt = LocalDateTime.now();
    private boolean ativo = true;

    public Reply() {}

    public Reply(ReplyResponse dados) {
        this.id = dados.id();
        this.author = dados.authorUsername();
        this.content = dados.content();
        this.createdAt = dados.createdAt();
    }

    @ManyToOne
    private Topic topic;

    @ManyToOne
    private User Author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        Author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
