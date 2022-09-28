package com.agendamento.agendamento.Services;

import com.agendamento.agendamento.DAO.ClientesDAO;
import com.agendamento.agendamento.Models.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClientesService {

    @Autowired
    private ClientesDAO dao;

    @Override
    public Clientes toCreate(Clientes cliente) {
        if (cliente != null){
            return dao.save(cliente);
        }
        return null;
    }

    @Override
    public Clientes toUpdate(Clientes cliente) {
        return null;
    }

    @Override
    public Clientes toDelete(Clientes cliente) {
        if (cliente != null){
            dao.delete(cliente);
            return cliente;
        }
        return null;
    }

    @Override
    public Integer toSearch(String email) {
        return dao.findByIdCliente(email);
    }

    @Override
    public Clientes toSearchId(Integer id) {
        return dao.findById(id).get();
    }
}
