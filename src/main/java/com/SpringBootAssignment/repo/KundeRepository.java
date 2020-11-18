package com.SpringBootAssignment.repo;


import com.SpringBootAssignment.model.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KundeRepository extends JpaRepository<Kunde,Long> {

}
