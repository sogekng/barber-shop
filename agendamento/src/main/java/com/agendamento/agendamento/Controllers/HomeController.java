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

    @Autowired
    private IVagasService serviceVagas;

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/home")
    public String home(){
        return "home/index";
    }

    @GetMapping("/home/administrador")
    public String admin(Model model){
        model.addAttribute("vagas", serviceVagas.toList());
        return "home/admin";
    }

    @PostMapping("/home/cadastrar")
    public String cadastrar(Clientes cliente, Agendamentos agendamento, Model model, String nome, String email, String telefone, String data){
        cliente.set_nome(nome);
        cliente.set_email(email);
        cliente.set_telefone(telefone);
        Integer id = serviceCliente.toSearch(email);
        Agendamentos agendamentoExistente = serviceAgendamento.toSearchIdCliente(id);
        agendamento.set_cliente(cliente);
        agendamento.set_data(data);

        if(id != null){
            model.addAttribute("error", "Email já cadastrado");
            return "redirect:/home";
        }else{
            serviceCliente.toCreate(cliente);
            agendamento.set_cliente(cliente);
            agendamento.set_data(data);
            if(agendamentoExistente != null){
                model.addAttribute("error", "Ja existe um agendamento com esse email");
                return "redirect:/home";
            }
    
            serviceAgendamento.toCreate(agendamento);

            model.addAttribute("accert", "Agendamento realizado com sucesso");
            return "redirect:/home";
        }
    }

    @PostMapping("/home/vagas")
    public String vagas(Vagas vagas, Model model, String data, String numero_de_vagas){

        vagas.set_data(data);
        vagas.set_numero_de_vagas(numero_de_vagas);

        if(serviceVagas.toExistByVaga(data)){
            return "redirect:/home/administrador";
        }else{
            serviceVagas.toCreate(vagas);
            return "redirect:/home/administrador";
        }
        
    }


    @GetMapping("/home/form-cliente")
    public String formCliente(){
        return "home/form-cliente";
    }
}