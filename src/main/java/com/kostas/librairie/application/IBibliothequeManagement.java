package com.kostas.librairie.application;

import com.kostas.librairie.domain.Adresse;
import com.kostas.librairie.domain.Bibliotheque;
import com.kostas.librairie.domain.Type;

public interface IBibliothequeManagement {

    Bibliotheque findByBid (Long id);


    void update(Long id, Bibliotheque bibliotheque);

    void create(Adresse adresse, Type type);
}
