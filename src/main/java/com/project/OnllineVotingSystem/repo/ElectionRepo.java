package com.project.OnllineVotingSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.OnllineVotingSystem.dto.Election;

public interface ElectionRepo extends JpaRepository<Election, Integer>{

}
