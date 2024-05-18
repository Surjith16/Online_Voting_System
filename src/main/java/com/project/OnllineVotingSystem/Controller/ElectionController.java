package com.project.OnllineVotingSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.OnllineVotingSystem.dto.Election;
import com.project.OnllineVotingSystem.service.ElectionService;
import com.project.OnllineVotingSystem.util.ResponseStructure;


@RestController
@RequestMapping("election")
public class ElectionController {
	@Autowired
	ElectionService service;
	@PostMapping
	public ResponseStructure<Election> saveelection(Election elec){
		return saveelection(elec);
		
	}
}