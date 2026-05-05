package com.preethi.assessment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.preethi.assessment.entity.Match;
import com.preethi.assessment.repository.MatchRepository;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }

    public List<Match> findAllMatches() {
        return matchRepository.findAll();
    }

    public Match getMatchById(Long id) {
        return matchRepository.findById(id).orElse(null);
    }

    public Match updateMatch(Long id, Match matchDetails) {
        Match match = matchRepository.findById(id).orElse(null);
        if (match != null) {
            match.setStatus(matchDetails.getStatus());
            match.setCreated_at(matchDetails.getCreated_at());
            return matchRepository.save(match);
        }
        return null;
    }

    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }

    public List<Match> findByStatus(String status) {
        return matchRepository.findByStatus(status);
    }

    public List<Match> findByMentorId(Long mentorId) {
        return matchRepository.findByMentor_Mentor_id(mentorId);
    }

    public List<Match> findByMenteeId(Long menteeId) {
        return matchRepository.findByMentee_Mentee_id(menteeId);
    }
}
