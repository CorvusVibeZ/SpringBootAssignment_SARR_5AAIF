package com.SpringBootAssignment.api;


import com.SpringBootAssignment.model.Kunde;
import com.SpringBootAssignment.service.KundenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KundeController {

    @Autowired
    private KundenService kundenService;

    @GetMapping("/kunden")
    public List<Kunde> getAllKunden() {

        return kundenService.listAll();
    }

    @GetMapping("/kunden/{id}")
    public Kunde getKundeById(@PathVariable(value = "id") Long id) {

        return kundenService.get(id);
    }

    @PostMapping(value = "/kunden", consumes = "application/json", produces = "application/json")
    public Kunde createKunde(@Validated @RequestBody Kunde kunde) {

        return kundenService.save(kunde);
    }

    @PutMapping("/kunden/{id}")
    public Kunde updateKunde(@PathVariable(value = "id") Long id, @Validated @RequestBody Kunde kunde) {


         kunde.setId(kundenService.get(id).getId());
         kunde.setVorname(kundenService.get(id).getVorname());
         kunde.setNachname(kundenService.get(id).getNachname());
         kunde.setRechnungsliste(kundenService.get(id).getRechnungsliste());
         kundenService.save(kunde);
         return kunde;
    }


    @DeleteMapping("/kunden/{id}")
    public void deleteKunde(@PathVariable Long id) {

            kundenService.delete(id);
    }



}
