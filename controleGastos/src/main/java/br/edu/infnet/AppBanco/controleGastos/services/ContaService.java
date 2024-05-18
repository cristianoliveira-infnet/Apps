package br.edu.infnet.AppBanco.controleGastos.services;

import br.edu.infnet.AppBanco.controleGastos.model.Conta;
import br.edu.infnet.AppBanco.controleGastos.model.Extrato;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ContaService {
    private static Map<Integer, Conta> mapa = new HashMap<Integer, Conta>();
    private static Integer id = 0;

    public void incluir(Conta conta){
        conta.setId(id);
        mapa.put(conta.getId(), conta);
    }

    public Collection<Conta> obterLista(){
        return mapa.values();
    }
}
