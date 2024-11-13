package br.com.fiap.ricardo.service;

public interface ConverteDados {

    <T> T obterDados(String json, Class<T> classe);

}
