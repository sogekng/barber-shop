package com.agendamento.agendamento.DAO;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.agendamento.agendamento.Models.Vagas;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;

public interface VagasDAO extends CrudRepository<Vagas, Integer> {
        
    @Query(value = "SELECT id_cliente FROM agendamento.agendamentos WHERE data = :data", nativeQuery = true)
    public Integer findByIdCliente(@Param("data") String data);

    @Query(value="SELECT * FROM agendamento.vagas WHERE data = :data", nativeQuery = true)
    public Vagas existsByVaga(@Param("data") String data);

    @Query(value="SELECT id_vaga FROM agendamento.vagas WHERE data = :data", nativeQuery = true)
    public Integer existsByIdVaga(@Param("data") String data);

    @Query(value = "SELECT numero_de_vagas FROM agendamento.vagas WHERE data = :data", nativeQuery = true)
    public String findByData(@Param("data") String data);

    @Transactional
    @Modifying
    @Query(value = "UPDATE agendamento.vagas SET numero_de_vagas = :newNumber  WHERE id_vaga = :id_vaga", nativeQuery = true)
    void updateNumber(@Param("id_vaga") Integer id_vaga, @Param("newNumber") String newNumber);

}
