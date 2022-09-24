package com.agendamento.agendamento.Models;

import javax.persistence.*;

@Entity
@Table(name = "vagas")
public class Vagas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vaga")
    private Integer id_vaga;

    @Column(name = "numero_de_vagas", length = 70, nullable = false)
    private String numero_de_vagas;

    @Column(name = "data", length = 70, nullable = false)
    private String data;


    public Integer get_Id(Integer id_vaga) {
        return id_vaga;
    }

    public void set_id(Integer id_vaga) {
        this.id_vaga = id_vaga;
    }


    public String get_numero_de_vagas() {
        return numero_de_vagas;
    }

    public void set_numero_de_vagas(String numero_de_vagas) {
        this.numero_de_vagas = numero_de_vagas;
    }


    public String get_data() {
        return data;
    }

    public void set_data(String data) {
        this.data = data;
    }
    
}
