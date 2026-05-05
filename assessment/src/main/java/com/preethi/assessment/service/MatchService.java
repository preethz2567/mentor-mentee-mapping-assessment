package com.preethi.assessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preethi.assessment.entity.Match;
import com.preethi.assessment.repository.MatchRepository;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository; 
 
    public MatchRepository getMatchRepository() {
        return matchRepository;
    }

    public void setMatchRepository(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }   

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public MatchService() {
    }

    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }

    public Match getMatchById(Long id) {
        return matchRepository.findById(id).orElse(null);
    }
    
    public Match updateMatch(Long id, Match matchDetails) {
        return matchRepository.findById(id)
                .map(match -> {
                    // Update match properties here
                    return matchRepository.save(match);
                })
                .orElse(null);
    }

    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }

}
