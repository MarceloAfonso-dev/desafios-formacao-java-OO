package br.com.alura.aplicandoorientacaoaobjetos.desafio3.exercicio1;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro carro1 = new ModeloCarro();
        carro1.setMarca("Ford");
        carro1.definirModelo("Esportivo");
        carro1.definirPrecos(70000,100000,60000);
        carro1.exibirInfo();
    }
}
