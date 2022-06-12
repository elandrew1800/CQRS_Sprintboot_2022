package com.example.coreapi.events;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantAddedEvent {

    private String idEtudiant;
    private String Nom;
    private String promo;
    private String idFormation;
}
