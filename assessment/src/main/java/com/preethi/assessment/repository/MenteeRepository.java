package com.preethi.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preethi.assessment.entity.Mentee;

public interface MenteeRepository extends JpaRepository<Mentee, Long> {
    
}
