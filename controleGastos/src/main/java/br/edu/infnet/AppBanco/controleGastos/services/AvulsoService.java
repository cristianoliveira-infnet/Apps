package br.edu.infnet.AppBanco.controleGastos.services;

import br.edu.infnet.AppBanco.controleGastos.model.Avulso;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AvulsoService {
    private static Map<Integer, Avulso> mapa = new HashMap<Integer, Avulso>();
    private static Integer id = 0;

    public void incluir(Avulso avulso){
        avulso.setId(++id);
        mapa.put(avulso.getId(), avulso);
    }

    public Collection<Avulso> obterLista(){
        return mapa.values();
    }
}
