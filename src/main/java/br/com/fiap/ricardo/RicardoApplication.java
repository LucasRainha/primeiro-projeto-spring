package br.com.fiap.ricardo;

import br.com.fiap.ricardo.model.DadosUsusario;
import br.com.fiap.ricardo.service.ConsumoApi;
import br.com.fiap.ricardo.service.ConverteDados;
import br.com.fiap.ricardo.service.ConverteDadosImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RicardoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RicardoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var consumo = new ConsumoApi();
		var json = consumo.obterDados("http://127.0.0.1:5000/usuarios/2");

		ConverteDados conversor = new ConverteDadosImp();
		DadosUsusario dados = conversor.obterDados(json, DadosUsusario.class);

		System.out.println(dados);
	}
}
