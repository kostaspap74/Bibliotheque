package com.kostas.librairie.infrastructure;

import com.kostas.librairie.domain.Bibliotheque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBibliothequeJpaRepo extends JpaRepository<Bibliotheque, Long> {

    Bibliotheque findByBid(Long bid);
}
