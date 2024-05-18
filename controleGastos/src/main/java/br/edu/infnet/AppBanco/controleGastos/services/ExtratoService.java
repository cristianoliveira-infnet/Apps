package br.edu.infnet.AppBanco.controleGastos.services;

import br.edu.infnet.AppBanco.controleGastos.model.Extrato;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ExtratoService {
    private static Map<Integer, Extrato> mapa = new HashMap<Integer, Extrato>();
    private static Integer id = 0;

    public void incluir(Extrato extrato){
        extrato.setId(id);
        mapa.put(extrato.getId(), extrato);
    }

    public Collection<Extrato> obterLista(){
        return mapa.values();
    }
}
