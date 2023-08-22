package com.silvia.silviabackend.silvia.services;

import java.util.List;
import java.util.Optional;

import com.silvia.silviabackend.silvia.models.entities.Pago;

public interface PagoService {
    
    List<Pago> findAll();

    Optional<Pago> findById(Long id);

    Pago save(Pago pago);

    Optional<Pago> update(Pago pago, Long id);

    void remove(Long id);
}
