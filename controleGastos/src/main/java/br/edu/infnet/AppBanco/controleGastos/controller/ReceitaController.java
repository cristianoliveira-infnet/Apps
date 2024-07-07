package br.edu.infnet.AppBanco.controleGastos.controller;

import br.edu.infnet.AppBanco.controleGastos.model.Receita;

import br.edu.infnet.AppBanco.controleGastos.services.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
public class ReceitaController {
    @Autowired
    private ReceitaService receitaService;
    @GetMapping("/receitas")
    public Collection<Receita> obterLista() {
        return receitaService.obterLista();
    }
    @PostMapping("/create-receita")
    public void incluir(Receita receita) {
        receitaService.incluir(receita);
    }
    @GetMapping("/receita/edit/{id}")
    public Receita obterPorId(@PathVariable("id") Integer id) {
        return receitaService.obeterPorId(id);
    }

    @DeleteMapping("/receita/delete/{id}")
    public void excluir(@PathVariable Integer id) {
        receitaService.excluir(id);
    }


}
