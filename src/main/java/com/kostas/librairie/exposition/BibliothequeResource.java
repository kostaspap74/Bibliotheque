package com.kostas.librairie.exposition;

import com.kostas.librairie.domain.Bibliotheque;
import com.kostas.librairie.application.IBibliothequeManagement;
import com.kostas.librairie.domain.BibliothequeNotFoundException;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class BibliothequeResource {

    @Autowired
    private IBibliothequeManagement iBibliothequeManagement;

    @PostMapping(value = "/librairie/create",consumes = { "application/json" }, produces = { "application/json" })
    @ResponseStatus(HttpStatus.CREATED)
    public Bibliotheque createLibrary(@NotNull @RequestBody final Bibliotheque bibliotheque) {
        if (bibliotheque != null) {
            iBibliothequeManagement.create(bibliotheque);
        }
        return bibliotheque;
    }

    @GetMapping(value = "/listeid/{bid}" , produces = {"application/json"})
    public ResponseEntity<Bibliotheque> rechercheLibrairieParBid (@PathVariable("bid") Long bid) {
        final Bibliotheque bibliotheque = iBibliothequeManagement.findByBid(bid);
        if (bibliotheque == null ){
            throw new BibliothequeNotFoundException(HttpStatus.NOT_FOUND, "Bibliothque avec identifiant : " + bid + "n'existe pas" );
        }
        return new ResponseEntity<Bibliotheque>(bibliotheque, HttpStatus.OK);

    }
    @PutMapping(value = "bibliotheque/maj/{bid}", produces = { "application/json" })
    @ResponseStatus(HttpStatus.OK)
    public void updateBibliotheque(@PathVariable("bid") final Long bid,  @NotNull @RequestBody final Bibliotheque bibliotheque) {
        iBibliothequeManagement.update(bid, bibliotheque);    }

}
