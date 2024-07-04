package br.edu.infnet.AppBanco.controleGastos.controller;

import br.edu.infnet.AppBanco.controleGastos.model.Despesa;
import br.edu.infnet.AppBanco.controleGastos.repository.DespesaRepository;
import br.edu.infnet.AppBanco.controleGastos.services.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Controller
public class DespesaController {
    List<Despesa> despesaList = new ArrayList<>();

    @Autowired
    DespesaService despesaService;

    @GetMapping("/despesas")
    public Collection<Despesa> obterLista() {
        return despesaService.obterLista();
    }
    @GetMapping("/create-despesa")
    public String homeDespesa() {
        return "create-despesa";
    }
    @PostMapping("/create-despesa")
    public String createDespesa(Despesa despesa) {
        despesaService.incluir(despesa);

        return "redirect:/despesas";
    }

    @GetMapping("/edit/{id}")
    public void edit(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("despesa");
        despesaList.stream().filter(despesa -> id.equals(despesa.getId()));
    }

}
