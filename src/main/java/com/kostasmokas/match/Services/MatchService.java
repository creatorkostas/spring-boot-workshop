package com.kostasmokas.match.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kostasmokas.match.Entity.MatchEntity;
import com.kostasmokas.match.Repositories.MatchRepository;

@Service
public class MatchService {
    private MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public MatchEntity createMatchEntity(MatchEntity matchEntity) {
        return matchRepository.save(matchEntity);
    }

    public List<MatchEntity> getAllMatches() {
        return matchRepository.findAll();
    }

    
}
