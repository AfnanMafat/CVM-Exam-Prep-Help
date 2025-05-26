package com.uep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uep.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{

}
