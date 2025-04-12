package com.raullalves.forum.model;

import com.raullalves.forum.dtos.topic.TopicDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "post")
@Table(name = "posts")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String message;

    public Topic() {}

    public Topic(TopicDto dados) {
        this.title = dados.title();
        this.message = dados.message();
    }

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "topic")
    private List<Reply> replyList = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}