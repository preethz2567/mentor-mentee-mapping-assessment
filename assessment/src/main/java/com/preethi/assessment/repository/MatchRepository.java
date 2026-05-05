package com.preethi.assessment.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.preethi.assessment.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {

    List<Match> findByStatus(String status);

    List<Match> findByMentor_Mentor_id(Long mentor_id);

    List<Match> findByMentee_Mentee_id(Long mentee_id);
}
