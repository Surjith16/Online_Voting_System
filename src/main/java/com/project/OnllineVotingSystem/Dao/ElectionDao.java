package com.project.OnllineVotingSystem.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.OnllineVotingSystem.dto.Election;
import com.project.OnllineVotingSystem.repo.ElectionRepo;
@Repository
public class ElectionDao {
	@Autowired
	ElectionRepo repo;
	public Election saveElection(Election election) {
		return repo.save(election);
	}
}
