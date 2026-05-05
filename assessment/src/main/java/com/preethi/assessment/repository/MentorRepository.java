package com.preethi.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preethi.assessment.entity.Mentor;

public interface MentorRepository extends JpaRepository<Mentor, Long> {

    
} 