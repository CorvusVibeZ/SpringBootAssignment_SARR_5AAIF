package com.SpringBootAssignment.repo;

import com.SpringBootAssignment.model.Rechnung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RechnungsRepository extends JpaRepository<Rechnung,Long> {
}
