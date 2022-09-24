package com.agendamento.agendamento.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.agendamento.agendamento.Models.Agendamentos;

public interface AgendamentoDAO extends CrudRepository<Agendamentos, Integer> {

    @Query(value = "SELECT * FROM agendamentos WHERE id_cliente = :id_cliente", nativeQuery = true)
    public Agendamentos findByIdCliente(@Param("id_cliente") Integer id_cliente);
    
}
