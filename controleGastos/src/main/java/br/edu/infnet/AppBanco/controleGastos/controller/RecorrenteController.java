package br.edu.infnet.AppBanco.controleGastos.controller;

import br.edu.infnet.AppBanco.controleGastos.model.Recorrente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class RecorrenteController {
    List<Recorrente> recorrenteList = new ArrayList<>();

    @GetMapping("/recorrente")
    public String home() {
        return "recorrente.html";
    }

    @PostMapping("/recorrente")
    public String create(Recorrente recorrente) {
        Long id = recorrenteList.size() + 1L;

        recorrenteList.add(new Recorrente(
                "Aluguel",
                850.00,
                new Date(),
                new Date(),
                false,
                "Conta mensal"
        ));
        System.out.println(recorrente);
        return "redirect:/list";
    }
    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("recorrentList");
        mv.addObject("recorrenteList", recorrenteList);
        return mv;
    }

}
