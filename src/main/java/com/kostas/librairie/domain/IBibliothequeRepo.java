package com.kostas.librairie.domain;

import java.util.Optional;

public interface IBibliothequeRepo {


    Bibliotheque save(Bibliotheque bibliotheque);

    Bibliotheque findByBid(Long bid);
}
