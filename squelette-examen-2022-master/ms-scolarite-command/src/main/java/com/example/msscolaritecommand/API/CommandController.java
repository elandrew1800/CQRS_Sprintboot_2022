package com.example.msscolaritecommand.API;


import com.example.coreapi.DTO.EtudiantDTO;
import com.example.coreapi.command.AddEtudiantCommand;
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

    @PostMapping("etudiant")
    public CompletableFuture<String> addEtudiant(@RequestBody EtudiantDTO etudiantDTO){

        CompletableFuture<String> response=commandGateway.send(
                new AddEtudiantCommand(etudiantDTO.getIdEtudiant(),
                        etudiantDTO.getNom(),
                        etudiantDTO.getPromo(),etudiantDTO.getIdFormation()));

        return response;
    }
}
