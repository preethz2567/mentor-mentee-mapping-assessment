package com.preethi.assessment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.preethi.assessment.entity.Match;
import com.preethi.assessment.service.MatchService;

@RestController
@RequestMapping("/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping
    public Match createMatch(@RequestBody Match match) {
        return matchService.createMatch(match);
    }

    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.findAllMatches();
    }

    @GetMapping("/{id}")
    public Match getMatchById(@PathVariable Long id) {
        return matchService.getMatchById(id);
    }

    @PutMapping("/{id}")
    public Match updateMatch(@PathVariable Long id, @RequestBody Match matchDetails) {
        return matchService.updateMatch(id, matchDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteMatch(@PathVariable Long id) {
        matchService.deleteMatch(id);
    }

    @GetMapping("/status/{status}")
    public List<Match> getMatchesByStatus(@PathVariable String status) {
        return matchService.findByStatus(status);
    }

    
    @GetMapping("/mentor/{mentorId}")
       public List<Match> getMatchesByMentor(@PathVariable Long mentorId) {
        return matchService.findByMentorId(mentorId);
    }

    
    @GetMapping("/mentee/{menteeId}")
    public List<Match> getMatchesByMentee(@PathVariable Long menteeId) {
        return matchService.findByMenteeId(menteeId);
    }
}
