package br.edu.infnet.AppBanco.controleGastos;

import br.edu.infnet.AppBanco.controleGastos.model.Extrato;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ExtratoLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Extrato> lista = new ArrayList<>();

        FileReader file = new FileReader("extrato.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        System.err.println("#extrato");

        while (linha != null) {
            campos = linha.split(";");

            Extrato extrato = new Extrato();
            System.out.println(extrato);
            linha = leitura.readLine();

            lista.add(extrato);

        }

//        for (Avulso avulso : lista) {
//            System.out.println("Entrei");
//            System.out.println(avulso);
//        }

        leitura.close();
    }
}
