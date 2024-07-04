package br.edu.infnet.AppBanco.controleGastos.controller;

import br.edu.infnet.AppBanco.controleGastos.model.Receita;

import br.edu.infnet.AppBanco.controleGastos.services.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Controller
public class ReceitaController {
    List<Receita> receitaList = new ArrayList<>();
    @Autowired
    private ReceitaService receitaService;
    @GetMapping("/receitas")
    public Collection<Receita> obterLista() {
        return receitaService.obterLista();
    }
    @GetMapping("/create-receita")
    public String createReceita() {
        return "create-receita";
    }
    @PostMapping("/create-receita")
    public String create(Receita receita) {

        receitaList.add(receita);

        receitaService.incluir(receita);

        receitaList.forEach(System.out::println);

        return "redirect:/receitas";
    }
    @GetMapping("/edit-receita/{id}")
    public Receita obterPorId(Integer id) {
        return receitaService.obeterPorId(id);
    }
//    public ModelAndView obterPorId(@PathVariable Integer id) {
//        receitaService.obeterPorId(id);
//        ModelAndView mv = new ModelAndView("create");
//        Receita findReceita = receitaList.stream().filter(receita -> id.equals(receita.getId())).findFirst().get();
//        System.out.println("findReceita: "+findReceita);
//        mv.addObject("receitaList", findReceita);
//        return mv;
//    }


}
