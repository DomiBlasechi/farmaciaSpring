package com.alura.farmacia.repository;
import com.alura.farmacia.modelo.Fabricante;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FabricanteRepository extends CrudRepository<Fabricante, Integer> {
    Optional<Fabricante> findByNome (String nome);
}
