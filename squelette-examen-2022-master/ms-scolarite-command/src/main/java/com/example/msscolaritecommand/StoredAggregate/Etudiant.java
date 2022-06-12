package com.example.msscolaritecommand.StoredAggregate;

import com.example.coreapi.command.AddEtudiantCommand;
import com.example.coreapi.events.EtudiantAddedEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.util.Assert;


import javax.persistence.Entity;

import javax.persistence.Id;

@Aggregate
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Etudiant {

    @Id

    private String idEtudiant;
    private String nom;
    private String promo;
    private String idFormation;

    @CommandHandler
    public  Etudiant(AddEtudiantCommand cmd){
        // check integrity
        Assert.notNull(cmd.getIdEtudiant(),"idEtudiant should be not null");
        Assert.notNull(cmd.getNom(),"name should be not null");

        AggregateLifecycle.apply(new EtudiantAddedEvent(cmd.getIdEtudiant(),
                cmd.getNom(),
                cmd.getPromo(), cmd.getIdFormation()));

    }

  @EventSourcingHandler
    public void on(EtudiantAddedEvent event)
    {
        this.idEtudiant=event.getIdEtudiant();
        this.nom= event.getNom();

    }

}