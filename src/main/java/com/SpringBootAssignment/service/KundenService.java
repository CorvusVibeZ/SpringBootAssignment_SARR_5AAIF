package com.SpringBootAssignment.service;


import com.SpringBootAssignment.model.Kunde;
import com.SpringBootAssignment.repo.KundeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KundenService {

    @Autowired
    private KundeRepository repo;


    public List<Kunde> listAll() {
       return repo.findAll();
    }


    public Kunde save(Kunde kunde) {

       return repo.save(kunde);
    }

    public Kunde get(Long id) {

        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);

    }







}
