package com.agendamento.agendamento.Services;

import java.util.Optional;
import com.agendamento.agendamento.Models.Clientes;

public interface IClientesService {
    public Clientes toCreate(Clientes clientes);
    public Clientes toUpdate(Clientes clientes);
    public Clientes toDelete(Clientes clientes);
    public Integer toSearch(String email);
    public Clientes toSearchId(Integer id);
}
