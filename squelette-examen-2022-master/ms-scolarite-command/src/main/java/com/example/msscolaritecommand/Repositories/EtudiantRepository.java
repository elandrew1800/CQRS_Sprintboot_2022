package com.example.msscolaritecommand.Repositories;



import com.example.msscolaritecommand.StoredAggregate.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {



}
