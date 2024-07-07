package br.edu.infnet.AppBanco.controleGastos.controller;

import br.edu.infnet.AppBanco.controleGastos.model.Balanco;
import br.edu.infnet.AppBanco.controleGastos.services.BalancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
public class BalancoController {
    @Autowired
    BalancoService balancoServiceService;
    @GetMapping("/balanco")
    public Collection<Balanco> obterLista() {
        return balancoServiceService.obterLista();
    }

}
