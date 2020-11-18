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

    @PostMapping(value = "/kunden", consumes = "application/json", produces = "application/json")
    public Kunde createKunde(@Validated @RequestBody Kunde kunde) {

        return kundenService.save(kunde);
    }

    @PutMapping("/kunden/{id}")
    public Kunde updateKunde(@PathVariable Long id, @Validated @RequestBody Kunde kunde) {

        Kunde k1 = kundenService.get(id);
        Kunde k2 = new Kunde(k1.getVorname(),k1.getNachname());
        return kundenService.save(k2);
    }


    @DeleteMapping("/kunden/{id}")
    public void deleteKunde(@PathVariable Long id) {

            kundenService.delete(id);
    }



}
