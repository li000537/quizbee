package com.demo.quizbee.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.quizbee.web.dto.QuizDTO;

@Repository("quizRepository")
public interface QuizRepository extends JpaRepository<QuizDTO, Long> {
}
