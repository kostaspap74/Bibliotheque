package com.kostas.librairie.application;

import com.kostas.librairie.DDD;
import com.kostas.librairie.domain.Adresse;
import com.kostas.librairie.domain.Bibliotheque;
import com.kostas.librairie.domain.IBibliothequeRepo;
import com.kostas.librairie.domain.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@DDD.ApplicationService
@Service
@Transactional
public class BibliothequeManagementImpl implements IBibliothequeManagement {

    @Autowired
    private IBibliothequeRepo bibliothequeRepo;

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

    @Override
    public void create(Adresse adresse, Type type) {
        final Bibliotheque bibliotheque = new Bibliotheque(type, adresse);
        bibliothequeRepo.save(bibliotheque);
    }

    private Bibliotheque obtain(Long bid) {
        return (Bibliotheque) bibliothequeRepo.findByBid(bid);

    }


}
