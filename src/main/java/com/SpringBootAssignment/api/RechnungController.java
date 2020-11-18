package com.SpringBootAssignment.api;


import com.SpringBootAssignment.model.Kunde;
import com.SpringBootAssignment.model.Rechnung;
import com.SpringBootAssignment.repo.RechnungsRepository;
import com.SpringBootAssignment.service.KundenService;
import com.SpringBootAssignment.service.RechnungService;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RechnungController {

    @Autowired
    private KundenService kundenService;

    @Autowired
    private RechnungService rechnungService;


    @GetMapping("/kunden/{id}/rechnungen")
    public List<Rechnung> getAllRechnungenById(@PathVariable(value = "id") Long kundenid) {

        Kunde k1 = kundenService.get(kundenid);


        return k1.getRechnungsliste();
    }

    @PostMapping("/kunden/{id]/rechnungen")
    public Rechnung createRechnung(@PathVariable(value = "id") Long kundenid,
                                   @Validated @RequestBody Rechnung rechnung) {

        Kunde k1 = kundenService.get(kundenid);
        rechnung.setKunde(k1);
        return rechnungService.save(rechnung);
    }

    public



}
