package br.edu.infnet.AppBanco.controleGastos;


import br.edu.infnet.AppBanco.controleGastos.model.Balanco;
import br.edu.infnet.AppBanco.controleGastos.model.Cotacao;
import br.edu.infnet.AppBanco.controleGastos.repository.ReceitaRepository;
import br.edu.infnet.AppBanco.controleGastos.services.ConsumoApi;
import br.edu.infnet.AppBanco.controleGastos.services.ConverterDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControleGastosApplication implements CommandLineRunner {
	@Autowired
	ReceitaRepository receitaRepository;
	public static void main(String[] args) {
		SpringApplication.run(ControleGastosApplication.class, args);
	}
	@Override
	public void run(String ...args) throws Exception {

		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://economia.awesomeapi.com.br/json/last/USD-BRL,EUR-BRL");
		System.out.println(json);

		ConverterDados converterDados = new ConverterDados();
		Cotacao dados = converterDados.obterDados(json, Cotacao.class);
		System.out.println(dados);

		Balanco balanco = new Balanco();
	}

}
