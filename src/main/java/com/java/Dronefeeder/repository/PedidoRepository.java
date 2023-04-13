package com.java.Dronefeeder.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.java.Dronefeeder.model.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {

  Optional<Pedido> findById(Long id);
}
