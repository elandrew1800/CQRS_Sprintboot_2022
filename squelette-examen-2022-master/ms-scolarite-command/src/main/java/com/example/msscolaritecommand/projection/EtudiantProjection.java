package com.example.msscolaritecommand.projection;


import com.example.coreapi.events.EtudiantAddedEvent;
import com.example.msscolaritecommand.Repositories.EtudiantRepository;
import com.example.msscolaritecommand.StoredAggregate.Etudiant;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EtudiantProjection {


    @Autowired
    EtudiantRepository etudiantRepository;

    @EventHandler
    public  void addEtudiant(EtudiantAddedEvent event)
    {
        Etudiant etudiant = new Etudiant(event.getIdEtudiant(), event.getNom(), event.getPromo(),event.getIdFormation());
        etudiantRepository.save(etudiant);
    }
}
