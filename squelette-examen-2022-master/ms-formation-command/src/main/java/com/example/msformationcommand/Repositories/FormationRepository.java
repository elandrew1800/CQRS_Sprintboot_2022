package com.example.msformationcommand.Repositories;

import com.example.msformationcommand.StoredAggregate.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FormationRepository extends  JpaRepository<Formation,Long> {
}
