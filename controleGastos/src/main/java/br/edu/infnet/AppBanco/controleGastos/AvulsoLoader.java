package br.edu.infnet.AppBanco.controleGastos;

import br.edu.infnet.AppBanco.controleGastos.model.Avulso;
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

            Avulso ticketCinema = new Avulso(35.00, LocalDateTime.now(), false, "Sem observacao");
            System.out.println(ticketCinema);

            Avulso consertoMicroondas = new Avulso(150.00, LocalDateTime.now(), false, "Conserto do mircroondas que não esquenta.");
            linha = leitura.readLine();

            lista.add(ticketCinema);
            lista.add(consertoMicroondas);
        }

        for (Avulso avulso : lista) {
            System.out.println("Entrei");
            System.out.println(avulso);
        }

        leitura.close();
    }
}
