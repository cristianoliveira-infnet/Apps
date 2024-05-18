package br.edu.infnet.AppBanco.controleGastos.services;

import br.edu.infnet.AppBanco.controleGastos.model.Lancamento;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class LancamentoService {
    private static Map<Integer, Lancamento> mapa = new HashMap<Integer, Lancamento>();
    private static Integer id = 0;

    public void incluir(Lancamento lancamento){
        lancamento.setId(++id);
        mapa.put(lancamento.getId(), lancamento);
    }

    public Collection<Lancamento> obterLista(){
        return mapa.values();
    }
}
