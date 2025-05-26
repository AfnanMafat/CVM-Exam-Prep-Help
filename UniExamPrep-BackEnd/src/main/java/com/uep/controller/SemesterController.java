package com.uep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.uep.model.Semester;
import com.uep.service.SemesterService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")

public class SemesterController {

	@Autowired
	SemesterService semesterService;
	
	@GetMapping("/ListSem/{id}")
	public List<Semester> GetSemesters(@PathVariable Integer id){
		return semesterService.getSemesters(id);
	}
}
 