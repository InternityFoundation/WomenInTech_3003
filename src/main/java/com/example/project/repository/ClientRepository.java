
package  com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.entity.Client;
 
public interface ClientRepository extends JpaRepository<Client, Integer> {
 
}