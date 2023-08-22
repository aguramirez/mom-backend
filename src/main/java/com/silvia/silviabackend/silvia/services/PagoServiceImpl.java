package com.silvia.silviabackend.silvia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.silvia.silviabackend.silvia.models.entities.Pago;
import com.silvia.silviabackend.silvia.repositories.PagoRepository;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    private PagoRepository repo;

    @Override
    @Transactional(readOnly = true)
    public List<Pago> findAll() {
        return (List<Pago>) repo.findAll();
    }

    @Override
    public Optional<Pago> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void remove(Long id) {
        
    }

    @Override
    public Pago save(Pago pago) {
        return null;
    }

    @Override
    public Optional<Pago> update(Pago pago, Long id) {
        return Optional.empty();
    }
    
    
}
