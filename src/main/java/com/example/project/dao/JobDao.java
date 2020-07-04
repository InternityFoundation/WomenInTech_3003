package com.example.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.PersonalDetails;



@Repository
public interface JobDao extends JpaRepository<PersonalDetails, Long> {

	PersonalDetails findByJobId(long jobId);
	//User findByUserId(long userId);
}
