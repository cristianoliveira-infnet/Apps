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

        String[] campos ;

        System.err.println("#recorrente");

        while (linha != null) {
            campos = linha.split(";");

            Recorrente contaTelefone = new Recorrente(Integer.parseInt(campos[0]), campos[1], Double.parseDouble(campos[2]), new Date(campos[3]), new Date(campos[4]), false, campos[6]);
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
