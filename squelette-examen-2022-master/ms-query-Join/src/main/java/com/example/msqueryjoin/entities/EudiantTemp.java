package com.example.msqueryjoin.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EudiantTemp {
    @Id
    private String idEtudiant;
    private String nom;

}
