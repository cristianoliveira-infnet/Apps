package br.edu.infnet.AppBanco.controleGastos.services;

import br.edu.infnet.AppBanco.controleGastos.model.Despesa;
import br.edu.infnet.AppBanco.controleGastos.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class DespesaService {
    @Autowired
    private DespesaRepository despesaRepository;
    public void incluir(Despesa despesa){
        despesaRepository.save(despesa);
    }

    public Collection<Despesa> obterLista(){
        return (Collection<Despesa>) despesaRepository.findAll();
    }

    public Despesa obterPorId(Integer id) {
        return despesaRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        despesaRepository.deleteById(id);
    }


    public Despesa obeterPorId(Integer id) {
       return despesaRepository.findById(id).orElse(null);
    }
}
