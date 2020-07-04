package com.example.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Client;



@Repository
public interface JobDao extends JpaRepository<Client, String> {

	Client findById(int id);
	List<Client> findBySkills(String skills);

	//User findByUserId(long userId);
}
