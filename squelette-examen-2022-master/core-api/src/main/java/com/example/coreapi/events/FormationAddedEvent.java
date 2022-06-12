package com.example.coreapi.events;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormationAddedEvent {

    private String idFormation;
    private String nom;
    private String duree;
}
