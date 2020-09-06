package com.kostas.librairie.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    String titre;
    String auteur;
    int nbPages;
    @Enumerated(EnumType.STRING)
    private GenreLitteraire genreLitteraire;

    @ManyToOne
    Bibliotheque bibliotheque;

    public Livre(Bibliotheque bibliotheque, Long id, String titre, String auteur, int nbPages, GenreLitteraire genreLitteraire) {
        this.bibliotheque = bibliotheque;
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.genreLitteraire = genreLitteraire;
    }

    public Livre() {
    }

    public Livre(Long id, String auteur, String titre, GenreLitteraire genreLitteraire, int nbPages) {
    }

    public Bibliotheque getBibliotheque() {
        return bibliotheque;
    }

    public void setBibliotheque(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public GenreLitteraire getGenreLitteraire() {
        return genreLitteraire;
    }

    public void setGenreLitteraire(GenreLitteraire genreLitteraire) {
        this.genreLitteraire = genreLitteraire;
    }
}
