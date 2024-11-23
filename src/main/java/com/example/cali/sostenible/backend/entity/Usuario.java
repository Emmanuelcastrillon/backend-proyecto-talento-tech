package com.example.cali.sostenible.backend.entity;

//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Entity
@Data
@Table(name="users")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(nullable = false)
    private String name;

    @NonNull
    @Column(nullable = false)
    private String apellido;

    @NonNull
    @Column(nullable = false)
    private String email;

    @NonNull
    @Column(nullable = false)
    private String telefono;

    @NonNull
    @Column(nullable = false)
    private String tipoid;

    @NonNull
    @Column(nullable = false)
    private Long numeroId;

    @NonNull
    @Column(nullable = false)
    private String actividad;

    @NonNull
    @Column(nullable = false)
    private  String lugar;

    @NonNull
    @Column(nullable = false)
    private LocalDate fecha;

}
