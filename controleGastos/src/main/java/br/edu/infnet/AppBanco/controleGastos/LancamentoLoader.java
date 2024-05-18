package br.edu.infnet.AppBanco.controleGastos;

import br.edu.infnet.AppBanco.controleGastos.model.Avulso;
import br.edu.infnet.AppBanco.controleGastos.model.Lancamento;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LancamentoLoader implements ApplicationRunner {
    List<Lancamento> lista = new ArrayList<>();
    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("avulso.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        System.err.println("#lancamento");

        while (linha != null) {
            campos = linha.split(";");


        }

        for (Lancamento lancamento : lista) {
            System.out.println("Conta avulsa");
            System.out.println(lancamento);
        }

        leitura.close();
    }
}
