package com.agendamento.agendamento.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.agendamento.agendamento.DAO.AgendamentoDAO;
import com.agendamento.agendamento.Models.Agendamentos;

@Service
public class AgendamentoService implements IAgendamentoService {

    @Autowired
    private AgendamentoDAO dao;

    @Override
    public Agendamentos toCreate(Agendamentos agendamento) {
        if (agendamento != null){
            return dao.save(agendamento);
        }
        return null;
    }

    @Override
    public Agendamentos toUpdate(Agendamentos agendamentos) {
        return null;
    }

    @Override
    public Agendamentos toDelete(Agendamentos agendamentos) {
        return null;
    }

    @Override
    public Agendamentos toSearch(Agendamentos agendamentos) {
        return null;
    }

    @Override
    public Agendamentos toSearchIdCliente(Integer id_cliente) {
        return dao.findByIdCliente(id_cliente);
    }
    
}
