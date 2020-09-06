package com.kostas.librairie.domain;

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
public class Bibliotheque {
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

    public Bibliotheque(Long bid, Type type, Adresse adresse, Director director, Set<Livre> livres) {
        this.bid = bid;
        this.type = type;
        this.adresse = adresse;
        this.director = director;
        this.livres = livres;
    }

    public Bibliotheque(Adresse adresse, Type type) {
    }

    public Bibliotheque() {
    }

    public void update(Bibliotheque bibliothequemodifiee) {
        this.type = bibliothequemodifiee.getType();
        this.adresse = bibliothequemodifiee.getAdresse();
        this.director = bibliothequemodifiee.getDirector();
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

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Set<Livre> getLivres() {
        return livres;
    }
}
