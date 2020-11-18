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

}
