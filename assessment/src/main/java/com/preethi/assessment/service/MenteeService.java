package com.preethi.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preethi.assessment.entity.Mentee;
import com.preethi.assessment.repository.MenteeRepository;

@Service
public class MenteeService {


    @Autowired
    private MenteeRepository menteeRepo;

    public MenteeService(MenteeRepository menteeRepository) {
        this.menteeRepo = menteeRepository;
    }

    public MenteeRepository getMenteeRepository() {
        return menteeRepo;
    }

    public Mentee saveMentee(Object mentee) {
        return menteeRepo.save(mentee);
    }

    public List<Mentee> getAllMentee(){
        return menteeRepo.findAll();
    }

    public String findMenteeById(Long id) {
        return menteeRepo.findById(id)
                .map(mentee -> mentee.getName())
                .orElse("Mentee not found");
    }


    public Mentee updateMentee(Long id, Mentee menteeDetails) {
        return menteeRepo.findById(id)
                .map(mentee -> {
                    mentee.setName(menteeDetails.getName());
                    mentee.setGoals(menteeDetails.getGoals());
                    mentee.setSkill_gaps(menteeDetails.getSkill_gaps());
                    return menteeRepo.save(mentee);
                })
                .orElse(null);
    }

    public void deleteMentee(Long id) {
        menteeRepo.deleteById(id);
    }

    public Object findMenteeObjectivesById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMenteeObjectivesById'");
    }






    

    
    
}
