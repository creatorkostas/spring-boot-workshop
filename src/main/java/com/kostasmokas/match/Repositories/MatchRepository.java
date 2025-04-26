package com.kostasmokas.match.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kostasmokas.match.Entity.MatchEntity;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, Long> {
    
}
