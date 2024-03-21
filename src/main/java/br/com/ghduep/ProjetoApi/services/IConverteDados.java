package br.com.ghduep.ProjetoApi.services;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
