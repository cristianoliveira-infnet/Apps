package br.edu.infnet.AppBanco.controleGastos.services;

import br.edu.infnet.AppBanco.controleGastos.model.Balanco;
import br.edu.infnet.AppBanco.controleGastos.repository.BalancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class BalancoService {
    @Autowired
    private BalancoRepository balancoRepository;
    public Collection<Balanco> obterLista(){
        return (Collection<Balanco>) balancoRepository.findAll();
    }

    public void incluir(Balanco balanco) {
        balancoRepository.save(balanco);
    }

    public Balanco obterPorId(Integer id) {
        return balancoRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        balancoRepository.deleteById(id);
    }
}
