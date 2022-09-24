package com.agendamento.agendamento.Models;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "agendamentos")
public class Agendamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agendamento")
    private Integer id_agendamento;

    @Column(name = "data", length = 70, nullable = false)
    private String data;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    @JsonIgnoreProperties("lista_de_clientes")
    private Clientes cliente;

    public Integer get_Id(Integer id_agendamento) {
        return id_agendamento;
    }

    public void set_id(Integer id_agendamento) {
        this.id_agendamento = id_agendamento;
    }


    public String get_data() {
        return data;
    }

    public void set_data(String data) {
        this.data = data;
    }


    public Clientes get_cliente(Clientes cliente) {
        return cliente;
    }

    public void set_cliente(Clientes cliente) {
        this.cliente = cliente;
    }


}
