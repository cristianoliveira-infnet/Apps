package br.edu.infnet.AppBanco.controleGastos.services;

import br.edu.infnet.AppBanco.controleGastos.model.Avulso;
import br.edu.infnet.AppBanco.controleGastos.model.Recorrente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RecorrenteService {
    private static Map<Integer, Recorrente> mapa = new HashMap<Integer, Recorrente>();
    private static Integer id = 0;

    public void incluir(Recorrente recorrente){
        recorrente.setId(++id);
        mapa.put(recorrente.getId(), recorrente);
    }

    public Collection<Recorrente> obterLista(){
        return mapa.values();
    }
}
