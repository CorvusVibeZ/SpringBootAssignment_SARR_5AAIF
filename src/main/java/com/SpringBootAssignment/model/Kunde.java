package com.SpringBootAssignment.model;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;



@Entity
@Table(name = "kunde")
public class Kunde {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String vorname;

    @NotNull
    private String nachname;



    @OneToMany
    private List<Rechnung> rechnungsliste;

    public Kunde() {

    }

    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public List<Rechnung> getRechnungsliste() {
        return rechnungsliste;
    }

    public void setRechnungsliste(List<Rechnung> rechnungsliste) {
        this.rechnungsliste = rechnungsliste;
    }
}
