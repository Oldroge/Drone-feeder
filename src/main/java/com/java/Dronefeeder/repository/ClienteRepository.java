package com.java.Dronefeeder.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.java.Dronefeeder.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
  List<Cliente> findAll();
}
