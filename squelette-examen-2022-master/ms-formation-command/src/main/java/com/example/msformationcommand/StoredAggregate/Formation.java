package com.example.msformationcommand.StoredAggregate;

import com.example.coreapi.command.AddFormationCommand;
import com.example.coreapi.events.FormationAddedEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.util.Assert;


import javax.persistence.Entity;

import javax.persistence.Id;

@Aggregate
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Formation {

    @AggregateIdentifier
    @Id
    private String idFormation;
    private String nom;
    private String duree;

 @CommandHandler
    public  Formation(AddFormationCommand cmd){
        // check integrity
     Assert.notNull(cmd.getIdFormation(),"IdFormation should be not null");
     Assert.notNull(cmd.getNom(),"nom should be not null");

       // propagate the event
     AggregateLifecycle.apply(new FormationAddedEvent(cmd.getIdFormation(),
             cmd.getNom(),
             cmd.getDuree()));

    }

  @EventSourcingHandler
    public void on(FormationAddedEvent event)
    {
       //complete the code
        this.idFormation=event.getIdFormation();
        this.nom= event.getNom();

    }
}
