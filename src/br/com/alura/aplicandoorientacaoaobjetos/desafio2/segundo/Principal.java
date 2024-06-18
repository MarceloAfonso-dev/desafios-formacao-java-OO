package br.com.alura.aplicandoorientacaoaobjetos.desafio2.segundo;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Marcelo");
        pessoa1.setIdade(17);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();
    }
}
