package org.example.untitled.modelo;

import javax.persistence.*;
import javax.validation.constraints.Max;

import org.openxava.annotations.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
@View(members = "numeroCarnet; nombres, apellidos; fechaNacimiento, carrera")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Integer id_candidato;

    @Column(length = 15, unique = true) // Unimos length y unique en una sola línea
    @Required
    private String numeroCarnet;

    @Max(2026)
    private int anioIngreso;

    @Column(length = 100)
    @Required
    private String nombres;

    @Column(length = 100)
    @Required
    private String apellidos;

    @Required
    private LocalDate fechaNacimiento;

    @Column(length = 100)
    @Required
    private String carrera;

    @Max(2026) // Validaciones simples para evitar errores de dedo
    private int añoIngreso;
}