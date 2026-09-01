package com.alemello.agendador_horarios.infrastructure.repository;

import com.alemello.agendador_horarios.infrastructure.entity.AgendamentoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, Long> {
 
    AgendamentoEntity findByServiceAndDataHoraAgendamentoBetween(String servico, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFinal);

    @Transactional
    void deleteByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);

    AgendamentoEntity findByDataHoraAgendamentoBetween(LocalDateTime dataHoraInicial, LocalDateTime dataHoraFinal);

    AgendamentoEntity findByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);


}
