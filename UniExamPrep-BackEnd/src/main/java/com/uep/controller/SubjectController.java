package com.uep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.uep.model.Subject;
import com.uep.service.SubjectService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")

public class SubjectController {
	
	@Autowired
	SubjectService subjectService;
	
	@GetMapping("/ListAllSubBySem/{id}")
	public List<Subject> GetAllSubjectBySemester(@PathVariable Integer id){
		return subjectService.ListAllSubjectsBySemester(id);
	}
	
	@GetMapping("/ListAllSubByBranchSem/{bid}/{id}")
	public List<Subject> GetAllSubjectsBranchSemWise(@PathVariable int bid,@PathVariable int id){
		return subjectService.ListAllByBranchSem(bid, id);
	}
}
