package com.kostas.librairie.application;

import com.kostas.librairie.domain.Bibliotheque;
import com.kostas.librairie.domain.IBibliothequeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BibliothequeManagementImpl implements IBibliothequeManagement {

    @Autowired
    private IBibliothequeRepo bibliothequeRepo;

    public void create(Bibliotheque bibliotheque) {
        bibliothequeRepo.save(bibliotheque);
    }

    @Override
    public Bibliotheque findByBid(Long bid) {
        return (Bibliotheque) this.bibliothequeRepo.findByBid(bid);
    }

    @Override
    public void update(Long id, Bibliotheque bibliothequemodifiee) {
        Bibliotheque bibliotheque = obtain(id);
        bibliotheque.update(bibliothequemodifiee);
        bibliothequeRepo.save(bibliotheque);
    }

    private Bibliotheque obtain(Long bid) {
        return (Bibliotheque) bibliothequeRepo.findByBid(bid);

    }


}
