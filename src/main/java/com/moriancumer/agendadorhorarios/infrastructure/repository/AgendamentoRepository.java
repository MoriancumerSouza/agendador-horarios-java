package com.moriancumer.agendadorhorarios.infrastructure.repository;

import com.moriancumer.agendadorhorarios.infrastructure.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
