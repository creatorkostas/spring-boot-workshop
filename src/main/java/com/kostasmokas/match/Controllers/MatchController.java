package com.kostasmokas.match.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kostasmokas.match.Entity.MatchEntity;
import com.kostasmokas.match.Services.MatchService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api/v1/matches")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MatchController {
    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @RequestMapping(path = "/cm") 
    @Transactional
    public MatchEntity createMatchEntity(@RequestBody MatchEntity matchEntity) {
        return matchService.createMatchEntity(matchEntity);
    }

    @RequestMapping(path = "/gam")
    @Transactional
    public List<MatchEntity> getAllMatches() {
        return matchService.getAllMatches();
    }

    @RequestMapping(path = "/{id}")
    @Transactional
    public MatchEntity getMatche(@PathVariable Long id) {  
        return matchService.getMatchById(id);
    }
}
