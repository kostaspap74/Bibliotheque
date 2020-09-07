package com.kostas.librairie.infrastructure;

import com.kostas.librairie.DDD;
import com.kostas.librairie.domain.Bibliotheque;
import org.springframework.stereotype.Service;

@DDD.InfrastructureServiceImpl
@Service
public class BibliothequeEntityMapper extends AbstractMapper<Bibliotheque, BibliothequeEntity> {
    @Override
    public Bibliotheque mapToDomain(BibliothequeEntity bibliothequeEntity) {
        final Bibliotheque bibliotheque = new Bibliotheque(bibliothequeEntity.getBid(), bibliothequeEntity.getType(), bibliothequeEntity.getAdresse(), bibliothequeEntity.getDirector(), bibliothequeEntity.getLivres());
        return bibliotheque;
    }

    @Override
    public BibliothequeEntity mapToEntity(Bibliotheque bibliotheque) {
        final BibliothequeEntity bibliothequeEntity = new BibliothequeEntity();
        bibliothequeEntity.setAdresse(bibliotheque.getAdresse());
        bibliothequeEntity.setBid(bibliotheque.getBid());
        bibliothequeEntity.setDirector(bibliotheque.getDirector());
        bibliothequeEntity.setLivres(bibliotheque.getLivres());
        bibliothequeEntity.setType(bibliotheque.getType());
        return bibliothequeEntity;
    }
}
