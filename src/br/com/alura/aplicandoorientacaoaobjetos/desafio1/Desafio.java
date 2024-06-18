package br.com.alura.aplicandoorientacaoaobjetos.desafio1;

import java.util.Scanner;

public class Desafio {

    static String clientName = "Marcelo Afonso";
    static String accountType = "Corrente";
    static double balanceValue = 2500.00;
    static double reciveValue, transferValue = 0.0;
    static int operationNumber = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensagemInicial());

        while (operationNumber != 4){
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a operação desejada:
                    """);
            operationNumber = scanner.nextInt();

            switch (operationNumber){
                case 1:
                    System.out.println("O saldo atual é R$ %.2f".formatted(balanceValue));
                    continue;
                case 2:
                    System.out.println("Informe um valor a receber:");
                    reciveValue = scanner.nextDouble();
                    if (reciveValue > 0){
                        balanceValue += reciveValue;
                        System.out.println("Saldo atualizado R$ %.2f".formatted(balanceValue));
                        continue;
                    } else{
                        System.out.println("Valor a receber inválido.");
                        continue;
                    }
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    transferValue = scanner.nextDouble();
                    if (transferValue > 0 && transferValue <= balanceValue){
                        balanceValue -= transferValue;
                        System.out.println("Saldo atualizado R$ %.2f".formatted(balanceValue));
                        continue;
                    } else{
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                        continue;
                    }
                case 4:
                    break;
                default:
                    System.out.println("Operação inválida! Digite novamente.");
            }
        }
    }

    public static String mensagemInicial(){
        return """
                 _ __                       ___               \s
                ( /  )                     ( /               
                 /--< __,  _ _   _, __      / __,  _  ,___,   \s
                /___/(_/(_/ / /_(__(_)    _/_(_/(_/ |/ (_/(_  \s
                                         //                   \s
                                        (/                    \s                                                                                             \s
                *********************************************
                Dados inciais do cliente:
                
                Nome:               %s
                Tipo conta:         %s
                Saldo inicial:      R$ %.2f
                *********************************************
                
                """.formatted(clientName, accountType, balanceValue);
    }
}
