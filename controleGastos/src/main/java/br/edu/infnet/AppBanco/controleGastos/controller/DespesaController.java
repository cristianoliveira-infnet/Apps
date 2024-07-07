package br.edu.infnet.AppBanco.controleGastos.controller;

import br.edu.infnet.AppBanco.controleGastos.model.Despesa;
import br.edu.infnet.AppBanco.controleGastos.services.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
public class DespesaController {

    @Autowired
    DespesaService despesaService;

    @GetMapping("/despesas")
    public Collection<Despesa> obterLista() {
        return despesaService.obterLista();
    }
    @PostMapping("/create-despesa")
    public void incluir(Despesa despesa) {
        despesaService.incluir(despesa);
    }
    @GetMapping("/despesa/editar/{id}")
    public Despesa obterPorId(@PathVariable("id") Integer id) {
        return despesaService.obeterPorId(id);
    }
    @DeleteMapping("/despesa/excluir/{id}")
    public void excluirPorId(@PathVariable("id") Integer id) {
        despesaService.excluir(id);
    }
}
