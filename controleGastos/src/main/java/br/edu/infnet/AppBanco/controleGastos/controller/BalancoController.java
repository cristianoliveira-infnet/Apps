package br.edu.infnet.AppBanco.controleGastos.controller;

import br.edu.infnet.AppBanco.controleGastos.model.Balanco;
import br.edu.infnet.AppBanco.controleGastos.services.BalancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
public class BalancoController {
    @Autowired
    BalancoService balancoService;
    @GetMapping("/balanco")
    public Collection<Balanco> obterLista() {
        return balancoService.obterLista();
    }

    @GetMapping("/balanco/{id}")
    public Balanco obterPorId(@PathVariable Integer id) {
        return balancoService.obterPorId(id);
    }
    @PostMapping("/create-balanco")
    public void incluir(@RequestBody Balanco balanco) {
        balancoService.incluir(balanco);
    }
    @DeleteMapping("/balanco/delete/{id}")
    public void remover(@PathVariable Integer id) {
        balancoService.excluir(id);
    }


}
