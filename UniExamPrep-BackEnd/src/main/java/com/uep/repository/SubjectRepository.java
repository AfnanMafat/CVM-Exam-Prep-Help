package com.uep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uep.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{
	
	List<Subject> findBySemesterId(int semesterID);
	
	@Query("SELECT s FROM Subject s WHERE s.branch.id = :branchId AND s.semester.id = :semesterId")
    List<Subject> findByBranchIdAndSemesterId(@Param("branchId") int branchId, @Param("semesterId") int semesterId);

}
