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


//        FileReader file = new FileReader("contaAvulso.txt");
//        BufferedReader leitura = new BufferedReader(file);
//
//        String linha = leitura.readLine();
//
//        String[] campos = null;
//
//        System.err.println("#avulso");
//
//        while (linha != null) {
//            campos = linha.split(";");
//
//            Avulso avulso = new Avulso(Double.valueOf(campos[0]),LocalDateTime.now(), Boolean.valueOf(campos[2]), campos[3]);
//            System.out.println(avulso);
//
//            lista.add(avulso);
//        }
//
//        for (Avulso avulso : lista) {
//            System.out.println("Conta avulsa");
//            System.out.println(avulso);
//        }
//
//        leitura.close();
    }
}
