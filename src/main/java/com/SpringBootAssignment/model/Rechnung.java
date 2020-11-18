package com.SpringBootAssignment.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rechnung")
public class Rechnung {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long rechnungsnummer;

    @NotNull
    private Date rechnungsdatum;

    @NotNull
    private Long rechnungsbetrag;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kunde_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Kunde kunde;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRechnungsnummer() {
        return rechnungsnummer;
    }

    public void setRechnungsnummer(Long rechnungsnummer) {
        this.rechnungsnummer = rechnungsnummer;
    }

    public Date getRechnungsdatum() {
        return rechnungsdatum;
    }

    public void setRechnungsdatum(Date rechnungsdatum) {
        this.rechnungsdatum = rechnungsdatum;
    }

    public Long getRechnungsbetrag() {
        return rechnungsbetrag;
    }

    public void setRechnungsbetrag(Long rechnungsbetrag) {
        this.rechnungsbetrag = rechnungsbetrag;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
