package com.example.coreapi.command;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddFormationCommand {


    @TargetAggregateIdentifier
    private String idFormation;
    private String nom;
    private String duree;


}
