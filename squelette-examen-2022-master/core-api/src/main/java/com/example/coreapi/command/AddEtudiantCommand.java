package com.example.coreapi.command;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddEtudiantCommand {

    @TargetAggregateIdentifier
    private String idEtudiant;
    private String nom;
    private String promo;
    private String idFormation;
}
