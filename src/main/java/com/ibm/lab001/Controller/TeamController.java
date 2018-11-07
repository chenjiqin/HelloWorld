package com.ibm.lab001.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.lab001.domain.Team;
import com.ibm.lab001.repository.TeamRepository;

//@RestController
public class TeamController {
	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping("/teams")
	  public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	  }
	
	@GetMapping("/teams/{id}")
	public Optional<Team> getTeam(@PathVariable Long id) {
		return teamRepository.findById(id);
	}

}
