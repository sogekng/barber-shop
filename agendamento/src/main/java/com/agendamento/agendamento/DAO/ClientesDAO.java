package com.agendamento.agendamento.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.agendamento.agendamento.Models.Clientes;

public interface ClientesDAO extends CrudRepository<Clientes, Integer> {
    @Query(value = "SELECT id_cliente FROM clientes WHERE email = :email", nativeQuery = true)
    public Integer findByIdCliente(@Param("email") String email);
}
