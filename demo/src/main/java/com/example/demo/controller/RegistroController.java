package com.example.demo.controller;

import com.example.demo.model.RegistroModel;
import com.example.demo.service.RegistroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registros")
public class RegistroController {


    private final RegistroService registroService;

    public RegistroController(RegistroService registroService) {
        this.registroService = registroService;
    }

    @GetMapping
    public ResponseEntity<List<RegistroModel>> getAllOrders() {
        List<RegistroModel> orders=registroService.findAllOrders();
        return new ResponseEntity<List<RegistroModel>>(orders, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<RegistroModel> createRegistro(@RequestBody RegistroModel registroModel) {
        RegistroModel registronew =registroService.createRegistro(registroModel);
        return new ResponseEntity<RegistroModel>(registronew, HttpStatus.CREATED);
    }



}
