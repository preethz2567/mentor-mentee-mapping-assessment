package com.preethi.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preethi.assessment.entity.Mentor;
import com.preethi.assessment.repository.MentorRepository;

@Service
public class MentorService {

    @Autowired
    private MentorRepository mentorRepo;

    public MentorService(MentorRepository mentorRepository) {
        this.mentorRepo = mentorRepository;
    }

    public MentorRepository getMentorRepository() {
        return mentorRepo;
    }

    public Mentor saveMentor(Object mentor) {
        return mentorRepo.save(mentor);
    }

    public List<Mentor> findAllMentors() {
        return mentorRepo.findAll();
    }

    public String findMentorById(Long id) {
        return mentorRepo.findById(id)
                .map(mentor -> mentor.getName())
                .orElse("Mentor not found");
    }

    public List<String> findMentorExpertiseById(Long id) {
        return mentorRepo.findById(id)
                .map(mentor -> mentor.getExpertise())
                .orElse(null);
    }

    public Mentor updateMentor(Long id, Object mentorDetails) {
        return mentorRepo.findById(id)
                .map(mentor -> {
                    mentor.setName(mentorDetails.getName());
                    mentor.setExpertise(mentorDetails.getExpertise());
                    return mentorRepo.save(mentor);
                })
                .orElse(null);
    }

    public void deleteMentor(Long id) {
        mentorRepo.deleteById(id);
    }

    public Object findMentorAvailabilityById(Long id) {
        return mentorRepo.findById(id)
                .map(mentor -> mentor.getAvailability())
                .orElse(null);
    }

    public List<Mentor> findMentorsByExpertise(String expertise) {
        return mentorRepo.findAll().stream()
                .filter(mentor -> mentor.getExpertise().contains(expertise))
                .toList();
    }

    public List<Mentor> findAvailableMentors() {
        return mentorRepo.findAll().stream()
                .filter(mentor -> "AVAILABLE".equals(mentor.getAvailability()))
                .toList();
    }

    public List<Mentor> findMentorsByName(String name) {
        return mentorRepo.findAll().stream()
                .filter(mentor -> mentor.getName().equalsIgnoreCase(name))
                .toList();
    }



}
