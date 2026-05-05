package com.preethi.assessment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.preethi.assessment.entity.Mentor;
import com.preethi.assessment.service.MentorService;

@RestController
@RequestMapping("/mentors")
public class MentorController {

    @Autowired
    private MentorService mentorService;

    @PostMapping
    public Mentor createMentor(@RequestBody Mentor mentor) {
        return mentorService.saveMentor(mentor);
    }

    @GetMapping
    public List<Mentor> getAllMentors() {
        return mentorService.findAllMentors();
    }

    @GetMapping("/{id}")
    public Mentor getMentorById(@PathVariable Long id) {
        return mentorService.findMentorById(id);
    }

    @PutMapping("/{id}")
    public Mentor updateMentor(@PathVariable Long id, @RequestBody Mentor mentorDetails) {
        return mentorService.updateMentor(id, mentorDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteMentor(@PathVariable Long id) {
        mentorService.deleteMentor(id);
    }

    @GetMapping("/available")
    public List<Mentor> getAvailableMentors() {
        return mentorService.findAvailableMentors();
    }

    @GetMapping("/search")
    public List<Mentor> searchMentors(@RequestParam String name) {
        return mentorService.searchByName(name);
    }
}
