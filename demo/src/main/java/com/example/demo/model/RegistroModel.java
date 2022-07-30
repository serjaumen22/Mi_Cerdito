package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotBlank;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "Registros")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegistroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    @Column(name = "Fechas_Hor", nullable = false)
    private LocalDateTime tiempo;

    @NotNull
    @NotBlank
    @Column(name = "placa", nullable = false)
    private String placa;

    @NotNull
    @NotBlank
    @Column(name = "chofer", nullable = false)
    private String chofer;

    public LocalDateTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalDateTime tiempo) {
        this.tiempo = tiempo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }
}
