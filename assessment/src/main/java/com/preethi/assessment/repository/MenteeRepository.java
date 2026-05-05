package com.preethi.assessment.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.preethi.assessment.entity.Mentee;

public interface MenteeRepository extends JpaRepository<Mentee, Long> {

    List<Mentee> findByNameContainingIgnoreCase(String name);
}
