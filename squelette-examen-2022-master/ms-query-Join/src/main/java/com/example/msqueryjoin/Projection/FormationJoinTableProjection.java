package com.example.msqueryjoin.Projection;


import com.example.coreapi.events.EtudiantAddedEvent;
import com.example.coreapi.events.FormationAddedEvent;
import com.example.msqueryjoin.Repository.EtudiantTempRepository;
import com.example.msqueryjoin.Repository.FormationJoinTableRepository;
import com.example.msqueryjoin.Repository.FormationTempRepository;
import com.example.msqueryjoin.entities.CompositeKey;
import com.example.msqueryjoin.entities.EudiantTemp;
import com.example.msqueryjoin.entities.FormationJoinTable;
import com.example.msqueryjoin.entities.FormationTemp;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FormationJoinTableProjection {

    @Autowired
    FormationJoinTableRepository formationJoinTableRepository;

    @Autowired
    FormationTempRepository formationTempRepository;

    @Autowired
   EtudiantTempRepository etudiantTempRepository;


    @EventHandler
    public void addFormation(FormationAddedEvent event)
    {
        formationTempRepository.save(new FormationTemp(event.getIdFormation(), event.getNom()));
    }


    @EventHandler
    public void addEtudiant(EtudiantAddedEvent event)
    {
        etudiantTempRepository.save(new EudiantTemp(event.getIdEtudiant(), event.getNom()));
    }


    @EventHandler
    public void FormationJoin(EtudiantAddedEvent event)
    {
        FormationJoinTable formationJoinTable =new FormationJoinTable();
        formationJoinTable.setKeyJoin(new CompositeKey(event.getIdFormation(), event.getIdEtudiant()));
        formationJoinTable.setEtudiantNom(event.getNom());
        formationJoinTable.setFormationNom(
                formationTempRepository.findById(event.getIdFormation()).get().getNom());

        formationJoinTableRepository.save(formationJoinTable);
    }


}


