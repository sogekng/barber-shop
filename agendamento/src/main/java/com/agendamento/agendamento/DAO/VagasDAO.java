package com.agendamento.agendamento.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.agendamento.agendamento.Models.Vagas;

public interface VagasDAO extends CrudRepository<Vagas, Integer> {
    
}
