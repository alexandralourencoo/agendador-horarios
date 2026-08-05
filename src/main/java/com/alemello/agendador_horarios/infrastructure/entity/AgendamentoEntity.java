package com.alemello.agendador_horarios.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "agendamento")
public class AgendamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String produto;
    private String profissional;
    private String Cliente;
    private String telefoneCliente;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataInsercao = LocalDateTime.now(); /* serve para pegar a data e a hora exatas do momento atual usando o relógio do sistema */

}
