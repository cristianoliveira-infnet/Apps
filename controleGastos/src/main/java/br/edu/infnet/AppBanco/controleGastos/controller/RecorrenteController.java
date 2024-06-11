package br.edu.infnet.AppBanco.controleGastos.controller;

import br.edu.infnet.AppBanco.controleGastos.model.Recorrente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RecorrenteController {
    List<Recorrente> recorrenteList = new ArrayList<>();

    @GetMapping("/recorrente")
    public String home(Recorrente recorrente) {
        System.out.println(recorrenteList.size());
        return "recorrente";
    }

    @PostMapping("/recorrente")
    public String create(Recorrente recorrente) {
        Long id = recorrenteList.size() + 1L;

        recorrenteList.add(new Recorrente(
                recorrente.getTituloDaConta(),
                recorrente.getValorDaConta(),
                recorrente.getDataVencimento(),
                recorrente.getDataPagamento(),
                recorrente.getEstaVencido(),
                recorrente.getObservacao()
        ));
        recorrenteList.forEach(System.out::println);

        return "redirect:visao-geral";
    }
    @GetMapping("/visao-geral")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("list");
        mv.addObject("recorrenteList", recorrenteList);
        recorrenteList.forEach(System.out::println);
        System.out.println(mv);
        return mv;
    }


    @GetMapping("/edit/{id}")
    public void edit(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("recorrente");
        recorrenteList.stream().filter(recorrente -> id.equals(recorrente.getId()));
    }

}
