package com.preethi.assessment.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.preethi.assessment.entity.Mentor;

public interface MentorRepository extends JpaRepository<Mentor, Long> {

    List<Mentor> findByAvailability(String availability);

    List<Mentor> findByNameContainingIgnoreCase(String name);
}