
package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.entity.Client;
import com.example.project.repository.ClientRepository;
 
@Service
@Transactional
public class ClientService {
 
    @Autowired
    private ClientRepository repo;
     
     public void save(Client client) {
        repo.save(client);
    }
  }