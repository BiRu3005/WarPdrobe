package WarPdrobe.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WarPdrobe.demo.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Aquí ya tienes métodos como: save(), findAll(), findById(), delete()
}
