package com.kostas.librairie.infrastructure;

import com.kostas.librairie.domain.Adresse;
import com.kostas.librairie.domain.Director;
import com.kostas.librairie.domain.Livre;
import com.kostas.librairie.domain.Type;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name ="Bibliotheque")
public class BibliothequeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bid;

    //private String id;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Embedded
    private Adresse adresse;
    @Embedded
    private Director director;

    @OneToMany
    Set<Livre> livres;

    public BibliothequeEntity(Long bid, Type type, Adresse adresse, Director director, Set<Livre> livres) {
        this.bid = bid;
        this.type = type;
        this.adresse = adresse;
        this.director = director;
        this.livres = livres;
    }

    public BibliothequeEntity() {
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Adresse getAdresse() {
        return adresse;
    }



    public Director getDirector() {
        return director;
    }


    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }
}
