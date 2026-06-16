package org.example.untitled.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Entity
@Getter @Setter
@View(members = "nombres, apellidos; especialidad")
public class Evaluador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Integer id_evaluador;

    @Column(length = 100)
    @Required
    private String nombres;

    @Column(length = 100)
    @Required
    private String apellidos;

    @Column(length = 100)
    @Required
    private String especialidad;
}