package com.preethi.assessment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.preethi.assessment.entity.Mentee;
import com.preethi.assessment.repository.MenteeRepository;

@Service
public class MenteeService {

    @Autowired
    private MenteeRepository menteeRepository;

    public Mentee saveMentee(Mentee mentee) {
        return menteeRepository.save(mentee);
    }

    public List<Mentee> findAllMentees() {
        return menteeRepository.findAll();
    }

    public Mentee findMenteeById(Long id) {
        return menteeRepository.findById(id).orElse(null);
    }

    public Mentee updateMentee(Long id, Mentee menteeDetails) {
        Mentee mentee = menteeRepository.findById(id).orElse(null);
        if (mentee != null) {
            mentee.setName(menteeDetails.getName());
            mentee.setGoals(menteeDetails.getGoals());
            mentee.setSkill_gaps(menteeDetails.getSkill_gaps());
            return menteeRepository.save(mentee);
        }
        return null;
    }

    public void deleteMentee(Long id) {
        menteeRepository.deleteById(id);
    }

    public List<Mentee> searchByName(String name) {
        return menteeRepository.findByNameContainingIgnoreCase(name);
    }
}
