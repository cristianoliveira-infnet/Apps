package br.edu.infnet.AppBanco.controleGastos;

import br.edu.infnet.AppBanco.controleGastos.model.Balanco;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ExtratoLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Balanco> lista = new ArrayList<>();

        FileReader file = new FileReader("extrato.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        System.err.println("#extrato");

        while (linha != null) {
            campos = linha.split(";");

            Balanco balanco = new Balanco();
            System.out.println(balanco);
            linha = leitura.readLine();

            lista.add(balanco);

        }

//        for (Avulso avulso : lista) {
//            System.out.println("Entrei");
//            System.out.println(avulso);
//        }

        leitura.close();
    }
}
