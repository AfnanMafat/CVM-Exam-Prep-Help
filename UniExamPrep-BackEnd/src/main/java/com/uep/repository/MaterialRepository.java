package com.uep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uep.model.Material;
import com.uep.model.Semester;

public interface MaterialRepository extends JpaRepository<Material, Integer>{

	List<Material> findBySubjectId(int subId);
}
