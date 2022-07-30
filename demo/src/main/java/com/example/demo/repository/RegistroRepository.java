package com.example.demo.repository;

import com.example.demo.model.RegistroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroModel, Long> {
}
