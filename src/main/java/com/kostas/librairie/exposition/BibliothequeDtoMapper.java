package com.kostas.librairie.exposition;

import com.kostas.librairie.domain.Bibliotheque;
import org.springframework.stereotype.Component;

@Component
public class BibliothequeDtoMapper extends AbstractMapper<BibliothequeDto, Bibliotheque> {


    @Override
    public BibliothequeDto mapToDto(Bibliotheque bibliotheque) {
        final BibliothequeDto bibliothequeDto = new BibliothequeDto();
        bibliothequeDto.setAdresse(bibliotheque.getAdresse());
        bibliothequeDto.setType(bibliotheque.getType());
        bibliothequeDto.setLivreDTOList(bibliotheque.getLivres());
        return bibliothequeDto;
    }

    @Override
    public Bibliotheque mapToDomain(BibliothequeDto dto) {
        final Bibliotheque bibliotheque = new Bibliotheque(dto.getAdresse(), dto.getType());
        return bibliotheque;
    }
}

