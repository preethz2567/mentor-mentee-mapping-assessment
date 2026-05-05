package com.preethi.assessment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.preethi.assessment.entity.Feedback;
import com.preethi.assessment.repository.FeedbackRepository;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> findAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    public Feedback findFeedbackById(Long id) {
        return feedbackRepository.findById(id).orElse(null);
    }

    public void deleteFeedback(Long id) {
        feedbackRepository.deleteById(id);
    }

   
    public List<Feedback> findByMatchId(Long matchId) {
        return feedbackRepository.findByMatch_id(matchId);
    }
}
