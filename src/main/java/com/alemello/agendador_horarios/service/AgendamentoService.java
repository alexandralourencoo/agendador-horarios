package com.alemello.agendador_horarios.service;

import com.alemello.agendador_horarios.infrastructure.entity.AgendamentoEntity;
import com.alemello.agendador_horarios.infrastructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AgendamentoService {
    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoEntity salvarAgendamento(AgendamentoEntity agendamento) {
        LocalDateTime horaAgendamento = agendamento.getDataHoraAgendamento();
        LocalDateTime horaFinal = agendamento.getDataHoraAgendamento().plusHours(1);

        AgendamentoEntity agendados = agendamentoRepository.findByServiceAndDataHoraAgendamentoBetween(agendamento.getProduto(), horaAgendamento, horaFinal);

        if (Objects.nonNull(agendamento)){
            throw new RuntimeException("O horário já está reservado");
        } return agendamentoRepository.save(agendamento);
    }
}
