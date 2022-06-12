package com.example.coreapi.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormationDTO {

    private String idFormation;
    private String nom;
    private String duree;


}
