package com.kostas.librairie.infrastructure;

import com.kostas.librairie.DDD;
import com.kostas.librairie.domain.Bibliotheque;
import com.kostas.librairie.domain.BibliothequeAlreadyExistException;
import com.kostas.librairie.domain.IBibliothequeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@DDD.RepositoryImpl
public class RepoBibliothequeImpl implements IBibliothequeRepo {

    @Autowired
    private IBibliothequeJpaRepo bibliothequeJpaRepo;

    @Autowired
    private BibliothequeEntityMapper mapper;

    @Override
    public Bibliotheque save(Bibliotheque bibliotheque) {
        BibliothequeEntity bibliothequeEntity = bibliothequeJpaRepo.findByBid(bibliotheque.getBid());
        if (bibliothequeEntity ==  null){
            bibliothequeEntity = mapper.mapToEntity(bibliotheque);
            bibliothequeJpaRepo.save(bibliothequeEntity);
            return bibliotheque;
        } else {
            throw new BibliothequeAlreadyExistException(bibliotheque.getBid());
        }

    }

    @Override
    public Bibliotheque findByBid(Long bid) {
        BibliothequeEntity bibliothequeEntity = bibliothequeJpaRepo.findByBid(bid);
        return mapper.mapToDomain(bibliothequeEntity);
    }


}
