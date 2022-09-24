package com.agendamento.agendamento.Services;

import com.agendamento.agendamento.Models.Agendamentos;

public interface IAgendamentoService {
    public Agendamentos toCreate(Agendamentos agendamentos);
    public Agendamentos toUpdate(Agendamentos agendamentos);
    public Agendamentos toDelete(Agendamentos agendamentos);
    public Agendamentos toSearch(Agendamentos agendamentos);
    public Agendamentos toSearchIdCliente(Integer id_cliente);
    
}
