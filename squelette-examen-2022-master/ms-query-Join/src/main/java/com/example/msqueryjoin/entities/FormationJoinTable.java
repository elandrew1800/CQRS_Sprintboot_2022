package com.example.msqueryjoin.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormationJoinTable {

    @EmbeddedId
    private CompositeKey keyJoin;
    private String EtudiantNom;
    private String FormationNom;
}
