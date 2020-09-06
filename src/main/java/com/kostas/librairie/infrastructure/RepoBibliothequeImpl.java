package com.kostas.librairie.infrastructure;

import com.kostas.librairie.domain.Bibliotheque;
import com.kostas.librairie.domain.BibliothequeAlreadyExistException;
import com.kostas.librairie.domain.IBibliothequeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RepoBibliothequeImpl implements IBibliothequeRepo {

    @Autowired
    private IBibliothequeJpaRepo bibliothequeJpaRepo;

    @Override
    public Bibliotheque save(Bibliotheque bibliotheque) {
        Bibliotheque bibliotheque1 = bibliothequeJpaRepo.findByBid(bibliotheque.getBid());
        if (bibliotheque1 ==  null){
            bibliothequeJpaRepo.save(bibliotheque);
            return bibliotheque;
        } else {
            throw new BibliothequeAlreadyExistException(bibliotheque.getBid());
        }

    }

    @Override
    public Bibliotheque findByBid(Long bid) {
        Bibliotheque bibliotheque = bibliothequeJpaRepo.findByBid(bid);
        return bibliotheque;
    }


}
