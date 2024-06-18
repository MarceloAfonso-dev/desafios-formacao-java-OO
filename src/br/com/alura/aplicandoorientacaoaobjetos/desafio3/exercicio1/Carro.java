package br.com.alura.aplicandoorientacaoaobjetos.desafio3.exercicio1;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco() {
        double menorPreco = precoAno2 < precoAno1 ? precoAno2 : precoAno3 < precoAno1 ? precoAno3 : precoAno1;
        return menorPreco;
    }

    private double calcularMaiorPreco() {
        double maiorPreco = precoAno2 > precoAno1 ? precoAno2 : precoAno3 > precoAno1 ? precoAno3 : precoAno1;
        return maiorPreco;
    }
}
