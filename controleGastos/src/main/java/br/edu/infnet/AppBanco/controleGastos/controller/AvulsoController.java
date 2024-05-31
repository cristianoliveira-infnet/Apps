package br.edu.infnet.AppBanco.controleGastos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AvulsoController {
    @GetMapping("/avulso")
    public String create() {
        return "avulso.html";
    }
}