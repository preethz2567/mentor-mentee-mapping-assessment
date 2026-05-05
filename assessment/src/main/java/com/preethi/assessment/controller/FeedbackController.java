package com.preethi.assessment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.preethi.assessment.entity.Feedback;
import com.preethi.assessment.service.FeedbackService;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    public Feedback createFeedback(@RequestBody Feedback feedback) {
        return feedbackService.saveFeedback(feedback);
    }

    @GetMapping
         public List<Feedback> getAllFeedbacks() {
        return feedbackService.findAllFeedbacks();
    }

    @GetMapping("/{id}")
    public Feedback getFeedbackById(@PathVariable Long id) {
        return feedbackService.findFeedbackById(id);
    }

      @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable Long id) {
        feedbackService.deleteFeedback(id);
    }

    @GetMapping("/match/{matchId}")
    public List<Feedback> getFeedbacksByMatch(@PathVariable Long matchId) {
        return feedbackService.findByMatchId(matchId);
    }
}
