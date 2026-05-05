package com.preethi.assessment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.preethi.assessment.entity.Mentor;
import com.preethi.assessment.repository.MentorRepository;

@Service
public class MentorService {

    @Autowired
    private MentorRepository mentorRepository;

    public Mentor saveMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    public List<Mentor> findAllMentors() {
        return mentorRepository.findAll();
    }

    public Mentor findMentorById(Long id) {
        return mentorRepository.findById(id).orElse(null);
    }

    public Mentor updateMentor(Long id, Mentor mentorDetails) {
        Mentor mentor = mentorRepository.findById(id).orElse(null);
        if (mentor != null) {
            mentor.setName(mentorDetails.getName());
            mentor.setExpertise(mentorDetails.getExpertise());
            mentor.setAvailability(mentorDetails.getAvailability());
            return mentorRepository.save(mentor);
        }
        return null;
    }

    public void deleteMentor(Long id) {
        mentorRepository.deleteById(id);
    }

    public List<Mentor> findAvailableMentors() {
        return mentorRepository.findByAvailability("AVAILABLE");
    }

    public List<Mentor> searchByName(String name) {
        return mentorRepository.findByNameContainingIgnoreCase(name);
    }
}
