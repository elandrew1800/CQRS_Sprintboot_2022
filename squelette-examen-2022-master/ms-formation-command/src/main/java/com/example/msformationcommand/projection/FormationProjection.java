package com.example.msformationcommand.projection;


import com.example.coreapi.events.FormationAddedEvent;
import com.example.msformationcommand.Repositories.FormationRepository;
import com.example.msformationcommand.StoredAggregate.Formation;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FormationProjection {

    @Autowired
    FormationRepository formationRepository;

    @EventHandler
    public  void addFormation(FormationAddedEvent event)
    {
        Formation formation = new Formation(event.getIdFormation(), event.getNom(), event.getDuree());
        formationRepository.save(formation);
    }
}
