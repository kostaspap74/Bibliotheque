package com.kostas.librairie.domain;

public class BibliothequeAlreadyExistException extends RuntimeException {
    public BibliothequeAlreadyExistException(Long bid) {
        super("Il existe déjà une bibliotheque avec l'identifant : " + bid);
    }
}
