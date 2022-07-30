package com.example.demo.service;

import com.example.demo.model.RegistroModel;
import com.example.demo.repository.RegistroRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service

public class RegistroService {
    private final RegistroRepository registroRepository;

    public RegistroService(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public RegistroModel createRegistro(RegistroModel registroModel){
        return registroRepository.save(registroModel);
    }

    public List<RegistroModel> findAllOrders(){
        return registroRepository.findAll();
    }
}
