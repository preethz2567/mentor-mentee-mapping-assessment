package com.preethi.assessment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.preethi.assessment.entity.Mentee;
import com.preethi.assessment.service.MenteeService;

@RestController
@RequestMapping("/mentees")
public class MenteeController {

    @Autowired
    private MenteeService menteeService;

    @PostMapping
    public Mentee createMentee(@RequestBody Mentee mentee) {
        return menteeService.saveMentee(mentee);
    }

    @GetMapping
    public List<Mentee> getAllMentees() {
        return menteeService.findAllMentees();
    }

    @GetMapping("/{id}")
    public Mentee getMenteeById(@PathVariable Long id) {
        return menteeService.findMenteeById(id);
    }

    @PutMapping("/{id}")
    public Mentee updateMentee(@PathVariable Long id, @RequestBody Mentee menteeDetails) {
        return menteeService.updateMentee(id, menteeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteMentee(@PathVariable Long id) {
        menteeService.deleteMentee(id);
    }

    @GetMapping("/search")
    public List<Mentee> searchMentees(@RequestParam String name) {
        return menteeService.searchByName(name);
    }
}
