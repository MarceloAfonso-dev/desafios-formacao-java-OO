package br.com.alura.api;

public record Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
}
