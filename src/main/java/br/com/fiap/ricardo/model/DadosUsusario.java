package br.com.fiap.ricardo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosUsusario(String nome,
                            String email,
                            @JsonAlias("data_nascimento") String dataNascimento,
                            String telefone){
}
