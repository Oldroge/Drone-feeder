package com.java.Dronefeeder.repository;

import com.java.Dronefeeder.model.RetiradaEntrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**Interface Professional Repository.*/
@Repository
public interface RetiradaEntregaRepository extends JpaRepository<RetiradaEntrega, Long> {}