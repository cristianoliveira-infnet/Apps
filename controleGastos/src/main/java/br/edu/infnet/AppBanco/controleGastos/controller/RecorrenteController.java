package br.edu.infnet.AppBanco.controleGastos.controller;

import br.edu.infnet.AppBanco.controleGastos.model.Recorrente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecorrenteController {
    @GetMapping("/recorrente")
    public String home() {
        return "recorrente.html";
    }

    @PostMapping("/recorrente")
    public void create(Recorrente recorrente) {
        System.out.println("O tipo de conta é: "+ recorrente);
    }
}
