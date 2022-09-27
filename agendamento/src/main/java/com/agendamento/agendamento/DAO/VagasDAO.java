package com.agendamento.agendamento.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.agendamento.agendamento.Models.Vagas;
import org.springframework.data.repository.query.Param;

public interface VagasDAO extends CrudRepository<Vagas, Integer> {
        
    @Query(value = "SELECT id_cliente FROM agendamento.agendamentos WHERE data = :data;", nativeQuery = true)
    public Integer findByIdCliente(@Param("data") String data);

    @Query(value="SELECT * FROM agendamento.vagas WHERE data = :data", nativeQuery = true)
    public Vagas existsByVaga(@Param("data") String data);
}
