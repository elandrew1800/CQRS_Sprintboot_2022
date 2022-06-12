package com.example.msformationcommand.API;


import com.example.coreapi.DTO.FormationDTO;
import com.example.coreapi.command.AddFormationCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("command")
public class CommandController {

    @Autowired
    CommandGateway commandGateway;

    @PostMapping("formation")
    public CompletableFuture<String> addFormation(@RequestBody FormationDTO formationDTO){

        CompletableFuture<String> response=commandGateway.send(
                new AddFormationCommand(formationDTO.getIdFormation(),
                        formationDTO.getNom(),
                        formationDTO.getDuree()));

        return response;
    }
}
