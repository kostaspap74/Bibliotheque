package com.kostas.librairie.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kostas.librairie.domain.Adresse;
import com.kostas.librairie.domain.Livre;
import com.kostas.librairie.domain.Type;
import com.sun.istack.NotNull;

import java.util.List;
import java.util.Set;

public class BibliothequeDto {
    @JsonProperty
    private Type type;
    @JsonProperty
    @NotNull
    private Adresse adresse;


    public BibliothequeDto(Type type, Adresse adresse) {
        this.type = type;
        this.adresse = adresse;
    }

    public BibliothequeDto() {

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

}
