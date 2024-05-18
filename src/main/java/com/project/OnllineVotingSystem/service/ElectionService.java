package com.project.OnllineVotingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.project.OnllineVotingSystem.Dao.ElectionDao;
import com.project.OnllineVotingSystem.dto.Election;
import com.project.OnllineVotingSystem.util.ResponseStructure;
@Service
public class ElectionService {
	@Autowired
	ElectionDao dao;
		ResponseStructure<Election> saveElection(Election elec){
		ResponseStructure<Election> structure=new ResponseStructure<Election>();
		Election saveElection=dao.saveElection(elec);
		if(saveElection!=null) {
			structure.setData(saveElection);
			structure.setMessage("election details saved successfully");
			structure.setStatus(HttpStatus.CREATED.value());
			return structure;
		}else
			return null;
		}	
}
