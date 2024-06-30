package br.edu.infnet.AppBanco.controleGastos.services;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
