package com.raullalves.forum.model;

import com.raullalves.forum.dto.TopicDto;
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
    private String menssage;

    public Topic() {}

    public Topic(TopicDto dados) {
        this.title = dados.title();
        this.menssage = dados.menssage();
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

    public String getMenssage() {
        return menssage;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }
}