package com.agendamento.agendamento.Services;

import com.agendamento.agendamento.Models.Vagas;

import java.util.ArrayList;

public interface IVagasService {
    public Vagas toCreate(Vagas vagas);
    public void toUpdate(Integer id_vaga, String number);
    public Vagas toDelete(Vagas vagas);
    public boolean toSearch(Integer id);
    public Integer toSearchIdCliente(Integer id_cliente);
    public Integer toSearchIdVaga(String data);
    public boolean toExistByVaga(String data);
    public String toSearchVaga(String data);
    public ArrayList<Vagas> toList();
}
