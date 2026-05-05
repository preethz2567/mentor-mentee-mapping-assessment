package com.preethi.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.preethi.assessment.service.MenteeService;

@RestController
@RequestMapping("/mentees")
public class MenteeController {
    

    @Autowired
    private MenteeService menteeService;

    public MenteeController(MenteeService menteeService) {
        this.menteeService = menteeService;
    }

    public MenteeService getMenteeService() {
        return menteeService;
    }

    public void setMenteeService(MenteeService menteeService) {
        this.menteeService = menteeService;
    }

    @GetMapping("/{id}")
    public Object getMenteeById(@PathVariable Long id) {
        return menteeService.findMenteeById(id);
    }   

    @GetMapping("/{id}/goals")
    public Object getMenteeObjectivesById(@PathVariable Long id) {
        return menteeService.findMenteeObjectivesById(id);   
     }

    @PostMapping("/")
    public Object createMentee(@RequestBody Object mentee) {                
        return menteeService.saveMentee(mentee);
    }

     @GetMapping("/") 
     public Object getAllMentees() {
         return menteeService.getAllMentee();
     }  
     
     

    

     


     



}
