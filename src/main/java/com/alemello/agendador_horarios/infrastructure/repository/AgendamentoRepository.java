package com.alemello.agendador_horarios.infrastructure.repository;

import com.alemello.agendador_horarios.infrastructure.entity.AgendamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, Long> {
    AgendamentoEntity findByServiceAndDataHoraAgendamentoBetween(String servico, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFinal);
}
