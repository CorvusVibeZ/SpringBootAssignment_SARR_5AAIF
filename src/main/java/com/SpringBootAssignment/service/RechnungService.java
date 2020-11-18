package com.SpringBootAssignment.service;


import com.SpringBootAssignment.model.Rechnung;
import com.SpringBootAssignment.repo.RechnungsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RechnungService {

    @Autowired
    private RechnungsRepository repo;

    public List<Rechnung> listAll() {

        return repo.findAll();
    }


    public Rechnung save(Rechnung rechnung) {

        return repo.save(rechnung);
    }

    public Rechnung get(Long id) {

        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);

    }





}
