package io.aditi.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.aditi.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {
    
    Team findByTeamName(String teamName);

}
