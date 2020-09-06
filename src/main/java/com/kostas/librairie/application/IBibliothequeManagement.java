package com.kostas.librairie.application;

import com.kostas.librairie.domain.Bibliotheque;

public interface IBibliothequeManagement {

    void create (Bibliotheque bibliotheque);
    Bibliotheque findByBid (Long id);


    void update(Long id, Bibliotheque bibliotheque);
}
