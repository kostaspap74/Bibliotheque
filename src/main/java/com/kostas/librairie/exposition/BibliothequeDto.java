package com.kostas.librairie.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kostas.librairie.domain.Adresse;
import com.kostas.librairie.domain.Livre;
import com.kostas.librairie.domain.Type;

import java.util.List;
import java.util.Set;

public class BibliothequeDto {
    @JsonProperty
    private Type type;
    @JsonProperty
    private Adresse adresse;
    @JsonProperty
    List<LivreDTO> livreDTOList;

    public BibliothequeDto(Type type, Adresse adresse, List<LivreDTO> livreDTOList) {
        this.type = type;
        this.adresse = adresse;
        this.livreDTOList = livreDTOList;
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

    public List<LivreDTO> getLivreDTOList() {
        return livreDTOList;
    }

    public void setLivreDTOList(Set<Livre> livres) {
        this.livreDTOList = livreDTOList;
    }
}
