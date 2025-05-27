package com.uep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.model.Subject;
import com.uep.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	SubjectRepository subjectRepository;
	
	public List<Subject> ListAllSubjectsBySemester(int id){
		return subjectRepository.findBySemesterId(id);
	}
}
