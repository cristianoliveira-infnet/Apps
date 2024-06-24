package br.edu.infnet.AppBanco.controleGastos.controller;
import br.edu.infnet.AppBanco.controleGastos.model.Receita;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.ArrayList;
import java.util.List;
@Controller
public class ReceitaController {

    List<Receita> receitaList = new ArrayList<>();

    @GetMapping("/receitas")
    public String homeReceita(Receita receita) {
        System.out.println(receitaList.size());
        return "receitas";
    }

    @GetMapping("/receita")
    public String homeReceitaCreate() {
        return "receita";
    }

    @PostMapping("/receita")
    public String create(Receita receita) {
        Integer id = receitaList.size()+1;

        receitaList.add(new Receita(
                id,
                receita.getDescricao(),
                receita.getValor(),
                receita.getDataVencimento(),
                receita.getEfetivada()

        ));

        receitaList.forEach(System.out::println);

        return "redirect:/receitas";
    }

}
