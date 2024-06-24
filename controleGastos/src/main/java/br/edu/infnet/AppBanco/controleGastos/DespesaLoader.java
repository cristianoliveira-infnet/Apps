package br.edu.infnet.AppBanco.controleGastos;

import br.edu.infnet.AppBanco.controleGastos.model.Despesa;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DespesaLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Despesa> lista = new ArrayList<>();

        FileReader file = new FileReader("despesa.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos ;

        System.err.println("#despesa");

        while (linha != null) {
            campos = linha.split(";");

            Despesa contaTelefone = new Despesa(
                    Integer.parseInt(campos[0]),
                    campos[1],
                    Double.parseDouble(campos[2]),
                    new Date(campos[3]),
                    new Date(campos[4]),
                    Boolean.valueOf(campos[5]),
                    campos[6],
                    Boolean.valueOf(campos[7])
            );
            System.out.println(contaTelefone);

            linha = leitura.readLine();

            lista.add(contaTelefone);
        }
        for (Despesa despesa : lista) {
            System.out.println(despesa);
        }

        leitura.close();
    }
}
