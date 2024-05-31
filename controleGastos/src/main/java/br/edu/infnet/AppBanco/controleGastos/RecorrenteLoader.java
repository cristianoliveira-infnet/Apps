package br.edu.infnet.AppBanco.controleGastos;

import br.edu.infnet.AppBanco.controleGastos.model.Recorrente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class RecorrenteLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Recorrente> lista = new ArrayList<>();

        FileReader file = new FileReader("recorrente.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        System.err.println("#recorrente");

        while (linha != null) {
            campos = linha.split(";");

            Recorrente contaTelefone = new Recorrente(campos[0], Double.valueOf(campos[3]), new Date(), new Date(), false, campos[5]);
            System.out.println(contaTelefone);

            linha = leitura.readLine();

            lista.add(contaTelefone);
        }
        for (Recorrente aluguel : lista) {
            System.out.println(aluguel);
        }

        leitura.close();
    }
}
