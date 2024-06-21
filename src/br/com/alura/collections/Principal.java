package br.com.alura.collections;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            if (sair > 1 || sair < 0) {
                System.err.println("Opção Inválida!");
            }

            System.out.print("\n\nDigite a descrição da compra: ");
            leitura.nextLine();
            String descricao = leitura.nextLine();

            System.out.print("\nDigite o valor da compra: ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("\nCompra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("**********************");
        System.out.println("COMPRAS REALIZADAS\n");
        Collections.sort(cartao.getCompras());
        for (Compra c : cartao.getCompras()) {
            System.out.printf("%s - %.2f%n", c.getDescricao(), c.getValor());
        }
        System.out.println("\n**********************");
        System.out.printf("\nSaldo do cartão: %.2f",cartao.getSaldo());
    }
}
