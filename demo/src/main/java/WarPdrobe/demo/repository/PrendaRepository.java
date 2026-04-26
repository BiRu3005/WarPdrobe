package WarPdrobe.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WarPdrobe.demo.model.Prenda;

@Repository
public interface PrendaRepository extends JpaRepository<Prenda, Long> {
    // Al heredar de JpaRepository, Spring implementa todo automáticamente
}
