package org.example.untitled.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Entity
@Getter @Setter
public class Resultado {
    @Id @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    private AsignacionPrueba asignacion;

    @Required
    private double nota;

    @Column(length = 200)
    private String observaciones;
}