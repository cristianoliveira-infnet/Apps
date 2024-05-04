package br.edu.infnet.AppBanco.controleGastos;

import br.edu.infnet.AppBanco.controleGastos.model.Avulso;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

@Component
public class AvulsoLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("avulso.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos =null;

        System.err.println("#avulso");

        while (linha != null) {
            campos = linha.split(";");

            Avulso avulso = new Avulso(150.00, new Date(), false, "Sem observacao");
            System.out.println(avulso);
            linha = leitura.readLine();
        }

        leitura.close();
    }
}
