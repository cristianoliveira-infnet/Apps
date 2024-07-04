package br.edu.infnet.AppBanco.controleGastos.services;

import br.edu.infnet.AppBanco.controleGastos.model.Despesa;
import br.edu.infnet.AppBanco.controleGastos.model.Receita;
import br.edu.infnet.AppBanco.controleGastos.repository.DespesaRepository;
import br.edu.infnet.AppBanco.controleGastos.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    public void incluir(Receita receita){
        receitaRepository.save(receita);
    }

    public Collection<Receita> obterLista(){
        return (Collection<Receita>) receitaRepository.findAll();
    }

    public Receita obeterPorId(Integer id) {
        return receitaRepository.findById(id).orElse(null);
    }
}
