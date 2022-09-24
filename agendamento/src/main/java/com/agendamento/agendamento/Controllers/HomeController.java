package com.agendamento.agendamento.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.agendamento.agendamento.Models.*;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import com.agendamento.agendamento.Services.*;

@Controller
public class HomeController {

    @Autowired
    private IClientesService serviceCliente;

    @Autowired
    private IAgendamentoService serviceAgendamento;

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/home")
    public String home(){
        return "home/index";
    }

    @PostMapping("/home/cadastrar")
    public String cadastrar(Clientes cliente, Model model, String nome, String email, String telefone){
        cliente.set_nome(nome);
        cliente.set_email(email);
        cliente.set_telefone(telefone);
        Integer id = serviceCliente.toSearch(email);    
        if(id != null){
            model.addAttribute("error", "Email já cadastrado");
            return "home/index";
        }else{
            serviceCliente.toCreate(cliente);
            model.addAttribute("email", email);
            return "home/form-calendario";
        }
    }

    @PostMapping("/home/agendamento")
    public String agendamento(Agendamentos agendamento, String email, String data, Model model){
        Integer id = serviceCliente.toSearch(email);
        Clientes cliente = serviceCliente.toSearchId(id);
        Agendamentos agendamentoExistente = serviceAgendamento.toSearchIdCliente(id);
        agendamento.set_cliente(cliente);
        agendamento.set_data(data);
        if(agendamentoExistente != null){
            model.addAttribute("error", "Ja existe um agendamento com esse email");
            return "home/index";
        }

        serviceAgendamento.toCreate(agendamento);
        model.addAttribute("accert", "Agendamento realizado com sucesso");
        return "home/index";
    }

    @GetMapping("/home/form-cliente")
    public String formCliente(){
        return "home/form-cliente";
    }
}