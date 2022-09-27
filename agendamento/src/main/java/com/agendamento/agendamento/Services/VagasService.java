package com.agendamento.agendamento.Services;

import com.agendamento.agendamento.DAO.VagasDAO;
import com.agendamento.agendamento.Models.Vagas;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VagasService implements IVagasService {
    
    @Autowired
    private VagasDAO dao;

    @Override
    public ArrayList<Vagas> toList() {
        return (ArrayList<Vagas>) dao.findAll();
    }

    @Override
    public Vagas toCreate(Vagas vagas) {
        if (vagas != null){
            return dao.save(vagas);
        }
        return null;
    }

    @Override
    public Vagas toUpdate(Vagas vagas) {
        return null;
    }

    @Override
    public Vagas toDelete(Vagas vagas) {
        return null;
    }

    @Override
    public boolean toSearch(Integer id) {
        return dao.existsById(id);
    }


    @Override
    public Integer toSearchIdCliente(Integer id_cliente) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean toExistByVaga(String data) {
        if(dao.existsByVaga(data) != null){
            return true;
        }
        return false;
    }
}
