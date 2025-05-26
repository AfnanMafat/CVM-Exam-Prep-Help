package com.uep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uep.model.Branch;
import com.uep.service.BranchService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")

public class BranchController {

	@Autowired
	BranchService branchService;
	
	@GetMapping("/ListBranches")
	public List<Branch> getAllBranches(){ 
		return branchService.GetBranches();
	}
}
