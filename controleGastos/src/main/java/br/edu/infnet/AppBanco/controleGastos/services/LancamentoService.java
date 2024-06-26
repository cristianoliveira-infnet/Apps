package br.edu.infnet.AppBanco.controleGastos.services;

import br.edu.infnet.AppBanco.controleGastos.model.Lancamento;
import br.edu.infnet.AppBanco.controleGastos.repository.LancamentoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class LancamentoService {
    private LancamentoRepository lancamentoRepository;
    public void incluir(Lancamento lancamento){
        lancamentoRepository.save(lancamento);
    }

    public Collection<Lancamento> obterLista(){
        return (Collection<Lancamento>) lancamentoRepository.findAll();
    }

    public Lancamento obterPorId(Integer id) {
        return lancamentoRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        lancamentoRepository.deleteById(id);
    }
}
