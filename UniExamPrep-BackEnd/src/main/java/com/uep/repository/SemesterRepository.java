package com.uep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uep.model.Semester;

public interface SemesterRepository extends JpaRepository<Semester, Integer>{

	List<Semester> findByBranchId(int branchId);
}
