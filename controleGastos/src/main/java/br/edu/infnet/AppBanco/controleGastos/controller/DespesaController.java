package br.edu.infnet.AppBanco.controleGastos.controller;

import br.edu.infnet.AppBanco.controleGastos.model.Despesa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DespesaController {
    List<Despesa> despesaList = new ArrayList<>();

    @GetMapping("/despesa")
    public String home(Despesa despesa) {
        System.out.println(despesaList.size());
        return "despesa";
    }

    @PostMapping("/despesa")
    public String create(Despesa despesa) {
        Integer id = despesaList.size()+1;

        despesaList.add(new Despesa(
                id,
                despesa.getDescricao(),
                despesa.getValor(),
                despesa.getDataVencimento(),
                despesa.getDataPagamento(),
                despesa.getEstaVencido(),
                despesa.getObservacao(),
                despesa.getRecorrente()
        ));

        despesaList.forEach(System.out::println);

        return "redirect:/visao-geral";
    }
    @GetMapping("/visao-geral")
    public ModelAndView listDespesa() {
        ModelAndView mv = new ModelAndView("visao-geral");
        mv.addObject("despesaList", despesaList);
        despesaList.forEach(System.out::println);
        System.out.println(mv);
        return mv;
    }


    @GetMapping("/edit/{id}")
    public void edit(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("despesa");
        despesaList.stream().filter(despesa -> id.equals(despesa.getId()));
    }

}
