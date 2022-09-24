package com.agendamento.agendamento.Models;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id_cliente;

    @Column(name = "nome", length = 70, nullable = false)
    private String nome;

    @Column(name = "email", length = 70, nullable = false)
    private String email;

    @Column(name = "telefone", length = 70, nullable = false)
    private String telefone;


    public Integer get_Id(Integer id_cliente) {
        return id_cliente;
    }

    public void set_id(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }


    public String get_nome() {
        return nome;
    }

    public void set_nome(String nome) {
        this.nome = nome;
    }


    public String get_email() {
        return email;
    }

    public void set_email(String email) {
        this.email = email;
    }


    public String get_telefone() {
        return telefone;
    }

    public void set_telefone(String telefone) {
        this.telefone = telefone;
    }
}
