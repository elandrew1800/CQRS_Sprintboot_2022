package com.example.msqueryjoin.Repository;

import com.example.msqueryjoin.entities.CompositeKey;
import com.example.msqueryjoin.entities.FormationJoinTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationJoinTableRepository extends JpaRepository<FormationJoinTable, CompositeKey> {

}
