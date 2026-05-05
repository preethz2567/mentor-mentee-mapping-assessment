package com.preethi.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preethi.assessment.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    
}
