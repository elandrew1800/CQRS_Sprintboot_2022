package com.example.coreapi.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantDTO {

    private String idEtudiant;
    private String nom;
    private String promo;
    private String idFormation;
}
