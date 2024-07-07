package br.edu.infnet.AppBanco.controleGastos.services;

import br.edu.infnet.AppBanco.controleGastos.model.Balanco;
import br.edu.infnet.AppBanco.controleGastos.repository.BalancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class BalancoService {
    @Autowired
    private BalancoRepository extratoRepository;
    public Collection<Balanco> obterLista(){
        return (Collection<Balanco>) extratoRepository.findAll();
    }

    public void incluir(Balanco balanco) {
        extratoRepository.save(balanco);
    }
}
