package com.kostas.librairie.domain;

import java.util.Set;


public class Bibliotheque {
    private Long bid;
    private Type type;
    private Adresse adresse;
    private Director director;
    Set<Livre> livres;

    public Bibliotheque(Long bid, Type type, Adresse adresse, Director director, Set<Livre> livres) {
        this.bid = bid;
        this.type = type;
        this.adresse = adresse;
        this.director = director;
        this.livres = livres;
    }

    public Bibliotheque() {
    }

    public Bibliotheque(Type type, Adresse adresse) {
        this.type = type;
        this.adresse = adresse;
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
