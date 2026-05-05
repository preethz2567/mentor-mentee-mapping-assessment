package com.preethi.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preethi.assessment.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {
    
}
