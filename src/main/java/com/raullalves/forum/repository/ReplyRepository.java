package com.raullalves.forum.repository;

import com.raullalves.forum.model.Reply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

    List<Reply> findByTopicId(Long topicId);

    Page<Reply> findAllByAtivoTrue(Pageable paginacao);
}
