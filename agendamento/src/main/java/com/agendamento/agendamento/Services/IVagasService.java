package com.agendamento.agendamento.Services;

import com.agendamento.agendamento.Models.Vagas;

import java.util.ArrayList;

public interface IVagasService {
    public Vagas toCreate(Vagas vagas);
    public Vagas toUpdate(Vagas vagas);
    public Vagas toDelete(Vagas vagas);
    public boolean toSearch(Integer id);
    public Integer toSearchIdCliente(Integer id_cliente);
    public boolean toExistByVaga(String data);
    public ArrayList<Vagas> toList();
}
