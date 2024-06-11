package br.edu.infnet.AppBanco.controleGastos;

import br.edu.infnet.AppBanco.controleGastos.model.Avulso;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class AvulsoLoader implements ApplicationRunner {
    List<Avulso> lista = new ArrayList<>();

    @Override
    public void run(ApplicationArguments args) throws Exception {


        FileReader file = new FileReader("avulso.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        System.err.println("#avulso");

        while (linha != null) {
            campos = linha.split(";");

            Avulso contaAvulsa = new Avulso(campos[0], Double.valueOf(campos[1]), new Date(campos[2]), new Date(campos[3]), false, campos[5]);
            System.out.println(contaAvulsa);

            linha = leitura.readLine();

            lista.add(contaAvulsa);
        }

        for (Avulso avulso : lista) {
            System.out.println(avulso);
        }

        leitura.close();
    }
}
