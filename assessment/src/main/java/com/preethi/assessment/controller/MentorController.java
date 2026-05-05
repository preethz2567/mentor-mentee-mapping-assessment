package com.preethi.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.preethi.assessment.service.MentorService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class MentorController {
   
    @Autowired
    MentorService mentorService;

    public MentorController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    public MentorService getMentorService() {
        return mentorService;
    }

    public void setMentorService(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @PostMapping("/mentors")
    public Object createMentor(@RequestBody Object mentor) {                
        return mentorService.saveMentor(mentor);
    }  

    @GetMapping("/mentors") 
    public Object getAllMentors() {
        return mentorService.findAllMentors();
    }

    @GetMapping("/mentors/{id}")
    public Object getMentorById(@PathVariable Long id) {
        return mentorService.findMentorById(id);
    }   

    @GetMapping("/mentors/{id}/expertise")
    public Object getMentorExpertiseById(@PathVariable Long id) {
        return mentorService.findMentorExpertiseById(id);   
     }  
     
    @GetMapping("/mentors/{id}/availability")
    public Object getMentorAvailabilityById(@PathVariable Long id) {
        return mentorService.findMentorAvailabilityById(id);
    }   

    @PutMapping("/mentors/{id}")
    public Object updateMentor(@PathVariable Long id, @RequestBody Object mentorDetails)    {
        return mentorService.updateMentor(id, mentorDetails);
    }   

    @DeleteMapping("/mentors/{id}")
    public void deleteMentor(@PathVariable Long id) {
        mentorService.deleteMentor(id);
    }

    @GetMapping("/mentors/expertise/{expertise}")
    public Object getMentorsByExpertise(@PathVariable String expertise) {     
        return mentorService.findMentorsByExpertise(expertise);
    }

    @GetMapping("/mentors/{id}/matches")
    public Object getMentorMatchesById(@PathVariable Long id) {     
        // Implement logic to retrieve matches for the mentor with the given ID
        return null; // Placeholder return statement
    }

    @GetMapping("/mentors/{id}/feedback")
    public Object getMentorFeedbackById(@PathVariable Long id) {
        // Implement logic to retrieve feedback for the mentor with the given ID
        return null; // Placeholder return statement
    }   

    @PostMapping("/mentors/{id}/matches")
    public Object createMatchForMentor(@PathVariable Long id, @RequestBody Object matchObject   ) {
        // Implement logic to create a match for the mentor with the given ID
        return null; // Placeholder return statement
    }   

    @PostMapping("/mentors/{id}/feedback")
    public Object createFeedbackForMentor(@PathVariable Long id, @RequestBody Object feedbackObject) {
        // Implement logic to create feedback for the mentor with the given ID
        return null; // Placeholder return statement
    }

    @PostMapping("/mentors/available")
    public Object getAvailableMentors() {
        return mentorService.findAvailableMentors();
    }   

    @GetMapping("/mentors/name/{name}")
    public Object getMentorsByName(@PathVariable String name) {
        return mentorService.findMentorsByName(name);
    }

    @PutMapping("/mentors/{id}/availability")
    public Object updateMentorAvailability(@PathVariable Long id, @RequestBody Object availabilityObject) {
        // Implement logic to update the availability of the mentor with the given ID
        return null; // Placeholder return statement
    }

    @PutMapping("/mentors/{id}/expertise")
    public Object updateMentorExpertise(@PathVariable Long id, @RequestBody Object expertiseObject) {
        // Implement logic to update the expertise of the mentor with the given ID
        return null; // Placeholder return statement
    }

    @DeleteMapping("/mentors/{id}/matches")
    public void deleteMentorMatches(@PathVariable Long id) {
        // Implement logic to delete matches for the mentor with the given ID
    }       







   


    

    

}
