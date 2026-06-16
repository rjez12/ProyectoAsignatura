package org.example.untitled.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
@View(members = "candidato; evaluador; fechaAsignacion, resultado")
public class AsignacionPrueba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Integer id_asignacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    @Required
    private Candidato candidato;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    @Required
    private Evaluador evaluador;

    @Required
    private LocalDate fechaAsignacion;

    @Column(length = 20)
    private String resultado;
}